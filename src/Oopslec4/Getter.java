package Oopslec4;

public class Getter {
    private int num;
    private String name;
    int[] array;

    public String getName() {
        return this.name;
    }

    public int getNum() {
        return this.num;
    }

    public Getter(int num, String name) {
        this.num = num;
        this.name = name;
        this.array = new int[num];
    }
}
