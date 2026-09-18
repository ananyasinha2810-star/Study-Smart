package studysmart.service;

import java.util.ArrayList;
import java.util.List;

import studysmart.model.QuizQuestion;
import studysmart.model.QuizResult;

public class QuizManager {

    private List<QuizQuestion> questions;

    public QuizManager() {

        questions = new ArrayList<>();

        loadQuestions();
    }

    private void loadQuestions() {

        questions.add(new QuizQuestion(
                "Which keyword is used for inheritance in Java?",
                "implements",
                "extends",
                "inherits",
                "super",
                "B"
        ));

        questions.add(new QuizQuestion(
                "Which keyword is used to create an object in Java?",
                "class",
                "object",
                "new",
                "create",
                "C"
        ));

        questions.add(new QuizQuestion(
                "Which method is the entry point of a Java program?",
                "start()",
                "main()",
                "run()",
                "execute()",
                "B"
        ));

        questions.add(new QuizQuestion(
                "Which collection does not allow duplicate elements?",
                "ArrayList",
                "LinkedList",
                "HashSet",
                "Vector",
                "C"
        ));

        questions.add(new QuizQuestion(
                "Which keyword is used to inherit a class in Java?",
                "implements",
                "extends",
                "inherits",
                "super",
                "B"
        ));
    }

    public List<QuizQuestion> getQuestions() {
        return questions;
    }

    public QuizResult calculateResult(
            String subject,
            int correctAnswers) {

        return new QuizResult(
                subject,
                questions.size(),
                correctAnswers
        );
    }
}