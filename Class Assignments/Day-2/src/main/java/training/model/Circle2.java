package training.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Circle2 extends Shape {
    public double radius;
    public Circle2(){
        radius=1.0;
    }
    public Circle2(String color,boolean filled,double radius){
        this.color=color;
        this.filled=filled;
        this.radius=radius;
    }
    public double getArea(){
        double area=pi*radius*radius;
        return area;
    }
    public double getPerimeter(){
        double perimeter=2*pi*radius;
        return perimeter;
    }

    @Override
    public String toString() {
        return "Circle2{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}
