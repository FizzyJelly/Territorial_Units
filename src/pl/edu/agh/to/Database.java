package pl.edu.agh.to;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Database {

    private Set<TerritorialUnit> units;

    public Database() {
        units = new LinkedHashSet<>();
    }

    public List<TerritorialUnit> getUnits(IFilterStrategy filter) {
        return filter.filterRecipients(units);
    }

    public void addUnit(TerritorialUnit unit) {
        units.add(unit);
    }

    public void removeUnit(TerritorialUnit unit) {
        units.remove(unit);
    }

}
