package training.model;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Student extends Person {
    public String program;
    public int year;
    public double fee;

    public Student(String name,String address,String program,int year,double fee){
        setName(name);
        setAddress(address);
        setProgram(program);
        setYear(year);
        setFee(fee);
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    @Override
    public String toString() {
        return "Student{" +
                "program='" + program + '\'' +
                ", year=" + year +
                ", fee=" + fee +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
