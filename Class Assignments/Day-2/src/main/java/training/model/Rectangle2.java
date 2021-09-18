package training.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Rectangle2 extends Shape {
    public double width;
    public double length;

    public Rectangle2(double width,double length,String color,boolean filled){
        this.width=width;
        this.length=length;
        this.color=color;
        this.filled=filled;
    }

    public double getArea(){
        double area=width*length;
        return area;
    }

    public double getPerimeter(){
        double perimeter=2*(length+width);
        return perimeter;
    }

    @Override
    public String toString() {
        return "Rectangle2{" +
                "width=" + width +
                ", length=" + length +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}
