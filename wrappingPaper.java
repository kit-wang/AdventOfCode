import java.io.*;

public class wrappingPaper {
	public int totalPaper(String dimensions) {

	}

	public static void main(String[] args) {
		Filereader file = new Filereader(
            "C:\\Users\\Kitty Wang\\Desktop\\APCS\\APCS0\\AdventOfCode\\input.txt");

		int i;
		String str = "";
        while ((i = file.read()) != -1) {
        	str += i;
        }

	}

}