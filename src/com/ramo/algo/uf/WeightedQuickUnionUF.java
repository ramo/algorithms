package com.ramo.algo.uf;

import java.util.Arrays;

public class WeightedQuickUnionUF extends QuickUnionUF {

    private int[] sz;

    public WeightedQuickUnionUF(int n) {
        super(n);
        this.sz = new int[n];
        Arrays.fill(this.sz, 1);
    }

    @Override
    public void union(int p, int q) {
        int i = root(p);
        int j = root(q);

        /**
         * already connected.
         * Don't proceed otherwise,
         * it would double size wrongly.
         */
        if (i == j) {
            return;
        }

        if (sz[i] < sz[j]) {
            id[i] = j;
            sz[j] += sz[i];
        } else {
            id[j] = i;
            sz[i] += sz[j];
        }
    }
}
