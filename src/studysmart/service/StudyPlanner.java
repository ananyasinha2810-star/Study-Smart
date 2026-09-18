package studysmart.service;

import java.util.ArrayList;
import java.util.List;

import studysmart.model.StudyTask;

public class StudyPlanner {

    private List<StudyTask> tasks;

    public StudyPlanner() {
        tasks = new ArrayList<>();
    }

    public void addTask(StudyTask task) {
        tasks.add(task);
    }

    public void removeTask(int index) {
        if (index >= 0 && index < tasks.size()) {
            tasks.remove(index);
        }
    }

    public void markCompleted(int index) {
        if (index >= 0 && index < tasks.size()) {
            tasks.get(index).setCompleted(true);
        }
    }

    public List<StudyTask> getTasks() {
        return tasks;
    }

    public int getTotalCount() {
        return tasks.size();
    }

    public int getCompletedCount() {

        int count = 0;

        for (StudyTask task : tasks) {
            if (task.isCompleted()) {
                count++;
            }
        }

        return count;
    }
}