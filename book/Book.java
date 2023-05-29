package book;
import java.util.Scanner;

public class Book {

    private String nameBook;
    private double price;
    private  int qtyInStock = 0;

    private   Author author = new Author();

    private static Scanner input = new Scanner(System.in);

    private static int number;

    private static  Author a1[] = new Author[number];
    

    

    public Book(){
        this.inputInfoBook();
        this.displayBook();
        
    };

    public  Book(String nameBook, Author author, double price) {
        this.nameBook = nameBook;
        this.author = author;
        this.price = price;
        this.inputInfoBook();
        this.displayBook();
        

    }

    public  Book(String nameBook, Author author, double price, int qtyInStock) {
        this.nameBook = nameBook;
        this.author = author;
        this.price = price;
        this.qtyInStock = qtyInStock;
        this.inputInfoBook();
        this.displayBook();

    }

    public String getnameBook(){
        return this.nameBook;
    }

    public double getPrice(){
        return this.price;
    }

    public void setPrice(double price){
        this.price = price;

    }

    public Author getAuthor(){
        return author;
    }


    public int getQtyInStock(){
        return this.qtyInStock;
    }


    public void setQtyInStock(int qtyInStock2){
        this.qtyInStock = qtyInStock2 ;
    }



    public void inputInfoBook(){

        System.out.print("Enter Name Book : ");
        this.nameBook = input.nextLine();
        
        System.out.print("Enter price Book: ");
        this.price = Double.parseDouble(input.nextLine());

        System.out.print("How many author do you want to input ? : ");
        number = Integer.parseInt(input.nextLine());

        if (number == 0){
            this.author = null;

        }else if (number == 1){

            System.out.print("Enter author Book: ");
            this.author.inputInfo();

        }else if ( 1 < number){

            a1= new Author[number];
            System.out.println("Enter author Book ");
            Author.inputInfo(a1);
        }

        System.out.print("Enter quantity Book : ");
        this.qtyInStock = Integer.parseInt(input.nextLine());
        
        

    }

   
    public static void inputInfoBook(Book book[]){

        for(int i = 0; i < book.length; i++){
            System.out.println("Enter information Book : " + (i+1));
            
            book[i].inputInfoBook();
        }
    }


    public void displayBook(){

        
        System.out.println(">>> Name Book: " + nameBook);

        System.out.println(">>> Author Book ");
        if (number == 0){
            System.out.println(">>> No author ");
        }else if (number == 1){
            author.disPlayAuthor();
        }else {
            Author.disPlayAuthor(a1);
        }
        System.out.println(">>> Price book: " + price);
        System.out.println(">>> Quantity book: " + qtyInStock);
    }

    public static void  disPlayAuthor(Book book){
        
        book.displayBook();

    }

    public static void disPlayAuthor(Book book[]){
        for(int i = 0; i < book.length; ++i){
            System.out.println("Information book " + (i+1));
            disPlayAuthor(book[i]);
        }

    }
    

}
