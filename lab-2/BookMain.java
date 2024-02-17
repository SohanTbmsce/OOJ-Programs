import java.util.Scanner;
class BookMain{
    String name;
    String author;
    int price;
    int num_pages;

    BookMain(String name,String author,int price,int num_pages){
        this.name=name;
        this.author=author;
        this.price=price;
        this.num_pages=num_pages;
    }

    public String toString(){
    String name,author,price,num_pages;
        name="name:"+this.name+"\n";
        author="author:"+this.author+"\n";
        price="price:"+this.price+"\n";
        num_pages="no of pages"+this.num_pages+"\n";
        return name+author+price+num_pages;
    }

    public static void main(String args[]){
    String name;
    String author;
    int price;
    int num_pages;
        BookMain b[];
        Scanner s=new Scanner(System.in);
        int n;
        System.out.println("enter no books");
        n=s.nextInt();
        b=new BookMain[n];
        for(int i=0;i<n;i++){
            System.out.println("enter the name of book");
            name=s.next();
            System.out.println("enter the author of book");
            author=s.next();
            System.out.println("enter the price of book");
            price=s.nextInt();
            System.out.println("enter the no of pages of book");
            num_pages=s.nextInt();
            b[i]=new BookMain(name,author,price,num_pages);
        }

        for(int i=0;i<2;i++){
            System.out.println(b[i].toString());
        }

    }
}