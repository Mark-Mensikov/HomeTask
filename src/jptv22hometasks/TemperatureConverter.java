/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jptv22hometasks;

import java.util.Scanner;

/**
 *
 * @author pupil
 */
public class TemperatureConverter {
    private final Scanner scanner;
    public TemperatureConverter(Scanner scanner) {
        this.scanner=scanner;
    }
    
    public void doConvert() {
        boolean repeat = true;
        do{
            System.out.println("Выберете направление конвертирования:");
            System.out.println("0. Выход из программы");
            System.out.println("1. Цельсий -> Фарингейт");
            System.out.println("2. Фарингейт -> Цельсий");
            System.out.println("№ направления");
            int task = this.scanner.nextInt();scanner.nextLine();
            switch (task) {
                case 0:
                    System.out.println("Выбран выход из программы");
                    repeat = false;
                    break;
                case 1:
                    System.out.println("Выбрана задача 1");
                    System.out.println("Введите Цельсий:");
                    double celsius = scanner.nextDouble();
                    double fahrenheitl = (celsius * 9/5) + 32;
                    System.out.println(celsius + " Градусов Цельсия " + fahrenheitl + " градусы Фарингейта ");
                    break;
                case 2:
                    System.out.println("Выбрана задача 2");
                    System.out.println("Введите Фарингейт:");
                    fahrenheitl = scanner.nextDouble();
                    celsius = (fahrenheitl - 32) * 5/9;
                    System.out.println(fahrenheitl + " Градусов Фарингейта " + celsius + " градусы Цельсия ");
                    break;
                default:
                    System.out.println("Выбереье номер из списка задач");
                    repeat = false;
                    break;
            }
        }while(repeat);
   }
    
}
