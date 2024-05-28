package Homework.five;

public class test {
//
public static void main(String[] args) {
//    Location location = new Location(3, 4);
//    Circle circle = new Circle(location, 'X', 5);
//    for (int i = 0; i < circle.grids.length; i++) {
//        for (int j = 0; j < circle.grids[i].length; j++) {
//            System.out.print(circle.grids[i][j]+" ");
//
//        }
//        System.out.println();
//
//    }
   ShapeCanvas shapeCanvas = new AvoidConflictShapeCanvas(50, 50);
//    System.out.println(shapeCanvas.addShape(0, 2, 'A', 5, 3, 1));
//    System.out.println(shapeCanvas.addShape(6, 8, 'B', 5, 7, 2));
//    System.out.println(shapeCanvas.addShape(8, 12, 'C', 5));
//    System.out.println(shapeCanvas.addShape(6,6,'D',5,7,1));
//    System.out.println(shapeCanvas.addShape(0,8,'E',3));
//
//    shapeCanvas.getShapesByArea().forEach(System.out::println);
//    shapeCanvas.getShapesByLocation().forEach(System.out::println);
    shapeCanvas.addShape(1,1,'E',10);
    for (int i = 0; i < shapeCanvas.getCanvas().length; i++) {
        for (int j = 0; j < shapeCanvas.getCanvas()[i].length; j++) {
            System.out.print(shapeCanvas.getCanvas()[i][j]+" ");

        }
        System.out.println();

    }
    }
}

