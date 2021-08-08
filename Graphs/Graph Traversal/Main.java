import java.util.*;

class Main {
    public static void main(String[] args) {
        ArrayList list = new ArrayList<GraphNode>();
        list.add(new GraphNode("A", 0));
        list.add(new GraphNode("B", 1));
        list.add(new GraphNode("C", 2));
        list.add(new GraphNode("D", 3));
        list.add(new GraphNode("E", 4));
        Graph graph = new Graph(list);
        graph.add(0, 1);
        graph.add(0, 2);
        graph.add(0, 3);
        graph.add(1, 4);
        graph.add(2, 3);
        graph.add(3, 4);
        graph.print();
        System.out.println("\n");
        graph.getBFS();
    }
}