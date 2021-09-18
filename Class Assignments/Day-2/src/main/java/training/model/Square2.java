package training.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Square2 extends Rectangle2 {
    public Square2(double side){
        this.length=side;
        this.width=side;
    }

    public Square2(double side,String color,boolean filled){
        this.length=side;
        this.width=side;
        this.color=color;
        this.filled=filled;
    }

    public double getSide(){
        return length;
    }

    public void setSide(double side){
        length=side;
        width=side;
    }

    public void setWidth(double side){
        width=side;
    }

    public void setLength(double side){
        length=side;
    }

    @Override
    public String toString() {
        return "Square2{" +
                "width=" + width +
                ", length=" + length +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}
