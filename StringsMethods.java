import java.util.*;
import java.io.*;

public class StringsMethods {

	public static void main(String[] args) {

		String s1 = "Hello";
		String s2 = "Hello";
		String s3 = "This is example sentence";
		//compareTo() returns 0 in case of same strings
		System.out.println("compareTo(): " + s1.compareTo(s2));

		//returns index of given char/string
		System.out.println("indexOf() on char: " + s1.indexOf('e'));
		System.out.println("indexOf() on word: " + s3.indexOf("example"));

		//replace all the occurence of specific word
		String exampleString = "This is second is is is example is string";

		String replaced = exampleString.replaceAll("is", "");

		System.out.println("replaceAll()" + replaced);

		//reverse string using string builder class
		StringBuilder sb = new StringBuilder("Programming");
		System.out.println("Using reverse() by StringBuilder class" + sb.reverse());

	}
}