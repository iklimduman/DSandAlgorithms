// Iterable interface represents collection of objects which can be iterated.

public class IterableClass {
    public static void main(String[] args) {

        Book catchingFire = new Book(0,"Catching Fire","Suzanne Colins");
        Book harryPotter = new Book(1,"HP","Rowling");
        Book lotr = new Book(2,"LOTR","Tolkien");

        List<Book> BookList = new ArrayList<Book>();
        BookList.add(catchingFire);
        BookList.add(harryPotter);
        BookList.add(lotr);

        // list interface is a sub-interface of collection
        Collection<Book> collection = BookList ;
        // collection extends the iterable interface
        Iterable<Book> iterable;
        iterable = collection;

        Iterator<Book> iterator = iterable.iterator();

        while(iterator.hasNext()){
            Book element = iterator.next();
        }

        iterable.forEach( (element) ->{
            System.out.println(element.author);
        });

        for(Book element : BookList){
            System.out.println("I am reading " + element.name);
        }

    }

}

class Book{
    private int id ;
    public String name ;
    public String author ;

    public Book(){
        this.id = 0 ;
        this.name = "";
        this.author = "";
    }

    public Book(int id, String name, String author){
        this.id = id ;
        this.name = name ;
        this.author = author ;
    }
}

