import java.util.*;

public class Graph {
    ArrayList<GraphNode> nodelist;
    int len;

    public Graph(ArrayList<GraphNode> nodelist) {
        this.nodelist = nodelist;
    }

    public void Dijkstra(GraphNode node) {
        node.distance = 0;
        PriorityQueue<GraphNode> list = new PriorityQueue<>();
        list.addAll(nodelist);
        while (!list.isEmpty()) {
            GraphNode current_node = list.remove();
            for (GraphNode neighbour : current_node.neibhours) {
                if (neighbour.distance > (current_node.distance + current_node.weightMap.get(neighbour))) {
                    neighbour.distance = current_node.distance + current_node.weightMap.get(neighbour);
                    neighbour.parent = current_node;
                    list.remove(neighbour);
                    list.add(neighbour);
                }
            }
            current_node.visited = true;
        }
        for (GraphNode n : nodelist) {
            System.out.print(n + ":");
            printPath(n);
            System.out.println();
        }
    }

    public void printPath(GraphNode n) {
        GraphNode node = n;
        if (node.parent != null) {
            printPath(node.parent);
        }
        System.out.print(node.name);
    }

    public void add_edge(int i, int j, int d) {
        nodelist.get(i).neibhours.add(nodelist.get(j));
        nodelist.get(i).weightMap.put(nodelist.get(j), d);
    }
}
