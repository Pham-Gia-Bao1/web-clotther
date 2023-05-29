package book;

import java.util.Scanner;


public class Author {

    private static Scanner input = new Scanner(System.in);

    protected  String nameAuthor;
    protected  String email;
    protected  char gender;

    public Author(){

        this.nameAuthor = null;
        this.email = null;
        this.gender = ' ';

    };
    public Author(String nameAuthor, String email, char gender){
        this.nameAuthor = nameAuthor;
        this.email = email;
        this.gender = gender;

    };

    public String getnameAuthor(){
        return this.nameAuthor;
    }

    public String getEmailAuthor(){
        return this.email;
    }

    public char getGenderAuthor(){
        return this.gender;
    }

    public void setnameAutho(String nameAuthor){
        this.nameAuthor = nameAuthor;
    }

    public void setEmailAuthor(String email){
        this.email = email;
    }

    public void setGenderAuthor(char gender){
        this.gender = gender;
    }





    public void inputInfo(){
        System.out.println();
        System.out.print("Enter Name Author: ");
        this.nameAuthor = input.nextLine();
        System.out.print("Enter Email Author: ");
        this.email = input.nextLine();
        System.out.print("Enter Gender Author: ");
        this.gender = input.nextLine().charAt(0);
    }

    public static void inputInfo(Author []author){
        
        for(int i = 0; i < author.length; ++i){
            System.out.println("Enter inofomation Author: " + (i+1));
            author[i] = new Author();
            author[i].inputInfo();
        }
    }



    public void disPlayAuthor(){

        System.out.println(">>> Name Author: " + this.nameAuthor);
        System.out.println(">>> Email Author :" + this.email);
        System.out.println(">>> Gender author :" + this.gender);
    }

    public static void disPlayAuthor(Author author[]){
        for(int i = 0; i < author.length; i++){
            System.out.println(">> Information Author " + (i+1) + ":");
            author[i].disPlayAuthor();
        }
    }


    

}
