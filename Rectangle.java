import java.util.Scanner;

public class Rectangle {
    double width;
    double height;
    public Rectangle(double w, double h) {
        this.width = w;
        this.height = h;
    }
    public double getArea() {
        return (this.width * this.height);
    }
    public  double getPerimeter() {
        return (2 * (this.width + this.height));
    }
    public String disPlay() {
        return ("width:" + this.width + " height:" + this.height);
    }

    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter width:");
        double w=sc.nextDouble();
        System.out.println("Enter height:");
        double h=sc.nextDouble();
        Rectangle r=new Rectangle(w,h);

        System.out.println("Your rectangle area is: " + r.disPlay());
        System.out.println("Perimeter of the rectangle is: "+r.getPerimeter());
        System.out.println("Area of the rectangle is: "+r.getArea());
    }
}
