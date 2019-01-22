package com.ramo.algo.uf;

public abstract class UF {

    protected int n;
    protected UF(int n) {
        this.n = n;
    }

    public abstract boolean connected(int p, int q);
    public abstract void union(int p, int q);
}
