class CeometricObject{
    public double getArea(){
        return 0.0;
    }
}

class Circle extends GeometricObject{
    private double radius;
    private double area;
    final double PI = 3.1415926;

    public Circle(double radius){
        if(radius <= 0) radius = 1.0;
        this.radius = radius;
        area = PI * radius * radius;
    }

    public double getRadius(){
        return radius;
    }

    public double getArea(){
        return area;
    }

    public void setRadius(double newRadius){
        if(newRadius <= 0) return;
        this.radius = newRadius;
        area = PI * radius * radius;
    }
}

class Rect extends GeometricObject{
    private double width;
    private double height;
    private double area;

    public Rect(double width,double height){
        setWidthAndHeight(width,height);
    }

    public double getWidth(){
        return width;
    }

    public double getHeight(){
        return height;
    }

    public double getArea(){
        return area;
    }
}