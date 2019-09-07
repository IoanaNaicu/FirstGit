public class Rectangle {
    private int height;
    private int length;

    Rectangle(int height, int length) {
        this.height = height;
        this.length = length;
    }

    public void setHeight(int Height) {
        this.height = Height;
    }

    public int getHeight() {
        return height;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    public int calculateArea() {
        return this.height * this.length;
    }

    public static int sumArea(Rectangle... rectangles) {
        int sum = 0;
        for (Rectangle r: rectangles)
            sum = sum +r.calculateArea();
        return sum;
    }


}
