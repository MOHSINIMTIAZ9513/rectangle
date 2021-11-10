
import java .util.*;
class Rectangle{
    private float length;
    private float width;
    public float area(){
        return length*width;
    }
    public float perimeter(){
        return 2*(length+width);
    }
public void setLength(float len)
        {
        if(len >0.0f && len <20.0f)
        length = len;
        else
        System.out.println("Invalid Length");
        }
public void setWidth(float wid)
        {
        if(wid >0.0f && wid <20.0f)
        width = wid;
        else
        System.out.println("Invalid width");
        }
public float getLength(){
        return length;
        }
public float getWidth(){
        return width;
        }
        }
public class Main {
    public static void main(String[] args) {
        Rectangle obj = new Rectangle(); //object of class rectangle
        Scanner sc = new Scanner(System.in);
        float len, width;
        System.out.println("Enter the length of the Rectangle");
        len = sc.nextFloat();
        System.out.println("Enter the width of the Rectangle");
        width = sc.nextFloat();
        obj.setLength(len); //setting values to attributes of class rectangle
        obj.setWidth(width);
        System.out.println("Length of the triangle is : " + obj.getLength());
        System.out.println("Width of the triangle is : " + obj.getWidth());
        System.out.println("Area of the triangle is : " + obj.area());
        System.out.println("Perimeter of the triangle is : " + obj.perimeter());
    }
}