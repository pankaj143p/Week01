// Create a class Circle with instance variables radius and pi.
class Circle{
    private double radius;
    private double pi;
    // Create a constructor Circle(double radius, double pi) that initializes the instance variables.
    Circle(double radius, double pi){
        this.radius=radius;
        this.pi=pi;
    }
    // Create a method areaOfCircle(double radius, double pi) that returns the area of the circle.
    private double areaOfCircle(double radius, double pi){
        return pi*radius*radius;
    }
    // Create a method areaOfCircumference(double radius, double pi) that returns the area of the circumference.
    private double areaOfCircumference(double radius, double pi){
        return 2*pi*radius;
    }
    // Create a method display() that displays the area of the circle and the area of the circumference.
    private void display(){
        System.out.println("Area of Circle: "+areaOfCircle(radius,pi));
        System.out.println("Area of Circumference: "+areaOfCircumference(radius,pi));

    }
    public static void main(String[] args) {
        Circle c=new Circle(3,3.14);
        c.display();
    }
}