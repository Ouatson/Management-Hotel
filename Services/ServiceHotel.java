package Services;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Collection;

import Class.Commandes;
import Class.Hotel;

public class ServiceHotel {
    // Chemin du fichier Excel existant
    private final static String excelFilePath = "../BD/mon_classeur.xlsx";

    // Nom de la feuille de calcul à modifier
    private final static String sheetName = "Hotel";

    public static void ajouterCommande(Hotel hotel) {

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
            newRow.createCell(0).setCellValue(hotel.getid());
            newRow.createCell(1).setCellValue(hotel.getnom());
            newRow.createCell(2).setCellValue(hotel.getadresse());
            newRow.createCell(3).setCellValue(hotel.gettelephone());
            newRow.createCell(4).setCellValue(hotel.getnbre_chambres_luxe());
            newRow.createCell(5).setCellValue(hotel.getnbre_chambres_normales());

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
}
