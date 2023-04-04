import java.util.Scanner;
public class LaraHW {
    public static void main (String []args){
     //Ex1

                Scanner data = new Scanner(System.in);

                System.out.println("Enter first numper:");
                int num = data.nextInt();
                if (num == 0) {
                    System.out.println("Zero value 0");
                } else if (num >= 1) {
                    System.out.println("The numper is positive");
                } else if (num <= -1) {
                    System.out.println("The numper is negative");
                } else {
                    System.out.println("please Inter numper");
                }

        //E2

                Scanner data = new Scanner(System.in);
                System.out.println("Enter numper :");
                int num1 =data.nextInt();
                System.out.println("Enter your name :");
                int name =data.nextInt();
                System.out.println("Enter your letter :");
                int letter =data.nextInt();

                System.out.println(letter.);



                //E3

                Scanner data1 =new Scanner(System.in);
                System.out.println("Enter your name:");
                int name1 =data.nextInt();
                String.co
            }


            //E4

            int number1, number2, number3, theBiggestNumber;
            Scanner data = new Scanner(System.in);
            System.out.println("Enter first number:");
            number1 = data.nextInt();
            System.out.println("Enter second number:");
            number2 = data.nextInt();
            System.out.println("Enter third number:");
            number3 = data.nextInt();

            if (number3 == number2 && number2 == number1) {
                System.out.println("equal number");
            } else if (number1 < number2 && number1 < number3) {
                System.out.println("The largest number is:" + number1);
            } else if (number2 < number1 && number2 > number3) {
                System.out.println("The largest number is :" + number2);
            } else if (number3 < number1 && number3 > number2) {
                System.out.println("The larhest number is :" + number3);
            } else {
                System.out.println("The largest number is;" + number3);
            }
        }


        