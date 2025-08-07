public class mainiki {

    public static void main(String[] args) {
        Triangle triangleA = new Triangle(15, 8, 15, 8, 17);
        Triangle triangleB = new Triangle(3, 2.598, 3, 3,3);
        System.out.println(triangleA);
        System.out.println(triangleB);

        double triangleAA=triangleA.findArea();
        System.out.println(triangleAA);

        System.out.println(triangleA.sideLenOne);
    }

}