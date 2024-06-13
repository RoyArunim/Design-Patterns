package Factory;

public class Square implements IShape{
    int side;
    Square(int side){
        this.side=side;
    }

    public void area(){
        System.out.println("area of rectangle is "+side*side);
    }
    public void perimeter(){
        System.out.println("perimeter of rectangle is "+4*side);
    }

    @Override
    public void draw() {
        System.out.println("Square drawn");
    }
}
