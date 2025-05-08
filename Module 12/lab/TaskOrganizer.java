package lab;

import java.util.LinkedList;
import java.util.Stack;

// Class to define Task with taskID and description
class Task {
    int taskID;
    String description;

    // constructor to initialize
    public Task(int taskID, String description) {
        this.taskID = taskID;
        this.description = description;
    }

    // display method
    @Override
    public String toString() {
        return "Task ID: " + taskID + " | Description: " + description;
    }
}

public class TaskOrganizer {
    LinkedList<Task> taskStack = new LinkedList<>();
    LinkedList<Task> recentTasks = new LinkedList<>();

    // Add a new task using push
    public void addTask(Task task) {
        taskStack.push(task);
    }

    // Complete a task (pop from current, push to recent)
    public void completeTask() {
        if (!taskStack.isEmpty()) {
            Task completed = taskStack.pop();
            recentTasks.push(completed);
        }
    }

    // List current tasks
    public void listTasks() {
        System.out.println("Current tasks:");
        for (int i = taskStack.size() - 1; i >= 0; i--) {
            System.out.println(taskStack.get(i));
        }
    }

    // Show recently completed tasks (limit to 3)
    public void showRecent() {
        System.out.println("Recent completed tasks:");
        int count = 0;
        for (int i = recentTasks.size() - 1; i >= 0 && count < 3; i--, count++) {
            System.out.println(recentTasks.get(i));
        }
    }

    // Remove a task by ID (rebuild stack without the task)
    public void removeTask(int taskID) {
        Stack<Task> tempStack = new Stack<>();
        
        while (!taskStack.isEmpty()) {
            Task t = taskStack.pop();

            if (t.taskID != taskID) {
                tempStack.push(t);
            }
        }
        while (!tempStack.isEmpty()) {
            taskStack.push(tempStack.pop());
        }
    }

    public static void main(String[] args) {
        TaskOrganizer organizer = new TaskOrganizer();

        organizer.addTask(new Task(1, "Study for Exam"));
        organizer.addTask(new Task(2, "Feed Cat"));
        organizer.addTask(new Task(3, "Shower"));
        organizer.listTasks();
        organizer.completeTask();
        organizer.showRecent();
        organizer.removeTask(3);
        organizer.listTasks();
    }
}
