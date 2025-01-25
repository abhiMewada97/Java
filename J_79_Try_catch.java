class J_79_Try_catch {
    public static void main(String []args) {

        try {
            int x = 3/0;
            System.out.println("Try block is running");
        }
        catch(Exception e) {        
            System.out.println("Error Occurs");
        }

        System.out.println("Outside the try catch block");
    }
}