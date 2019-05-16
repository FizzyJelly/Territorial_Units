package pl.edu.agh.to;

public interface TerritorialUnit {

    // If below method's name was "sendMessage" it would suggest that it is sending message
    // We want it to be the recipient not the sender
    void receiveMessage(Message message);
}
