package opp1;

import java.util.ArrayList;

public class SachTest {
    public static void main(String[] args) {
        ArrayList<MyDate> listDate = new ArrayList<MyDate>();
        MyDate myDate = new MyDate(listDate);
//        myDate.importDate();
//        System.out.println(""+myDate.toString());

        ArrayList<HoaDonCaffe> list = new ArrayList<HoaDonCaffe>();
        HoaDonCaffe hd = new HoaDonCaffe(list);
//        hd.importCaffe();
//        hd.printCafe();

        XuLySach xls = new XuLySach();
        System.out.println("-----------BOOK------------");
        xls.importListBook();
        xls.printListBook();


    }
}
