package co.istad.exercise;

public class Person {
    private String name ;
    private String gender ;
    private Double height ;

    public Person(String name, String gender, Double height) {
        this.name = name;
        this.gender = gender;
        this.height = height;
    }

    public  Person(){

    };

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }
}
