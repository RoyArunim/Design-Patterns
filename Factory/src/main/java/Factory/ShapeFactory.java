package Factory;

import java.util.Scanner;

public class ShapeFactory {
    Scanner sc=new Scanner(System.in);

    public IShape getShape(String input){
        switch(input){
            case "CIRCLE":
                System.out.println("enter radius");
                int r=sc.nextInt();
                return new Circle(r);
            case "SQUARE":
                System.out.println("enter side");
                int s=sc.nextInt();
                return new Square(s);
            case "RECTANGLE":
                System.out.println("enter length and breadth");
                int l=sc.nextInt();
                int b= sc.nextInt();
                return new Rectangle(l,b);
            default:return null;
        }

    }
}
