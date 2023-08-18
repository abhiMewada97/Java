public class J_18_Switch_Case {
    public static void main(String[] args){
        String var = "Saurabh";

//        switch(var){
//
//            case "Shubham":
//                System.out.println("You are going to adult");
//                break;
//
//            case "Saurabh":
//                System.out.println("You are going to join a job!");
//                break;
//
//            case "Abhishek":
//                System.out.println("Enjoy your life");
//                break;
//
//            default:
//                System.out.println("Default is going on ");
//        }


        // above switch case is also correct
        // this is a inhence switch
        // break is not needed in below code
        switch (var) {
            case "Saurabh" -> System.out.println("You are going to join a job!");

            case "Abhishek" -> {
                System.out.println("Enjoy your life");
                System.out.println("Hello Abhishek ");
            }
            default -> System.out.println("Default is going on ");
        }
    }
}
