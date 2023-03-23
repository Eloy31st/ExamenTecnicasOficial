package Practica3;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Graph<V> {
    private Map<V, Set<V>> adjacencyList = new HashMap<>();

    public boolean addVertex(V vertex){
        if(adjacencyList.containsKey(vertex)){
            return false;
        }
        adjacencyList.put(vertex, null);
        return true;
    }

    public boolean addEdge(V vertice1, V vertice2){
        if(!adjacencyList.containsKey(vertice1) || !adjacencyList.containsKey(vertice2)){
            return false;
        }
        adjacencyList.get(vertice1).add(vertice2);
        adjacencyList.get(vertice2).add(vertice1);
        return true;
    }
}
