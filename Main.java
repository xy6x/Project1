import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner s =new Scanner(System.in);

        check();
    }
    public static void check(){
Scanner s =new Scanner(System.in);
double firstNumber =0;
double secondNumber =0;
        System.out.println("Enter 1 to addition the numbers");
        System.out.println("Enter 2 to subtraction the numbers");
        System.out.println("Enter 3 to multiplication the numbers");
        System.out.println("Enter 4 to  division the numbers");
        System.out.println("Enter 5 to modulus the numbers");
        System.out.println("Enter 6 to  find minimum number");
        System.out.println("Enter 7 to find maximum number");
        System.out.println("Enter 8 to find the average of numbers");
        System.out.println("Enter 9 to print the last result in calculator");
        System.out.println("Enter 10  print the list of all results in calculator");
        System.out.println("Enter -1 to Exit ");
        ArrayList  number = new ArrayList();
        double size = 0;

      try {
        while (true) {
            System.out.println("please enter number of the operation");
            String num = s.next();
            if (num.matches(("[0-9]{1,2}"))) {

            switch (num) {
                case "1":
                    try {
                        System.out.println(" addition the numbers");
                        System.out.println("please enter first number");
                        firstNumber = s.nextDouble();
                        System.out.println("please enter second number");
                        secondNumber = s.nextDouble();
                        System.out.println(firstNumber + secondNumber);
                        size = firstNumber + secondNumber;
                        number.add(size);

                    } catch (InputMismatchException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case "2":
                    System.out.println(" subtraction the numbers");
                    System.out.println("please enter first number");
                    firstNumber= s.nextDouble();
                    System.out.println("please enter second number");
                    secondNumber = s.nextDouble();
                    System.out.println(firstNumber - secondNumber);
                    size = firstNumber - secondNumber;
                    number.add(size);
                    break;
                case "3":
                    System.out.println("multiplication the numbers");
                    System.out.println("please enter first number");
                    firstNumber = s.nextDouble();
                    System.out.println("please enter second number");
                    secondNumber = s.nextDouble();
                    System.out.println(firstNumber * secondNumber);
                    size = firstNumber * secondNumber;
                    ;
                    number.add(size);
                    break;
                case "4":
                    System.out.println("division the numbers");
                    System.out.println("please enter first number");
                    firstNumber = s.nextDouble();
                    System.out.println("please enter second number");
                    secondNumber = s.nextDouble();
                    System.out.println(firstNumber / secondNumber);
                    size = firstNumber / secondNumber;
                    number.add(size);

                    break;

                case "5":
                    System.out.println("modulus the numbers");
                    System.out.println("please enter first number");
                    firstNumber = s.nextDouble();
                    System.out.println("please enter second number");
                    secondNumber = s.nextDouble();
                    System.out.println(firstNumber % secondNumber);
                    size = firstNumber % secondNumber;
                    number.add(size);
                    break;
                case "6":
                    System.out.println("  find minimum number");

                    System.out.println("please enter first number");
                    firstNumber = s.nextDouble();
                    System.out.println("please enter second number");
                    secondNumber = s.nextDouble();
                    if (firstNumber < secondNumber) {
                        System.out.println(firstNumber);
                        //size++;
                        number.add(firstNumber);
                        break;

                    } else System.out.println(secondNumber);
                    // size++;
                    number.add(secondNumber);
                    break;
                case "7":
                    System.out.println(" find maximum number");
                    System.out.println("please enter first number");
                    firstNumber = s.nextDouble();
                    System.out.println("please enter second number");
                    secondNumber = s.nextDouble();
                    if (secondNumber > firstNumber) {
                        System.out.println(secondNumber);
                        number.add(secondNumber);
                        break;
                    } else System.out.println(firstNumber);

                    number.add(firstNumber);
                    break;
                case "8":

                    System.out.println((firstNumber + secondNumber) / 2);
                    size = (firstNumber +secondNumber)/2;
                    number.add(size);
                    break;

                case "9":
                    System.out.println(size);
                    break;
                case "10":

                    System.out.println(number);
                    break;
                case "0":
                    System.out.println(" Exit");
                    System.exit(-1);
                    break;

            }

        }System.out.println("pleas enter number");
            }

       }catch (InputMismatchException e){
           System.out.println(e.getMessage());

       }


    }

    }
