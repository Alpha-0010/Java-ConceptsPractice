package training.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Cylinder extends Circle {
    public double height;
    private double pi=3.14;

    public Cylinder(){
        this.height=1.0;
    }

    public Cylinder(double radius, double height, String color) {
        this.color=color;
        this.radius=radius;
        this.height = height;
    }

    public Cylinder(double radius,double height){
        this.radius=radius;
        this.height=height;
    }

    public Cylinder(double height) {
        this.height = height;
    }

    public double getVolume(){
        double vol=(pi)*(radius)*(radius)*(height);
        return vol;
    }
}
