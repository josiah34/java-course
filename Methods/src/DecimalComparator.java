public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double d1, double d2) {
        int i = (int)(d1*1000);
        int j = (int)(d2*1000);

        if(i==j){
            return true;
        }
        return false;

    }
}
