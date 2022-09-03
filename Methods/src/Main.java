public class Main {
    public static void main(String[] args) {
      Sum(3,4);
      System.out.println(sum(6,7));
      //assigning variable to method result
      int variableSum = sum(6,7);
        System.out.println(variableSum);
        System.out.println(SpeedConverter.toMilesPerHour(60));
        SpeedConverter.printConversion(0);
        System.out.println(LeapYearCalculator.isLeapYear(1924));
        double number = 651.5176515121351;
        number = Math.round(number * 1000);
        number = number / 1000;
        System.out.println(number);
        System.out.println(DecimalComparator.areEqualByThreeDecimalPlaces(304.997,304.9978));
    }
    public static void Sum(int value1, int value2) {
        int sum = value1 + value2;
        System.out.println(sum);

    }
    public static int sum(int value1, int value2) {
        int sum = value1 + value2;
        return sum;

    }
}
