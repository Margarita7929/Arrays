package ru.netology.stats;

public class StatsService {

    public int minSalesDay(long[] sales1) {
        int minMonth = 0;
        int month1 = 0;
        for (long sale : sales1) {
            if (sale <= sales1[minMonth]) {
                minMonth = month1;
            }
            month1 = month1 + 1;
        }
        return minMonth + 1;
    }

    public int maxSalesDay(long[] sales2) {
        int maxMonth = 0;
        int month2 = 0;
        for (long sale : sales2) {
            if (sale >= sales2[maxMonth]) {
                maxMonth = month2;
            }
            month2 = month2 + 1;
        }
        return maxMonth + 1;
    }
    public int sumOfAllSales(int[] sales3) {
        int sum1 = 0;
        for (int i = 0; i < sales3.length; i++) {
            sum1 = sum1 + sales3[i];
        }
        return sum1;

    }

    public int averageSumOfSalesInMonth(int[] sales4) {
        int sum2 = 0;
        for (int i = 0; i < sales4.length; i++) {
            sum2 = sum2 + sales4[i] / sales4.length;
        }
        return sum2;
    }

    public int numberOfMonthsWithSalesBelowAverage(int[] sales5) {
        int averageSum = averageSumOfSalesInMonth(sales5);
        int count = 0;
        for (long sale : sales5) {
            if (sale <= averageSum) {
                count++;
            }
        }
        return count;
    }

    public int numberOfMonthsWithSalesAboveAverage(int[] sales6) {
        int averageSum = averageSumOfSalesInMonth(sales6);
        int count = 0;
        for (long sale : sales6) {
            if (sale >= averageSum) {
                count++;
            }
        }
        return count;
    }
}
