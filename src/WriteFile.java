import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteFile {

    /**
     * Schreibt den eingegebenen Text in eine Datei mit dem angegebenen Dateinamen.
     *
     * @param writeDatei Der Dateiname der Datei, in die der Text geschrieben werden soll.
     */
    public void write(String writeDatei) {

        File file = new File(writeDatei);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(writeDatei))) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Gebe einen Text ein, er wird in der Datei " + file.getName() + " gespeichert! ");
            String eingabe = "";

            do {
                writer.write(scanner.nextLine());
                writer.newLine();
                System.out.println("Möchten Sie den Text weiterschreiben? (j/n)");
                eingabe = scanner.nextLine();
            } while (eingabe.equals("j"));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

