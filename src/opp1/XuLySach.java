package opp1;

import java.util.ArrayList;
import java.util.Scanner;

public class XuLySach {

    ArrayList<QLSach> listBook = new ArrayList<>();

    public void importListBook (){
        System.out.println("Import n book: ");
        int n = new Scanner(System.in).nextInt();
        for(int i = 0; i < n; i++){
            QLSach book = new QLSach(listBook);
            book.importBook();
            listBook.add(book);
        }
    }

    public void printListBook (){
        for(QLSach book : listBook){
            System.out.println("" + book.toString());
        }
    }
}
