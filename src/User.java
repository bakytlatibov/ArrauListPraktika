import javax.swing.*;

public class User {
    private int Id;
    private String name;
    private  int age;

    public User(int id, String name, int age) {
        Id = id;
        this.name = name;
        this.age = age;
    }
    public  User(){

    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
