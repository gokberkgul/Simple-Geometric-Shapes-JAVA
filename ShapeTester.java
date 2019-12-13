import java.util.*;

public class ShapeTester{
  public static void main(String[] args){
    int choice=0;
    
    Scanner scan = new Scanner(System.in);
    ShapeContainer box = new ShapeContainer();
    
    do{
      System.out.println( "Welcome, please select an option from the following menu");
      System.out.println( "--------------------------------------------------------");
      System.out.println( " ( 1 ) Create empty container");
      System.out.println( " ( 2 ) Add a shape to the container ");
      System.out.println( " ( 3 ) Compute total surface area in container");
      System.out.println( " ( 4 ) Display all the information on all shapes in the container");
      System.out.println( " ( 5 ) Look for the first shape in container to contain a given x and y");
      System.out.println( " ( 6 ) Remove all the selected shapes");
      System.out.println( " ( 7 ) Quit");
      choice = scan.nextInt();
      
      if(choice == 1)
        box = new ShapeContainer();
      if(choice == 2){
        System.out.println(" Press 1 for rectangle, 2 for circle, 3 to square");
        int n = scan.nextInt();
        if(n == 1){
          System.out.println("Enter width and height for rectangle");
          int width = scan.nextInt();
          int height = scan.nextInt();
          Rectangle r = new Rectangle(width, height);
          
          System.out.println("Enter x and y for rectangle");
          int x = scan.nextInt();
          int y = scan.nextInt();
          r.setLocation(x,y);
          box.add(r);
        }
        if(n == 2){
          System.out.println("Enter radius for circle");
          int radius = scan.nextInt();
          Circle c = new Circle(radius);
          
          System.out.println("Enter x and y for circle");
          int x = scan.nextInt();
          int y = scan.nextInt();
          c.setLocation(x,y);
          box.add(c);
        }
        if(n == 3){
          System.out.println("Enter side for square");
          int side = scan.nextInt();
          Square s = new Square(side);
          
          System.out.println("Enter x and y for square");
          int x = scan.nextInt();
          int y = scan.nextInt();
          s.setLocation(x,y);
          box.add(s);
        }
      }
      if(choice == 3)
        System.out.println("Whole Area is : " + box.getArea() );
      if(choice == 4)
        System.out.println(box.toString());
      if(choice == 5){
        System.out.println("Enter x and y axis");
        int x = scan.nextInt();
        int y = scan.nextInt();
        System.out.println((box.firstShape(x,y)).toString());
      }
      if(choice == 6){
        for(int i = 0; i<((box.container).size()) ; i++){
          if(((box.container).get(i)).getSelected())
          box.remove(i);
        }
      }
    }while(choice != 7);
  }
}
        
          
                             