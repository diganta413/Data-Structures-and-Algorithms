import java.util.*;

class Main {
    public static void main(String[] args) {
        ArrayList<GraphNode> nodelist = new ArrayList<GraphNode>();
        nodelist.add(new GraphNode(0, "A"));
        nodelist.add(new GraphNode(1, "B"));
        nodelist.add(new GraphNode(2, "C"));
        nodelist.add(new GraphNode(3, "D"));
        nodelist.add(new GraphNode(4, "E"));
        nodelist.add(new GraphNode(5, "F"));
        nodelist.add(new GraphNode(6, "G"));
        Graph g = new Graph(nodelist);
        g.add_edge(0, 1, 2);
        g.add_edge(0, 2, 5);
        g.add_edge(1, 2, 6);
        g.add_edge(1, 3, 1);
        g.add_edge(1, 4, 3);
        g.add_edge(2, 5, 8);
        g.add_edge(3, 4, 4);
        g.add_edge(4, 6, 9);
        g.add_edge(5, 6, 7);
        g.Dijkstra(nodelist.get(0));
    }

}