package test2;
import java.util.HashSet;
public class Q6 {
public static void main(String[] args) {
	int[] arr = {1, 2, 3, 2, 4, 5, 1, 6, 4};
	HashSet<Integer> uniqueElements = new HashSet<>();
	for (int element : arr) {
        uniqueElements.add(element);
    }
	System.out.println("Unique elements in the array:");
    for (int uniqueElement : uniqueElements) {
        System.out.print(uniqueElement + " ");
}
}
}