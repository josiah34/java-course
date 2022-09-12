public class VipPerson {
    private String name;
    private double creditLimit;
    private String email;

    public VipPerson(){
        this("Joe", 25000.00, "joe@gmail.com");
    }

    public VipPerson(String name, String email) {
        this.name = name;
        this.email = email;
        this.creditLimit = 00.00;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }

    public VipPerson(String name, double creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

}
