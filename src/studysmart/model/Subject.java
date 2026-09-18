package studysmart.model;

public class Subject {

    private int subjectId;
    private String subjectName;
    private double score;

    public Subject(int subjectId, String subjectName, double score) {
        this.subjectId = subjectId;
        this.subjectName = subjectName;
        this.score = score;
    }

    public int getSubjectId() {
        return subjectId;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String getPerformanceStatus() {

        if (score >= 80) {
            return "Strong";
        } else if (score >= 60) {
            return "Moderate";
        } else {
            return "Needs Improvement";
        }
    }

    public void displaySubject() {

        System.out.println("Subject ID   : " + subjectId);
        System.out.println("Subject      : " + subjectName);
        System.out.println("Score        : " + score + "%");
        System.out.println("Performance  : " + getPerformanceStatus());
    }
}
