package studysmart.gui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTabbedPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class DashboardFrame extends JFrame {

    public DashboardFrame() {

        setTitle("StudySmart - Intelligent Student Assistant");

        setSize(900, 600);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLocationRelativeTo(null);

        setLayout(new BorderLayout());

        JPanel headerPanel = new JPanel(new BorderLayout());

        JLabel titleLabel = new JLabel(
                "STUDYSMART",
                SwingConstants.CENTER
        );

        titleLabel.setFont(
                new Font("Arial", Font.BOLD, 28)
        );

        JLabel subtitleLabel = new JLabel(
                "Intelligent Student Assistant",
                SwingConstants.CENTER
        );

        subtitleLabel.setFont(
                new Font("Arial", Font.PLAIN, 16)
        );

        headerPanel.add(
                titleLabel,
                BorderLayout.CENTER
        );

        headerPanel.add(
                subtitleLabel,
                BorderLayout.SOUTH
        );

        headerPanel.setBorder(
                BorderFactory.createEmptyBorder(
                        15, 10, 15, 10
                )
        );

        add(
                headerPanel,
                BorderLayout.NORTH
        );

        JTabbedPane tabbedPane = new JTabbedPane();

JPanel dashboardPanel = createDashboardPanel();

tabbedPane.addTab(
        "Dashboard",
        dashboardPanel
);

tabbedPane.addTab(
        "Study Planner",
        new PlannerPanel()
);

tabbedPane.addTab(
        "Quiz",
        new QuizPanel()
);

tabbedPane.addTab(
        "Performance",
        new PerformancePanel()
);

tabbedPane.addTab(
        "Notes",
        new NotesPanel()
);

        add(
                tabbedPane,
                BorderLayout.CENTER
        );

        setMinimumSize(
                new Dimension(700, 500)
        );

        setVisible(true);
    }

    private JPanel createDashboardPanel() {

        JPanel panel = new JPanel(
                new BorderLayout()
        );

        JLabel welcomeLabel = new JLabel(
                "<html><center>"
                + "<h1>Welcome to StudySmart!</h1>"
                + "<p>Your intelligent student study assistant.</p>"
                + "<p>Plan your studies, take quizzes, "
                + "track performance and manage notes.</p>"
                + "</center></html>",
                SwingConstants.CENTER
        );

        panel.add(
                welcomeLabel,
                BorderLayout.CENTER
        );

        return panel;
    }
}
