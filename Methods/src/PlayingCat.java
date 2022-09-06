public class PlayingCat {
    public static boolean isCatPlaying(boolean summer, int temperature) {
        if(summer){
            int upperLimit = 45;
            if (temperature >= 25 && temperature <= upperLimit){
                return true;
            } else{
                return false;
            }
        } else {
            int upperLimit = 35;
            if (temperature >= 25 && temperature <= upperLimit){
                return true;
            } else{
                return false;
            }

        }
    }
}
