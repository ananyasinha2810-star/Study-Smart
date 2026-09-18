package studysmart.gui;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;

import studysmart.model.QuizQuestion;
import studysmart.model.QuizResult;
import studysmart.service.QuizManager;

public class QuizPanel extends JPanel {

    private QuizManager quizManager;

    private List<QuizQuestion> questions;

    private int currentQuestion = 0;
    private int correctAnswers = 0;

    private JLabel questionNumberLabel;
    private JLabel questionLabel;

    private JRadioButton optionA;
    private JRadioButton optionB;
    private JRadioButton optionC;
    private JRadioButton optionD;

    private JButton submitButton;

    public QuizPanel() {

        quizManager = new QuizManager();

        questions = quizManager.getQuestions();

        setLayout(new BorderLayout(10, 10));

        setBorder(
                BorderFactory.createEmptyBorder(
                        20, 20, 20, 20
                )
        );
        
        questionNumberLabel = new JLabel(
                "",
                SwingConstants.CENTER
        );

        questionLabel = new JLabel(
                "",
                SwingConstants.CENTER
        );

        optionA = new JRadioButton();
        optionB = new JRadioButton();
        optionC = new JRadioButton();
        optionD = new JRadioButton();

        ButtonGroup group = new ButtonGroup();

        group.add(optionA);
        group.add(optionB);
        group.add(optionC);
        group.add(optionD);

        JPanel questionPanel =
                new JPanel(new BorderLayout());

        questionPanel.add(
                questionNumberLabel,
                BorderLayout.NORTH
        );

        questionPanel.add(
                questionLabel,
                BorderLayout.CENTER
        );

        JPanel optionsPanel =
                new JPanel(new GridLayout(4, 1, 5, 5));

        optionsPanel.add(optionA);
        optionsPanel.add(optionB);
        optionsPanel.add(optionC);
        optionsPanel.add(optionD);

        submitButton =
                new JButton("Submit Answer");

        JPanel bottomPanel =
                new JPanel();

        bottomPanel.add(submitButton);

        add(
                questionPanel,
                BorderLayout.NORTH
        );

        add(
                optionsPanel,
                BorderLayout.CENTER
        );

        add(
                bottomPanel,
                BorderLayout.SOUTH
        );

        loadQuestion();

        submitButton.addActionListener(
                e -> submitAnswer()
        );
    }

    private void loadQuestion() {

        QuizQuestion question =
                questions.get(currentQuestion);

        questionNumberLabel.setText(
                "Question "
                + (currentQuestion + 1)
                + " of "
                + questions.size()
        );

        questionLabel.setText(
                "<html><h2>"
                + question.getQuestion()
                + "</h2></html>"
        );

        optionA.setText(
                "A. " + question.getOptionA()
        );

        optionB.setText(
                "B. " + question.getOptionB()
        );

        optionC.setText(
                "C. " + question.getOptionC()
        );

        optionD.setText(
                "D. " + question.getOptionD()
        );

        optionA.setSelected(false);
        optionB.setSelected(false);
        optionC.setSelected(false);
        optionD.setSelected(false);
    }

    private void submitAnswer() {

        String answer = "";

        if (optionA.isSelected()) {
            answer = "A";
        } else if (optionB.isSelected()) {
            answer = "B";
        } else if (optionC.isSelected()) {
            answer = "C";
        } else if (optionD.isSelected()) {
            answer = "D";
        }

        if (answer.isEmpty()) {

            JOptionPane.showMessageDialog(
                    this,
                    "Please select an answer."
            );

            return;
        }

        QuizQuestion question =
                questions.get(currentQuestion);

        if (question.isCorrect(answer)) {
            correctAnswers++;
        }

        currentQuestion++;

        if (currentQuestion < questions.size()) {

            loadQuestion();

        } else {

            QuizResult result =
                    quizManager.calculateResult(
                            "Java",
                            correctAnswers
                    );

            JOptionPane.showMessageDialog(
                    this,
                    "Quiz Completed!\n\n"
                    + "Correct Answers: "
                    + result.getCorrectAnswers()
                    + "\nTotal Questions: "
                    + result.getTotalQuestions()
                    + "\nScore: "
                    + result.getPercentage()
                    + "%",
                    "Quiz Result",
                    JOptionPane.INFORMATION_MESSAGE
            );

            submitButton.setEnabled(false);
        }
    }
}
