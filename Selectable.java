public interface Selectable
{ 
  public boolean getSelected(); 
  
  public void setSelected(boolean t);  
  
  public Shape contains(int x, int y);
  
}