package Task1;

public class Rectangle implements Style, Show, Parameters, Drawing, Calculating {
  
  private double height;

  private double width;

  public Rectangle (double height, double width) {
    this.height = height;
    this.width = width;
  }

  @Override
  public void draw() {
    System.out.println("Drawing rectangle...");
    
  }

 
  public void setHeight (double height) {
    this.height = height;
  }

  
  public void setWidth(double width) {
    this.width = width;  
  }

  @Override 
  public double getHeight() {
    return height;
  }

  @Override
  public double getWidth() {
    return width;
  }

  public double area() {
    return getHeight() * getWidth();
  }

  
  public double perimeter() {
    return (getHeight() + getWidth())*2;
  }
  

  public void showAll() {
    /*System.out.println(getHeight());
    System.out.println(getWidth());
    System.out.println(area());
    System.out.println(perimeter());
    System.out.println(COLOR);
    System.out.println(BORDERCOLOR);*/

    System.out.printf ("Построен треугольник высотой %d, шириной %d, площадью %d, с периметром %d", getHeight(),getWidth(),area(),perimeter());
    System.out.printf ("Цвет прямоугольника: %s. Обводка прямоугольника: %s", COLOR, BORDERCOLOR);

  }

}
