package Factory;

public class Rectangle implements IShape {
    int l, b;
    Rectangle(int l, int b){
        this.l=l;
        this.b=b;
    }

    public void area(){
        System.out.println("Area is "+l*b);
    }

    public void perimeter(){
        System.out.println("Perimeter of rectangle is "+(2*(l+b)));
    }

    @Override
    public void draw() {
        System.out.println("Rectangle drawn");
    }
}
