package studysmart.model;

public class QuizResult {

    private String subject;
    private int totalQuestions;
    private int correctAnswers;

    public QuizResult(
            String subject,
            int totalQuestions,
            int correctAnswers) {

        this.subject = subject;
        this.totalQuestions = totalQuestions;
        this.correctAnswers = correctAnswers;
    }

    public String getSubject() {
        return subject;
    }

    public int getTotalQuestions() {
        return totalQuestions;
    }

    public int getCorrectAnswers() {
        return correctAnswers;
    }

    public double getPercentage() {

        if (totalQuestions == 0) {
            return 0;
        }

        return ((double) correctAnswers / totalQuestions) * 100;
    }
}