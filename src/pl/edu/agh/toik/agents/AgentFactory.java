package pl.edu.agh.toik.agents;

import pl.edu.agh.toik.stuff.AgentObservator;
import pl.edu.agh.toik.stuff.Properties;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by m on 15.05.17.
 */
public class AgentFactory {

    private Properties properties;

    public AgentFactory(Properties properties) {
        this.properties = properties;
    }

    //where should agent name be decided?
    public Agent getAgent(String name) {
        Agent agent = new Agent();
        agent.setAgentObservator(new AgentObservator());
        agent.setName(name);
        agent.setNeighbours(getNeighbours(name));

        return agent;
    }

    public List<Agent> getAgents(int numOfAgents) {
        List<Agent> agents = new ArrayList<>();
        for(int i = 0; i < numOfAgents; i++) {
            agents.add(getAgent("agent" + i));
        }
        return agents;
    }

    //to be changed with proper properties
    private ArrayList<Agent> getNeighbours(String agentName) {
        return this.properties.getNeighbours();
    }


}
