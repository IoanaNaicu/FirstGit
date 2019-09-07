import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Rectangle rec1 = new Rectangle(1, 1);
//        Rectangle rec2 = new Rectangle(2, 2);
//        Rectangle rec3 = new Rectangle(3, 3);
//        Rectangle rec4 = new Rectangle(4, 4);
//        Rectangle rec5 = new Rectangle(5, 5);
//
//        Rectangle[] myRectangle = {rec1, rec2, rec3, rec4, rec5};
//
//        for (Rectangle rec: myRectangle) {
//            System.out.println(rec.calculateArea());
//        }
//
//        System.out.println(Rectangle.sumArea(rec1, rec2, rec3, rec4, rec5));
//        System.out.println(Rectangle.sumArea(myRectangle));

//        for (int i = 0; i < args.length; i++) {
//            int length = (int) Math.random() * 100 + 1;
//            int height = (int) Math.random() * 100 + 1;
//            Rectangle rectangle = new Rectangle(length, height);
//            System.out.println(rectangle.calculateArea());
//        }


        //height si length citite din consola si calculata area.
        Scanner in = new Scanner(System.in);
        System.out.println("enter height: ");
        while (!in.hasNextInt()) {
            System.out.println("pls enter a int");
            in.next();
        }
        int height = in.nextInt();

        System.out.println("enter length: ");
        while (!in.hasNextInt()) {
            System.out.println("pls enter a int");
            in.next();
        }
        int length = in.nextInt();


        Rectangle r = new Rectangle(height, length);
        System.out.println(r.calculateArea());


    }
}
