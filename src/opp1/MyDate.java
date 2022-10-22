package opp1;

//import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class MyDate {
    private int day;
    private int month;
    private int year;

    public MyDate(int day, int month, int year){
        if(day >=1 && day <= 31){
            this.day = day;
        }
        else{
            this.day = 1;
        }

        if(month >= 1 && month <= 12){
            this.month = month;
        }
        else{
            this.month = 1;
        }

        if(year >= 1){
            this.year = year;
        }
        else{
            this.year = 1;
        }
    }

    public MyDate(ArrayList<MyDate> listDate) {
    }

    public int getDay(){
        return this.day;
    }

    public void setDay(int day){
        if(day >= 1 && day <= 31){
            this.day = day;
        }
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if(month >= 1 && month <= 12){
            this.month = month;
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if(year >= 1){
            this.year = year;
        }
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof MyDate myDate)) return false;
        return getDay() == myDate.getDay() && getMonth() == myDate.getMonth() && getYear() == myDate.getYear();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getDay(), getMonth(), getYear());
    }

    public void importDate (){
        System.out.println("Import day: ");
        day = new Scanner(System.in).nextInt();
        System.out.println("Import month: ");
        month = new Scanner(System.in).nextInt();
        System.out.println("Import year: ");
        year = new Scanner(System.in).nextInt();
    }

    @Override
    public String toString() {
        return "MyDate{" +
                this.day +
                "/" + this.month +
                "/" + this.year +
                '}';
    }
}
