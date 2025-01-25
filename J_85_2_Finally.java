public class J_85_2_Finally {

    public static void cal() {
        int a = 50;
        int b = 5;
        while (true) {
            try {
                System.out.println(a / b);
            } catch (Exception e) {
                System.out.println("Exception Occure");
                break;
            } finally {
                System.out.println("finally Run " + b);
            }
            --b;
        }
    }

    public static void main(String[] args) {
        cal();
    }
}
