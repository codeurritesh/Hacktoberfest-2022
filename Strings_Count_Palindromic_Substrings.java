import java.util.*;
public class Strings_Count_Palindromic_Substrings{

	public static void main(String[] args) {
	
		Scanner s=new Scanner(System.in);
		String st=s.next();
		print(st);
	}

	public static void print(String st) {
int count=0;
		for (int i = 0; i < st.length(); i++) {
			for (int j = i + 1; j <= st.length(); j++) {
				String s1 = st.substring(i,j);
				if(isPalidromString(s1)==true) {
					count++;
				}

			}

		}
		System.out.print(count);

	}

	public static boolean isPalidromString(String s) {
		int i = 0;
		int j = s.length() - 1;
		while (i < j) {
			if (s.charAt(i) != s.charAt(j)) {
				return false;
			}

			i++;
			j--;
		}
		return true;

	}
}
