import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println( "input" );
        Scanner scanner = new Scanner( System.in );// ввод с клавиатуры
        String strl = scanner.nextLine();
        String[] example = strl.split( " " );
        for (String element : example) {
            System.out.println( "ВВеденные элементы: " + element );
        }
        int length = strl.length(); // вычисление длины строки
        Calculation result = new Calculation(); // вызов метода подсчета
        if (length == 5) {
            //String sign = String.valueOf(strl.charAt(1));
            //String strl1 = String.valueOf(strl.charAt(0));
            //int num1 = Integer.parseInt( element[0].trim());
            // String strl2 = String.valueOf(strl.charAt(2));
            //int num2 = Integer.parseInt(strl2.trim());
            int num1 = Integer.parseInt( example[0] );
            result.number1 = num1;// первое число
            int num2 = Integer.parseInt( example[2] );
            result.number2 = num2; //второе число
            switch ( example[1] ) {
                case "+":
                    result.summa();
                    break;
                case "-":
                    result.difference();
                    break;
                case "*":
                    result.multiplication();
                    break;
                case "/":
                    result.division();
                    break;
            }
        } else {
            if (length == 5) {
                String sign = String.valueOf( strl.charAt( 2 ) );
                result.number1 = 10;// первое число
                result.number2 = 10;// второе число
                switch ( sign ) {
                    case "+":
                        result.summa();
                        break;
                    case "-":
                        result.difference();
                        break;
                    case "*":
                        result.multiplication();
                        break;
                    case "/":
                        result.division();
                        break;
                }
            } else {
                String sign1 = String.valueOf( strl.charAt( 1 ) );
                if (sign1.equals( "0" )) {
                    int num1 = 10;
                    String strl2 = String.valueOf( strl.charAt( 3 ) );
                    int num2 = Integer.parseInt( strl2.trim() );
                    String sign = String.valueOf( strl.charAt( 2 ) );
                    result.number1 = num1;
                    result.number2 = num2;
                    switch ( sign ) {
                        case "+":
                            result.summa();
                            break;
                        case "-":
                            result.difference();
                            break;
                        case "*":
                            result.multiplication();
                            break;
                        case "/":
                            result.division();
                            break;
                    }
                } else {
                    int num2 = 10;
                    String strl2 = String.valueOf( strl.charAt( 0 ) );
                    int num1 = Integer.parseInt( strl2.trim() );
                    String sign = String.valueOf( strl.charAt( 1 ) );
                    result.number1 = num1;
                    result.number2 = num2;
                    switch ( sign ) {
                        case "+":
                            result.summa();
                            break;
                        case "-":
                            result.difference();
                            break;
                        case "*":
                            result.multiplication();
                            break;
                        case "/":
                            result.division();
                            break;
                    }
                }
            }


        }
    }
}

//class DefinitionOfArithmeticSign {String sign;
//  String Arithmetic() {
//   switch (sign) {
//  Calculation result = new Calculation();
//case "+":
//   result.summa();
//   break;
// case "-":
//    result.difference();
// break;
//case "*":
// result.multiplication();
// break;
//  case "/":
//   result.division();
//    break;
// }
//}

class Calculation {
    int number1;
    int number2;


    void summa() {
        int resultatSumma = number1 + number2; // вычисление суммы
        System.out.printf( "результат суммы = " + resultatSumma );
    }

    void difference() {
        int resultatDifference = number1 - number2; // вычисление разности
        System.out.printf( "результат разности = " + resultatDifference );
    }

    void multiplication() {
        int resultatMultiplication = number1 * number2; // вычисление умножения
        System.out.printf( "результат умножения = " + resultatMultiplication );
    }

    void division() {
        int resultatDivision = number1 / number2; // вычисление деления
        System.out.printf( "результат деления = " + resultatDivision );
    }
}