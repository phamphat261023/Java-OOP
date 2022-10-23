package Abstract;

public class TestHinh {
    public static void main(String[] args) {
        ToaDo td1 = new ToaDo(3,4);
        ToaDo td2 = new ToaDo(5,6);
        ToaDo td3 = new ToaDo(3,7);

//        Hinh hinh = new Hinh(td1); => error

        Hinh h1 = new Diem(td1);
        Hinh h2 = new HinhTron(td2, 5);
        Hinh h3 = new HinhCN(td3, 4,5);

        System.out.println("Dien tich diem: "+h1.tinhDT());
        System.out.println("Dien tich hinh tron: " + h2.tinhDT());
        System.out.println("Dien tich hinh cn: " + h3.tinhDT());
    }
}
