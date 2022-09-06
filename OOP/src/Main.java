public class Main {
    public static void main(String[] args){
         Car porsche = new Car(6, 4,"Porsche", "v6","red");
         Car civic = new Car();
         porsche.setModel("test");
        System.out.println(civic.toString());
    }
}
