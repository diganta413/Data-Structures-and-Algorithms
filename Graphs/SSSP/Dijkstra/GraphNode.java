import java.util.*;

public class GraphNode implements Comparable<GraphNode> {
    public int index;
    public String name;
    public ArrayList<GraphNode> neibhours = new ArrayList<GraphNode>();
    public HashMap<GraphNode, Integer> weightMap = new HashMap<>();
    public int distance;
    public boolean visited;
    public GraphNode parent;

    public GraphNode(int index, String name) {
        this.index = index;
        this.name = name;
        visited = false;
        distance = Integer.MAX_VALUE;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int compareTo(GraphNode n) {
        return (this.distance - n.distance);
    }
}
