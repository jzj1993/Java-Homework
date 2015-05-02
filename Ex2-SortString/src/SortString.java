import java.util.Arrays;

public class SortString {

	public static String sortString(String input) {
		char[] c = input.toCharArray();
		Arrays.sort(c);
		return new String(c);
	}

}
