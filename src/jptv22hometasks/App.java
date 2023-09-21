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
public class App {
    private Scanner scanner;
    
    public App() {
        this.scanner = new Scanner(System.in);
    }

    public void run() {
        boolean repeat = true;
        do {
            System.out.println("Выберете номер задачи из списка:");
            System.out.println("0. Выход из программы");
            System.out.println("1. Конвертер температуры");
            System.out.println("№ задачи");
            int task = this.scanner.nextInt();scanner.nextLine();
        switch (task) {
            case 0:
                System.out.println("Выбран выход из программы");
                repeat = false;
                break;
            case 1:
                System.out.println("Выбрана задача 1");
                TemperatureConverter temperatureConverter = new TemperatureConverter(scanner);
                temperatureConverter.doConvert();
                break;
            case 2:
                System.out.println("Выбрана задача 2");
                NumberParser numberParser;
                numberParser = new NumberParser(scanner);
                numberParser.doParser();
                break;
                
            default:
                System.out.println("Выберете прававельный номер задачи");
                break;
        }
        } while (repeat);
    }


}
  