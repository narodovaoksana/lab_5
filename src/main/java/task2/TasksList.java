package task2;

import java.util.ArrayList;
import java.util.List;

public class TasksList {
    private List<String> tasks;

    public TasksList() {
        this.tasks = new ArrayList<>();
    }

    public void add(String description) {
        tasks.add(description);
    }

    public void remove(String description) {
        tasks.remove(description);
    }

    public List<String> getTasks() {
        return tasks;
    }
}