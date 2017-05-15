package pl.edu.agh.toik.stuff;

import pl.edu.agh.toik.agents.Agent;

import java.util.ArrayList;

/**
 * Created by m on 15.05.17.
 */
public class Properties {
    private ArrayList<Agent> neighbours;

    public Properties() {
        this.neighbours = new ArrayList<>();
    }

    public ArrayList<Agent> getNeighbours() {
        return neighbours;
    }

}
