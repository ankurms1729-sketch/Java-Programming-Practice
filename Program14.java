//Read a sentence and count the number of vowels in it.
import java.util.Scanner;
class Program14
{
public static void main(String args[]){
    Scanner sc= new Scanner(System.in);
    System.out.print("Enter a sentence:");
    String str=sc.nextLine();
    int count=0;
    for(int i=0;i<str.length();i++){

        if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'){
            count=count+1;
        }
    }
     System.out.println("The number of vowels in the sentence is: "+count);
    }
}
