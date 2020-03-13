/**
 * Student
 */
public class Student {

    private String name , gender , studentid , department , age ;

public Student()
{
    System.out.println("Student object is created") ;
}

public void setName(String newName)
{
    this.name = newName ;
}

public String getName()
{
    return this.name ;
}
}