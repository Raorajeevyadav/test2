package JavaExample;

import java.util.HashMap;
import java.util.Set;

public class DuplicateCharacterInString {

	public static void main(String[] args) {

		String str = "characters";
		HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();
		char[] strArray = str.toCharArray();

		for (char ch : strArray) {

			if (charCountMap.containsKey(ch)) {
				charCountMap.put(ch, charCountMap.get(ch) + 1);
			} else {
				charCountMap.put(ch, 1);
			}
		}

		Set<Character> set = charCountMap.keySet();

		for (char c : set)

			if (charCountMap.get(c) > 1)

				System.out.println(c+" : "+charCountMap.get(c));

	}

}
