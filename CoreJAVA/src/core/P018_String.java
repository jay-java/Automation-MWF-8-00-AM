package core;

public class P018_String {
	public static void main(String[] args) {
		String s1 = "java";
		String s2 = "java";
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareToIgnoreCase(s2));
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
		
		
		System.out.println(s1.length());
		System.out.println(s1.charAt(2));
		System.out.println(s1.concat(s2));
		String s3 = "java technology best to learn in 2026";
		System.out.println(s3.contains("ava"));
		System.out.println(s3.startsWith("java te"));
	}
}
