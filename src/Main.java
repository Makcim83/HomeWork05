public class Main {
    public static void main(String[] args) {
        System.out.println("HomeWork 5  Part 1");
        int clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Скачайте версию для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Скачайте версию для Android по ссылке");
        } else
            System.out.println("Тип операционной системы не определен, обратитесь за помощью в техническую поддержку");

        System.out.println("HomeWork 5  Part 2");
        int clientDeviceOS = 0;
        int clientDeviceYear = 2017;
        int oldVersionYear = 2015;
        if (clientDeviceOS == 0) {
            if (clientDeviceYear < oldVersionYear) {
                System.out.println("Скачайте облегченную версию для iOS по ссылке");
            }   else {
                    System.out.println("Скачайте стандартную версию для iOS по ссылке");}
        } else if (clientDeviceOS == 1) {
            if (clientDeviceYear < oldVersionYear) {
                System.out.println("Скачайте облегченную версию для Android по ссылке");
            } else {
                    System.out.println("Скачайте стандартную версию для Android по ссылке");
            }
        } else
            System.out.println("Тип операционной системы не определен, обратитесь за помощью в техническую поддержку");

        System.out.println("HomeWork 5  Part 3");
        int year = 2020;
        if (year % 4 == 0) {
            System.out.println("Год " + year + " високосый");
        }   else {
            System.out.println("Год " + year + " невисокосый");
        }

        System.out.println("HomeWork 5  Part 4");
        int currierDistance = 95;
        if (currierDistance < 20) {
            System.out.println("Доставка банковской карты занимает одни сутки");
        } else if (currierDistance < 60) {
            System.out.println("Доставка банковской карты занимает двое суток");
        } else if (currierDistance < 100) {
            System.out.println("Доставка банковской карты занимает трое суток");
        } else
            System.out.println("Подробности о времени доставки банковской карты необходимо уточнить у корнсультанта");

        System.out.println("HomeWork 5  Part 4");
        int monthNumber = 8;
        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println("Месяц номер " + monthNumber + " - зимний сезон");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Месяц номер " + monthNumber + " - весенний сезон");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Месяц номер " + monthNumber + " - летний сезон");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Месяц номер " + monthNumber + " - осенний сезон");
                break;
        }
    }
}

