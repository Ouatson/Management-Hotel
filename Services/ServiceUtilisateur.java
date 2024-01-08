package Services;

import Class.*;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ServiceUtilisateur {

    // Chemin du fichier Excel existant
    private final static String excelFilePath = "../BD/mon_classeur.xlsx";

    // Nom de la feuille de calcul à modifier
    private final static String sheetName = "Utilisateurs";

    public static void ajouterUtilisateur(Utilisateurs user) {

        try (FileInputStream fileInputStream = new FileInputStream(excelFilePath);
                Workbook workbook = new XSSFWorkbook(fileInputStream)) {

            // Récupération de la feuille de calcul
            Sheet sheet = workbook.getSheet(sheetName);

            if (sheet == null) {
                System.out.println("La feuille de calcul " + sheetName + " n'a pas été trouvée.");
                return;
            }

            // Ajout de nouvelles données à la feuille de calcul
            Row newRow = sheet.createRow(sheet.getLastRowNum() + 1);
            newRow.createCell(0).setCellValue(user.getid());
            newRow.createCell(1).setCellValue(user.getnom());
            newRow.createCell(2).setCellValue(user.getprenom());
            newRow.createCell(3).setCellValue(user.getposte().toString());
            newRow.createCell(4).setCellValue(user.getlogin());
            newRow.createCell(5).setCellValue(user.getpassword());
            newRow.createCell(6).setCellValue(user.getid_hotel());

            // Écrire dans le fichier
            // Sauvegarde des modifications dans le même fichier Excel
            try (FileOutputStream fileOutputStream = new FileOutputStream(excelFilePath)) {
                workbook.write(fileOutputStream);
            }
            System.out.println("Données ajoutées avec succès à la feuille de calcul " + sheetName);

            // Fermer le Workbook après utilisation
            fileInputStream.close();
            workbook.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Collection<Utilisateurs> recupListUtilisateurs() {

        Collection<Utilisateurs> utilisateurs = new ArrayList<Utilisateurs>();
        try (FileInputStream fileInputStream = new FileInputStream(excelFilePath);
                Workbook workbook = new XSSFWorkbook(fileInputStream)) {

            // Récupération de la feuille de calcul
            Sheet sheet = workbook.getSheet(sheetName);

            if (sheet == null) {
                System.out.println("La feuille de calcul " + sheetName + " n'a pas été trouvée.");
            }

            for (int i = 0; i <= sheet.getLastRowNum(); i++) {
                Row row = sheet.getRow(i);

                // Je remplace les indices de colonnes par ceux correspondant à votre structure
                // Excel
                int id = (int) row.getCell(0).getNumericCellValue();
                String nom = row.getCell(1).getStringCellValue();
                String prenom = row.getCell(2).getStringCellValue();
                TypePoste poste = TypePoste.valueOf(row.getCell(3).getStringCellValue());
                String login = row.getCell(4).getStringCellValue();
                String password = row.getCell(5).getStringCellValue();
                int id_hotel = (int) row.getCell(6).getNumericCellValue();

                // Créer un nouvel objet avec les valeurs lues et l'ajouter à la liste
                Utilisateurs nouvelObjet = new Utilisateurs(id, nom, prenom, poste, login, password, id_hotel);
                utilisateurs.add(nouvelObjet);
            }
            // Fermer le Workbook après utilisation
            fileInputStream.close();
            workbook.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return utilisateurs;
    }

    // private static Workbook getOrCreateWorkbook(FileInputStream fileInputStream,
    // FileOutputStream fileOutputStream)
    // throws IOException {
    // Workbook workbook;

    // try {
    // // Essayez de créer le workbook à partir du fichier existant
    // workbook = new XSSFWorkbook(fileInputStream);
    // } catch (org.apache.poi.EmptyFileException emptyFileException) {
    // // Le fichier est vide, créez un nouveau workbook
    // workbook = new XSSFWorkbook();
    // workbook.createSheet(sheetName);
    // workbook.write(fileOutputStream);
    // }

    // return workbook;
    // }
}
