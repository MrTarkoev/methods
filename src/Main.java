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
        String osName;
        String osVersion;
        osName = getClientOs(clientOS);
        osVersion = getOsVersion(clientDeviceYear);
        System.out.println("Установите "+" "+osVersion+" "+"версию "+osName);
    }
    public static String getClientOs(int os){
        if (os == 0) {
            return "iOs";
        }else{
            return "Android";
        }
    }
    public static String getOsVersion(int year){
        int currentYear = LocalDate.now().getYear();
        if(year<currentYear){
            return "облегченную";
        }else{
            return  "полную";
        }
    }

    // Методы. Домашнее задание 3
    public static int calculateDeliveryDistance(int deliveryDistance) {
        if (deliveryDistance <= 20) {
            return 1;
        } else return (deliveryDistance / 40 ) + 1;
    }
}


