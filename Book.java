/**
 * Homework1Book
 */
public class Book {

    private String name , author , kind , issuedate , pages ;

    public Book()
    {
        System.out.println ("book object has created") ;
    }    

    public void setName(String newName)
    {
        this.name = newName ;
    }

    public String getName()
    {
        return this.name ;
    }

    public void setAuthor(String newAuthor) 
    {
        this.author = newAuthor ;
    }

    public String getAuthor()
    {
        return this.author ;
    }

    public void setKind(String newKind)
    {
        this.kind = newKind ;
    }

    public String getKind()
    {
        return this.kind ;
    }

    public void setIssuedate(String newIssuedate)
    {
        this.issuedate = newIssuedate ;
    }

    public String getIssuedate()
    {
        return this.issuedate ;
    }

    public void setPages(String newPages)
    {
        this.pages = newPages ;
    }

    public String getPages()
    {
        return this.pages ;
    }
    }
