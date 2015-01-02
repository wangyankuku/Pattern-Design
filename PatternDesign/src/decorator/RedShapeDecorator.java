package decorator;

public class RedShapeDecorator extends ShapeDecorator {
    public RedShapeDecorator(Shape decoratedShape) {
	super(decoratedShape);
    }

    @Override
    public void draw() {
	decoratedShape.draw();
	System.out.println("This is the red one");
    }
}
