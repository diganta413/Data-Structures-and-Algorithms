import java.util.*;

public class Graph {
    public ArrayList<GraphNode> list = new ArrayList<GraphNode>();
    public int[][] adjacencyList;

    public Graph(ArrayList<GraphNode> list) {
        this.list = list;
        adjacencyList = new int[list.size()][list.size()];
    }

    public void add(int i, int j) {
        adjacencyList[i][j] = 1;
        adjacencyList[j][i] = 1;
    }

    public void print() {
        int i, j;
        for (i = 0; i < list.size(); i++) {
            for (j = 0; j < list.size(); j++) {
                if (adjacencyList[i][j] == 1)
                    System.out.print(adjacencyList[i][j]);
                else
                    System.out.print(0);
            }
            System.out.println("\n");
        }
    }

    public ArrayList<GraphNode> get_neighbours(GraphNode node) {
        int index = node.index;
        int i;
        ArrayList<GraphNode> neighbours = new ArrayList<GraphNode>();
        for (i = 0; i < list.size(); i++) {
            if (adjacencyList[index][i] == 1) {
                neighbours.add(list.get(i));
            }
        }
        return neighbours;
    }

    public void BFS(GraphNode node) {
        LinkedList<GraphNode> Q = new LinkedList<>();
        Q.add(node);
        while (!Q.isEmpty()) {
            GraphNode node_deleted = Q.remove(0);
            System.out.println(node_deleted.name);
            node_deleted.isVisited = true;
            ArrayList<GraphNode> neighbours = get_neighbours(node_deleted);
            for (GraphNode n : neighbours) {
                if (!n.isVisited) {
                    Q.add(n);
                    n.isVisited = true;
                }
            }
        }
    }

    public void getBFS() {
        for (GraphNode node : list) {
            if (!node.isVisited) {
                BFS(node);
            }
        }
    }

    public void DFS(GraphNode node) {
        Stack<GraphNode> s = new Stack<GraphNode>();
        s.push(node);
        while (!s.isEmpty()) {
            GraphNode current = s.pop();
            current.isVisited = true;
            System.out.println(current.name);
            ArrayList<GraphNode> neighbours = get_neighbours(current);
            for (GraphNode n : neighbours) {
                if (!n.isVisited) {
                    s.push(n);
                    n.isVisited = true;
                }
            }
        }
    }

    public void getDFS() {
        for (GraphNode node : list) {
            if (!node.isVisited) {
                DFS(node);
            }
        }
    }

}