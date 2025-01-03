class MyThread1 extends Thread {
    @Override
    public void run() {
        int i=0;
        while(i++ < 20) {
            System.out.println("Thread 1 is");
            System.out.println("Cooking");
        }
    }
}

class MyThread2 extends Thread {
    @Override
    public void run() {
        int i=0;
        while(i++ < 20) {
            System.out.println("Thread 2 is");
            System.out.println("Singing");
        }
    }
}

class J_70_Multithreading_by_thread_class {
    public static void main(String []args) {
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();

        t1.start(); // start will automaticaly call run method inside class, the logic writen inside Thread class
        t2.start();
    }
}