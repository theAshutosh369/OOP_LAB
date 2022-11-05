package oopl_or_oopc;

interface shape
{
    void draw();
}
class rectangle implements shape
{
    @Override
    public void draw() {
        System.out.println("inside Rectangle :: draw() method ");
    }
}
class circle implements shape
{
    @Override
    public void draw() {
        System.out.println("inside Circle :: draw() method ");
    }
}
class square implements shape
{
    @Override
    public void draw() {
        System.out.println("inside Square :: draw() method ");
    }
}

class ShapeFactory
{
    public shape getShape( String shapeType){
        if(shapeType.equalsIgnoreCase("CIRCLE"))
        {
            return new circle();
        }
        if(shapeType.equalsIgnoreCase("RECTANGLE"))
        {
            return new rectangle();
        }
        if(shapeType.equalsIgnoreCase("SQUARE"))
        {
            return new square();
        }
        return  null;
    }

}
public class DESIGN_PATTERN {
    public static void main(String[] args)
    {
        ShapeFactory shapeFactory = new ShapeFactory();

        shape shape1 = shapeFactory.getShape("CIRCLE");
        shape1.draw();

        shape shape2 = shapeFactory.getShape("RECTANGLE");
        shape2.draw();

        shape shape3= shapeFactory.getShape("SQUARE");
        shape3.draw();

    }
}
