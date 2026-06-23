public class FinancialForecast {

    // Recursive method to predict future value
    public static double predictFutureValue(double currentValue,
                                            double growthRate,
                                            int years) {

        // Base Case
        if (years == 0) {
            return currentValue;
        }

        return predictFutureValue(
                currentValue * (1 + growthRate),
                growthRate,
                years - 1);
    }
}