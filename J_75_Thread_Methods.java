class MyThr extends Thread {

    public MyThr(String name) {
        super(name);
    }
    
    @Override
    public void run() {
        int i=0;
        while(i++ < 20) {
            System.out.println("Thread "+ this.getName());
        }
    }
}

class J_75_Thread_Methods {
    public static void main(String []args) {
        
        MyThr t1 = new MyThr("Abhishek 1");
        MyThr t2 = new MyThr("Abhishek 2");
        
        t1.start();
        try {
            t1.join();  // join --> when t1 thread end then t2 thread start
        } 
        catch(Exception e) {
            System.out.println(e);
        }
        t2.start();
        
    }
}