import java.io.File;
import java.util.Scanner;

public class CreateFile {

    private File file;

    /**
     * Gibt das File-Objekt zurück.
     *
     * @return Das File-Objekt.
     */
    public File getFile() {
        return file;
    }

    /**
     * Fragt den Benutzer nach einem Dateinamen und setzt das entsprechende File-Objekt.
     * Die Eingabe wird wiederholt, bis ein gültiger Dateiname eingegeben wird.
     */
    public void askForFileName() {
        Scanner scanner = new Scanner(System.in);
        String dateiname = null;

        do {
            try {
                System.out.println("Gib den Dateinamen ein: ");
                dateiname = scanner.nextLine();

                if (dateiname != null) {
                    this.file = new File(dateiname);
                }

            } catch (NullPointerException e) {
                System.out.println("FEHLER: " + e.getMessage());
            }
        } while (dateiname == null);
    }
}
