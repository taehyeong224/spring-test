package model;

public class Test {
    private String name;
    private int age;


    public Test() {
        this.age = -1;
        this.name = "";
    }

    public Test(int age) {
        this.age = age;
        this.name = "";
    }

    public Test(String name) {
        this.name = name;
        this.age = -1;
    }

    public Test(String name, int age) {
        this.name = name;
        this.age = age;
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
        return "Test{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
