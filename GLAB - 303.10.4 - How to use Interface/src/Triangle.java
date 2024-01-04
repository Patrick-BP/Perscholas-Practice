public class Triangle extends Shape implements Movable{


    private int x, y;


    public Triangle( int x, int y) {

        this.x = x;
        this.y = y;
    }

    @Override
    public void moveUp() {
        y--;
    }

    @Override
    public void moveDown() {
        y++;
    }

    @Override
    public void moveLeft() {
        x--;
    }

    @Override
    public void moveRight() {
        x++;
    }

    @Override
    public String getCoordinate() {
        return  "(" + x + "," + y + ")";
    }

    @Override
    public double getArea() {
        double area = (this.x * this.y)/2;
        return area;
    }
}
