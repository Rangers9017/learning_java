import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

    int StudentAge= 15;
    char ilk ='a';
    boolean evet = false;
    String er ="Sahara";
    char studenfirst = er.charAt(0);
    double studentGPA =2.86;
    System.out.println(studenfirst +""+ evet+ er);
    System.out.println("What gpa?");
    Scanner input =new Scanner(System.in);
    studentGPA = input.nextDouble();

    System.out.println(studenfirst+""+er+""+studentGPA);


        }
}