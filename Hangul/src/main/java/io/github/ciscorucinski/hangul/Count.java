package io.github.ciscorucinski.hangul;

public enum Count {

    L (19),
    V (21),
    T (28),

    N (T.count * V.count),
    S (L.count * N.count);

    public final int count;

    Count(int count) {
        this.count = count;
    }
}