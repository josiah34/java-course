public class AreaCalculator {
    public static double area(double radius){
        if (radius < 0){
            return -1.0;
        }
        else {
            radius = radius * radius * Math.PI;
            return radius;
        }
    }
    public static double area(double x, double y){
        if (x < 0 || y < 0){
            return -1.0;
        }
        else {
            double areaRectangle = x * y;
            return areaRectangle;
        }
    }
}
