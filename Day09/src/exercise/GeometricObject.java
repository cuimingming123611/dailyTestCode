package exercise;

/**
 * @Author: MingmingCui
 * @Description:
 * @Date:14:13 2019-11-21
 */
public class GeometricObject {
    protected String color;
    protected double weight;
    

    public GeometricObject() {
        this.color = "white";
        this.weight = 1.0;
    }

    public GeometricObject(String color, double weight) {
        this.color = color;
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
