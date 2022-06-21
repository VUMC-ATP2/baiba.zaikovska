package homework.classHomework;

public class Triangle {

    int side1;
    int side2;
    int side3;
    double triangleArea;


    public Triangle() {
        System.out.println("Triangle object is created!");
    }

    public double areaOfTriangle(int side1, int side2, int side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        double halfPerimeter = (side1 + side2 + side3) / 2.0d;
        triangleArea = Math.sqrt(halfPerimeter * (halfPerimeter - side1) * (halfPerimeter - side2) * (halfPerimeter - side3));
        return this.triangleArea;

    }

    public boolean isTriangleEquilateral() {
        boolean isEquilateral = true;
        if (side1 == side2 && side1 == side3) {
            System.out.println("This triangle is equilateral!");
            isEquilateral = true;
        } else {
            System.out.println("This triangle is not equilateral!");
            isEquilateral = false;
        }
        return isEquilateral;
    }

    public boolean isTriangleIsoceles() {
        boolean isIsoceles = true;
        if (side1 == side2 || side1 == side3 || side2 == side3) {
            System.out.println("This triangle is isoceles!");
            isIsoceles = true;
        } else {
            System.out.println("This triangle is not isoceles!");
            isIsoceles = false;
        }
        return isIsoceles;
    }
}
