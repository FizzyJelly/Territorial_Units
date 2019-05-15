package pl.edu.agh.to.model;

import java.util.List;

public interface IFilterStrategy {

    List<TerritorialUnit> filterRecipients(List<TerritorialUnit> units);
}
