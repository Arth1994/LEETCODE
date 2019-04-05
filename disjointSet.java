package GraphAlgorithms;

import java.util.*;


public class disjointSet {
    Map<Integer, Node> map = new HashMap<>();

    class Node {
        int data;
        int rank;
        Node parent;
    }

    public void makeSet(int data) {
        Node node = new Node();
        node.parent = node;
        node.rank = 0;
        map.put(data, node);
    }

    public void union(int d1, int d2) {
        Node n1 = map.get(d1);
        Node n2 = map.get(d2);

        Node p1 = findSet(n1);
        Node p2 = findSet(n2);

        if (p1.data == p2.data) {
            return;
        }

        if (p1.rank >= p2.rank) {
            p2.parent = p1;
        } else {
            p1.parent = p2;
        }

    }

    //Find Representative of Particulkar set
    public int findSet(int data) {
        return findSet(map.get(data)).data;
    }

    //Path Compression is followed
    private Node findSet(Node node) {
        Node parent = node.parent;
        if (parent == node) {
            return parent;
        }
        node.parent = findSet(node.parent);
        return node.parent;
    }


    public static void main(String args[]) {
        disjointSet ds = new disjointSet();
        ds.makeSet(1);
        ds.makeSet(2);
        ds.makeSet(3);
        ds.makeSet(4);
        ds.makeSet(5);
        ds.makeSet(6);
        ds.makeSet(7);

        ds.union(1, 2);
        ds.union(2, 3);
        ds.union(4, 5);
        ds.union(6, 7);
        ds.union(5, 6);
        ds.union(3, 7);

        System.out.println(ds.findSet(1));
        System.out.println(ds.findSet(2));
        System.out.println(ds.findSet(3));
        System.out.println(ds.findSet(4));
        System.out.println(ds.findSet(5));
        System.out.println(ds.findSet(6));
        System.out.println(ds.findSet(7));
    }
}