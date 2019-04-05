import java.util.*;

class Graph {
    public class Edge {
        int v, w;

        public Edge(int v, int w) {
            this.v = v;
            this.w = w;
        }

        @Override
        public String toString() {
            return "Edge{" +
                    "v=" + v +
                    ", w=" + w +
                    '}';
        }
    }

    private LinkedList<Edge> G[];

    public Graph(int n) {
        G = new LinkedList[n];
        for (int i = 0; i < n; i++) {
            G[i] = new LinkedList<>();
        }
    }

    boolean isConnected(int u, int v) {
        for (Edge e : G[u]) {
            if (e.v == v) {
                return true;
            }
        }
        return false;
    }

    void addEdge(int u, int v, int w) {
        G[u].add(0, new Edge(v, w));
    }

    @Override
    public String toString() {
        String result = "";
        for (int i = 0; i < G.length; i++) {
            result += i + "==>" + G[i] + "\n";
        }
        return result;
    }
}

public class graphAdjacencyList {
    public static void main(String args[]) {
        Graph graph = new Graph(6);
        graph.addEdge(0, 2, 16);
        graph.addEdge(0, 4, 8);
        graph.addEdge(1, 0, 56);
        graph.addEdge(2, 5, 54);
        graph.addEdge(3, 4, 9);
        graph.addEdge(4, 1, 56);
        System.out.println(graph);
        System.out.println(graph.isConnected(0, 2));
        System.out.println(graph.isConnected(1, 2));
    }
}
