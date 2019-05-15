package pl.edu.agh.to.model;

import java.util.ArrayList;
import java.util.List;

public class Database {

    private List<TerritorialUnit> units;

    public Database() {
        units = new ArrayList<>();
    }

    public List<TerritorialUnit> getUnits(IFilterStrategy filter){
        return filter.filterRecipients(units);
    }

    public void addUnit(TerritorialUnit unit){
        units.add(unit);
    }

    public void removeUnit(TerritorialUnit unit){
        units.remove(unit);
    }

}
