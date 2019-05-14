package pl.edu.agh.to.model;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SendToTypes implements ISendStrategy {

    private List<Class> recipientTypes;

    @Override
    public List<TerritorialUnit> filterRecipients(List<TerritorialUnit> units) {
        List<TerritorialUnit> recipients = units.stream().filter(unit -> recipientTypes.contains(unit.getClass())).collect(Collectors.toList());
        return recipients;
    }

    public SendToTypes() {
        recipientTypes = new ArrayList<>();
    }

    public SendToTypes(Class targetType) {
        this();
        if (TerritorialUnit.class.isAssignableFrom(targetType)) {
            recipientTypes.add(targetType);
        }
    }

    public SendToTypes(List<Class> targetTypes) {
        this();
        for (Class type : targetTypes) {
            if (TerritorialUnit.class.isAssignableFrom(type)) { // does it implement Territorial unit?
                recipientTypes.add(type);
            }
        }
    }
}
