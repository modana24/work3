public class homework {
    public static void main(String[] args) {
        //задание 1
        int f = 80043;
        byte twoHoursInMinutes = 48;
        short numberOfAuditions = 8642;
        long thePriceOfTheApartment = 18002830;
        float c = 3.75f;
        double childAge = 1.5;
        System.out.println(f);
        System.out.println(twoHoursInMinutes);
        System.out.println(numberOfAuditions);
        System.out.println(thePriceOfTheApartment);
        System.out.println(c);
        System.out.println(childAge);
        System.out.println();

        //задание 2
        float f2 = 27.12f;
        long l = 987678965549L;
        double d = 2.786;
        int i = 569;
        short s = -159;
        char c2 = 27897;
        byte b = 67;
        System.out.println();

// задание 3
        int LydmilaIvanovnaStudents = 23;
        int AnnaSergevnaStudents = 27;
        int EkaterinaAndeevnaStudents = 30;
        int sumStudent = LydmilaIvanovnaStudents + AnnaSergevnaStudents + EkaterinaAndeevnaStudents;
        int totalPaper = 480;
        int papersForOneStudent = totalPaper / sumStudent;
        System.out.println("На каждого ученика рассчитано " + papersForOneStudent + " листов бумаги.");

// задание 4
        int productivityPerMinute = 16 / 2;
        int twentyMinutes = 20;
        int minutesInDay = 1440;
        int minutesInThereDays = minutesInDay * 3;
        int minutesInMounth = minutesInDay * 30;

        System.out.println("За " + twentyMinutes + " машина произвела " + (twentyMinutes * productivityPerMinute) + " штук бутылок.");
        System.out.println("За " + minutesInDay + " машина произвела " + (minutesInDay * productivityPerMinute) + " штук бутылок.");
        System.out.println("За " + minutesInThereDays + " машина произвела " + (minutesInThereDays * productivityPerMinute) + " штук бутылок.");
        System.out.println("За " + minutesInMounth + " машина произвела " + (minutesInMounth * productivityPerMinute) + " штук бутылок.");
        System.out.println();

//задание 5
        int theAmountOfPaintInClass = 6;
        int totalCansOfPaint = 120;
        int totalClass = totalCansOfPaint / theAmountOfPaintInClass;
        int whiteCansOfPaint = totalClass * 2;
        int brownCansOfPaints = totalClass * 4;
        System.out.println("В школе, где " + totalClass + " классов, нужно " + whiteCansOfPaint + " банок белой краски и " + brownCansOfPaints + " банок коричневой краски");
        System.out.println();

//задание 6
        double gramInOneBananna = 80.0;
        double oneHungerdMlMilkGram = 105.0;
        double oneiceCreamGram = 100.0;
        double oneAggGram = 70.0;

        int totalBananas = 5;
        int totalMilk = 200;
        int totalIceCream = 2;
        int totalAgg = 4;

        double breakfastInGram = gramInOneBananna * totalBananas + oneHungerdMlMilkGram * totalMilk + oneiceCreamGram * totalIceCream + oneAggGram + totalAgg;
        System.out.println("Завтрак в граммах - " + breakfastInGram + " гр.");

        double breakfastInKilogram = breakfastInGram / 1000;
        System.out.println("Завтрак в килограммах - " + breakfastInKilogram + " кг.");
        System.out.println();

//задание 7
    int needToReset = 7;
    int weightInKilograms = needToReset * 1000;
    int twoHundredGram = weightInKilograms / 250;
    int fiveHudredGram = weightInKilograms / 500;

    System.out.println("Спорстсмену понадобиться " + twoHundredGram + " дней, если скидывать по 250 гр.");
    System.out.println("Спорстсмену понадобиться " + fiveHudredGram + " дней, если скидывать по 500 гр.");
    System.out.println();

//задание 8
    double MashaSalary = 67760;
    double DenisSalary = 83690;
    double KristinaSalary = 76230;

    double newMashaSalary = MashaSalary + (MashaSalary * 10 /100);
    double MashaAnnualIncome = (newMashaSalary*12) - (MashaSalary * 12) ;
    System.out.println("Маша теперь получает " + newMashaSalary + " рублей. Годовой доход вырос на " + MashaAnnualIncome + " рублей.");

    double newDenisSalary = DenisSalary + (DenisSalary*10/100);
    double DenisAnnualIncome = (newDenisSalary*12) - (DenisSalary*12);
    System.out.println("Денис теперь получает " + newDenisSalary + " рублей. Годовой доход вырос на " + DenisAnnualIncome + " рублей.");

    double newKristinaSalary = KristinaSalary + (KristinaSalary * 10 / 100);
    double KristinaAnnualIncome = (newKristinaSalary * 12) - (KristinaSalary * 12);
    System.out.println("Кристина теперь получает " + newKristinaSalary + " рублей. Годовой доход вырос на " + KristinaAnnualIncome + " рублей.");

    }
}
