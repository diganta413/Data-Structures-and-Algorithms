import java.util.*;

public class Graph {
    ArrayList<GraphNode> nodelist = new ArrayList<GraphNode>();

    public Graph(ArrayList<GraphNode> nodelist) {
        this.nodelist = nodelist;
    }

    public void add_edge(int i, int j, int d) {
        nodelist.get(i).neibhours.add(nodelist.get(j));
        nodelist.get(i).weightMap.put(nodelist.get(j), d);
    }

    public void warshall() {
        int[][] mat = new int[nodelist.size()][nodelist.size()];
        int i, j;
        for (i = 0; i < nodelist.size(); i++) {
            GraphNode node = nodelist.get(i);
            for (j = 0; j < nodelist.size(); j++) {
                if (i == j) {
                    mat[i][j] = 0;
                } else if (node.neibhours.contains(nodelist.get(j))) {
                    mat[i][j] = node.weightMap.get(nodelist.get(j));
                } else {
                    mat[i][j] = Integer.MAX_VALUE / 10;
                }
            }
        }
        int k = 0;
        for (k = 0; k < nodelist.size(); k++) {
            for (i = 0; i < nodelist.size(); i++) {
                for (j = 0; j < nodelist.size(); j++) {
                    if (mat[i][j] > (mat[i][k] + mat[k][j])) {
                        mat[i][j] = mat[i][k] + mat[k][j];
                    }
                }
            }
        }
        // display
        for (i = 0; i < nodelist.size(); i++) {
            for (j = 0; j < nodelist.size(); j++) {
                System.out.print(mat[i][j] + "\t");
            }
            System.out.println("\n");
        }
    }
}