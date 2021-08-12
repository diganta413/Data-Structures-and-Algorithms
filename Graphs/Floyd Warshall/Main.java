import java.util.*;

class Main {

    public static void main(String[] args) {
        ArrayList<GraphNode> nodelist = new ArrayList<GraphNode>();
        nodelist.add(new GraphNode(0, "A"));
        nodelist.add(new GraphNode(1, "B"));
        nodelist.add(new GraphNode(2, "C"));
        nodelist.add(new GraphNode(3, "D"));
        Graph graph = new Graph(nodelist);
        graph.add_edge(0, 3, 1);
        graph.add_edge(0, 1, 8);
        graph.add_edge(1, 2, 1);
        graph.add_edge(2, 0, 4);
        graph.add_edge(3, 1, 2);
        graph.add_edge(3, 2, 9);
        graph.warshall();
    }

}