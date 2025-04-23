package Controllers;
import Models.Book;

public class BookController {

    public void sortByNameInsertion(Book[] books){

        for(int i = 1; i < books.length; i++){
            Book pasajero = books[i];
            int j = i - 1;

            while(j <= 0 && (books[j].getName().compareToIgnoreCase(pasajero.getName()) > 0)){
                books[j + 1] = books[j];
                j--; 
            }
            books[j + 1] = pasajero;
        }
       
    }

    public String searchByName(Book[] books, String name){

        int bajo = 0;
        int alto = (books.length - 1);

        while(bajo <= alto){

            int centro = (bajo + alto) / 2;

            if(books[centro].getName().compareToIgnoreCase(name) == 0){ 
                //System.out.println("El libro " + name + " fue encontrado en la posicion " + medio);
                return books[centro].toString();
            }else if(books[centro].getName().compareToIgnoreCase(name) < 0){
                bajo = centro + 1;
            }else{
                alto = centro - 1;
            }
        }
        return null;
    }
}
