public class QuickUnionUF {
    private int id[];
    private int size[];

    public QuickUnionUF(int N) {
        id = new int[N];
        size = new int[N];
        for (int i = 0; i < id.length; i++) {
            id[i] = i;
            size[i] = 1;
        }
    }

    //Find maximum element in a connected component
    private void find(i) {
        max = i;
        int a = root(i);
        for (int j = 0; j < id.length; j++) {
            temp = root(id[j]);
            if (temp == a)
                if (j > max)
                    max = j;
        }
        return max;
    }

    private int getRoot(int i) {
        while (id[i] != i) {
            id[i] = id[id[i]];
            i = id[i];
        }
        return i;
    }

    private boolean isConnected(int p, int q) {
        return getRoot(p) == getRoot(q);
    }

    //
    private void union(int p, int q) {
        int i = root(p);
        int j = root(q);
        sendValues(p, q);
        /*id[i] = j;*/
        //Improvement over the previous algorithm using an extra array
        if (i == j)
            return;
        if (size[i] < size[j]) {
            id[i] = j;
            size[j] += size[i];
        } else {
            id[j] = i;
            size[i] += size[j];

        }
    }
}

