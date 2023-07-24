import java.io.File;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
    /*
    Schreibe eine Methode, die den Inhalt einer Textdatei ausliest und die Anzahl der Zeilen in der Datei zählt.
    Verwende einen Try/Catch-Block, um IOExceptions abzufangen und eine entsprechende Fehlermeldung auszugeben,
    falls die Datei nicht gefunden oder nicht gelesen werden kann.
    
     */

        CreateFile createFile = new CreateFile();
        createFile.askForFileName(); // Fragt den Benutzer nach dem Dateinamen
        File datei = createFile.getFile(); // Holt das File-Objekt mit dem eingegebenen Dateinamen

        WriteFile write = new WriteFile();
        write.write(datei.getName()); // Schreibt Text in die Datei mit dem gegebenen Dateinamen

        ReadFile reader = new ReadFile();
        reader.readDat(datei); // Liest den Inhalt der Datei und zählt die Zeilen
    }

}