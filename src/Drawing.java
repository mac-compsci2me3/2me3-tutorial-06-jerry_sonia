public class Drawing {
    private static Drawing instance; 

    private Drawing(){}
    
    public static Drawing getInstance(){
        if (instance == null){
            instance = new Drawing();
        }
        return instance; 
    }

    public void drawShape(Shape shape){
        String shapeType = shape.getClass().getSimpleName();
        String color = shape.getColor();
        double area = shape.calculateArea();
        System.out.println("Drawing a " + shapeType + " with color: " + color + " and area: " + area);
    }
}
