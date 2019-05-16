package pl.edu.agh.to;

public class ZUSUnit implements ZUS {

    private String name;

    public ZUSUnit(String name) {
        this.name = name;
    }

    @Override
    public void receiveMessage(Message message) {
        String toShow = String.format("Unit \033[0;32m%s\033[0m  received message from: \033[0;32m%s\033[0m.\t Message: \033[0;33m%s\033[0m", this.name, message.getSender(), message.getMessageText());
        System.out.println(toShow);
    }
}
