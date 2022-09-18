public class Main {
    public static void main(String[] args) {

        System.out.println("Работа над ошибками");
        // Задание 2
        System.out.println("Задание 2");
        short clientDeviceYear = 2022;
        byte clientOSAI = 1;
        if (clientDeviceYear < 2015 && clientOSAI == 0) {
            System.out.println("Установите облегчённую версию приложения для IOS по ссылке");
        }
        if (clientDeviceYear >= 2015 && clientOSAI == 0) {
            System.out.println("Установите полную версию приложения для IOS по ссылке");
        }
        if (clientDeviceYear < 2015 && clientOSAI == 1) {
            System.out.println("Установите облегчённую версию приложения для Android по ссылке");
        }
        if (clientDeviceYear >= 2015 && clientOSAI == 1) {
            System.out.println("Установите полную версию приложения для Android по ссылке");
        }
        // Задание 3
        System.out.println("Задание 3");
        System.out.println("Программа-определитель високосного года");
        int year = 2025;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
            System.out.println("Год " + year + " является високосным");
        }else{
            System.out.println("Год " + year + " не является високосным");
        }

        // Задание 5
        System.out.println("Задание 5");
        System.out.println("Программа определитель сезона года");
        int monthNumber = 12;
        System.out.println("Месяц: " + monthNumber);
        switch (monthNumber) {
            case 1:
                System.out.println("Зима");
                break;
            case 2:
                System.out.println("Зима");
                break;
            case 12:
                System.out.println("Зима");
                break;
            case 3:
                System.out.println("Весна");
                break;
            case 4:
                System.out.println("Весна");
                break;
            case 5:
                System.out.println("Весна");
                break;
            case 6:
                System.out.println("Лето");
                break;
            case 7:
                System.out.println("Лето");
                break;
            case 8:
                System.out.println("Лето");
                break;
            case 9:
                System.out.println("Осень");
                break;
            case 10:
                System.out.println("Осень");
                break;
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }



    }
}


