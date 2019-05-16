package pl.edu.agh.to;

import java.util.List;

public class Ministry {

    private String name;
    private Database database;

    public Ministry(String name, Database db) {
        this.name = name;
        database = db;
    }

    public void sendMessage(String message, Class unitType) {
        IFilterStrategy filter = new ToTypes(unitType);
        sendMessage(message, filter);
    }


    public void sendMessage(String message, List<Class> unitType) {
        IFilterStrategy filter = new ToTypes(unitType);
        sendMessage(message, filter);
    }


    public void sendMessageToAll(String message) {
        IFilterStrategy filter = new ToAll();
        sendMessage(message, filter);
    }

    private void sendMessage(String message, IFilterStrategy filter) {
        List<TerritorialUnit> recipients = database.getUnits(filter);

        for (TerritorialUnit unit : recipients) {
            unit.receiveMessage(new Message(this.name, message));
        }
    }

    public void registerUnit(TerritorialUnit unit) {
        database.addUnit(unit);
    }

    public void unregisterUnit(TerritorialUnit unit) {
        database.removeUnit(unit);
    }
}
