package io.github.ciscorucinski.hangul;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        String korean = "나는 Chris입니다. 4-Jamo: 퓛";
        System.out.println(korean);

        for (Character symbol: korean.toCharArray()) {

            System.out.println();

            if (!Utils.isPrecompiledHangul(symbol)) {
                System.out.println(symbol == ' ' ? "[SPACE]": symbol);
                continue;
            }

            System.out.print(symbol + "\t>>");
            List<Integer> decomposition = Utils.fullCanonicalDecomposition(symbol);

            for (Integer part : decomposition) {

                // todo Map characters to their typed in version ( ᄂ >> ㄴ)
                if (part == 0) continue;

                System.out.print('\t');
                System.out.print(Character.toChars(part));

            }

        }
    }
}
