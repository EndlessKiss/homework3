public class Main {
    public static void main(String[] args) {
        //Задача 1
        byte b = 1;
        System.out.println("Значение переменной b с типом byte равно " + b);
        short s = 2;
        System.out.println("Значение переменной s с типом short равно " + s);
        int i = 3;
        System.out.println("Значение переменной i с типом int равно " + i);
        long l = 4L;
        System.out.println("Значение переменной l с типом long равно " + l);
        float f = 1.1f;
        System.out.println("Значение переменной f с типом float равно " + f);
        double d = 2.2;
        System.out.println("Значение переменной d с типом double равно " + d);

        //Задача 2
        float flo = 27.12f;
        long log = 987_678_965_549L;
        byte byt = 2;
        short sht = 786;
        boolean bool = false;
        short shr = 569;
        short srt = -159;
        int it = 27897;
        byte by = 67;
        double db = 27.12;
        char ch = '.';

        //Задача 3
        int classLudPav = 23;
        int classAnSer = 27;
        int classEkAnd = 30;
        int paper = 480;
        int paperSheet = paper / (classAnSer + classEkAnd + classLudPav);
        System.out.println("На каждого ученика рассчитано " + paperSheet + " листов  бумаги.");

        //Задача 4
        int minutes = 2, bottles = 16;
        int perfomance = bottles / minutes;
        int timeWork = 20;
        int perfomanceTimeWork = perfomance * timeWork;
        int day = 60;
        int perfomanceDay = perfomance * day;
        int threeDay = day * 3;
        int perfomanceThreeDay = threeDay * perfomance;
        int mounth = day * 30;
        int perfomanceMounth = mounth * perfomance;
        System.out.println("За 20 минут машина произвела " + perfomanceTimeWork + " бутылок.");
        System.out.println("За сутки машина произвела " + perfomanceDay + " бутылок.");
        System.out.println("За 3 дня машина произвела " + perfomanceThreeDay + " бутылок.");
        System.out.println("За месяц машина произвела " + perfomanceMounth+ " бутылок.");

        //Задача 5
        int whitePaint = 2;
        int brownPaint = 4;
        int classRoom = whitePaint + brownPaint;
        int allPaint = 120;
        int allClassRoom = allPaint / classRoom;
        int allWhitePaint = allClassRoom * whitePaint;
        int allBrownPaint = allClassRoom * brownPaint;
        System.out.println("В школе, где " + allClassRoom + " классов, нужно " + allWhitePaint + " банок белой краски и " + allBrownPaint + " банок коричневой краски.");

        //Задача 6

        int bananaGram = 80;
        int milkGram = 105;
        int iceCreamGram = 100;
        int eggGram = 70;
        int allBananasGram = bananaGram * 5;
        int allMilkGram = milkGram * 2;
        int allIceCreamGram = iceCreamGram * 2;
        int allEggsGram = eggGram * 4;
        int atletesBreakfastGram = allBananasGram + allMilkGram + allIceCreamGram + allEggsGram;
        float atletesBreakfastKilogram = atletesBreakfastGram / 1000f;
        System.out.println("Завтрак спортсмена " + atletesBreakfastKilogram + " кг.");

        //Задача 7
        int loseWeightKilogram = 7;
        int loseWeightGram = loseWeightKilogram * 1000;
        int oneDiet = 250;
        int daysOneDiet = loseWeightGram / oneDiet;
        int twoDiet = 500;
        int daysTwoDiet = loseWeightGram / twoDiet;
        System.out.println(daysOneDiet + " дней.");
        System.out.println(daysTwoDiet + " дней.");
        int averageDaysDiet = (daysOneDiet + daysTwoDiet) / 2;
        System.out.println("В среднем потребуется " + averageDaysDiet + " день.");

        //Задача 8
        float everyYearRise = 0.1f;
        int salaryMaria = 67_760;
        int salaryDenis = 83_690;
        int salaryCristine = 76_230;
        float newSalaryMaria = salaryMaria * everyYearRise + salaryMaria;
        float newSalaryDenis = salaryDenis * everyYearRise + salaryDenis;
        float newSalaryCristine = salaryCristine * everyYearRise + salaryCristine;
        int year = 12;
        int annualIncomeMaria = salaryMaria * year;
        int annualIncomeDenis = salaryDenis * year;
        int annualIncomeCristine = salaryCristine * year;
        float newAnnualIncomeMaria = newSalaryMaria * year;
        float newAnnualIncomeDenis = newSalaryDenis * year;
        float newAnnualIncomeCristine = newSalaryCristine * year;
        float differenceMaria = newAnnualIncomeMaria - annualIncomeMaria;
        float differenceDenis = newAnnualIncomeDenis - annualIncomeDenis;
        float differenceCristine = newAnnualIncomeCristine - annualIncomeCristine;
        System.out.println("Маша теперь получает " + newSalaryMaria + " рублей." + " Годовой доход вырос на " + differenceMaria + " рублей.");
        System.out.println("Денис теперь получает " + newSalaryDenis + " рублей." + " Годовой доход вырос на " + differenceDenis + " рублей.");
        System.out.println("Кристина теперь получает " + newSalaryCristine + " рублей." + " Годовой доход вырос на " + differenceCristine + " рублей.");





        



    }
}