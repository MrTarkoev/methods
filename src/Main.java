public class Main {


    // Методы. Домашнее задание 1
    public static void year() {
        int year = 2020;
        if (year % 4 == 0 || year % 400 != 0) {
            System.out.printf(year + " високосный год");
        } else if (year % 100 > 0) {
            System.out.printf(year + " не високосный год");
        }
    }

    // Методы. Домашнее задание 2
    public static void(int clientDeviceYear, int clientOS) {
        if (clientDeviceYear > 2015 && clientOS == 0) {
            System.out.println(" Установите версию приложения для Android по ссылке");
        } else if (clientDeviceYear > 2015 && clientOS == 1) {
            System.out.println(" Установите версию приложения для iOS по ссылке");
        } else if (clientDeviceYear < 2015 && clientOS == 0) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientDeviceYear < 2015 && clientOS == 1) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");


            // Методы. Домашнее задание 3
            public static int calculateDeliveryDistance ( int deliveryDistance){
                if (deliveryDistance <= 20) {
                    System.out.println(" Потребуется дней: 1 день");
                } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
                    System.out.println(" Потребуется дней: 2 дня ");
                } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
                    System.out.println(" Потреубется дней: 3 дня");
                }
                return (int) Math.round((double) deliveryDistance / 40) + 1;


                public static void main (String[]args){
                    }
                }
         }
    }
}
