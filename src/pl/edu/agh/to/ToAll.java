package pl.edu.agh.to;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ToAll implements IFilterStrategy {

    @Override
    public List<TerritorialUnit> filterRecipients(Collection<TerritorialUnit> units) {
        return new ArrayList<TerritorialUnit>(units);
    }
}
