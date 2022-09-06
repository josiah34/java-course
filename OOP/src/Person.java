//Write a class with the name Person. The class needs three fields (instance variables) with the names firstName, lastName of type String and age of type int.
//Without declaring constructors
public class Person {
    private String firstName;
    private String lastName;
    private int age;
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        if (age < 0 || age > 100){
            this.age = 0;
        }
        else {
            this.age = age;
        }
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public boolean isTeen() {
        if(age > 12 && age <= 19 ){
            return true;
        } else {
            return false;
        }
    }
    public String getFullName(){
        if (firstName.isEmpty() && lastName.isEmpty()){
            return "";
        }
        else if (firstName.isEmpty()){
            return lastName;
        }
        else if (lastName.isEmpty()){
            return firstName;
        }
        else {
            return firstName+" "+lastName;
        }
    }
}
