//Write a method called printNumberInWord. The method has one parameter number which is the whole number.The method needs to print "ZERO", "ONE", "TWO", ... "NINE", "OTHER" if the int parameter number is 0, 1, 2, .... 9 or other for any other number including negative

public class NumberInWord {
    public static void printNumberInWord(int number){
        String numberWord;
        switch(number) {
            case 0:
                numberWord = "ZERO";
                break;
            case 1:
                numberWord = "ONE";
                break;
            case 2:
                numberWord = "TWO";
                break;
            case 3:
                numberWord = "Three";
                break;
            case 4:
                numberWord = "FOUR";
                break;
            case 5:
                numberWord = "FIVE";
                break;
            case 6:
                numberWord = "SIX";
                break;
            case 7:
                numberWord = "SEVEN";
                break;

            case 8:
                numberWord = "EIGHT";
                break;

            case 9:
                numberWord = "NINE";
                break;
            default:
                numberWord = "OTHER";
        }
        System.out.println(numberWord);
    }

}
