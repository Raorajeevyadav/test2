package JavaExample;

import java.awt.List;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class CompareTwoString {

	public static void main(String[] args) {

		String s1[] = { "ONE", "TWO", "THREE", "FOUR", "FIVE" };
		String s2[] = { "ONE", "FOUR", "THREE", "SIX", "SEVEN" };
		ArrayList <String>set = new ArrayList();

		for (int x = 0; x < s1.length; x++) {

			for (int y = 0; y < s2.length; y++) {

				if (s1[x] == s2[y]) {

					set.add(s2[y]);

				}

			}

		}

		System.out.println(set);

	}

}
