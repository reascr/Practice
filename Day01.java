import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

// pairprogramming @reascr @lquenti

public class Day01 {
	private static final String FILE_PATH = "./src/Input01";
	private static long solve01() throws IOException {
		return Files.lines(Paths.get(FILE_PATH)).map(Long::parseLong).map(x -> x/3 - 2).reduce((long)0, (x,y) -> x+y);
	}
	public static int solve02() throws FileNotFoundException, IOException {
		int res = 0;
		try (BufferedReader br = new BufferedReader(new FileReader(FILE_PATH))) {
		    String line;
		    while ((line = br.readLine()) != null) {
		    	int fuel = Integer.parseInt(line);
		    	while (true) {
		    		fuel = (fuel / 3) -2;
		    		if (fuel <= 0) break;
		    		res += fuel;
		    	}
		    }
		}
		
		return res;
		
	}
	public static void main(String[] args) throws IOException {
		System.out.println(solve01());
		System.out.println(solve02());
	}

}
