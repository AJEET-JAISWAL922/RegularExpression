package com.regular.expression;
import java.util.regex.*;

public class RegularExpression 
{
public static void main(String args[])throws Exception
{
	boolean b = Pattern.matches("[abc]?","a");// a,b or c
	boolean c = Pattern.matches("[^abc]","f");// not a,b or c
	boolean d = Pattern.matches("[a-z A-Z]","G");
	System.out.println(b);
	System.out.println(c);
	System.out.println(d);
}
}
