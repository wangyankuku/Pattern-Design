package decorator;

public class Main {
    public static void main(String[] args) {
	Shape circle = new RedShapeDecorator(new BorderShapeDecorator(new Circle()));
	
	Shape rec = new BorderShapeDecorator(new Rectangle());
	
	circle.draw();
	
	System.out.println();
	rec.draw();
    }
}
