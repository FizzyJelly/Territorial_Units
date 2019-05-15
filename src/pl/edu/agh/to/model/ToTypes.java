package pl.edu.agh.to.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ToTypes implements IFilterStrategy {

    private List<Class> recipientTypes;

    @Override
    public List<TerritorialUnit> filterRecipients(List<TerritorialUnit> units) {
        //System.out.println(units);
        List<TerritorialUnit> recipients = new ArrayList<>();

        for (TerritorialUnit unit : units) {

            for (Class type : unit.getClass().getInterfaces()) {
                if (recipientTypes.contains(type)) {
                    recipients.add(unit);
                    break;
                }
            }
        }

        //System.out.println(recipients.toString());
        return recipients;
    }

    public ToTypes() {
        recipientTypes = new ArrayList<>();
    }

    public ToTypes(Class targetType) {
        this();
        //System.out.println(targetType.toString());
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
