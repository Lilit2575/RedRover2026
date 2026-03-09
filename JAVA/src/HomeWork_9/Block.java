package HomeWork_9;

public class Block {

    public int width;
    private int length;
    private int height;


    // Конструктор, принимающий массив [width, length, height]
    public Block(int[] parametrs) { // модификатор , Имя Класса ( тим данных  название )
        this.width = parametrs[0];
        this.length = parametrs[1];
        this.height = parametrs[2];
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

    public int getHeight() {
        return height;
    }

    public int getVolume() {
        int v = width * length * height;
        return v;
    }

    public int getSurfaceArea() {
        return 2 * (width * length + length * height + width * height);
    }

}





