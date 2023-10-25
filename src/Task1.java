import java.util.Scanner;

public class Task1 {
    static int getNumberWithDialog(){
        Scanner numbScan = new Scanner(System.in);
        System.out.println("Type the number");
        return numbScan.nextInt();
    }
    static int returnSumOfTheNumber(int inputedNumber){

        int sumCounter = 0;

        do {

            int offCount = inputedNumber%10;
            sumCounter+= offCount;
            inputedNumber/=10;


        }while (inputedNumber!=0);

        return sumCounter;

    }

    public static void main(String[] args) {
        int inputedNumber = getNumberWithDialog();
        int sumOfImpNum   = returnSumOfTheNumber(inputedNumber);
        System.out.println("The sum of the digits of a number " + inputedNumber + " is "+ sumOfImpNum);
    }
}
