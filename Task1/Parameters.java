package Task1;

public interface Parameters {
  default void setWidth(){
    double width = 5;
  }
  default double getWidth() {
    return 5;
  }
  default void setHeight() {
    double height = 4;
  }
  default double getHeight() {
    return 4;
  }
}
