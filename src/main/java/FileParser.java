import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileParser {

    private static BufferedReader br;

    public FileParser(String filename) throws FileNotFoundException {
        br = new BufferedReader(new FileReader(filename));
    }

    public FileParser() {

    }

    public void open(String filename) throws FileNotFoundException {
        br = new BufferedReader(new FileReader(filename));
    }

    public String getLine() throws IOException {
        if (br == null) {
            throw new IOException("BufferedReader is not initialised");
        } else {
            return br.readLine();
        }
    }

    public void close() throws IOException {
        br.close();
    }
}
