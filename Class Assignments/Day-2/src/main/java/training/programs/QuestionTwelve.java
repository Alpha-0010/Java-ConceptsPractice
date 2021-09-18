package training.programs;

import training.model.Circle;
import training.model.Cylinder;

public class QuestionTwelve {
    public static void main(String[] args) {
        Circle[] circles = {
                (Cylinder)new Cylinder(12.34),
                (Cylinder)new Cylinder(12.34, 10.0),
                (Cylinder)new Cylinder(12.34, 10.0, "blue")
        };
        for(Circle circle : circles){
            System.out.println(circle.getArea()+" "+((Cylinder) circle).getVolume());
        }

    }
}
