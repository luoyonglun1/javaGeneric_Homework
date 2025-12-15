package co.istad.exercise;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class SchoolSystem {
    public static void main(String[] args) {

        Person Student = new Student("Luo yonglun" , "male" , 1.82 , 99.00);
        Person Student2 = new Student("Luo Jinghua" , "male" , 1.82 , 99.00);
        Person Teacher = new Teacher("Chen Lixing" , "Female" , 1.65 , BigDecimal.valueOf(2000));
        Person Teacher2 = new Teacher("Chen Liping" , "male" , 1.75 , BigDecimal.valueOf(2500));


        List<Person> person = new ArrayList<>();
        person.add(Student);
        person.add(Student2);
        person.add(Teacher);
        person.add(Teacher2);

        School<Person> people = new School<>();
        people.setData(person);

        people.getData().forEach(person1 -> {
            System.out.println("Name : " + person1.getName());
            System.out.println("Gender : " + person1.getGender());
            System.out.println("Height : " + person1.getHeight());

            if (person1 instanceof Student obj){
                System.out.println("Score : " + obj.getScore());
            }else if(person1 instanceof  Teacher obj){
                System.out.println("Salary : " + obj.getSalary());
            }else {
                System.out.println("Invalid information..!");
            }
            System.out.println("--------------------------");
        } );



    }
}
