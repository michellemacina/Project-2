package sandbox;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

//creating print job class 
class PrintJob {
    int arrival;
    int pages;

    //initializing the class 
    public PrintJob(int arrival, int pages) {
        this.arrival = arrival;
        this.pages = pages;
    }

    //displaying the information 
    @Override
    public String toString() {
        return "PrintJob{" +
                "Arrival=" + arrival + "s " +
                ", pages=" + pages +
                '}';
    }
}

public class Exercise3 {
    public static void main(String[] args) {
        // Create a queue for print jobs
        Queue<PrintJob> printQueue = new LinkedList<>();

        // Add some print jobs to the queue
        Random random = new Random();
        int time = 0;
        for (int i = 0; i < 50; i++) {
            time += random.nextInt(1, 10);
            printQueue.add(new PrintJob(time, random.nextInt(1, 100)));
        }

        time = 0;
        while (printQueue.size() > 0) {
        
            time++;
            PrintJob job = printQueue.peek();
            if (job != null && job.arrival <= time) {
                time += job.pages;
                printQueue.remove(job);
                System.out.println("Printing: " + job);
            }

        }

        // Process the print jobs
        System.out.println(time/50.);
    }

}