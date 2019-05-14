package pl.edu.agh.to.model;

public class PUP implements TerritorialUnit {

    private String name;

    public PUP(String name) {
        this.name = name;
    }

    @Override
    public void receiveMessage(Message message) {
        String toShow = String.format("Unit \033[0;32m%s\033[0m  received message from: \033[0;32m%s\033[0m.\t Message: \033[0;34m%s\033[0m", this.name, message.getSender(), message.getMessageText());
        System.out.println(toShow);
    }
}
