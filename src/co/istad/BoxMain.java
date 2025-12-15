package co.istad;

public class BoxMain {
    public static void main(String[] args) {
        Box<String , Integer> box = new Box<>();
        box.setData("Hello world");
        box.setSubData(12);
        System.out.println(box.getData());
        System.out.println(box.getSubData());

        Box<Integer , String > boxes = new Box<>();
        boxes.setData(168168);
        boxes.setSubData("Hello ni hao");
        System.out.println(boxes.getData());
        System.out.println(boxes.getSubData());
    }
}
