public abstract class Shape implements Locatable{
  int x,y;
  
  public abstract double getArea();
  public abstract boolean getSelected();
  
  public int getX(){
    return x;
  }
  
  public int getY(){
    return y;
  }
  
  public void setLocation(int x, int y){
    this.x = x;
    this.y = y;
  }
}