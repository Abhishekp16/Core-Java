/*
Create a class OneBHK with instance variables roomArea, hallArea and price. Then create default constructor that 
initializes instance variables with some values and a parameterized constructor that takes values for all instance 
variables and stores them in instance variables. Now create a method named show()  to print OneBHK’s instance 
variable values.
Create another class TwoBHK which has (inherites) all the properties and behaviors of OneBHK and a new instance 
variable room2Area. Then create default constructor to initialize all 4 instance variables and a parameterized 
constructor to take the values for initialization of all instance variables. Override show() method to print all 
data member information.
Write main method in another class (Say Demo) and store three TwoBHK flat’s information and print information using 
show method. Also print total amount of all flats. 
*/


class OneBHK{
    private int roomArea;
    private int hallArea;
    private int price;

    //default constructor
    OneBHK()
    {
        roomArea = 100;
        hallArea = 200;
        price = 2000;
    }

    //parametarized constructor
    OneBHK(int roomArea, int hallArea, int price)
    {
        this.roomArea = roomArea;
        this.hallArea = hallArea;
        this.price = price;
    }

    void show()
    {
        System.out.println("Room-area : "+roomArea+" Hall-area : "+hallArea+" price : "+price);
    }
}

class TwoBHK extends OneBHK{
    private int room2Area;

    TwoBHK()
    {
        super();
        room2Area=200;
    }
    TwoBHK(int roomArea, int hallArea, int price, int room2Area)
    {
        super(roomArea, hallArea, price);
        this.room2Area = room2Area;
    }
    void show()
    {
        super.show();
        System.out.println("Room2area : "+room2Area);
    }
}
public class Q43 {
    public static void main(String args[])
    {
        TwoBHK t = new TwoBHK(10,110,10,200);
        t.show();

    }
}
