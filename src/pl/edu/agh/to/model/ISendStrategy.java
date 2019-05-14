package pl.edu.agh.to.model;

import java.util.List;

public interface ISendStrategy {

    List<TerritorialUnit> filterRecipients(List<TerritorialUnit> units);
}
