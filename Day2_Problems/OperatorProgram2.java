public class OperatorProgram2 {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Enter 2 numbers only");
            return;
        }

        int m = Integer.parseInt(args[0]);
        int d = Integer.parseInt(args[1]);

        boolean isSpring = isSpringSeason(m, d);

        System.out.println(isSpring);
    }

    public static boolean isSpringSeason(int m, int d) {
        if ((m == 3 && d >= 20) || (m == 4 || m == 5) || (m == 6 && d <= 20)) {
            return true;
        } else {
            return false;
        }
    }
}
