package javaprogams;

public class Stringspra {

	public static void main(String[] args) {
		System.out.println(Character.isAlphabetic('*')); // false
		System.out.println(Character.isAlphabetic('a')); // true
		System.out.println(Character.isLowerCase('z')); // true
		System.out.println(Character.isUpperCase('Z')); // true
		System.out.println(Character.isDigit('Z')); // false
		System.out.println(Character.isDigit('8')); // true
	}

}
