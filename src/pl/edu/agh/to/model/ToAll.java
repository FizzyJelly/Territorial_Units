package pl.edu.agh.to.model;

import java.util.ArrayList;
import java.util.List;

public class ToAll implements IFilterStrategy {

    @Override
    public List<TerritorialUnit> filterRecipients(List<TerritorialUnit> units) {
        return new ArrayList<TerritorialUnit>(units);
    }
}
