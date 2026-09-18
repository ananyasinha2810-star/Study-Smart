package studysmart;

import javax.swing.SwingUtilities;

import studysmart.gui.DashboardFrame;

public class Main {

    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> {
            new DashboardFrame();
        });
    }
}