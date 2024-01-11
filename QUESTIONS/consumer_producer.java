//  Demonstrate the Producer-Consumer problem using the concept of inter thread 
// communication (i.e. multi-threading).
class consumerProducerProblem extends Thread {
    int total = 0;

    public void run()
    {
        synchronized (this) {
            for (int i = 0; i < 10; i++)
            {
                total += 100;
            }
            this.notify();
        }
    }

}

public class consumer_producer {
    public static void main(String[] args) throws InterruptedException {
        consumerProducerProblem problem = new consumerProducerProblem();
        problem.start();
        synchronized (problem) {
            problem.wait(5000);
        }
        System.out.println("Total Earning " + problem.total + "rs");

    }
}
