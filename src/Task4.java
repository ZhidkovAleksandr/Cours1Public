import java.util.Date;
import java.util.Scanner;

public class Task4 {

    static long createDateAndReturnIt(Scanner scanDat){
        System.out.println("Please, type the date in format 02/11/1995");
        String dateAsString = scanDat.nextLine().replaceAll(" ","");
        long dateAsNumber =0;
        int lenStringDateToCompare = dateAsString.length();
        dateAsString = dateAsString.replaceAll("/", "");
        if((dateAsString.length()+2)==lenStringDateToCompare) {
            dateAsNumber = Long.parseLong(dateAsString);
        }else{
            dateAsNumber = createDateAndReturnIt(scanDat);
        }
        scanDat.close();
        return dateAsNumber;
    }

    static void countTheSum(long numberOfDate){

        long resultSum = 0;

        do {

            long offCount = numberOfDate%10;

            resultSum+=offCount;
            numberOfDate/=10;


        }while (numberOfDate!=0);

        System.out.println(resultSum);
    }

    public static void main(String[] args) {

        Scanner scanDat = new Scanner(System.in);
        long numberOfDate = createDateAndReturnIt(scanDat);
        countTheSum(numberOfDate);


    }

}
