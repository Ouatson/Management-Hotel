package Class;

import javax.swing.*;

import java.awt.Color;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import Services.ServiceUtilisateur;

public class Management extends JFrame {
    private final static String nomApplication = "Management Hotel";
    private final static String excelFilePath = "../BD/mon_classeur.xlsx";
    private final static int WIDTH = 1400;
    private final static int HEIGHT = 700;

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

        // Vérifier si le répertoire BD existe d'abord
        String directoryPath = "../BD";
        File directory = new File(directoryPath);

        if (!directory.exists()) {
            if (directory.mkdir()) {
                System.out.println("Répertoire créé avec succès");
            } else {
                System.out.println("Erreur lors de la création du répertoire");
                return;
            }
        }

        // Initialisation ou récupération de notre fichier de base de données
        try (FileInputStream fileInputStream = new FileInputStream(excelFilePath);
                Workbook workbook = new XSSFWorkbook(fileInputStream)) {
            // Vérifier que toutes les tables sont présentes
            int sheetCount = workbook.getNumberOfSheets();

            if (sheetCount != 9) {
                System.out.println("La fichier de feuilles de calcul n'est pas conforme !");
                return;
            }
            fileInputStream.close();
        } catch (IOException e) {

            try (FileOutputStream fileOutputStream = new FileOutputStream(excelFilePath);
                    Workbook workbook = new XSSFWorkbook()) {

                System.out.println("Fichier excel créé.");
                // Créer le fichier excel vierge avec les tables
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

                System.out.println("Fichier excel enregistré.");
                workbook.close();
                fileOutputStream.close();
            } catch (IOException ioE) {
                ioE.printStackTrace();
            }
            // Demander informations sur l'utilisateur (poste manager) et de l'hotel
            // Partie graphique à mettre ici
            // Ensuite afficher la page de connexion

            // e.printStackTrace();
        }
    }

    public static String getNomApplication() {
        return nomApplication;
    }

    public static void main(String[] args) {
        JFrame frame = new Management();

        // Le corps de notre application débute maintenant

        // Utilisateurs u_1 = new Utilisateurs(1, "OUATTARA", "Lancina",
        // TypePoste.Manager, "louattara@et.esiea.fr",
        // "Passer123", 1);
        // Utilisateurs u_2 = new Utilisateurs(2, "TCHOUMBA", "Idriss",
        // TypePoste.Manager, "tchoumba@et.esiea.fr",
        // "Passer123", 2);

        // ServiceUtilisateur.ajouterUtilisateur(u_1);
        // ServiceUtilisateur.ajouterUtilisateur(u_2);

        // Collection<Utilisateurs> result = ServiceUtilisateur.recupListUtilisateurs();
        // for (Utilisateurs utilisateurs : result) {
        // System.out.println(utilisateurs);
        // }
    }
}
