import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.*;

public class Collision {
	public static void main(String[] args) {
		long counter = 100000;
		while (!((generateMd5(String.format("%s%d",args[0], counter))).startsWith("000000"))) {
			System.out.println(generateMd5(String.format("%s%d",args[0], counter)));
			counter ++;
		}
		System.out.println(counter);
	}

	public static String generateMd5(String str) {
		String digest = null;
		try {
			MessageDigest md = MessageDigest.getInstance("MD5");
			byte[] hash = md.digest(str.getBytes("UTF-8"));

			StringBuilder stringBuild = new StringBuilder(hash.length * 2);
			for (byte b : hash) {
				stringBuild.append(String.format("%02x", b));
			}

			digest = stringBuild.toString();

		} catch (UnsupportedEncodingException e) {
            System.out.println("grrrr");
            System.exit(1);
        } catch (NoSuchAlgorithmException e) {
            System.out.println("grr");
            System.exit(1);
        }
    	return digest;
	}
}