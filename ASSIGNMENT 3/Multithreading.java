class A extends Thread {
    public void print() {
        System.out.println("Printing Even Numbers : (From Thread A)");
        for (int i = 0; i < 20; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}

class B extends Thread {
    public void print() {
        System.out.println("\nPrinting Odd Numbers : (From Thread B)");
        for (int i = 0; i < 20; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
    }
}

public class Multithreading {
    public static void main(String[] args) {
        A obA = new A();
        B obB = new B();
        obA.print();
        obB.print();
      


    }
}