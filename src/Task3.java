import java.util.Scanner;

public class Task3 {

    static String getHandleTheName(){

        Scanner scName = new Scanner(System.in);
        System.out.println("Type the name");
        String inputedName = scName.nextLine();
        scName.close();
        inputedName = inputedName.replaceAll(" ","");
        inputedName = inputedName.toLowerCase();

        return inputedName;

    }
    static char[] prepareAlphabeth(){

        return "abcdefghijklmnopqrstuvwxyz".toCharArray();

    }

    static void showNumbersOfName(String enteredName){

        int lenghtOfName = enteredName.length();
        char [] alphab = prepareAlphabeth();



        int resultNumber = 0;
        for (int i =0; i<lenghtOfName;i++){


            char foundLetter = enteredName.charAt(i);

            resultNumber+= returnNumberOfLetter(alphab,foundLetter);

        }

        System.out.println(resultNumber);


    }

    static int returnNumberOfLetter(char[] alphArr, char foundLetter){
        for (int j=0; j<alphArr.length;j++){
            char AlphLet = alphArr[j];
            if(foundLetter==AlphLet){
                return (j+1);
            }

        }
        return 0;
    }
    public static void main(String[] args) {

        String enteredName = getHandleTheName();
        showNumbersOfName(enteredName);



    }
}