package Test_Tasks;

import java.util.Scanner;

//Составить алгоритм: если введенное имя совпадает с Вячеслав, то вывести “Привет, Вячеслав”, если нет, то вывести "Нет такого имени"
public class Task2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите ваше имя: ");
        String name = sc.nextLine();
        if (name.equalsIgnoreCase("Вячеслав") || name.equalsIgnoreCase("Vyacheslav") ) {
            System.out.println("Привет, Вячеслав");
        } else {
            System.out.println("Нет такого имени");
        }
    }
}
