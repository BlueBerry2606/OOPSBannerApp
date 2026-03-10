public class OOPSBannerApp {

    static class CharacterPatternMap {

        private final char character;
        private final String[] pattern;

        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public char getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    public static CharacterPatternMap getOPattern() {
        return new CharacterPatternMap('O', new String[] {
            " ******* ",
            "*       *",
            "*       *",
            "*       *",
            "*       *",
            "*       *",
            " ******* "
        });
    }

    public static CharacterPatternMap getPPattern() {
        return new CharacterPatternMap('P', new String[] {
            "******** ",
            "*       *",
            "*       *",
            "******** ",
            "*        ",
            "*        ",
            "*        "
        });
    }

    public static CharacterPatternMap getSPattern() {
        return new CharacterPatternMap('S', new String[] {
            " ******* ",
            "*        ",
            "*        ",
            " ******* ",
            "        *",
            "        *",
            " ******* "
        });
    }

    public static void main(String[] args) {

        CharacterPatternMap[] chars = new CharacterPatternMap[] {
            getOPattern(),
            getOPattern(),
            getPPattern(),
            getSPattern()
        };

        for (int row = 0; row < 7; row++) {
            StringBuilder line = new StringBuilder();
            for (int col = 0; col < chars.length; col++) {
                line.append(chars[col].getPattern()[row]);
                if (col < chars.length - 1) {
                    line.append("  ");
                }
            }
            System.out.println(line.toString());
        }
    }
}