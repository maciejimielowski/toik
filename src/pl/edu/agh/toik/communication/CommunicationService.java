package pl.edu.agh.toik.communication;

/**
 * Created by m on 15.05.17.
 */
public class CommunicationService {

    public CommunicationService() {
        System.out.println("comm service created");
    }

    //commmservice stub
    public void sendMessage(Message msg) {
        System.out.println("message sent from: " + msg.getSender() + " to: "+ msg.getReceiver() );
    }
}
