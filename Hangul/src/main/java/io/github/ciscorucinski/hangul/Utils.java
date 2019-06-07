package io.github.ciscorucinski.hangul;

import java.util.List;

public class Utils {

    public static boolean isPrecompiledHangul(int hangulSyllable) {
        return hangulSyllable >= Base.S.character
                && hangulSyllable <= Base.S.character + Count.S.count;
    }
    public static int getPrecomposedHangulIndex(int hangulSyllable) {
        // todo Check that syllable is within range
        return hangulSyllable - Base.S.character;
    }

    // todo Convert List<Integer> into a class that holds them
    public static List<Integer> fullCanonicalDecomposition(int hangulSyllable) {
        int index_s = hangulSyllable - Base.S.character;

        int index_l = index_s / Count.N.count;
        int index_v = (index_s % Count.N.count) / Count.T.count;
        int index_t = index_s % Count.T.count;

        int part_l = Base.L.character + index_l;
        int part_v = Base.V.character + index_v;
        int part_t = index_t > 0
                ? Base.T.character + index_t
                : 0;

        // todo decompose part_l, part_v, and part_t if needed (map characters to their decomposed parts directly or with algorithm)

        return List.of(part_l, part_v, part_t);

    }

}

