package baiTap.CircleAndCylinder;

public class Test {
    public static void main(String[] args) {
//        Circle circle =  new Circle();
//        String a= circle.toString();
//        System.out.println(a);
//
    Cylinder cylinder = new Cylinder(10.0 , 30, "black");
    String a = cylinder.toString();
        System.out.println(a);
        System.out.println(cylinder.getVolume());
        System.out.println(cylinder.getColor());
        System.out.println(cylinder.getRadius());
    }
}
