public class J_85_1_Finally {
    public static int cal() {
        try {
            int b = 2;
            int a = 50;
            int result = a / b;
            return result; // finally run even return statement is here
        } catch (Exception e) {
            System.out.println("Exception Occure");
        } finally {
            System.out.println("finally Run");
        }
        return -1;
    }

    public static void main(String[] args) {
        int x = cal();
        System.out.print(x);
    }
}
