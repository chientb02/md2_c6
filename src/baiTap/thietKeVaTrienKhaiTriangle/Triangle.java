package baiTap.thietKeVaTrienKhaiTriangle;

public class Triangle extends Shape {
    private double side1 ;
    private double side2 ;
    private double side3 ;

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public Triangle(String color, double side1, double side2, double side3) {
        super(color);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public Triangle() {
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }
    public double  getPerimeter() {
        double Perimeter = this.side1 + this.side2 + this.side3;
        return Perimeter ;
    }
    public double getArea(){
        double p = (this.side1 + this.side2 + this.side3)/2;
        double h = 2* ((Math.sqrt(p*(p-this.side1)*(p-this.side2)*(p-this.side3)))/this.side2);
        return (this.side1 * h) /2 ;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "side1=" + side1 +
                ", side2=" + side2 +
                ", side3=" + side3 + "color= "+this.getColor() +"chu vi =" + this.getPerimeter() +"dien tich" +this.getArea() +
                '}';
    }
}
