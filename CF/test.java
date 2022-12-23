import java.io.PrintStream;

class Circle {
    private double radius = 1;
    private String color = "red";

    public Circle(){}
    public Circle(double radius){this.radius = radius;}

    protected double getRadius(){return this.radius;}

    public String toString(){return color;}
}

class Cylinder extends Circle {
    private static PrintStream OUT = System.out;
    protected double height = 1.0;

    Cylinder(){}
    Cylinder(double radius){super(radius);}

    Cylinder(double radius, double height) {super(radius);this.height = height;}

    private double getHeight(){return this.height;}

    private double getVolume(){return 3.14 * this.getRadius() * this.getHeight();}
}

class Shape {
    private String color = "red";

    private boolean filled = true;

    Shape(){}

    Shape(String color, boolean filled) {this.color = color;this.filled = filled;}

    protected String getColor(){return this.color;}

    public void setColor(String color){this.color = color;}

    public boolean isFilled(){return filled;}

    public void setFilled(boolean filled){this.filled = filled;}

    public String toString() {return this.color;}
}

class Circle extends Shape {
    private double radius;

    Circle(){}

    Circle(double radius){this.radius = radius;}

    Circle(double radius, String color, boolean filled) {
        super(color, filled);this.radius = radius;
    }
    public double getRadius(){return radius;}

    public void setRadius(double radius){this.radius = radius;}

    protected double getArea() {return 3.14 * Math.pow(this.getRadius(), 2);}

    protected double getPerimeter() {return 3.14 * 2 * this.getRadius();}
}

class Rectangle extends Shape {
    private double width = 1;
    private double length = 1;

    Rectangle(){}

    Rectangle(double width, double length) {this.width = width;this.length = length;}

    Rectangle(double width, double length, String color, boolean filled) {super(color, filled);this.width = width;this.length = length;}

    public double getWidth(){return width;}

    public void setWidth(double width){this.width = width;}

    public double getLength(){return length;}

    public void setLength(double length){this.length = length;}

    public double getArea(){return this.getLength() * this.getLength();}

    public double getPerimeter(){return (this.getLength() + this.getLength()) * 2;}
}

class Square extends Rectangle {
    private double side;

    public double getSide(){return side;}
    public void setSide(double side) {this.side = side;}
    Square(){}
    Square(double side) {this.side = side;}
    Square(double side, String color, boolean filled) {super(side, side, color, filled);this.side = side;}
}

class Person{
    protected String name = "Person";
    protected String address = "address";
    Person(String name , String address){this.name = name;this.address = address;}

    public String toString(){return "name is " + this.name + " , address " + this.address;}
}


class Employee extends Person{
    protected double salary;
    Employee(double salary , String name , String address) {
        super(name , address);
        this.salary = salary;
    }
    public String toString(){return "name is " + this.name + " , address " + this.address + " salary is " + this.salary;}
}
class Faculty extends Employee{
    protected double office_hours;
    protected double rank;
    Faculty(double salary, String name, String address , double office_hours , double rank) {
        super(salary, name, address);
        this.office_hours = office_hours;
        this.rank = rank;
    }
    public String toString(){return "name is " + this.name + " , address " + this.address + " salary is " + this.salary +" office hours are " + this.office_hours +" rank is " + this.rank ;}
}
class Staff extends Employee{
    protected String title;

    Staff(double salary, String name, String address , String title) {super(salary, name, address);this.title = title;}
    public String toString(){return "name is " + this.name + " , address " + this.address + " salary is " + this.salary +" title is " + this.title;}
}

class test{
    private static PrintStream OUT = System.out;
    public static void main(String[] args){
        var person = new Person("persone name" , "person address");
        var emp = new Employee(10, "Emp name", "emp address");
        var fac = new Faculty(0, "fac name" , "fac address" , 10 , 1);
        var stf = new Staff(0, "stf name", "stf ad", "title");
        OUT.println(person.toString());
        OUT.println(emp.toString());
        OUT.println(fac.toString());
        OUT.println(stf.toString());
    }
}

class MyInteger{
    private int value;
    MyInteger(int value){this.value = value;}
    public int getValue(){return value;}
    public boolean isEven(){return this.getValue()%2==0;}
    public boolean isPrime(){
        for(int i = 2 ; i <this.getValue() ; i++){
            if(this.getValue() % i !=0 )return false;
        }
        return true;
    }
}
class publication{
    protected String title;
    protected double price;
    protected float[]ar = new float[3];
    public void set_data(String title , double price , float[]ar){
        this.title = title;
        this.price = price;
        this.ar = ar;
    }
    public void display_data(){
         System.out.println("Title => " + this.title + " price => " + this.price + " Array values => ");
        for(int i = 0 ; i <3 ; i++) System.out.println(ar[i]);
    }
}
class Book extends publication{
    private float time;
    public void set_data(String title , double price , float[]ar , float time){
        this.title = title;this.price = price;
        this.time = time;
    }
    public void display_data(){
        System.out.println("Title => " + this.title + " price => " + this.price + " Array values => ");
        for(int i = 0 ; i <3 ; i++) System.out.println(ar[i]);
        System.out.println(" time => " + this.time);
    }
}

class AudioCD extends publication{
    private float page_cnt;
    public void set_data(String title , double price , float[]ar , float page_cnt){
        this.title = title;this.price = price;
        this.page_cnt = page_cnt;
    }
    public void display_data(){
        System.out.println("Title => " + this.title + " price => " + this.price + " Array values => ");
        for(int i = 0 ; i <3 ; i++) System.out.println(ar[i]);
        System.out.println(" Page count => " + this.page_cnt);
    }
}
class Main{
    public static void main(String[] args){
        var pub = new publication();
        var book = new Book();
        var audio =new AudioCD();
        pub.set_data(null, 0, null);
        book.set_data(null, 0, null);
        audio.set_data(null, 0, null);
        pub.display_data();
        book.display_data();
        audio.display_data();
    }
}
