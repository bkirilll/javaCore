package org.example.controllers;

import org.example.dao.AnimalDao;
import org.example.models.Animal;

import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class AnimalController {

    public AnimalController() {
    }

    private final AnimalDao animalDao = new AnimalDao();

    final static String DATE_FORMAT = "yyyy-dd-mm";

    Scanner scanner = new Scanner(System.in);

    public void start() {
        boolean flag = true;
        while (flag) {
            System.out.println("Введите желаемую операцию: 1 - показать всех животных, 2 - показать животного по его id, 3 - добавить животного, 4 - количество всех животных, 5 - завершение программы.");
            String action = scanner.nextLine();
            switch (action) {
                case "1" -> {
                    for (Animal animal : animalDao.index()) {
                        System.out.println(animal);
                    }
                }
                case "2" -> {
                    System.out.println("Введите id:");
                    int id = scanner.nextInt();
                    System.out.println(animalDao.show(id));
                }
                case "3" -> {
                    boolean temp = true;
                    System.out.println("Введите имя: ");
                    String name = scanner.nextLine();
                    System.out.println("Введите вид животного: ");
                    String type = scanner.nextLine();
                    System.out.println("Введите дату рождения животного в формате ГГГГ-ММ-ДД: ");
                    String date = scanner.nextLine();
                    while (temp) {
                        if (isDateValid(date)) temp = false;
                        else {
                            System.out.println("Неправильная дата");
                            date = scanner.nextLine();
                        }
                    }
                    System.out.println("Введите вес: ");
                    int weight = scanner.nextInt();
                    Animal animal = new Animal(name, type, Date.valueOf(date), weight);
                    animalDao.save(animal);
                }
                case "4" -> System.out.println(animalDao.count());
                case "5" -> {
                    System.out.println("end");
                    flag = false;
                }
            }
        }
    }

    public static boolean isDateValid(String date) {
        try {
            DateFormat df = new SimpleDateFormat(DATE_FORMAT);
            df.setLenient(false);
            df.parse(date);
            return true;
        } catch (ParseException e) {
            return false;
        }
    }
}

