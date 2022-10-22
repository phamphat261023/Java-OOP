package OppExtends;

import java.util.ArrayList;
import java.util.Scanner;

public class XuLy {

    ArrayList<TuLanh> list = new ArrayList<>();

    public void nhapdsTL() {
        int chon;
        while (true) {
            System.out.println("Ban co muon nhap khong '1/0': ");
            chon = new Scanner(System.in).nextInt();
            if (chon == 0) {
                break;
            } else if (chon == 1) {
                TuLanh tl = new TuLanh();
                tl.nhapthongtin();
                list.add(tl);
            }
        }
    }

    public void hienthi() {
        for (TuLanh tl : list) {
            System.out.println(tl.toString());
        }
    }

    public ArrayList<TuLanh> tkTheoHang() {
        System.out.println("Nhap hang san xuat ma ban muon tim: ");
        String hangSX = new Scanner(System.in).nextLine();
        for (TuLanh tl : list) {
            if (hangSX.equals(tl.getHangSX()) == true) {
                System.out.println(tl.toString());
            }
        }
        return list;
    }

    public void tongTien() {
        double tong = 0;
        for (TuLanh tl : list) {
            tong += tl.ThanhTien();
        }
        System.out.println("Tong tien: " + tong);
    }

    public void tren200DT() {
        for (TuLanh tl : list) {
            if (tl.getDungtich() > 200) {
                System.out.println(tl.toString());
            }
        }
    }

    public void sxGiam() {
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if(list.get(j).getSl() > list.get(i).getSl()){
                    TuLanh tmp;
                    tmp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, tmp);
                }
            }
        }
        System.out.println(list.toString());
    }
}
