package co.istad;

public class Box<T , U> {
    private T data ;
    private U subData ;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public U getSubData() {
        return subData;
    }

    public void setSubData(U subData) {
        this.subData = subData;
    }
}
