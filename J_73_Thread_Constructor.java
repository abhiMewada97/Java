class MyThr extends Thread {

    public MyThr(String name) {
        super(name);
    }
    
    @Override
    public void run() {
        int i=0;
        while(i++ < 20) {
            System.out.println("Thread 1 ");
        }
    }
}

class J_73_Thread_Constructor {
    public static void main(String []args) {
        
        MyThr t1 = new MyThr("Abhishek");
        MyThr t2 = new MyThr("Mewada");
        
        t1.start(); // start will automaticaly call run method inside class, the logic writen inside Thread class
        t2.start(); 
        
        System.out.println("T1 id "+ t1.getId());
        System.out.println("T1 name "+ t1.getName());
        System.out.println("T2 id "+ t2.getId());
        System.out.println("T2 name "+ t2.getName());
    }
}