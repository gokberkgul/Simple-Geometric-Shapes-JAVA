public class Circle extends Shape implements Selectable{
  
 int radius;
 double area;
 boolean selected;
 
 public Circle(int radius){
   this.radius = radius;
   selected = false;
 }
 
 public double getArea(){
   return (double)(Math.PI*radius*radius);
 }
 
 public Shape contains(int x, int y){
    if( Math.pow( Math.pow( getX() - x, 2) + Math.pow( getY() - y, 2), 0.5) <= radius)
      return this;
    return null;
  }
  
  public boolean getSelected(){
    return selected;
  }
  
  public void setSelected(boolean selected){
    this.selected = selected;
  }
  
  public String toString(){
    return "The shape is circle. It's area is : " + getArea() + ". It's x is : " + getX() + ", it's y is : " +
      getY() + " with radius " + radius + ". It's selected statement is " + getSelected();
  }
    
}