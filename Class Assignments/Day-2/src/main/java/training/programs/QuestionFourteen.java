package training.programs;


import training.model.Circle2;
import training.model.Rectangle2;
import training.model.Shape;
import training.model.Square2;


public class QuestionFourteen {
    public static void main(String[] args) {
        Shape[] shapes={
                new Circle2("red",true, 12.33),
                new Rectangle2(10.1,11.2,"blue",true),
                new Square2(14.35,"yellow",true)
        };
        for(int i=0;i<shapes.length;i++){
            System.out.println(shapes[i].toString());
        }
        System.out.println(((Circle2)shapes[0]).getArea());
    }
}
