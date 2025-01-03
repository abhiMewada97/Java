class MyThr extends Thread {

    public MyThr(String name) {
        super(name);
    }
    
    @Override
    public void run() {
        // int i=0;
        // while(i++ < 20) {
            System.out.println("Thread "+ this.getName());
        // }
    }
}

class J_74_Thread_Priority {
    public static void main(String []args) {
        
        MyThr t1 = new MyThr("Abhishek 1");
        MyThr t2 = new MyThr("Abhishek 2");
        MyThr t3 = new MyThr("Abhishek 3");
        MyThr t4 = new MyThr("Abhishek 4");
        MyThr t5 = new MyThr("Abhishek 5 (Most Important)");
        
        t5.setPriority(Thread.MAX_PRIORITY);

        t1.start(); 
        t2.start(); 
        t3.start(); 
        t4.start(); 
        t5.start(); 
        
    }
}