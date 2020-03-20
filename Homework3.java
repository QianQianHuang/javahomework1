/**
 * Homework3
 */
public class Homework3 {

    public static void main(String[] args) {
        Book3 book1 = new Book3 () ;
        book1.setName ("This Book Name is Noname") ;
        book1.setAuthor ("This Book's Author is QianQian Huang") ;
        book1.setPages (484) ;
        book1.setPrice (350.4f) ;
        
        Book3 book2 = new Book3 () ;
        book2.setName ("This Book Name is K") ;
        book2.setAuthor ("This Book's Author is Jack") ;
        book2.setPages (500) ;
        book2.setPrice (632.6f) ;

        Book3 book3 = new Book3 () ;
        book3.setName ("This Book Name is J") ;
        book3.setAuthor ("This Book's Aythor is Peter") ;
        book3.setPages (484) ;
        book3.setPrice (1202.3f) ;
        
        book1.showlnfo() ;
        book2.showlnfo() ;
        book3.showlnfo() ;
    }
}