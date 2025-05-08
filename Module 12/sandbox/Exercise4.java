package sandbox;

import java.util.PriorityQueue;

class Patient implements Comparable<Patient> {
    int severity;
    int arrival;

    public Patient(int severity, int arrival) {
        this.severity = severity;
        this.arrival = arrival;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "Severity=" + severity +
                ", Arrival=" + arrival +
                '}';
    }

    @Override
    public int compareTo(Patient other) {
        if (this.severity == other.severity) {
            return Integer.compare(this.arrival, other.arrival);
        }
        return Integer.compare(this.severity, other.severity);
    }
}

public class Exercise4 {
    public static void main(String[] args) {
        PriorityQueue<Patient> queue = new PriorityQueue<>();

        // Populate the queue with random patients
        int time = 0;
        for (int i = 0; i < 30; i++) {
            time += (int) (Math.random() * 100);
            queue.add(new Patient((int) (Math.random() * 5) + 1, time));
        }

        // Process the patients
        int[] wait = new int[5];
        int[] count = new int[5];
        time = 0;
        while (!queue.isEmpty()) {
            Patient patient = queue.peek();
            if (patient != null && patient.arrival <= time) {
                queue.remove(patient);
                System.out.println("Processing: " + patient);
            } else {
                time++;
            }
            wait[patient.severity - 1] += time;
            count[patient.severity - 1]++;
        }
        for (int i = 0; i < 5; i++) {
            if (count[i] != 0) {
                System.out.println("Average wait time for severity " + (i + 1) + ": " + (wait[i] / (double) count[i]));
            } else {
                System.out.println("No patients with severity " + (i + 1));
            }
        }
        System.out.println("Total wait time: " + (double) (wait[0] + wait[1] + wait[2] + wait[3] + wait[4]) / 30);
    }
}