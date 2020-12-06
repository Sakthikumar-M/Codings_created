/*
 Given a string s containing just the
characters '(', ')', '{', '}', '[' and ']', determine
if the input string is valid.
An input string is valid if:
Open brackets must be closed by the
same type of brackets.
Open brackets must be closed in the
correct order.
Example 1:
Input: s = "()" , Output: true
 */
package sample_codes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Java_brackets {

	public static void main(String[] args) {
		String str = "([{{}])";
		char input[] = str.toCharArray();
		Map<Character, Character> map_char = new HashMap<Character, Character>();
		map_char.put('(', ')');
		map_char.put('[', ']');
		map_char.put('{', '}');
		map_char.put('<', '>');
		boolean flg = bracket(map_char, input);
		System.out.println();		
		System.out.println("Input String : "+str);
		System.out.println("Output : "+flg);

	}

	public static boolean bracket(Map<Character, Character> map_char, char[] input) {

		int key_count = 0;
		int val_count = 0;
		boolean flag = false;

		for (Entry<Character, Character> map : map_char.entrySet()) {

			for (int i = 0; i < input.length; i++) {
				if (map.getKey() == input[i]) {
					key_count++;
				}
				if (map.getValue() == input[i]) {
					val_count++;
				}
			}
			System.out.println(map.getKey() + " occurs  " + key_count + " Times");
			System.out.println(map.getValue() + " occurs  " + val_count + " Times");

			if (key_count == val_count) {
				flag = true;
			} else {
				flag = false;
				break;
			}

			key_count = 0;
			val_count = 0;
		}
		return flag;
	}
}
