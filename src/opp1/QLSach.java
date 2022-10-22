package opp1;

import java.util.ArrayList;
import java.util.Scanner;

public class QLSach {
    private int bookId;
    private String name;
    private int yearBorn;
    private double sell;
    private String nameAuthor;
    private int dayAuthor;
    private int monthAuthor;
    private int yearAuthor;
    private double sale;

    public QLSach(int bookId, String name, int yearBorn, double sell, String nameAuthor, int dayAuthor, int monthAuthor, int yearAuthor, double sale) {
        this.bookId = bookId;
        this.name = name;
        this.yearBorn = yearBorn;
        this.sell = sell;
        this.nameAuthor = nameAuthor;
        this.dayAuthor = dayAuthor;
        this.monthAuthor = monthAuthor;
        this.yearAuthor = yearAuthor;
        this.sale = sale;
    }

    public QLSach(ArrayList<QLSach> listBook) {
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearBorn() {
        return yearBorn;
    }

    public void setYearBorn(int yearBorn) {
        this.yearBorn = yearBorn;
    }

    public double getSell() {
        return sell;
    }

    public void setSell(double sell) {
        this.sell = sell;
    }

    public String getNameAuthor() {
        return nameAuthor;
    }

    public void setNameAuthor(String nameAuthor) {
        this.nameAuthor = nameAuthor;
    }

    public int getDayAuthor() {
        return dayAuthor;
    }

    public void setDayAuthor(int dayAuthor) {
        this.dayAuthor = dayAuthor;
    }

    public int getMonthAuthor() {
        return monthAuthor;
    }

    public void setMonthAuthor(int monthAuthor) {
        this.monthAuthor = monthAuthor;
    }

    public int getYearAuthor() {
        return yearAuthor;
    }

    public void setYearAuthor(int yearAuthor) {
        this.yearAuthor = yearAuthor;
    }

    public double getSale() {
        return sale;
    }

    public void setSale(double sale) {
        this.sale = sale;
    }

    public void importBook (){
        System.out.println("Id: ");
        bookId = new Scanner(System.in).nextInt();
        System.out.println("Name: ");
        name = new Scanner(System.in).nextLine();
        System.out.println("Year born: ");
        yearBorn = new Scanner(System.in).nextInt();
        System.out.println("Sell: ");
        sell = new Scanner(System.in).nextDouble();
        System.out.println("Sale %: ");
        sale = new Scanner(System.in).nextDouble();
        System.out.println("Name author: ");
        nameAuthor = new Scanner(System.in).nextLine();
        System.out.println("Day born author: ");
        dayAuthor = new Scanner(System.in).nextInt();
        System.out.println("Month born author: ");
        monthAuthor = new Scanner(System.in).nextInt();
        System.out.println("Year born author: ");
        yearAuthor = new Scanner(System.in).nextInt();

    }

    @Override
    public String toString() {
        return "QLSach{" +
                "bookId: " + bookId +
                ", name: '" + name + '\'' +
                ", yearBorn: '" + yearBorn + '\'' +
                ", sale: " + sale +
                ", sell: " + sell + "\n" +
                ", nameAuthor: '" + nameAuthor + '\'' +
                ", Date author: ' " + dayAuthor + "/" + monthAuthor + "/" + yearAuthor +
                ", book then sale %: " + saleBook() +
                '}' + "\n" + "----------------------------------------------------------------------" + "\n" ;
    }

//    public boolean bookDate (QLSach otherBook){
//        return (this.yearBorn == otherBook.yearBorn) ? true : false;
//    }

    public double saleBook (){
        return sell*sale;
    }
}
