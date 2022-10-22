package opp1;

import java.util.ArrayList;
import java.util.Scanner;

public class HoaDonCaffe {
    private String tenCaffe;
    private double giaBan;
    private double khoiLuong;

    public HoaDonCaffe(String tenCaffe, double giaBan, double khoiLuong){
        this.tenCaffe = tenCaffe;
        this.giaBan = giaBan;
        this.khoiLuong = khoiLuong;
    }

    public HoaDonCaffe(ArrayList<HoaDonCaffe> list) {
    }

    public void importCaffe (){
        System.out.println("Import name caffe: ");
        tenCaffe = new Scanner(System.in).nextLine();
        System.out.println("Import price sell: ");
        giaBan = new Scanner(System.in).nextDouble();
        System.out.println("Import kg/1cafee: ");
        khoiLuong = new Scanner(System.in).nextDouble();
    }

    public void printCafe (){
        System.out.println("Name caffe: " + tenCaffe);
        System.out.println("Price: " + giaBan);
        System.out.println("Kg: " + khoiLuong);
        System.out.println("Sell: " + intoMoney());
        System.out.println("Test: " + testKg(2.0));
        System.out.println("Test total money > 500.000: " + testTotalMoney500k());
        System.out.println("Total money: " + saleMoney500k());
    }

    public double intoMoney(){
        return this.giaBan*this.khoiLuong;
    }

    public String testKg (double kl){
       return (this.khoiLuong > kl) ? "true" : "false" ;
    }

    public boolean testTotalMoney500k (){
        return this.intoMoney() > 500.000;
    }

    public double saleMoney500k (){
        if(this.intoMoney() > 500.000){
            return this.intoMoney()*0.2;
        }
        else {
            return this.intoMoney();
        }
    }
}
