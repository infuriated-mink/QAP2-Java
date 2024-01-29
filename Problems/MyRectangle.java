package Problems;

public class MyRectangle {
    private MyPoint topLeft;
    private MyPoint bottomRight;

// constructors
    public MyRectangle(MyPoint topLeft, MyPoint bottomRight) {
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }
// getters and setters
    public MyRectangle(int x1, int y1, int x2, int y2) {
        this.topLeft = new MyPoint(x1, y1);
        this.bottomRight = new MyPoint(x2, y2);
    }
// Overloaded constructors
    public MyPoint getTopLeft() {
        return topLeft;
    }
// getters and setters
    public void setTopLeft(MyPoint topLeft) {
        this.topLeft = topLeft;
    }

    public MyPoint getBottomRight() {
        return bottomRight;
    }

    public void setBottomRight(MyPoint bottomRight) {
        this.bottomRight = bottomRight;
    }
// Overloaded getters and setters
    public double getPerimeter() {
        double width = Math.abs(topLeft.getX() - bottomRight.getX());
        double height = Math.abs(topLeft.getY() - bottomRight.getY());
        return 2 * (width + height);
    }
// getPerimeter() and getArea() methods
    public double getArea() {
        double width = Math.abs(topLeft.getX() - bottomRight.getX());
        double height = Math.abs(topLeft.getY() - bottomRight.getY());
        return width * height;
    }

    @Override
    public String toString() {
        return "MyRectangle[topLeft=" + topLeft + ",bottomRight=" + bottomRight + "]";
    }
}
