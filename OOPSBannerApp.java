public class OOPSBannerApp {

    public static void main(String[] args) {

        String[] oPattern = getOPattern();
        String[] pPattern = getPPattern();
        String[] sPattern = getSPattern();

        String[] banner = new String[7];

        // Combine O O P S
        for (int i = 0; i < 7; i++) {
            banner[i] = String.join("   ",
                    oPattern[i], oPattern[i], pPattern[i], sPattern[i]);
        }

        // Print banner
        for (String line : banner) {
            System.out.println(line);
        }
    }

    // O pattern
    public static String[] getOPattern() {
        return new String[]{

                String.join(" ", "  *****  "),
                String.join(" ", " *     * "),
                String.join(" ", " *     * "),
                String.join(" ", " *     * "),
                String.join(" ", " *     * "),
                String.join(" ", " *     * "),
                String.join(" ", "  *****  ")
        };
    }

    // P pattern
    public static String[] getPPattern() {
        return new String[]{

                String.join(" ", " ******  "),
                String.join(" ", " *     * "),
                String.join(" ", " *     * "),
                String.join(" ", " ******  "),
                String.join(" ", " *       "),
                String.join(" ", " *       "),
                String.join(" ", " *       ")
        };
    }

    // S pattern
    public static String[] getSPattern() {
        return new String[]{

                String.join(" ", "  *****  "),
                String.join(" ", " *       "),
                String.join(" ", " *       "),
                String.join(" ", "  *****  "),
                String.join(" ", "       * "),
                String.join(" ", "       * "),
                String.join(" ", "  *****  ")
        };
    }
}