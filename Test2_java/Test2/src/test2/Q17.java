package test2;

public class Q17 {
public static void main(String[] args) {
	 String str = "Vikranth Redyy";
     int upperCaseCount = 0;
     int lowerCaseCount = 0;
     for (int i = 0; i < str.length(); i++) {
         char ch = str.charAt(i);
         if (Character.isUpperCase(ch)) {
             upperCaseCount++;
         }
         if (Character.isLowerCase(ch)) {
             lowerCaseCount++;
         }
     }
     System.out.println("Number of uppercase letters: " + upperCaseCount);
     System.out.println("Number of lowercase letters: " + lowerCaseCount);
}
}
