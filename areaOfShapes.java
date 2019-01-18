import java.util.Scanner;
class areaOfShapes {

    public static double area;
    public static String nameOfShape;

    public static void printArea(String nameOfShape, double area){
        System.out.println("The area of given "+nameOfShape+" is "+area);
    }

    public static double areaOfCircle(double radius) {
        area =  3.14 * radius * radius;
        return area;
    }


    public static double areaOfRectangle(double length, double breadth) {
        area = length * breadth;
        return area;
    }

    public static double areaOfTriangle(double base, double height) {
        area = 1/2 * base * height;
        return area;
    }

    public static double areaOfSquare(double side) {
        area =  side * side;
        return area;
    }

    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name of the shape ");
        nameOfShape = sc.next();

        switch (nameOfShape.toUpperCase()) {

            case "CIRCLE":
                System.out.print("Enter the radius of the Circle : ");
                double radius = sc.nextDouble();        
                printArea(nameOfShape, areaOfCircle(radius));             
                break;

            case "RECTANGLE":
                System.out.print("Enter the length of the Rectangle : ");
                double length = sc.nextDouble();
                System.out.print("Enter the breadth of the Rectangle : ");
                double breadth = sc.nextDouble();
                printArea(nameOfShape, areaOfRectangle(length, breadth));             
                break;

            case "TRIANGLE":
                System.out.print("Enter the base of the Triangle : ");
                double base = sc.nextDouble();
                System.out.print("Enter the height of the Triangle : ");
                double height = sc.nextDouble();
                printArea(nameOfShape, areaOfTriangle(base, height));             
                break;

            case "SQUARE":
                System.out.print("Enter the side of the Square : ");
                double side = sc.nextDouble();
                printArea(nameOfShape, areaOfSquare(side));             
                break;

            default:
                System.out.println("Invalid Input Of Shape.");
                System.out.println("Enter One of the Following shapes:\nCIRCLE\tRECTANGLE\tTRIANGLE\tSQUARE");
        }
    }
}
