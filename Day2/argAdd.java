package Day2;

public class argAdd {
    /*
     * this argument adder first tries to add them as numbers, and if that isn't
     * possible it concatenates them as strings
     */

    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("please provide at least one argument");
            System.exit(0);
        }

        StringBuilder result = new StringBuilder();
        int intResult = 0;

        int i = 1;
        // relies on the fact that code is still executing in the try
        // so the second loop picks up where the first one fails
        try {
            intResult = Integer.valueOf(args[0]);
            while (i < args.length) {
                intResult += Integer.valueOf(args[i]);
                i++;
            }
            result.append(intResult);
        } catch (Exception e) {
            if (i > 1) { // correctly handle if previous args were 0
                result.append(intResult);
            } else {
                result.append(args[0]);
            }
            while (i < args.length) {
                result.append(args[i]);
                i++;
            }

        }
        System.out.println(result);
    }
}
