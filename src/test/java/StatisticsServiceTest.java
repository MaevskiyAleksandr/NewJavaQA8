import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatisticsServiceTest {
    @Test
    void findMax() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;

        long actual = service.findMax(incomesInBillions);

        Assertions.assertEquals(expected, actual);
    }

    void searchAvgRealIncome() {
        StatisticsService service = new StatisticsService();

        long[] actualIncomes = {12, 3, 4, 7, 9, 5, 73, 3, 8, 10, 12};
        long expected = 73;

        long actual = service.findMax(actualIncomes);

        Assertions.assertEquals(expected, actual);
    }

}


