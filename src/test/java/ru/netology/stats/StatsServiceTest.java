package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @Test
    void shouldCalculateSum() {
        StatsService service = new StatsService();

        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;

        int actual = service.calculateSum(purchases);

        assertEquals(expected, actual);
    }

    //средняя сумма продаж в месяц
    @Test
    void shouldFindAverage() {
        StatsService service = new StatsService();

        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;

        int actual = service.calculateAverage(purchases);

        assertEquals(expected, actual);
    }

    //Номер месяца, в котором был пик продаж
    @Test
    void shouldMaxSale() {
        StatsService service = new StatsService();

        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;

        int actual = service.maxSaleMonth(purchases);

        assertEquals(expected, actual);
    }

    //Номер месяца, в котором был минимум продаж
    @Test
    void shouldMinSale() {
        StatsService service = new StatsService();

        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;

        int actual = service.minSaleMonth(purchases);

        assertEquals(expected, actual);
    }

    //Кол-во месяцев, в которых продажи были ниже среднего
    @Test
    void shouldNumberMonthSaleBelowAverage() {
        StatsService service = new StatsService();

        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;

        int actual = service.saleBelowAverage(purchases);

        assertEquals(expected, actual);
    }

    //Кол-во месяцев, в которых продажи были выше среднего
    @Test
    void shouldNumberMonthSaleAboveAverage() {
        StatsService service = new StatsService();

        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;

        int actual = service.saleAboveAverage(purchases);

        assertEquals(expected, actual);

    }
}
