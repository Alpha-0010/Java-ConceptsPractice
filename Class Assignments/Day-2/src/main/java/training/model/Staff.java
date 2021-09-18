package training.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class Staff extends Person {
    public String school;
    public double pay;

    public Staff(String name,String address,String school,double pay){
        setName(name);
        setAddress(address);
        setSchool(school);
        setPay(pay);
    }

    @Override
    public String toString() {
        return "Staff{" +
                "school='" + school + '\'' +
                ", pay=" + pay +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
