class RunnableThread1 implements Runnable {
    public void run() {
        int i=0;
        while(i++ < 20) {
            System.out.println("Runneble Thread 1 ");
        }
    }
}

class RunnableThread2 implements Runnable {
    public void run() {
        int i=0;
        while(i++ < 20) {
            System.out.println("Runnable Thread 2 ");
        }
    }
}

class J_71_Multithreading_by_runnable_interface {
    public static void main(String []args) {
        RunnableThread1 bullet1 = new RunnableThread1();
        Thread gun1 = new Thread(bullet1);
       
        RunnableThread2 bullet2 = new RunnableThread2();
        Thread gun2 = new Thread(bullet2);

        gun1.start(); // start will automaticaly call run method inside class, the logic writen inside Thread class
        gun2.start();
    }
}