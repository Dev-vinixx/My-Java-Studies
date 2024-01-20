package revision;

//Java classes are a template or framework for creating
// objects in Java, it can use attributes and methods.
public class ClassJava {

    //Beginning of Attributes
    private String name;
    private int birth;
    private int dateHiring;
    private int salary;
    //End of Attributes

    //Beginning of method
    public void CreateAnEmployee(String newName, int birth,
                                 int dateHiring, int salary) {
        name = newName;
        this.birth = birth;
        this.dateHiring = dateHiring;
        this.salary = salary;
    }
    //End of method
}
//What I was able to understand about the Java class is that
// it basically serves as a blueprint/template for an object
// (or more, but that's where the workaround is) and it needs
// one or more things (like variables) and it needs a method
// like (create, pay, play).