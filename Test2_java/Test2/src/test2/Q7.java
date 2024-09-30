package test2;

public class Q7 {
public static void main(String[] args) {
	int[] arr = {-10, 3, 5, -2, 0, 8, -1, 12};
	System.out.println("Positive numbers in the array:");
    for (int num : arr) {
        if (num > 0) {
            System.out.print(num + " ");
        }
    }
}
}
