import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        IQuanLySach quanLy = new QuanLySachImpl();

        while (true) {
            System.out.println("\n====== MENU QUAN LY SACH ======");
            System.out.println("1. Them sach giao trinh");
            System.out.println("2. Them sach tieu thuyet");
            System.out.println("3. Hien thi danh sach");
            System.out.println("4. Tim kiem theo ma");
            System.out.println("5. Xoa sach");
            System.out.println("6. Thoat");
            System.out.print("Chon: ");
            int chon = sc.nextInt();
            sc.nextLine();

            switch (chon) {
                case 1:
                    System.out.print("Nhap ma: ");
                    String ma1 = sc.nextLine();
                    System.out.print("Tieu de: ");
                    String td1 = sc.nextLine();
                    System.out.print("Tac gia: ");
                    String tg1 = sc.nextLine();
                    System.out.print("Nam xuat ban: ");
                    int nam1 = sc.nextInt();
                    System.out.print("So luong: ");
                    int sl1 = sc.nextInt();
                    System.out.print("Gia co ban: ");
                    double gia1 = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("Mon hoc: ");
                    String mh = sc.nextLine();
                    System.out.print("Cap do: ");
                    String cd = sc.nextLine();
                    quanLy.themSach(new SachGiaoTrinh(ma1, td1, tg1, nam1, sl1, gia1, mh, cd));
                    break;

                case 2:
                    System.out.print("Nhap ma: ");
                    String ma2 = sc.nextLine();
                    System.out.print("Tieu de: ");
                    String td2 = sc.nextLine();
                    System.out.print("Tac gia: ");
                    String tg2 = sc.nextLine();
                    System.out.print("Nam xuat ban: ");
                    int nam2 = sc.nextInt();
                    System.out.print("So luong: ");
                    int sl2 = sc.nextInt();
                    System.out.print("Gia co ban: ");
                    double gia2 = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("The loai: ");
                    String tl = sc.nextLine();
                    System.out.print("La series (true/false): ");
                    boolean series = sc.nextBoolean();
                    quanLy.themSach(new SachTieuThuyet(ma2, td2, tg2, nam2, sl2, gia2, tl, series));
                    break;

                case 3:
                    quanLy.hienThiDanhSach();
                    break;

                case 4:
                    System.out.print("Nhap ma can tim: ");
                    String maTim = sc.nextLine();
                    Sach s = quanLy.timKiemSach(maTim);
                    System.out.println(s != null ? s : "Khong tim thay!");
                    break;

                case 5:
                    System.out.print("Nhap ma can xoa: ");
                    String maXoa = sc.nextLine();
                    quanLy.xoaSach(maXoa);
                    System.out.println("Da xoa neu ton tai!");
                    break;

                case 6:
                    System.out.println("Ket thuc chuong trinh!");
                    return;

                default:
                    System.out.println("Lua chon khong hop le!");
            }
        }
    }
}