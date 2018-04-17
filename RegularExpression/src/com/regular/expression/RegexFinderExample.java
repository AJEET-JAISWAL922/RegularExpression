package com.regular.expression;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexFinderExample 
{
public static void main(String args[])
{
	Scanner sc = new Scanner(System.in);

	while(true)
	{
		System.out.println("ENTER REGEX PATTERN");
		Pattern p = Pattern.compile(sc.nextLine());
		
		System.out.println("ENTER TEXT");
		
		Matcher m = p.matcher(sc.nextLine());
		
		boolean found = false;
		while(m.find())
		{
		System.out.println("i found the text" +m.group()+ "starting at the index" + m.start()+ " and ending at the index" +m.end() );	
		found = true;
		}
		if(!found)
			System.out.println("NO match found");
	}

}
}
