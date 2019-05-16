package pl.edu.agh.to;

import java.util.Collection;
import java.util.List;

public interface IFilterStrategy {

    List<TerritorialUnit> filterRecipients(Collection<TerritorialUnit> units);
}
