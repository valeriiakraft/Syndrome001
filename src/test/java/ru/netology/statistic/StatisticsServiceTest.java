package ru.netology.statistic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StatisticsServiceTest {

    @Test
    void findMaxWhenMaxFirst() {
        ru.netology.statistic.StatisticsService service = new ru.netology.statistic.StatisticsService();

        long[] incomesInBillions = {12, 5, 8, 3, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }
    @Test
    void findMaxWhenMaxInTheMiddle() {
        ru.netology.statistic.StatisticsService service = new ru.netology.statistic.StatisticsService();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 35, 8, 6, 11, 11, 12};
        long expected = 35;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }
    @Test
    void findMaxWhenAllValues0() {
        ru.netology.statistic.StatisticsService service = new ru.netology.statistic.StatisticsService();

        long[] incomesInBillions = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        long expected = 0;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }

    @Test
    void findMaxWithNegativeValues() {
        ru.netology.statistic.StatisticsService service = new ru.netology.statistic.StatisticsService();

        long[] incomesInBillions = {-20, -3, -17, -1, -9, -26, -13, -15, -15, -3, -4};
        long expected = -1;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }
}
