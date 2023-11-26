package web.model;

public class Car {
    private String model;
    private String color;
    private double volume;

    public Car() {
    }

    public Car(String model, String color, double volume) {
        this.model = model;
        this.color = color;
        this.volume = volume;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }
}
