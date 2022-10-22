package OppExtends;

import java.util.Scanner;

public class TuLanh extends MatHang {

    private int dungtich;
    private String mausac;
    private String hangSX;
    private int sl;
    private float donGia;

    public TuLanh() {
        super();
    }

    public TuLanh(int dungtich, String mausac, String hangSX, int sl, float donGia, String tenHang, String maHang, String nuocSX) {
        super(tenHang, maHang, nuocSX);
        this.dungtich = dungtich;
        this.mausac = mausac;
        this.hangSX = hangSX;
        this.sl = sl;
        this.donGia = donGia;
    }

    public int getDungtich() {
        return dungtich;
    }

    public void setDungtich(int dungtich) {
        this.dungtich = dungtich;
    }

    public String getMausac() {
        return mausac;
    }

    public void setMausac(String mausac) {
        this.mausac = mausac;
    }

    public String getHangSX() {
        return hangSX;
    }

    public void setHangSX(String hangSX) {
        this.hangSX = hangSX;
    }

    public int getSl() {
        return sl;
    }

    public void setSl(int sl) {
        this.sl = sl;
    }

    public float getDonGia() {
        return donGia;
    }

    public void setDonGia(float donGia) {
        this.donGia = donGia;
    }

    @Override
    public String toString() {
        return "TuLanh{" + super.toString()
                + "dungtich=" + dungtich + ", mausac=" + mausac + ", hangSX=" + hangSX + ", sl=" + sl + ", donGia=" + donGia + ThanhTien() +  "\n" + '}';
    }

    public double ThanhTien(){
        return donGia*sl;
    }

    @Override
    public void nhapthongtin() {
        super.nhapthongtin();
        System.out.println("Nhap dung tich: ");
        dungtich = new Scanner(System.in).nextInt();
        System.out.println("Nhap mau sac: ");
        mausac = new Scanner(System.in).nextLine();
        System.out.println("Nhap hang san xuat: ");
        hangSX = new Scanner(System.in).nextLine();
        System.out.println("Nhap so luong: ");
        sl = new Scanner(System.in).nextInt();
        System.out.println("Nhap don gia: ");
        donGia = new Scanner(System.in).nextFloat();
    }
}
