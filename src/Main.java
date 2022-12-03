import java.util.SortedMap;

public class Main {
    public static void main(String[] args) {
        System.out.println("\nHomeWork 5  Part 1");
        int clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Скачайте версию для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Скачайте версию для Android по ссылке");
        } else
            System.out.println("Тип операционной системы не определен, обратитесь за помощью в техническую поддержку");

        System.out.println("\nHomeWork 5  Part 2");
        int clientDeviceOS = 0;
        int clientDeviceYear = 2017;
        int oldVersionYear = 2015;
        if (clientDeviceOS == 0) {
            if (clientDeviceYear < oldVersionYear) {
                System.out.println("Скачайте облегченную версию для iOS по ссылке");
            } else {
                System.out.println("Скачайте стандартную версию для iOS по ссылке");
            }
        } else if (clientDeviceOS == 1) {
            if (clientDeviceYear < oldVersionYear) {
                System.out.println("Скачайте облегченную версию для Android по ссылке");
            } else {
                System.out.println("Скачайте стандартную версию для Android по ссылке");
            }
        } else
            System.out.println("Тип операционной системы не определен, обратитесь за помощью в техническую поддержку");

        System.out.println("\nHomeWork 5  Part 3");
        int year = 500;
        if ((year % 400 == 0 && year != 0) || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println("Год " + year + " високосый");
        } else {
            System.out.println("Год " + year + " невисокосый");
        }

        System.out.println("\nHomeWork 5  Part 4");
        int currierDistance = 95;
        int daysForDelivery = 1 + (currierDistance + 19) / 40;
        System.out.println("Доставка банковской карты занимает: " + daysForDelivery + " дн.");

        System.out.println("\nHomeWork 5  Part 5");
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

        System.out.println("\nHomeWork 5 Addon tasks  Part 6");
        int creditLimit;
        int minSolidAgeCreditor = 23;
        int ratioSmallAge = 2;
        int ratioSolidAge = 3;
        int averagelSalary = 50_000;
        double ratioAverageSalary = 1.2;
        int highSalary = 80_000;
        double ratioHighSalary = 1.5;

        int creditorAge = 19;
        int creditorSalary = 58_000;

        if (creditorAge >= minSolidAgeCreditor) {
            creditLimit = creditorSalary * ratioSolidAge;
        } else {
            creditLimit = creditorSalary * ratioSmallAge;
        }
        if (creditorSalary >= highSalary) {
            creditLimit *= ratioHighSalary;
        } else if (creditorSalary >= averagelSalary) {
            creditLimit *= ratioAverageSalary;
        }
        System.out.println("Мы готовы выдать Вам кредитную карту с лимитом " + creditLimit + " рублей");

        System.out.println("\nHomeWork 5 Addon tasks  Part 7");
        double ratioYearCreditProcent = 10;
        int creditPercentLimitFromSalary = 50;
        int studentAge = 23;
        double addCreditProcentForStudents = 1;
        int maxAgeWorkers = 30;
        double addCreditProcentForWorkers = 0.5;
        int creditorSolidSalary = 80_000;
        double decCreditProcetForSolidSalary = 0.7;
        double everyMonthProcent;
        double annuityMontPayment;

        int creditorSalaryNew = 60_000;
        int creditorAgeNew = 25;
        int creditorWantedSum = 530_000;
        int creditDurationMonths = 12;

        if (creditorSalaryNew > creditorSolidSalary) {
            ratioYearCreditProcent -= decCreditProcetForSolidSalary;
        }
        if (creditorAgeNew < studentAge) {
            ratioYearCreditProcent += addCreditProcentForStudents;
        } else if (creditorAgeNew < maxAgeWorkers) {
            ratioYearCreditProcent += addCreditProcentForWorkers;
        }
        System.out.println("Кредитная савка составляет " + ratioYearCreditProcent);
        everyMonthProcent = ratioYearCreditProcent / creditDurationMonths /100;
        System.out.println("Месячная кредитная ставка " + (float) everyMonthProcent*100);
        annuityMontPayment = (double) (creditorWantedSum * everyMonthProcent /(1-Math.pow((1+everyMonthProcent), ((-1) * creditDurationMonths))));
        System.out.println("Аннуитетный ежемесячный платеж " + (int) annuityMontPayment);
        System.out.println("Сумма всех выплат " + (int) (annuityMontPayment * creditDurationMonths));
        System.out.println("Сумма выплат по процентам " + (int) (annuityMontPayment * creditDurationMonths - creditorWantedSum));
        if (annuityMontPayment / creditorSalaryNew * 100 > creditPercentLimitFromSalary) {
            System.out.println("Кредит не одобрен, т.к. выплаты по кредиту более 50% (" + (int)(annuityMontPayment / creditorSalaryNew * 100) + "%)" );
        } else {
            System.out.println("Кредит одобрен");
        }

    }
}

