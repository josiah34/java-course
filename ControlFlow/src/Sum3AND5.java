public class Sum3AND5 {
    public static void sum3And5(int range){
        for (int i = 1; i <= range; i++) {
          if (i % 3 == 0 && i % 5 == 0){
              System.out.println(i);
          }
        }
    }
}
