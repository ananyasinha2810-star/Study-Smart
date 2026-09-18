package studysmart.gui;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import studysmart.service.NotesManager;

public class NotesPanel extends JPanel {

    private JTextField subjectField;
    private JTextField topicField;
    private JTextArea notesArea;
    private JTextArea savedNotesArea;

    private NotesManager notesManager;

    public NotesPanel() {

        notesManager = new NotesManager();

        setLayout(new BorderLayout(10, 10));

        setBorder(
                BorderFactory.createEmptyBorder(
                        15, 15, 15, 15
                )
        );

        JPanel inputPanel =
                new JPanel(new GridLayout(2, 2, 10, 10));

        inputPanel.add(new JLabel("Subject"));

        subjectField = new JTextField();

        inputPanel.add(subjectField);

        inputPanel.add(new JLabel("Topic"));

        topicField = new JTextField();

        inputPanel.add(topicField);

        add(
                inputPanel,
                BorderLayout.NORTH
        );

        notesArea = new JTextArea(8, 40);

        notesArea.setLineWrap(true);
        notesArea.setWrapStyleWord(true);

        notesArea.setBorder(
                BorderFactory.createTitledBorder(
                        "Write Your Note"
                )
        );

        add(
                new JScrollPane(notesArea),
                BorderLayout.CENTER
        );

        JPanel bottomPanel =
                new JPanel(new BorderLayout(10, 10));

        JButton saveButton =
                new JButton("Save Note");

        savedNotesArea = new JTextArea(6, 40);

        savedNotesArea.setEditable(false);

        savedNotesArea.setLineWrap(true);
        savedNotesArea.setWrapStyleWord(true);

        savedNotesArea.setBorder(
                BorderFactory.createTitledBorder(
                        "Saved Notes"
                )
        );

        bottomPanel.add(
                saveButton,
                BorderLayout.NORTH
        );

        bottomPanel.add(
                new JScrollPane(savedNotesArea),
                BorderLayout.CENTER
        );

        add(
                bottomPanel,
                BorderLayout.SOUTH
        );

        saveButton.addActionListener(
                e -> saveNote()
        );

        loadSavedNotes();
    }

    private void saveNote() {

        String subject =
                subjectField.getText().trim();

        String topic =
                topicField.getText().trim();

        String content =
                notesArea.getText().trim();

        if (subject.isEmpty()
                || topic.isEmpty()
                || content.isEmpty()) {

            JOptionPane.showMessageDialog(
                    this,
                    "Please fill Subject, Topic and Note."
            );

            return;
        }

        notesManager.addNote(
                subject,
                topic,
                content
        );

        JOptionPane.showMessageDialog(
                this,
                "Note saved successfully!"
        );

        subjectField.setText("");
        topicField.setText("");
        notesArea.setText("");

        loadSavedNotes();
    }

    private void loadSavedNotes() {

        List<String> notes =
                notesManager.getNotes();

        savedNotesArea.setText("");

        for (String note : notes) {

            savedNotesArea.append(
                    note + "\n\n"
            );
        }
    }
}
