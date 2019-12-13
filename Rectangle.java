import java.util.*;

public class Rectangle extends Shape implements Selectable{
  int width, height;
  double area;
  boolean selected;
  
  public Rectangle(int width, int height){
    this.width = width;
    this.height = height;
    selected = false;
  }
  
  public double getArea(){
    return height*width;
  }
  
  public Shape contains(int x, int y){
    if(getX() - x <= width/2 && getY() - y <= height/2 )
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
    return "The shape is rectangle. It's area is : " + getArea() + ".  It's x is : " + getX() + ", it's y is : " +
      getY() + "with width " + width + " and with height " + height + ". It's selected statement is " + getSelected();
  }
    
  
}//