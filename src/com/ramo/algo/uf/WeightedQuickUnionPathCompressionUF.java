package com.ramo.algo.uf;

public class WeightedQuickUnionPathCompressionUF extends WeightedQuickUnionUF {

    public WeightedQuickUnionPathCompressionUF(int n) {
        super(n);
    }

    @Override
    protected int root(int i) {
        int root = super.root(i);

        // path compression
        while (i != id[i]) {
            int j = i;
            i = id[i];
            id[j] = root;
        }
        return root;
    }
}
