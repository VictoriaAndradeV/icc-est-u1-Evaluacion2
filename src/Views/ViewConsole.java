package Views;
import Models.Book;

public class ViewConsole {
    //private ViewConsole viewConsole;
    

    public void showArray(Book[] books) {
        System.out.println("Lista de Libros");
        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i].toString());
        }
    }


    public void showMessage(){
        
    }

}
