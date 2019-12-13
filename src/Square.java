public class Square extends Rectangle{
  int side;
  boolean selected;
  
  public Square(int side){
    super(side,side);
    this.side = side;
    selected = false;
  }
  
  public String toString(){
    return "The shape is square. It's area is : " + getArea() + ".  It's x is : " + getX() + ", it's y is : " +
      getY() + "with sides " + side + ". It's selected statement is " + getSelected();
  }
}