package test2;

public class Q8 {
public static void main(String[] args) {
	int[] array = {22, 34, 65, 81, 10};
    int sum = 0;
    for (int num : array) {
        sum += num;
    }

    double average = (double) sum / array.length;
    System.out.println("The average value of array elements is: "+average);

}
}
