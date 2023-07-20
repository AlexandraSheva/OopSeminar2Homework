package Task1;

public interface Parameters {
  default double getWidth(){
    return 5;
  }
  default double getHeight(){
    return 4;
  }

  public void setHeight (double height);

  public void setWidth(double width);
}
