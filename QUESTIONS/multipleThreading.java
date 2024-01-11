// 20. Create a program to generate two threads, one thread will print odd numbers and 
// second thread will print even numbers between 1 to 20 numbers. 

class A extends Thread {
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Printing ODD from Thread A : " + i);
        }
        System.out.println("EXIT from Thread A");

    }

}

class B extends Thread {
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Printing EVEN from Thread B : " + i);
        }
        System.out.println("EXIT from Thread B");

    }

}

class multipleThreading {
    public static void main(String[] args) {

        A obA = new A();
        B obB = new B();
        obA.start();
        obB.start();
        System.out.println("End of program");
    }
}