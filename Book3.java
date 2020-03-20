/**
 * Book3
 */
public class Book3 {

    private String name , author , kind , id ;
    private int pages ;
    private float price ;
    
    public Book3 ()
    {

    }
    
    public void setName (String newName)
    {
        this.name = newName ;
    }
     public String getName ()
    {
        return this.name ;
    }

    public void setAuthor (String newAuthor)
    {
        this.author = newAuthor ;
    }
    public String getAuthor ()
    {
        return this.author ; 
    }

    public void setPages (int newPages)
    {
        this.pages = newPages ;
    }
    public int getPages ()
    {
        return this.pages ;
    }

    public void setPrice (Float newPrice)
    {
        this.price = newPrice ;
    }
    public float getPrice ()
    {
        return this.price ;
    }

    public void showlnfo ()
    { 
        System.out.println (getName () + "\n" + getAuthor () 
        + "\n This Book Pages is " + getPages () + "\n This Book Price is " + getPrice ()) ;
    }

}