package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {


    @Test
    public void minSalesDaySeveralTimes() {
        StatsService service = new StatsService();
        long[] sales1 = {10000, 200, 350, 100, 1000, 100, 888};

        int expectedSum = 6;
        int actualSum = service.minSalesDay(sales1);

        Assertions.assertEquals(expectedSum, actualSum);

    }

    @Test
    public void maxSalesDayMaximumAtTheEnd() {
        StatsService service = new StatsService();
        long[] sales2 = {523, 200, 112, 225, 88, 100, 3000};

        int expectedSum = 7;
        int actualSum = service.maxSalesDay(sales2);

        Assertions.assertEquals(expectedSum, actualSum);

    }

    @Test
    public void sumOfAllSalesOneSumNegative() {
        StatsService service = new StatsService();
        int[] sales3 = {5, 4, -10, 20, 50};

        int expectedSum = 69;
        int actualSum = service.sumOfAllSales(sales3);

        Assertions.assertEquals(expectedSum, actualSum);

    }

    @Test
    public void averageSumOfSalesInMonthAllSumsPositive() {
        StatsService service = new StatsService();
        int[] sales4 = {5, 4, 10, 20, 50};

        int expectedSum = 17;
        int actualSum = service.averageSumOfSalesInMonth(sales4);

        Assertions.assertEquals(expectedSum, actualSum);

    }

    @Test
    public void numberOfMonthsWithSalesBelowAverageMoreThanOneSuitableSum() {
        StatsService service = new StatsService();
        int[] sales5 = {10, 40, 35, 1, 83, 104};

        int expectedSum = 4;
        int actualSum = service.numberOfMonthsWithSalesBelowAverage(sales5);

        Assertions.assertEquals(expectedSum, actualSum);

    }

    @Test
    public void numberOfMonthsWithSalesAboveAverageOneSuitableSum() {
        StatsService service = new StatsService();
        int[] sales5 = {7, 19, 1000, 31, 50};

        int expectedSum = 1;
        int actualSum = service.numberOfMonthsWithSalesAboveAverage(sales5);

        Assertions.assertEquals(expectedSum, actualSum);

    }
}
