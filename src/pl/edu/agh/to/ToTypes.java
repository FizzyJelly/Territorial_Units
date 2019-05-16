package pl.edu.agh.to;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class ToTypes implements IFilterStrategy {

    private List<Class> recipientTypes;

    @Override
    public List<TerritorialUnit> filterRecipients(Collection<TerritorialUnit> units) {
        return units.stream().filter(unit -> Arrays.stream(unit.getClass().getInterfaces()).anyMatch(type -> recipientTypes.contains(type))).collect(Collectors.toList());
    }

    public ToTypes() {
        recipientTypes = new ArrayList<>();
    }

    public ToTypes(Class targetType) {
        this();
        if (TerritorialUnit.class.isAssignableFrom(targetType)) {
            recipientTypes.add(targetType);
        }
    }

    public ToTypes(List<Class> targetTypes) {
        this();
        for (Class type : targetTypes) {
            if (TerritorialUnit.class.isAssignableFrom(type)) { // does it implement Territorial unit?
                recipientTypes.add(type);
            }
        }
    }
}
