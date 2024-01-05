package Class;

import javax.swing.*;
import java.awt.event.*;
import java.io.FileInputStream;
import java.io.IOException;

public class Management extends JFrame {
    private static String nomApplication = "Management Hotel";
    private static String excelFilePath = "../BD/mon_classeur.xlsx";
    private final static int WIDTH = 200;
    private final static int HEIGHT = 100;

    public Management() {
        // Initialisation de la fenêtre
        super(getNomApplication());

        WindowListener l = new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        };

        addWindowListener(l);
        setSize(WIDTH, HEIGHT);
        setVisible(true);

        // Initialisation ou récupération de notre fichier de base de données
        try (FileInputStream fileInputStream = new FileInputStream(excelFilePath);
                Workbook workbook = new XSSFWorkbook(fileInputStream)) {
            // Récupérer pour toutes les tables les informations de chaque classe et créer les objets
            // correspondants

            // Récupération de la feuille de calcul
            Sheet sheet = workbook.getSheet(sheetName);

            if (sheet == null) {
                System.out.println("La feuille de calcul " + sheetName + " n'a pas été trouvée.");
                return;
            }
        } catch (IOException e) {
            // Créer le fichier excel vierge avec les tables
            // Demander informations sur l'utilisateur (poste manager) et de l'hotel
            // Ensuite afficher la page de connexion

            e.printStackTrace();
        }
    }

    public static String getNomApplication() {
        return nomApplication;
    }

    public static void main(String[] args) {
        JFrame frame = new Management();
    }
}
