import java.util.Scanner;

// Задание 2 Палиндром
public class Palindrome
{
	public static void main(String[] args) 
	{
		System.out.println("Write a word: ");
		Scanner sc = new Scanner (System.in);
		String s = sc.next();
		ispalindrome(s);
	}
	public static String reverseString(String str)
	{
		String p = "";
		for (int i = str.length() - 1; i >= 0; i--)
		{
			p = p + str.charAt(i);
		}
		return p;
	}
	public static boolean ispalindrome(String str)
	{
		if (str.equals(reverseString(str)))
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("Not palindrome");
		}
		return str.equals(reverseString(str));
	}
}