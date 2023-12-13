import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class _00_20_ReadingWritingFiles {
    public static void main(String[] args) throws IOException {
        Scanner infile = new Scanner(new File("_00_20_ReadingWritingFiles.java"));
        PrintStream outfile = new PrintStream(new File("src/Hello.bak"));
        while (infile.hasNextLine()) {
            String line = infile.nextLine();
            System.out.println(line);
        }
        infile.close();
    }
}