package Class;

import javax.swing.*;
import java.awt.event.*;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

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
            // Vérifier que toutes les tables sont présentes
            int sheetCount = workbook.getWorksheets().getCount();

            if (sheetCount != 9) {
                System.out.println("La fichier de feuilles de calcul n'est pas conforme !");
                return;
            }
        } catch (IOException e) {

            try (FileOutputStream fileOutputStream = new FileOutputStream(excelFilePath)) {
                fileOutputStream.close();
                // Workbook workbook = new XSSFWorkbook(fileOutputStream);
                FileInputStream fileInputStream = new FileInputStream(excelFilePath);
                Workbook workbook = new XSSFWorkbook(fileInputStream);
                // Créer le fichier excel vierge avec les tables
                System.out.println("Fichier excel créé.");
                // Créer les différentes tables de notre fichier
                workbook.createSheet("Hotel");
                workbook.createSheet("Utilisateurs");
                workbook.createSheet("Clients");
                workbook.createSheet("ChambreLuxe");
                workbook.createSheet("ChambreNormale");
                workbook.createSheet("Reservations");
                workbook.createSheet("Commandes");
                workbook.createSheet("Factures");
                workbook.createSheet("Historique");
                workbook.write(fileOutputStream);
            }
            // Demander informations sur l'utilisateur (poste manager) et de l'hotel
            // Partie graphique à mettre ici
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
