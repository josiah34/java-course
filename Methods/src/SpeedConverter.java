public class SpeedConverter {
    public static long toMilesPerHour(double kilometersPerHour) {
      if (kilometersPerHour <= 0) {
          return -1;
      }
      else {
          long miles = (long) (kilometersPerHour * 0.62137);
          return Math.round(miles);

      }
    }
    public static void printConversion (double kilometersPerHour) {
        int miles = (int) toMilesPerHour(kilometersPerHour);
        if (kilometersPerHour < 0) {
            System.out.println("Invalid Value");
        }
        else {
        System.out.println(kilometersPerHour+" km/h = "+miles+" mi/h");}
    }

}
