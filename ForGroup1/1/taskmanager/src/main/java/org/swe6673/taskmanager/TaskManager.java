package org.swe6673.taskmanager;

import org.swe6673.task.Task;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;
import static org.junit.jupiter.api.Assertions.*;


public class TaskManager {
    private List<Task> tasks;

    public TaskManager() {
        this.tasks = new LinkedList<>();
    }

    public Task getTaskByName(String task) {
        for (Task t : tasks) {
            if (t.getName().equals(task)) {
                return t;
            }
        }
        return null;
    }

    public void addTask(Task... tasksToAdd) throws NullPointerException {
        Arrays.stream(tasksToAdd).forEach(task -> tasks.add(task));
    }
    public void updateTask(Task task, String s) {
        task.updateTaskName("Updated Task 1");
    }

    public List<Task> tasks() {
//        return tasks;
        return Collections.unmodifiableList(tasks);
    }

    public void markTaskAsCompleted(Task task) {
        task.completeTask(task);
    }

    public void deleteTask(Task task) {
        this.tasks.remove(task);
    }

    public List<Task> getCompletedTasks() {
        List<Task> completeTasks = new ArrayList<>();
        for (Task task : tasks) {
            if (task.isCompleted()) {
                completeTasks.add(task);
                System.out.println(task);
            }
        }

        return completeTasks;
    }

    public List<Task> getIncompleteTasks() {
        List<Task> incompleteTasks = new ArrayList<>();
        for (Task task : tasks) {
            System.out.println(task);
            if (!task.isCompleted()) {
                incompleteTasks.add(task);

            }
        }
        return incompleteTasks;
    }

    public List<Task> arrange() {
        return tasks.stream().sorted().collect(Collectors.toList());
    }

    public List<Task> getOverdueTasks() {
        List<Task> overdueTasks = new ArrayList<>();
        for (Task task : tasks) {
            System.out.println(task);
            if (!task.isCompleted()) {
                overdueTasks.add(task);
            }
        }
        return overdueTasks;
    }

    @Override
    public String toString() {
        return "TaskManager{" +
                "tasks=" + tasks +
                '}';
    }
}
