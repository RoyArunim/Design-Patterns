package Factory;

public class Circle implements IShape {
    public int radius;
    public Circle(int radius){
        this.radius=radius;
    }
    public void area(){
        System.out.println("Area is "+3.14*radius*radius);
    }
    public void perimeter(){
        System.out.println("Circumference is "+2*3.14*radius);
    }

    @Override
    public void draw() {
        System.out.println("CIRCLE drawn");
    }
}
