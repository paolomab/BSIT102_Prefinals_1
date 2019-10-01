import java.util.Scanner;

public class PrefinActivity1 {

        public static void main(String[] args) {
            int number = 0;
            Scanner scanner = new Scanner(System.in); //The use of Scanner//
            System.out.print("Please type a number between 0 and 1000 OR type -1 to exit:  ");
            number = scanner.nextInt(); //Here, number is the variable//
            while(number!=-1){
                if(number>=0 && number<=1000){
                    if(number==0){
                        System.out.print("Converted in to Words:\tZERO");
                    } else {
                        System.out.print("Converted in to Words:\t"); //This will be input after entering number from 0 - 1000//
                        numberToWord(((number / 100) % 10), " Hundred"); //This is for Hundreds//
                        numberToWord(((number / 1000) % 100), " Thousand"); //This is for One Thousand//
                        numberToWord((number % 100), " ");
                    }

                } else{
                    System.out.print("Number Out of Range"); // This will be the input if the number entered exceeded from the range//
                }
                System.out.print("\nPlease type a number between 0 and 1000 OR type -1 to exit:  ");
                number = scanner.nextInt(); // this will be input after the first conversion//
            }
        }

        public static void numberToWord(int num, String val) {
            String ones[] = {" ", " One", " Two", " Three", " Four", " Five", " Six", " Seven", " Eight", " Nine", " Ten", " Eleven", " Twelve", " Thirteen", " Fourteen", " Fifteen", " Sixteen", " Seventeen", " Eighteen", " Nineteen"
            }; //This is the Conversion to Ones//
            String tens[] = {" ", " ", " Twenty", " Thirty", " Fourty", " Fifty", " Sixty", " Seventy", " Eighty", " Ninety"}; //This is the Conversion to Tens//
            if (num > 19) {
                System.out.print(tens[num / 10] + " " + ones[num % 10]);
            } else {
                System.out.print(ones[num]);
            }
            if (num > 0) {
                System.out.print(val);
            }
        }
    }
