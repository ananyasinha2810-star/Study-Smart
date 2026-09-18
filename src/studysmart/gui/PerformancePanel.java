package studysmart.gui;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import studysmart.model.QuizResult;
import studysmart.service.PerformanceAnalyzer;

public class PerformancePanel extends JPanel {

    private PerformanceAnalyzer analyzer;

    public PerformancePanel() {

        analyzer = new PerformanceAnalyzer();

        setLayout(new BorderLayout(10, 10));

        setBorder(
                BorderFactory.createEmptyBorder(
                        20, 20, 20, 20
                )
        );

        QuizResult javaResult =
                new QuizResult("Java", 5, 4);

        QuizResult dsaResult =
                new QuizResult("DSA", 5, 2);

        QuizResult dbmsResult =
                new QuizResult("DBMS", 5, 3);

        analyzer.addResult(javaResult);
        analyzer.addResult(dsaResult);
        analyzer.addResult(dbmsResult);

        JLabel titleLabel = new JLabel(
                "PERFORMANCE ANALYSIS",
                SwingConstants.CENTER
        );

        titleLabel.setBorder(
                BorderFactory.createEmptyBorder(
                        10, 10, 20, 10
                )
        );

        add(
                titleLabel,
                BorderLayout.NORTH
        );

        JPanel scorePanel =
                new JPanel(new GridLayout(4, 1, 10, 10));

        for (QuizResult result : analyzer.getResults()) {

            JLabel scoreLabel = new JLabel(
                    result.getSubject()
                    + " : "
                    + result.getPercentage()
                    + "%",
                    SwingConstants.CENTER
            );

            scorePanel.add(scoreLabel);
        }

        double average =
                analyzer.getAverageScore();

        JLabel averageLabel = new JLabel(
                "Average Score : "
                + average
                + "%",
                SwingConstants.CENTER
        );

        JLabel statusLabel = new JLabel(
                "Performance Status : "
                + analyzer.getStatus(average),
                SwingConstants.CENTER
        );

        JLabel weakestLabel = new JLabel(
                "Weakest Subject : "
                + analyzer.getWeakestSubject(),
                SwingConstants.CENTER
        );

        JPanel summaryPanel =
                new JPanel(new GridLayout(3, 1, 5, 5));

        summaryPanel.add(averageLabel);
        summaryPanel.add(statusLabel);
        summaryPanel.add(weakestLabel);

        add(
                scorePanel,
                BorderLayout.CENTER
        );

        add(
                summaryPanel,
                BorderLayout.SOUTH
        );
    }
}
