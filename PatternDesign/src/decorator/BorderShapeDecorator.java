package decorator;

public class BorderShapeDecorator extends ShapeDecorator{
    public BorderShapeDecorator(Shape decoratedShape) {
	super(decoratedShape);
    }
    
    @Override
    public void draw() {
	decoratedShape.draw();
	System.out.println("This is a shape with border");
    }
}
