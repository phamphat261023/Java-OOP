package OppExtends;

import java.util.Scanner;

public class MatHang {

    private String tenHang;
    private String maHang;
    private String nuocSX;

    public MatHang() {
    }

    public MatHang(String tenHang, String maHang, String nuocSX) {
        this.tenHang = tenHang;
        this.maHang = maHang;
        this.nuocSX = nuocSX;
    }

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }

    public String getMaHang() {
        return maHang;
    }

    public void setMaHang(String maHang) {
        this.maHang = maHang;
    }

    public String getNuocSX() {
        return nuocSX;
    }

    public void setNuocSX(String nuocSX) {
        this.nuocSX = nuocSX;
    }

    @Override
    public String toString() {
        return "MatHang{" + "tenHang=" + tenHang + ", maHang=" + maHang + ", nuocSX=" + nuocSX + '}';
    }

    public void nhapthongtin(){
        System.out.println("Nhap ten hang: ");
        tenHang = new Scanner(System.in).nextLine();
        System.out.println("Nhap ma hang: ");
        maHang = new Scanner(System.in).nextLine();
        System.out.println("Nhap nuoc san xuat: ");
        nuocSX = new Scanner(System.in).nextLine();
    }
}
