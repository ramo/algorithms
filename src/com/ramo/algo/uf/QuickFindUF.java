package com.ramo.algo.uf;

public class QuickFindUF extends UF {

    private int[] id;
    public QuickFindUF(int n) {
        super(n);
        this.id = new int[n];
        for (int i = 0; i < n; i++) {
            id[i] = i;
        }
    }

    @Override
    public boolean connected(int p, int q) {
        return id[p] == id[q];
    }

    @Override
    public void union(int p, int q) {
        int pid = id[p];
        int qid = id[q];
        for (int i = 0; i < n; i++) {
            if (id[i] == pid) {
                id[i] = qid;
            }
        }
    }
}
