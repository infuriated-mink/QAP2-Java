package Task1;

class MyPoint {
    private int x;
    private int y;

    // getters and setters
    public MyPoint() {
        this(0, 0);
    }

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    // Overloaded getXY() with no arguments
    public int[] getXY() {
        return new int[] { x, y };
    }

    // Overloaded getXY() with array output
    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Overloaded setXY() with array input
    public double distance(int x, int y) {
        int xDiff = this.x - x;
        int yDiff = this.y - y;
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }

    // Overloaded distance() with MyPoint input
    public double distance(MyPoint another) {
        return distance(another.getX(), another.getY());
    }

    @Override
    public String toString() {
        return "(" + x + "," + y + ")";
    }
}
