//Read the total number of days and convert it into years, weeks, and remaining days.
import java.util.Scanner;;
public class Program8{
    
public static void main(String[] args){
int days;
Scanner sc= new Scanner(System.in);
System.out.println("Enter the total number of days");
days = sc.nextInt();
int years = days/365;
int weeks = days/7;
int remainingdays = days%7;
System.out.println("The total number of days is " + days);
System.out.println("The total number of years is " + years);
System.out.println("The total number of weeks is " + weeks);
System.out.println("The total number of remaining days is " + remainingdays);
}
}