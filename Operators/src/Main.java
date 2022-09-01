public class Main {
    public static void main(String[] args) {
       int result = 1 + 2; // 1 + 2 = 3



        int topScore = 100;

        if (topScore >= 100) {
            System.out.println("You got the high score!!");
        }

        int secondTopScore = 30;
        //Both statements in below if must be true for the code within the block to execute
        if ((secondTopScore >= 70) && (secondTopScore < 100)) {
            System.out.println("You're in the target score range!");
        }
        //Logical OR Operator ||
        if ((secondTopScore >= 70) || (secondTopScore < 40)){
            System.out.println("Logical OR operator");
        }
        // Ternary Operator ?:
        int age = 19;
        boolean isAgeOfMajority = (age >= 18) ? true : false;

        if (isAgeOfMajority) {
            System.out.print("Age of majority");
        }
        // Challenge

        double value1 = 20.00;
        double value2 = 85.00;
        double sum = (value1 + value2) * 100.00;
        double remainder = sum % 40;
        boolean isTrue = (remainder == 0) ? true: false;
        System.out.println("\n"+isTrue);

        if (!isTrue) {
            System.out.println("Got some remainder: "+remainder);
        }
    }
}
