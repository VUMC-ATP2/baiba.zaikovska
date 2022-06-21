package homework.oop_homework;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@AllArgsConstructor

public class Customer {
    @Getter
    private String name;
    @Setter
    private boolean member = false;
    @Getter
    @Setter
    private String memberType;

    public Customer(String name) {
        this.name = name;
    }

    public boolean isMember() {
        return member;
    }
}
