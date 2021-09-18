package training.model;

import lombok.*;


@AllArgsConstructor
@Getter
@Setter
@ToString
public class Circle {
    public double radius;
    public String color;
    private double pi=3.14;

    public Circle(){
        this.radius=1.0;
        this.color="Red";
    }

    public double getArea(){
        double area=(pi)*(radius)*(radius);
        return area;
    }

}
