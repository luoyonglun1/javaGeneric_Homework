package co.istad.exercise;

public class Student extends Person {
    private Double score ;

    public Student(String name, String gender, Double height, Double score) {
        super(name, gender, height);
        this.score = score;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }
}
