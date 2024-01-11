class TrainBerth {
    private static int availableBerth = 1;

    synchronized void allocateBerth(String passengerName) {
        if (availableBerth == 1) {
            System.out.println(passengerName + " has been allotted the berth.");
            availableBerth--;
        } else {
            System.out.println("Sorry, berth unavailable for " + passengerName + ".");
        }
    }
}

class Counter implements Runnable {
    private TrainBerth trainBerth;
    private String passengerName;

    Counter(TrainBerth trainBerth, String passengerName) {
        this.trainBerth = trainBerth;
        this.passengerName = passengerName;
    }

    @Override
    public void run() {
        trainBerth.allocateBerth(passengerName);
    }
}

public class TrainBooking {
    public static void main(String[] args) {
        TrainBerth trainBerth = new TrainBerth();
        Counter counter1 = new Counter(trainBerth, "Passenger A");
        Counter counter2 = new Counter(trainBerth, "Passenger B");

        Thread thread1 = new Thread(counter1);
        Thread thread2 = new Thread(counter2);

        thread1.start();
        thread2.start();
    }
}
