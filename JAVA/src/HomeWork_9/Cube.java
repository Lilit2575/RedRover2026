public class Cube {
    private int Side;

    public int getSide() {
        return Side;
    }

    public void setSide(int num) {
        this.Side = num;

    }
}

void main() {
    Cube cube = new Cube();
    cube.setSide(9);

    System.out.println(cube.getSide());

    Cube cube1 = new Cube();
    int numer = 25;
    cube1.setSide( numer);


    System.out.println(cube1.getSide());
}
