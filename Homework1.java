/**
 * Homework1
 */
public class Homework1 {

    public static void main(String[] args) {
        Book book1 = new Book() ;
        book1.setName("Noname") ;
        System.out.println(book1.getName()) ;
        book1.setAuthor("QianQian Huang") ;
        System.out.println(book1.getAuthor()) ;
        book1.setKind("Romance") ;
        System.out.println(book1.getKind()) ;
        book1.setIssuedate("2020/3/9") ;
        System.out.println(book1.getIssuedate()) ;
        book1.setPages("200") ;
        System.out.println(book1.getPages()) ;
    }
}