package chapter6;

/*
 * CREATE CLASS FOR FIELDS AND METHODS OF A RECTANGLE
 * This class meant to be a general representation
 */

public class Rectangle {

    private double length;
    private double width;

    public Rectangle() {
        length = 0;
        width = 0;
    }

    public Rectangle(double length, double width) {
        this.length = length; //2 options
        setWidth(width);
    }

    public double getLength(){
        return length;
    }

    public void setLength(double length){
        this.length = length;
    }

    public double getWidth(){
        return width;
    }

    public void setWidth(double width){
        this.width = width;
    }

    double calculatePerimeter() {
        return(2 * length) + (2 * width);
    }

    double calculateArea(){
        return length * width;
    }
}
