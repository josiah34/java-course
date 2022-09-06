public class Car {
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    public Car(){
      this.doors= 4;
      this.wheels=4;
      this.model= "Honda Civic";
      this.engine= "Electric";
      this.colour = "Blue";
    }
    public Car(int doors, int wheels, String model, String engine, String colour) {
        this.doors = doors;
        this.wheels = wheels;
        this.model = model;
        this.engine = engine;
        this.colour = colour;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    private String colour;


    public void setModel(String model) {
        this.model = model;
    }
    public String getModel() {
        return model;

    }

    @Override
    public String toString() {
        return "Car{" +
                "doors=" + doors +
                ", wheels=" + wheels +
                ", model='" + model + '\'' +
                ", engine='" + engine + '\'' +
                ", colour='" + colour + '\'' +
                '}';
    }
}
