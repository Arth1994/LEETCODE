import java.util.*;

import static javafx.scene.input.KeyCode.T;

public class MaxHeap implements Comparable<BinarySearchTree.Node> {
    int lastPosition;
    BinarySearchTree.Node[] array = (BinarySearchTree.Node[]) new Object(size);

    public void add(BinarySearchTree.Node obj) {
        array[++lastPosition] = obj;
        trickleUp(lastPosition);
    }

    public void trickleUp(int position) {
        if (position == 0)
            return;

        int parent = (int) Math.floor((position - 1) / 2);

        if (array[position].compareTo(array[parent]) > 0) {
            swap(position, parent);
            trickleUp(parent);
        }
    }

    public BinarySearchTree.Node remove() {
        BinarySearchTree.Node temp = new BinarySearchTree.Node();
        swap(0, lastPosition);
        trickleDown(0);
        return temp;
    }

    public void trickleDown(int parent) {
        int left = parent * 2 + 1;
        int right = parent * 2 - 1;

        if (left == lastPosition && ((array[parent].compareTo(array[left])) < 0)) {
            swap(parent, left);
            return;
        }
        if (right == lastPosition && ((array[parent].compareTo(array[right])) < 0)) {
            swap(parent, right);
            return;
        }

        if (left >= lastPosition || right >= lastPosition)
            return;

        if (array[left] > array[right] && array[parent] < array[left]) {
            swap(parent, left);
            trickleDown(left);
        } else if (array[parent] < array[right]) {
            swap(parent, right);
            trickleDown(right);
        }
    }
}

