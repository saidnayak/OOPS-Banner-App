public class OOPSBannerApp {

    public static void main(String[] args) {

        // Step 1: Create array
        String[] banner = new String[7];

        // Step 2: Fill array using String.join()

        banner[0] = String.join(" ",
                "  *****", "   ", "*****", "   ", "******", "   ", "*****");

        banner[1] = String.join(" ",
                " *     *", " ", "*     *", " ", "*     *", " ", "*");

        banner[2] = String.join(" ",
                " *     *", " ", "*     *", " ", "*     *", " ", "*");

        banner[3] = String.join(" ",
                " *     *", " ", "*     *", " ", "******", " ", "****");

        banner[4] = String.join(" ",
                " *     *", " ", "*     *", " ", "*", " ", "      *");

        banner[5] = String.join(" ",
                " *     *", " ", "*     *", " ", "*", " ", "      *");

        banner[6] = String.join(" ",
                "  *****", "   ", "*****", "   ", "*", "   ", "*****");


        // Step 3: Print using loop
        for (String line : banner) {
            System.out.println(line);
        }
    }
}