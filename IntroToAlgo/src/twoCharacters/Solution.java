package twoCharacters;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Solution sol = new Solution();
		Scanner in = new Scanner(System.in);
		int len = in.nextInt();
		String s = in.next();

		if(s.length() == 1){
			System.out.println(0);
		} else {
			String buffer = "";
			for (int i = 0; i < len; i++) {
				if (!buffer.contains(String.valueOf(s.charAt(i)))) {
					buffer += s.charAt(i);
				}
			}

			int maxLength = 0;
			int temp = 0;
			String control = "";
			for (int i = 0; i < buffer.length(); i++) {
				for (int j = i + 1; j < buffer.length(); j++) {
					control = s.replaceAll("[^" + buffer.charAt(i) + "" + buffer.charAt(j) + "]", "");
					temp = sol.control(control);
					if (maxLength < temp)
						maxLength = temp;
				}
			}
			System.out.println(maxLength);
		}
		in.close();
	}

	private int control(String control) {
		if (control.length() == 0)
			return 0;
		else if (control.length() == 1)
			return 0;
		else {
			for (int i = 1; i < control.length(); i++) {
				if (control.charAt(i) == control.charAt(i - 1))
					return 0;
				else
					continue;
			}
		}
		return control.length();
	}

}
