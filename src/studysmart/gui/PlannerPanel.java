package studysmart.gui;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import studysmart.model.StudyTask;
import studysmart.service.StudyPlanner;

public class PlannerPanel extends JPanel {

    private JTextField subjectField;
    private JTextField topicField;
    private JTextField durationField;

    private JComboBox<String> difficultyBox;

    private DefaultTableModel tableModel;
    private JTable taskTable;

    private StudyPlanner planner;

    public PlannerPanel() {

        planner = new StudyPlanner();

        setLayout(new BorderLayout(10, 10));

        setBorder(
                BorderFactory.createEmptyBorder(
                        15, 15, 15, 15
                )
        );

        // Input panel
        JPanel inputPanel = new JPanel(
                new GridLayout(2, 5, 10, 10)
        );

        inputPanel.add(new JLabel("Subject"));
        inputPanel.add(new JLabel("Topic"));
        inputPanel.add(new JLabel("Duration (min)"));
        inputPanel.add(new JLabel("Difficulty"));
        inputPanel.add(new JLabel(""));

        subjectField = new JTextField();
        topicField = new JTextField();
        durationField = new JTextField();

        difficultyBox = new JComboBox<>(
                new String[] {
                        "Easy",
                        "Medium",
                        "Hard"
                }
        );

        JButton addButton =
                new JButton("Add Study Task");

        inputPanel.add(subjectField);
        inputPanel.add(topicField);
        inputPanel.add(durationField);
        inputPanel.add(difficultyBox);
        inputPanel.add(addButton);

        add(
                inputPanel,
                BorderLayout.NORTH
        );

        // Table
        tableModel = new DefaultTableModel(
                new String[] {
                        "Subject",
                        "Topic",
                        "Duration",
                        "Difficulty",
                        "Status"
                },
                0
        );

        taskTable = new JTable(tableModel);

        add(
                new JScrollPane(taskTable),
                BorderLayout.CENTER
        );

        // Buttons
        JPanel buttonPanel = new JPanel();

        JButton completeButton =
                new JButton("Mark Completed");

        JButton removeButton =
                new JButton("Remove Task");

        buttonPanel.add(completeButton);
        buttonPanel.add(removeButton);

        add(
                buttonPanel,
                BorderLayout.SOUTH
        );

        // Add task
        addButton.addActionListener(e -> addTask());

        // Complete task
        completeButton.addActionListener(
                e -> markCompleted()
        );

        // Remove task
        removeButton.addActionListener(
                e -> removeTask()
        );
    }

    private void addTask() {

        String subject =
                subjectField.getText().trim();

        String topic =
                topicField.getText().trim();

        String durationText =
                durationField.getText().trim();

        String difficulty =
                (String) difficultyBox.getSelectedItem();

        if (subject.isEmpty()
                || topic.isEmpty()
                || durationText.isEmpty()) {

            JOptionPane.showMessageDialog(
                    this,
                    "Please fill all fields."
            );

            return;
        }

        try {

            int duration =
                    Integer.parseInt(durationText);

            if (duration <= 0) {

                JOptionPane.showMessageDialog(
                        this,
                        "Duration must be greater than 0."
                );

                return;
            }

            StudyTask task =
                    new StudyTask(
                            subject,
                            topic,
                            duration,
                            difficulty
                    );

            planner.addTask(task);

            refreshTable();

            subjectField.setText("");
            topicField.setText("");
            durationField.setText("");

        } catch (NumberFormatException e) {

            JOptionPane.showMessageDialog(
                    this,
                    "Duration must be a valid number."
            );
        }
    }

    private void markCompleted() {

        int selectedRow =
                taskTable.getSelectedRow();

        if (selectedRow == -1) {

            JOptionPane.showMessageDialog(
                    this,
                    "Please select a task first."
            );

            return;
        }

        planner.markCompleted(selectedRow);

        refreshTable();
    }

    private void removeTask() {

        int selectedRow =
                taskTable.getSelectedRow();

        if (selectedRow == -1) {

            JOptionPane.showMessageDialog(
                    this,
                    "Please select a task first."
            );

            return;
        }

        planner.removeTask(selectedRow);

        refreshTable();
    }

    private void refreshTable() {

        tableModel.setRowCount(0);

        for (StudyTask task : planner.getTasks()) {

            tableModel.addRow(
                    new Object[] {
                            task.getSubject(),
                            task.getTopic(),
                            task.getDuration(),
                            task.getDifficulty(),
                            task.isCompleted()
                                    ? "Completed"
                                    : "Pending"
                    }
            );
        }
    }
}
