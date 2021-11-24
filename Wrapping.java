import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.lang.Math;

public class Wrapping {
	public static void main(String[] args) {
		try {
			File file = new File(args[0]);
			Scanner input = new Scanner(file);
			int totalArea = 0;
			while (input.hasNextLine()) {
				String[] dimensions = input.nextLine().split("x");
				int a = Integer.parseInt(dimensions[0]);
				int b = Integer.parseInt(dimensions[1]);
				int c = Integer.parseInt(dimensions[2]);
				int area1 = a * b;
				int area2 = a * c;
				int area0 = c * b;
				int extraArea = Math.min(area0, Math.min(area1, area2));
				totalArea += extraArea + 2 * (area0 + area1 + area2);
			}
			System.out.println(totalArea);

			File file1 = new File(args[1]);
			input = new Scanner(file1);
			totalArea = 0;
			while (input.hasNextLine()) {
				String[] dimensions = input.nextLine().split("x");
				int a = Integer.parseInt(dimensions[0]);
				int b = Integer.parseInt(dimensions[1]);
				int c = Integer.parseInt(dimensions[2]);
				int smallestPeri = 2 * (Math.min(a, Math.min(b, c)) + (a + b + c - (Math.min(a, Math.min(b, c))) - 
										Math.max(a, Math.max(b, c))));
				totalArea += smallestPeri + ( a * b * c );
			}
			System.out.println(totalArea);
		}
		catch (FileNotFoundException e) {
			System.exit(1);
		}
	}
}