package pl.edu.agh.toik.worker;

import pl.edu.agh.toik.agents.Agent;
import pl.edu.agh.toik.agents.AgentFactory;
import pl.edu.agh.toik.communication.CommunicationService;
import pl.edu.agh.toik.communication.Message;
import pl.edu.agh.toik.stuff.Properties;
import pl.edu.agh.toik.stuff.StopCondition;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by m on 15.05.17.
 */
public class Worker {

    private CommunicationService communicationService;
    private String name;
    private AgentFactory agentFactory;
    private List<Agent> agents;
    private StopCondition stopCondition;
    private int stepCounter;
    private ArrayList<Worker> workers;

    public Worker(StopCondition stopCondition, Properties properties) {
        this.agentFactory = new AgentFactory(properties);
        this.agents = new ArrayList<>();
        this.stopCondition = stopCondition;
        this.stepCounter = 0;
    }

    /*
    getters and setters
     */

    public void setName(String name) {
        this.name = name;
    }

    public void setCommunicationService(CommunicationService commService) {
        this.communicationService = commService;
    }

    public ArrayList<Worker> getWorkers() {
        return workers;
    }

    public void setWorkers(ArrayList<Worker> workers) {
        this.workers = workers;
    }

    /*
    command from Starter to make steps
     */
    public void makeStep(){
        if (checkStopCondition(stopCondition)) {
            stepCounter++;
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
        if (stepCounter < stopCondition.getSteps()) {
            return true;
        } else {
            return false;
        }
    }

    public void createAgents(int numOfAgents) {
        this.agents = agentFactory.getAgents(numOfAgents);
    }

    //stub
    public Agent checkOwnAgents(String name) {
        for (Agent a: agents) {
            if(a.getName().equals(name)) {
                return a;
            }
        }
        return null;
    }

    public void sendMessage(Message msg) {
        Agent agent = checkOwnAgents(msg.getReceiver());
        if(agent!=null) {
            agent.receiveMessage(msg);
        } else {
            //stub
            communicationService.sendMessage(msg);
            System.out.println("msg sent from worker: " + name);
        }

    }

}
