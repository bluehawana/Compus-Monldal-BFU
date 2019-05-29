public class Main {

    public static String s;
    public static int i=5;

    public static void main(String[] args) {
        int j = i + i + i;
        i = 5;
        String k = "Nej";
        if (j <= i) {
            System.out.println(s);
        } else {
            System.out.println(k);
        }
    }

}