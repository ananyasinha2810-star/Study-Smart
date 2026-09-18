package studysmart.model;

public class StudyTask {

    private String subject;
    private String topic;
    private int duration;
    private String difficulty;
    private boolean completed;

    public StudyTask(String subject, String topic,
                     int duration, String difficulty) {

        this.subject = subject;
        this.topic = topic;
        this.duration = duration;
        this.difficulty = difficulty;
        this.completed = false;
    }

    public String getSubject() {
        return subject;
    }

    public String getTopic() {
        return topic;
    }

    public int getDuration() {
        return duration;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public void displayTask() {

        System.out.println(
                subject + " | "
                + topic + " | "
                + duration + " minutes | "
                + difficulty + " | "
                + (completed ? "Completed" : "Pending")
        );
    }
}
