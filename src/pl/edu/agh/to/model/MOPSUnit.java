package pl.edu.agh.to.model;

public class MOPSUnit implements MOPS {

    private String name;

    public MOPSUnit(String name) {
        this.name = name;
    }

    @Override
    public void receiveMessage(Message message) {
        String toShow = String.format("Unit \033[0;32m%s\033[0m  received message from: \033[0;32m%s\033[0m. Message: \033[0;31m%s\033[0m", this.name, message.getSender(), message.getMessageText());
        System.out.println(toShow);
    }
}
