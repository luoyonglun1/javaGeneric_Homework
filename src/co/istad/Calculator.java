package co.istad;

public class Calculator<T extends Number , U extends Number> {
    private T one ;
    private U two ;

    public Calculator(T one, U two) {
        this.one = one;
        this.two = two;
    }

    public T getOne() {
        return one;
    }

    public U getTwo() {
        return two;
    }
}
