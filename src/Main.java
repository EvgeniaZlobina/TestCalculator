import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println( "input" );
        try {
            Scanner scanner = new Scanner( System.in );


            String strl = scanner.nextLine();
            String[] example = strl.split( " " );
            int length = example.length;  // вычисление количества элементов в массиве
            if ( length > 3 ) {
                try {
                    throw new IOException();
                } catch (IOException e) {
                    System.out.printf( "Output: " );
                    System.out.println( "формат математической операции не удовлетворяет заданию" );
                }
            } else {

                String[] rimmsks = new String[10];
                rimmsks[0] = "I";
                rimmsks[1] = "II";
                rimmsks[2] = "III";
                rimmsks[3] = "IV";
                rimmsks[4] = "V";
                rimmsks[5] = "VI";
                rimmsks[6] = "VII";
                rimmsks[7] = "VIII";
                rimmsks[8] = "IX";
                rimmsks[9] = "X";
                String[] arabs = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
                Calculation result = new Calculation(); // вызов метода подсчета
                String part0 = "arab";
                for (int i = 0; i <= 9; i++) {
                    if ( example[0].equals( rimmsks[i] ) ) {
                        part0 = "rim";
                    }

                }
                String part2 = "arab";

                for (int i = 0; i <= 9; i++) {
                    if ( example[2].equals( rimmsks[i] ) ) {
                        part2 = "rim";
                    }
                }
                if ( !part0.equals( part2 ) || !part2.equals( part0 ) ) {
                    try {
                        throw new IOException();
                    } catch (IOException e) {
                        System.out.printf( "Output: " );
                        System.out.println( "используются одновременно разные системы счисления" );
                    }
                } else {


                    int num1 = 11;
                    int num2 = 12;
                    for (int i = 0; i <= 9; i++) {
                        if ( example[0].equals( rimmsks[i] ) ) {
                            num1 = i + 1;
                            // System.out.println( "РИМСКАЯ1:  " + num1 );
                        }
                    }
                    for (int i = 0; i <= 9; i++) {
                        if ( example[2].equals( rimmsks[i] ) ) {
                            num2 = i + 1;
                            // System.out.println( "РИМСКАЯ2:  " + num2 );
                        }
                    }
                    if ( num1 < num2 && num1 < 11 && num2 < 12 ) {
                        try {
                            throw new IOException();
                        } catch (IOException e) {
                            System.out.printf( "Output: " );
                            System.out.println( "в римской системе нет отрицательных чисел" );
                        }
                    } else {
                        if ( num1 == 11 ) {
                            num1 = Integer.parseInt( example[0] );
                        }
                        if ( num2 == 12 ) {
                            num2 = Integer.parseInt( example[2] );
                        }
                        if ( num1 < 1 || num2 > 10 || num1 > 10 || num2 < 1 ) {
                            try {
                                throw new IOException();
                            } catch (IOException e) {
                                System.out.printf( "Output: " );
                                System.out.println( "Калькулятор умеет работать только с числами от 1 до 10" );
                            }


                        } else {
                            result.number1 = num1;// первое число
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
                        }
                    }
                }
            }
        } catch (NumberFormatException e) {
            System.out.printf( "Output: " );
            System.out.println( "Неверный формат" );
        }
    }
}

class Calculation {
    int number1;
    int number2;


    void summa() {
        int resultatSumma = number1 + number2; // вычисление суммы
        System.out.printf( "Output = " + resultatSumma );
    }

    void difference() {
        int resultatDifference = number1 - number2; // вычисление разности
        System.out.printf( "Output = " + resultatDifference );
    }

    void multiplication() {
        int resultatMultiplication = number1 * number2; // вычисление умножения
        System.out.printf( "Output = " + resultatMultiplication );
    }

    void division() {
        int resultatDivision = number1 / number2; // вычисление деления
        System.out.printf( "Output = " + resultatDivision );
    }
}