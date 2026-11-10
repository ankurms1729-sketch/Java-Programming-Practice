//Read n numbers into an array and print the largest and the smallest.
import java.util.Scanner;
public class Program18 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter the number of elements: ");
int n = sc.nextInt();
int[] a = new int[n];
for(int i=0; i<n; i++) {
    System.out.print("Enter element " + (i + 1) + ": ");
    a[i] = sc.nextInt();
}
int min = a[0];
int max = a[0];
for(int i=1; i<n; i++) {
if(a[i] < min) {
min = a[i];
}
if(a[i] > max) {
max = a[i];
}
}
System.out.println("The smallest element is: " + min);
System.out.println("The largest element is:" + max);

}
}