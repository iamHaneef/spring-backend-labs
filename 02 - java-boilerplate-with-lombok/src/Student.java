import lombok.Data;
import lombok.Getter;
import lombok.Setter;

//@Data - it includes all
@Setter @Getter
public class Student {

    private int age;
    private String name;


    //to avoid this all , we use lombok
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public String getName() {
//        return name;
//    }


}
