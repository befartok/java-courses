public class Calculate {

    public static void main(String[] arg) {
        System.out.println("Calculate..");
        Double first = Double.valueOf(arg[0]);
        Double second = Double.valueOf(arg[1]);
        Double summ = first + second;
        Double razn = first - second;
        Double proiz = first * second;
        Double delen = first / second;
        System.out.println("Summ = " + summ);
        System.out.println("razn = " + razn);
        System.out.println("proiz = " + proiz);
        System.out.println("delen = " + delen);
    }
}
