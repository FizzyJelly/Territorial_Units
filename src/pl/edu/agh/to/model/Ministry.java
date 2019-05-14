package pl.edu.agh.to.model;

import java.util.ArrayList;
import java.util.List;

public class Ministry {

    private String name;
    private List<TerritorialUnit> units;

    public Ministry(String name) {
        this.name = name;
        units = new ArrayList<>();
    }

    public void sendMessage(String message, ISendStrategy strategy){
        List<TerritorialUnit> recipients = strategy.filterRecipients(units);

        for(TerritorialUnit unit : recipients){
            unit.receiveMessage(new Message(this.name,message));
        }
    }

    public void registerUnit(TerritorialUnit unit) {
        units.add(unit);
    }

    public void unregisterUnit(TerritorialUnit unit) {
        units.remove(unit);
    }
}
