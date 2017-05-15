package pl.edu.agh.toik.agents;

import pl.edu.agh.toik.communication.Message;
import pl.edu.agh.toik.stuff.AgentObservator;
import pl.edu.agh.toik.stuff.Properties;

import java.util.ArrayList;

/**
 * Created by m on 15.05.17.
 */
public class Agent {


    //temporary stub for neighbours - maybe just an array of names?
    private ArrayList neighbours;
    private String name;
    private AgentObservator agentObservaator;
    private Properties properties;

    public  ArrayList       getNeighbours() {
        return neighbours;
    }public void            setNeighbours(ArrayList neighbours) {
        this.neighbours = neighbours;
    }public String          getName() {
        return name;
    }public void            setName(String name) {
        this.name = name;
    }public AgentObservator getAgentObservaator() {
        return agentObservaator;
    }public void            setAgentObservaator(AgentObservator agentObservaator) {
        this.agentObservaator = agentObservaator;
    }public Properties      getProperties() {
        return properties;
    }public void            setProperties(Properties properties) {
        this.properties = properties;
    }

    public Agent() {
        this.neighbours = new ArrayList();
    }

    public void makeStep() {
        System.out.println("doing some steps...");
    }

    public void receiveMessage(Message message) {

    }

    public void sendMessage(Message msg) {

    }


}
