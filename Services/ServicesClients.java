package Services;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

import Class.Clients;
import Class.TypePaiement;
import Class.TypePoste;

public class ServicesClients {
    // Chemin du fichier Excel existant
    private final static String excelFilePath = "../BD/mon_classeur.xlsx";

    // Nom de la feuille de calcul à modifier
    private final static String sheetName = "Clients";

    public static void ajouterClient(Clients client) {

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
            newRow.createCell(0).setCellValue(client.getid());
            newRow.createCell(1).setCellValue(client.getnom());
            newRow.createCell(2).setCellValue(client.getprenom());
            newRow.createCell(3).setCellValue(client.getemail());
            newRow.createCell(4).setCellValue(client.gettelephone());
            newRow.createCell(5).setCellValue(client.getdate_arrivee().toString());
            newRow.createCell(6).setCellValue(client.getdate_sortie().toString());
            newRow.createCell(7).setCellValue(client.getmode_paiement().toString());

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

    public static Collection<Clients> recupListClients() {

        Collection<Clients> clients = new ArrayList<Clients>();
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
                String email = row.getCell(3).getStringCellValue();
                String telephone = row.getCell(4).getStringCellValue();
                Date date_arrivee = (Date) row.getCell(5).getStringCellValue();
                Date date_sortie = (Date) row.getCell(6).getStringCellValue();
                TypePaiement mode_paiement = TypePaiement.valueOf(row.getCell(7).getStringCellValue());

                // Créer un nouvel objet avec les valeurs lues et l'ajouter à la liste
                Clients nouvelObjet = new Clients(id, nom, prenom, email, telephone, date_arrivee, date_sortie, mode_paiement);
                clients.add(nouvelObjet);
            }
            // Fermer le Workbook après utilisation
            fileInputStream.close();
            workbook.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return clients;
    }
}
