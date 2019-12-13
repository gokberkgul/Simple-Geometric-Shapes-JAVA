import java.util.*;

public class ShapeContainer{
  public int size, valid;
  public ArrayList<Shape> container;
  public double allArea = 0;
  
  public ShapeContainer(){
    size = 1;
    valid = 0;
    container = new ArrayList<Shape>(size);
  }
  
  public void add(Shape s){
    size++;
    container.add(valid,s);
    valid++;
  }
  
  public double getArea(){
    for(int i = 0 ; i<valid ; i++ )
      allArea += (container.get(i)).getArea();
    return allArea;
  }
  
  public ArrayList<Shape> getList(){
    return container;
  }
  
  public void remove(int a){
    container.remove(a);
    valid--;
  }
  
  public String toString(){
    String tmp = "Container has " + valid + " shapes in it. " ;
    for(int i = 0 ; i<valid ; i++ )
      tmp += container.get(i).toString() + "\n";
    return tmp;
  }
  
  public Shape firstShape(int x , int y){
     for(int i = 0 ; i < size ; i++){
      Selectable shape = ((Selectable)container.get(i));
      if(shape.contains( x, y )!= null) {
        shape.setSelected(true);
        return container.get(i);
      }
    }
    return null;
  }
}
    
  
  
  
    
  