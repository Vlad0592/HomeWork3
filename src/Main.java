public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }


    public static void task1() {
        // Задание 1

        int clientOS = 0;
        if (clientOS == 0) {
            System.out.println(" Установите версию приложения для iOS по ссылке. ");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");

        }

    }

    public static void task2() {
        // Задание 2
        int clientDeviceYear = 2015;
        int clientOs = 0;
        if (clientOs == 0) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите  версию приложения для iOS по ссылке");
            }
        } else {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите  версию приложения для Android по ссылке");
            }

        }

    }

    public static void task3() {
        int year = 2020;
        if (year % 4 == 0 && 100 != 0 || year % 400 == 0) {
            System.out.println(year + " Является высокосным");
        } else {
            System.out.println(year + " Не является высокосным");
        }
    }


    public static void task4() {
        int DeliveryDistance = 95;
        int DeliveryDays = 1;
        if (DeliveryDistance > 20) {
            DeliveryDays++;
        }

        System.out.println("Потребуется дней " + DeliveryDays);
        }



     public static void task5() {
         int monthNumber = 12;

         switch (monthNumber) {
             case 12:
             case 1:
             case 2:
                 System.out.println("Зима");
                 break;
             case 3:
             case 4:
             case 5:
                 System.out.println("Весна");
                 break;
             case 6:
             case 7:
             case 8:
                 System.out.println("Лето");
                 break;
             case 9:
             case 10:
             case 11:

                 System.out.println("Осень");
                 break;
             default:
                 System.out.println("Некоррекный месяц" + monthNumber);
         }
     }
}