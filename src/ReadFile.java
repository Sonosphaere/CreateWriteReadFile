import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {

    /**
     * Liest den Inhalt einer Textdatei zeilenweise aus und gibt ihn auf der Konsole aus.
     *
     * @param file Die Datei, die gelesen werden soll.
     */
    public void readDat(File file) {

        // Überprüfen, ob die Datei lesbar und eine reguläre Datei ist
        if (!file.canRead() || !file.isFile()) {
            System.out.println("File existiert nicht!");
            System.exit(0);
        }

        try {
            // Erzeugen eines BufferedReader-Objekts zum Lesen der Datei
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String zeile = null;
            int counter = 0;

            // Zeilenweise lesen und ausgeben
            while ((zeile = reader.readLine()) != null) {
                System.out.println(zeile);
                counter += 1;
            }

            System.out.println("Du hast " + counter + " Zeilen geschrieben!");

        } catch (IOException e) {
            System.out.println("Fehler: " + e.getMessage());
        }
    }
}

