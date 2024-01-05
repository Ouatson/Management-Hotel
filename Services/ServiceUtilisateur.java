package Services;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import Class.Utilisateurs;

public class ServiceUtilisateur {

    // Chemin du fichier Excel existant
    private static String excelFilePath = "../BD/mon_classeur.xlsx";

    // Nom de la feuille de calcul à modifier
    private static String sheetName = "Utilisateurs";
    
    public static void addUser(Utilisateurs user) {

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
            newRow.createCell(0).setCellValue(1); // ID de l'utilisateur
            newRow.createCell(1).setCellValue("OUATTARA"); // Nom de l'utilisateur
            newRow.createCell(2).setCellValue("Lancina"); // Prenom  de l'utilisateur

            // ...

            // Sauvegarde des modifications dans le même fichier Excel
            try (FileOutputStream fileOutputStream = new FileOutputStream(excelFilePath)) {
                workbook.write(fileOutputStream);
            }

            System.out.println("Données ajoutées avec succès à la feuille de calcul " + sheetName);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
