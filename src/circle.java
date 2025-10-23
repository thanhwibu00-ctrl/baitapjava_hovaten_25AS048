public class circle {
    private double radius;
    private String color;
    public circle(){
        radius = 50;
        color = "red";
    }
public circle(double radius) {
    radius = radius < 0 ? radius : radius;
    color = "red";
}
public double setRadius() {return radius;}
public void setRadius(double radius) {
        radius = radius < 0 ? radius : radius;}
    public double getArea() {
        return radius * radius * Math.PI;
    }
    public double getCircumference() {
        return 2 * radius * Math.PI;
    }
    public String toString() {
        return "Circle{" + "radius=" + radius + ", color=" + color + '}';
    }

}