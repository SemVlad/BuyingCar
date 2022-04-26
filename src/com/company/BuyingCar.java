package com.company;

import java.util.Scanner;

public class BuyingCar {
    public static void main(String[] args) {

        // Инициализируем поля объекта Сar
        Car car = new Car();
        car.brand = "Toyota";
        car.color = "Grey";
        car.price = 23_500;
        car.timeCredit = 36;
        car.ageCredit = 18;

        // Инициализируем поля объекта Customer
        // Вводим данные покупателя в консоле
        Customer customer = new Customer();
        System.out.print("Введите Ваше имя - ");
        Scanner scan = new Scanner(System.in);
        customer.firstName = scan.next();
        System.out.print("Введите Вашу фамилию - ");
        customer.surName = scan.next();
        System.out.print("Введите Вашe отчество - ");
        customer.patronymic = scan.next();

        // Вводим возраст клиента и принимаем дальнейшие действия
        System.out.print("Введите Ваш возраст - ");
        customer.age = scan.nextInt();
        if (customer.age < car.ageCredit) {
            int time = car.ageCredit - customer.age;
            System.out.println("Извини, но приходи через " + time + " лет, малолетка!");
            return;
        }

        // Вводим сумму на покупку и принимаем дальнейшие действия
        System.out.print("Введите, сколько у Вас есть денег на покупку - ");
        customer.money = scan.nextInt();
        if (customer.money > car.price) {
            System.out.println("Поздравляем с приобретением прекрасного автомобиля " + car.brand);
            return;
        }

        // Проверяем готовность кредитования и принимаем дальнейшие действия
        System.out.print("Если готовы брать кредит, введите цифру 1 - ");
        customer.credit = scan.nextInt();
        if (customer.credit != 1) {
            System.out.println("Приходи, когда нашкребушь, жлоб!");
        } else {
            customer.sumCredit = (double) (car.price - customer.money) / car.timeCredit;
            System.out.println("Ваш ежемесячный платеж = " + customer.sumCredit);
            System.out.println("Поздравляем с приобретением автомобиля " + car.brand + " - не бит, не крашен, ха-ха)");

        }
    }
}
