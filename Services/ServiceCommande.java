package Services;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

import Class.Commandes;
import Class.TypePaiement;

public class ServiceCommande {
    // Chemin du fichier Excel existant
    private final static String excelFilePath = "../BD/mon_classeur.xlsx";

    // Nom de la feuille de calcul à modifier
    private final static String sheetName = "Commandes";

    public static void ajouterCommande(Commandes commande) {

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
            newRow.createCell(0).setCellValue(commande.getid());
            newRow.createCell(1).setCellValue(commande.gettype());
            newRow.createCell(2).setCellValue((Float) commande.getmontant());
            newRow.createCell(3).setCellValue(commande.getarticles());
            newRow.createCell(4).setCellValue(commande.getid_client());
            newRow.createCell(5).setCellValue(commande.getid_chambre());
            newRow.createCell(6).setCellValue(commande.getid_hotel());

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

    public static Collection<Commandes> recupListCommandes() {

        Collection<Commandes> commandes = new ArrayList<Commandes>();
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
                String type = row.getCell(1).getStringCellValue();
                Float montant = (Float) row.getCell(2).getNumericCellValue();
                String article = row.getCell(3).getStringCellValue();
                int id_client = (int) row.getCell(4).getNumericCellValue();
                int id_chambre = (int) row.getCell(5).getNumericCellValue();
                int id_hotel = (int) row.getCell(6).getNumericCellValue();

                // Créer un nouvel objet avec les valeurs lues et l'ajouter à la liste
                Commandes nouvelObjet = new Commandes(id, type, montant, article, id_client, id_chambre, id_hotel);
                commandes.add(nouvelObjet);
            }
            // Fermer le Workbook après utilisation
            fileInputStream.close();
            workbook.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return commandes;
    }
}
