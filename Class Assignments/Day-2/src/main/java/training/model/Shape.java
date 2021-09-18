package training.model;


import lombok.AllArgsConstructor;


@AllArgsConstructor
public class Shape {
    public String color;
    public boolean filled;
    public double pi=3.1416;

    public Shape(){
        color="red";
        filled=true;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    public boolean isFilled(boolean filled){
        return filled;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}
