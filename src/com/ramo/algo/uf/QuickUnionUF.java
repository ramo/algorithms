package com.ramo.algo.uf;

public class QuickUnionUF extends UF {

    protected int[] id;

    public QuickUnionUF(int n) {
        super(n);
        this.id = new int[n];
        for (int i = 0; i < n; i++) {
            id[i] = i;
        }
    }

    @Override
    public boolean connected(int p, int q) {
        return root(p) == root(q);
    }

    protected int root(int i) {
        while (id[i] != i) {
            i = id[i];
        }
        return i;
    }

    @Override
    public void union(int p, int q) {
        int i = root(p);
        int j = root(q);
        id[i] = j;
    }
}
