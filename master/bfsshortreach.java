import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testcases = in.nextInt();
        while (testcases-- > 0) {
            int numNodes = in.nextInt();
            Map<Integer, Node> nodeMap = new HashMap<>();
            while(numNodes-- > 0)
                nodeMap.put(numNodes + 1, new Node(numNodes + 1));
            
            int numEdges = in.nextInt();
            while (numEdges-- > 0) {
                Node x = nodeMap.get(in.nextInt());
                Node y = nodeMap.get(in.nextInt());
                x.neighbors.add(y);
                y.neighbors.add(x);
            }
            int start = in.nextInt();
            bfsFromStart(nodeMap, nodeMap.get(start), 6);
        }
    }
    
    private static void bfsFromStart(Map<Integer, Node> nodeMap, Node start, int edgeVal) {
        Map<Node, Integer> pathLengths = new HashMap<>();
        bfsRec(Collections.singleton(start), pathLengths, 0);
        
        for(int i = 1, size = nodeMap.size(); i <= size; ++i) {
            Node node = nodeMap.get(i);
            if (node == start)
                continue;
            if(!pathLengths.containsKey(node)) {
                System.out.print("-1 ");
                continue;
            }
            System.out.print(pathLengths.get(node) * edgeVal + " ");
        }
        System.out.println();
    }
    
    private static void bfsRec(Iterable<Node> queue, Map<Node, Integer> visitedMap, int depth) {
        Iterator<Node> iter = queue.iterator();
        Set<Node> neighbors = new HashSet<>();
        while(iter.hasNext()) {
            Node curr = iter.next();
            if (!visitedMap.containsKey(curr)) {
                visitedMap.put(curr, depth);
                neighbors.addAll(curr.neighbors);
            }
        }
        
        if (!neighbors.isEmpty()) {
            bfsRec(neighbors, visitedMap, depth + 1);
        }
    }
}

class Graph {
    public final Map<Integer, Node> nodes;
    public final Set<Edge> edges;
    
    public Graph(Map<Integer, Node> nodes, Set<Edge> edges) {
        this.nodes = nodes;
        this.edges = edges;
    }
}

class Edge {
    public final Node x;
    public final Node y;
    
    public Edge(Node x, Node y) {
        this.x = x;
        this.y = y;
        x.neighbors.add(y);
        y.neighbors.add(x);
    }
}

class Node {
    public final int n;
    public Set<Node> neighbors;
    
    public Node(int n) {
        this.n = n;
        neighbors = new HashSet<>();
    }
    public String toString() {
        return String.valueOf(n);
    }
}
