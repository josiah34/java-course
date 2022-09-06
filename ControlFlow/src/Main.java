public class Main {
   public static void main(String[] args){
       PrintDayOfWeek.printDayOfWeek(0);
        int switchValue = 7;
        // switch statement
        switch(switchValue){
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
            case 3:
                System.out.println("3");
                break;
            default:
                System.out.println("Unknown switch statement");
                break;
        }
        // for loop
        for(int i = 1; i <= 7; i++){
            System.out.println(i);
        }
        Sum3AND5.sum3And5(1000);
        int count = 1;
        //while loop
        while(count <= 6){
            System.out.println(count);
            count++;
        }
        // do while
        do{
            System.out.println("Something");
            count++;
        }while(count <= 10);
    }
}
