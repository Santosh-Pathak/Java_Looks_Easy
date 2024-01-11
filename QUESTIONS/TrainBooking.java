// 22. Write a program to solve the following problem: Suppose only one berth is available 
// in a train and two passengers are asking for that berth in two different counters. The 
// clerks at different counters sent a request to the server to allot that berth to their
// passengers. And only one passenger is eligible to get the berth in a train, another 
// passenger get a message “Sorry Berth unavailable”. Solve this problem using 
// synchronized keyword .

class TrainBerth {
    private static int availableBerth = 1;

    synchronized void allocateBerth(String passengerName) {
        if (availableBerth == 1) {
            System.out.println(  passengerName + " has been Allocated th berth");
            availableBerth--;
        } else {
            System.out.println("Sorry , berth is Unavailable for " + passengerName);
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

class TrainBooking {
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
