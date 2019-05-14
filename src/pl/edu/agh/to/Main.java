package pl.edu.agh.to;

import pl.edu.agh.to.model.*;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Ministry ministry = new Ministry("Ministry of Something");
        ministry.registerUnit(new ZUS("ZUS in Cracow"));
        ministry.registerUnit(new ZUS("ZUS in Warsaw"));
        ministry.registerUnit(new MOPS("MOPS in Wieliczka"));
        ministry.registerUnit(new MOPS("MOPS in Cedynia"));
        ministry.registerUnit(new MOPS("MOPS in Katowice"));
        ministry.registerUnit(new PUP("PUP in Cracow"));

        ministry.sendMessage("Hello there ZUS!!", new SendToTypes(ZUS.class));
        ministry.sendMessage("Welcome, all the MOPS units!!", new SendToTypes(MOPS.class));

        List<Class> zusAndMops = new ArrayList<>();
        zusAndMops.add(ZUS.class);
        zusAndMops.add(MOPS.class);

        ministry.sendMessage("Hello ZUS and MOPS!", new SendToTypes(zusAndMops));c

        ministry.sendMessage("Goodbye to all of you!!", new SendToAll());

        System.exit(0);

    }
}
