package io.github.ciscorucinski.hangul;

public enum Base {

    S (0xAC00),
    L (0x1100),
    V (0x1161),
    T (0x11A7);

    public final int character;

    Base(int location) {
        this.character = location;
    }
}
