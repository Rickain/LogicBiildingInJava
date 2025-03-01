package com.CoreJava.Codes;

public class StringConstantPool {
	
	//understand Mutable an immutable concept
	public static void main(String[] args) {
		
		String string1 = "Rickain";
		String string2  = "Rickain";
		
		System.out.println(System.identityHashCode(string1));
		System.out.println(System.identityHashCode(string2));
		
		System.out.println(".equals() method -> " + string1.equals(string2));
		System.out.println(string1 == string2);
		
		String s = new String("Solanki");
		String a = new String("Solanki");
		
		System.out.println(System.identityHashCode(s));
		System.out.println(System.identityHashCode(a));
		
		System.out.println("String Object .equals() method -> " + s.equals(a));
		System.out.println(s == a);
		
	}
	

}
