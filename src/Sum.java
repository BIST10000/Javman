public class Sum {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i < args.length; i++) {
            int chislo = Integer.parseInt(args[i]);
            sum += chislo;
        }
        System.out.println("CYMMA " + sum);
    }
}

