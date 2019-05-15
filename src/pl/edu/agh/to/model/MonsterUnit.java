package pl.edu.agh.to.model;

public class MonsterUnit implements ZUS, PUP, MOPS {

    @Override
    public void receiveMessage(Message message) {
        System.out.println("I am an abomination!!!");
    }
}
