package pl.edu.agh.toik;

import pl.edu.agh.toik.communication.CommunicationService;
import pl.edu.agh.toik.stuff.Properties;
import pl.edu.agh.toik.stuff.StopCondition;
import pl.edu.agh.toik.worker.Worker;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        // Starter stub

        /*

        create new Workers
        start Workers
        do smth

         */

        StopCondition stopCon = new StopCondition(20);
        Properties properties = new Properties();
        CommunicationService communicationService = new CommunicationService();

        Worker w1 = new Worker(stopCon, properties);
        w1.setName("TEST");
        w1.setCommunicationService(communicationService);
        w1.createAgents(15, properties);
        w1.makeStep();



    }
}
