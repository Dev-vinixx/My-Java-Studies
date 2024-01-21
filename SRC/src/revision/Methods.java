package revision;

//Java methods are blocks of code that belong to a Java
// class and they are used to make a specific functio.
public class Methods {

    private double noteOne;
    private double noteTwo;
    private double noteThree;
    private double Average;
    private boolean passed;

    //These are Java methods: they can use the attributes
    // of your class to do various actions such as returning
    // a message or changing the value of an attribute.
    public void setNotes(int noteOne, int noteTwo, int noteThree) {
        this.noteOne = noteOne;
        this.noteTwo = noteTwo;
        this.noteThree = noteThree;
    }
    public void calculateAverage() {
        Average = noteOne + noteTwo + noteThree;
    }
    public void passedOrNot() {
        if (Average < 18) {
            System.out.println("you reprovous your average " +
                    "was: " + Average);
        } if (Average >= 18) {
            System.out.println("You were approved Your average" +
                    " was: " + Average);
        }
    }
}
//I was able to understand that the methods are essential
// for a Java application, they are very versatile because
// they can be used for many functions and they can also be
// used from other places in the application.