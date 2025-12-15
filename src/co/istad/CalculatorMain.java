package co.istad;

import java.util.Scanner;

public class CalculatorMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator<Double , Integer> cal = new Calculator<>(100.0 , 20);
        do {
            System.out.print("Enter operator :");
            String op = scanner.nextLine();
            Double result = switch (op){
                case "+" -> cal.getOne() + cal.getTwo() ;
                case "-" -> cal.getOne() - cal.getTwo() ;
                case "*" -> cal.getOne() * cal.getTwo() ;
                case "/" -> cal.getOne() / cal.getTwo() ;
                default -> throw new IllegalStateException();
            };
            System.out.println("Result : " + result);
        }while (true);

    }
}
