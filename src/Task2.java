import java.util.Scanner;

public class Task2 {

    static void makeTheReverseOfNumber(int InNumb){



        do {

            int OfCount = InNumb%10;
            if (OfCount==0){

                break;
            }
            System.out.print(OfCount);
            InNumb/=10;


        }while (InNumb!=0);



    }

    static int getNumberWithDialog(){
        Scanner numbScan = new Scanner(System.in);
        System.out.println("Type the number");
        return numbScan.nextInt();
    }



    public static void main(String[] args) {

        int inpNumb = getNumberWithDialog();

        String numInStr = Integer.toString(inpNumb);

        int lenghtOfNum = numInStr.length();
        int checkedNum  = numInStr.replaceAll("0","").length();

        if(lenghtOfNum>checkedNum){
            System.out.println("number contains 0, type another number without 0");
            return;
        }

        makeTheReverseOfNumber(inpNumb);

    }

}
