package Task1;

public class MainCode {
  public static void main(String[] args) {
    
    Rectangle r1 = new Rectangle(3,2);
    System.out.println (r1.getHeight());
    r1.setHeight(7);
    r1.setWidth(4);
    r1.draw();
    r1.showAll();
  }
}
