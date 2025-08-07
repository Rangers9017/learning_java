import java.util.Scanner;

public class mainbir {
    public static void main(String[] args){
        System.out.println("pick number");
        Scanner scanner =new Scanner(System.in);

        int inputtedNum = scanner.nextInt();

        if (inputtedNum <5){
            System.out.println("Enjoy");
        }
        else{
            System.out.println("Bad");
        }
        Scanner input =new Scanner(System.in);
        boolean isonrepeat =true;
        while(isonrepeat){
            System.out.println("playing");
            System.out.println("Yes");
            String userInput =input.next();

            if(userInput.equals("yes")){
                isonrepeat=false;
            }
        }
        System.out.println("next");
    }

}
