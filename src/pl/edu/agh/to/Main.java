package pl.edu.agh.to;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Database database = new Database();

        Ministry ministry = new Ministry("Ministry of Something", database);
        ministry.registerUnit(new ZUSUnit("ZUSUnit in Cracow"));
        ministry.registerUnit(new ZUSUnit("ZUSUnit in Warsaw"));
        ministry.registerUnit(new MOPSUnit("MOPSUnit in Wieliczka"));
        ministry.registerUnit(new MOPSUnit("MOPSUnit in Cedynia"));
        ministry.registerUnit(new MOPSUnit("MOPSUnit in Katowice"));
        ministry.registerUnit(new PUPUnit("PUPUnit in Cracow"));
        ministry.registerUnit(new MonsterUnit());
        ministry.sendMessage("Hello there ZUSUnit!!", ZUS.class);
        ministry.sendMessage("Welcome, all the MOPSUnit units!!", MOPS.class);

        List<Class> zusAndMops = new ArrayList<>();
        zusAndMops.add(ZUS.class);
        zusAndMops.add(MOPS.class);

        ministry.sendMessage("Hello ZUSUnit and MOPSUnit!", zusAndMops);

        ministry.sendMessageToAll("Goodbye to all of you!!");

        System.exit(0);

    }
}
