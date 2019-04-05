
import java.util.*;

public class QuickFindUF {
    private int id[];


    public QuickFindUF(int N)
    {
        id  = new int[N];
        for(int i =0 ; i < id.length; i++)
        {
            id[i] = i ;
        }
    }

    private boolean quickFind(int p, int q)
    {
        return id[p] == id[q];
    }

    //Here we are doing the union of the 2nd element with the first one
    private void  union(int p, int q)
    {
        int pid = id[p];
        int qid = id[q];

        for(int i =0 ; i < id.length; i++)
            if(pid == id[i])
                id[i] = qid;
    }
}

