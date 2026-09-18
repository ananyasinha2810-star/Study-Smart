package studysmart.service;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class NotesManager {

    private final String fileName = "data/notes.txt";

    public NotesManager() {

        File directory = new File("data");

        if (!directory.exists()) {
            directory.mkdirs();
        }
    }

    public void addNote(
            String subject,
            String topic,
            String content) {

        try (BufferedWriter writer =
                     new BufferedWriter(
                             new FileWriter(fileName, true))) {

            writer.write(
                    subject + " | "
                    + topic + " | "
                    + content
            );

            writer.newLine();

        } catch (IOException e) {

            System.out.println(
                    "Error saving note: "
                    + e.getMessage());
        }
    }

    public List<String> getNotes() {

        List<String> notes = new ArrayList<>();

        File file = new File(fileName);

        if (!file.exists()) {
            return notes;
        }

        try (BufferedReader reader =
                     new BufferedReader(
                             new FileReader(file))) {

            String line;

            while ((line = reader.readLine()) != null) {
                notes.add(line);
            }

        } catch (IOException e) {

            System.out.println(
                    "Error reading notes: "
                    + e.getMessage());
        }

        return notes;
    }
}
