/**
 * OOPS Banner App - UC7
 */
public class OOPSBannerApp {

    /**
     * Inner static class to store character pattern
     */
    static class CharacterPattern {
        private char character;
        private String[] pattern;

        // Constructor
        public CharacterPattern(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        // Getter
        public String[] getPattern() {
            return pattern;
        }
    }

    // Method to get O pattern
    public static CharacterPattern getOPattern() {
        return new CharacterPattern('O', new String[]{
                "  *****  ",
                " *     * ",
                " *     * ",
                " *     * ",
                " *     * ",
                " *     * ",
                "  *****  "
        });
    }

    // Method to get P pattern
    public static CharacterPattern getPPattern() {
        return new CharacterPattern('P', new String[]{
                " ******  ",
                " *     * ",
                " *     * ",
                " ******  ",
                " *       ",
                " *       ",
                " *       "
        });
    }

    // Method to get S pattern
    public static CharacterPattern getSPattern() {
        return new CharacterPattern('S', new String[]{
                "  *****  ",
                " *       ",
                " *       ",
                "  *****  ",
                "       * ",
                "       * ",
                "  *****  "
        });
    }

    public static void main(String[] args) {

        CharacterPattern o = getOPattern();
        CharacterPattern p = getPPattern();
        CharacterPattern s = getSPattern();

        String[] oPattern = o.getPattern();
        String[] pPattern = p.getPattern();
        String[] sPattern = s.getPattern();

        // Build banner using StringBuilder
        String[] banner = new String[7];

        for (int i = 0; i < 7; i++) {
            StringBuilder line = new StringBuilder();

            line.append(oPattern[i]).append("   ")
                .append(oPattern[i]).append("   ")
                .append(pPattern[i]).append("   ")
                .append(sPattern[i]);

            banner[i] = line.toString();
        }

        // Print banner
        for (String line : banner) {
            System.out.println(line);
        }
    }
}