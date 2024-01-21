package revision;

//Constructors in Java are special methods created to
// initialize the objects of a class, in this example I
// make a constructor of a car.
public class Constructor {

    private String brand;
    private  String model;
    private int year;

    //This is a constructor and it is used to
    // initialize the value of the class variables
    public Constructor(String brand, String model, int year){

        this.brand = brand;
        this.model = model;
        this.year = year;

    }
}
//I was able to understand that constructors are special
// methods because they are called right when a class object
// is created and they are useful to ask for essential
// information when using the application.