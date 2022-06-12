package homework.classHomework;

public class Main {
    public static void main(String[] args) {
        Triangle myTriangle = new Triangle();
        myTriangle.side1 = 3;
        myTriangle.side2 = 4;
        myTriangle.side3 = 5;
        System.out.println("Area of this triangle is: " + myTriangle.areaOfTriangle(myTriangle.side1, myTriangle.side2, myTriangle.side3));
        myTriangle.isTriangleEquilateral();
        myTriangle.isTriangleIsoceles();

        Triangle otherTriangle = new Triangle();
        System.out.println("Area of this triangle is: " + otherTriangle.areaOfTriangle(12, 12, 14));
        otherTriangle.isTriangleIsoceles();
        otherTriangle.isTriangleEquilateral();
    }


}
