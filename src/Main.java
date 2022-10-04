import javax.swing.*;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println("Методы. Домашнее задание 1");
        checkLipYear(100);
        System.out.println();
        System.out.println("Методы. Домашнее задание 2");
        DeviceYear(2015, 1);
        System.out.println();
        System.out.println("Методы. Домашнее задание 3");
        int days = calculateDeliveryDistance(104);
        System.out.println("Потребуется дней: " + days);

    }

    // Методы. Домашнее задание 1
    public static void checkLipYear(int year) {
        if ((year % 4 == 0 || year % 400 == 0) && year % 100 != 0) {
            System.out.println((year + " високосный год"));
        } else {
            System.out.println(year + " не високосный год");
        }
    }
    // Методы. Домашнее задание 2

    public static void DeviceYear(int clientDeviceYear, int clientOS) {
        int currentYear = LocalDate.now().getYear();
        if (clientDeviceYear >= currentYear && clientOS == 0) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientDeviceYear >= currentYear && clientOS == 1) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientDeviceYear < currentYear && clientOS == 0) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientDeviceYear < currentYear && clientOS == 1) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
    }

    // Методы. Домашнее задание 3
    public static int calculateDeliveryDistance(int deliveryDistance) {
        if (deliveryDistance <= 20) {
            return 1;
        } else return (deliveryDistance / 40 ) + 1;
    }
}


