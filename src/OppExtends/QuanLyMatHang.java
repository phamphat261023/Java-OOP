package OppExtends;

public class QuanLyMatHang {
    public static void main(String[] args) {
        XuLy xl = new XuLy();
        System.out.println("Nhap thong tin");
        xl.nhapdsTL();
        System.out.println("Hien thi thong tin");
        xl.hienthi();
        System.out.println("Tim kiem theo nhan hang");
        xl.tkTheoHang();
        xl.tongTien();
        xl.tren200DT();
        xl.sxGiam();
    }
}
