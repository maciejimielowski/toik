package pl.edu.agh.toik.worker;

import pl.edu.agh.toik.agents.Agent;
import pl.edu.agh.toik.agents.AgentFactory;
import pl.edu.agh.toik.communication.CommunicationService;
import pl.edu.agh.toik.communication.Message;
import pl.edu.agh.toik.stuff.Properties;
import pl.edu.agh.toik.stuff.StopCondition;

import java.util.ArrayList;

/**
 * Created by m on 15.05.17.
 */
public class Worker {

    private CommunicationService communicationService;
    private String name;
    private AgentFactory agentFactory;
    private ArrayList<Agent> agents;
    private StopCondition stopCondition;
    private int counter;

    public Worker(StopCondition stopCondition, Properties properties) {
        this.agentFactory = new AgentFactory();
        this.agents = new ArrayList<>();
        this.stopCondition = stopCondition;
        this.counter = 0;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCommunicationService(CommunicationService commService) {
        this.communicationService = commService;
    }

    /*
    command from Starter to make steps
     */
    public void makeStep(){
        if (checkStopCondition(stopCondition)) {
            counter++;
            for (Agent a: agents) {
                a.makeStep();
            }
        }
        else {
            System.out.println("no more steps");
        }
    }

    public boolean checkStopCondition(StopCondition stopCondition) {
        //stub
        if (counter < stopCondition.getSteps()) {
            return true;
        }
        else {
            return false;
        }

    }

    public int createAgents(int numOfAgents, Properties properties) {
        return 0;
    }

    //stub
    public void checkOwnAgents(String name) {
    }

    /*
    maybe delete receiveMessage?
     */
    public void receiveMessage(Message msg) {
        //check things - check own agents
    }

    public void sendMessage(Message msg) {
        communicationService.sendMessage(msg);
        System.out.println("msg sent from worker: " + name);
    }

}
