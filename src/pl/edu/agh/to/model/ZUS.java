package pl.edu.agh.to.model;

public class ZUS implements TerritorialUnit {

    @Override
    public void receiveMessage(Message message) {
        String toShow = String.format("Sent by: %s,\t Message: %s", message.getSender(), message.getMessageText());
    }
}
