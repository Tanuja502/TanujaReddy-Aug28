package test2;

public class Q14 {
public static void main(String[] args) {
	 String text = "HelloWorld";
	 int startIndex = 0; 
     int endIndex = text.length(); 
     int Count = text.codePointCount(startIndex, endIndex);
     System.out.println("Number of Unicode code points in the specified range: " +Count);}
}
