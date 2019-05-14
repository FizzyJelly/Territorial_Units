package pl.edu.agh.to.model;

import java.util.ArrayList;
import java.util.List;

public class SendToAll implements ISendStrategy {

    @Override
    public List<TerritorialUnit> filterRecipients(List<TerritorialUnit> units) {
        return new ArrayList<TerritorialUnit>(units);
    }
}
