// Yêu cầu 4: Kiểm tra hệ thống (Test)

import java.util.Scanner;

public class YeuCau4_Main {
    public static void main(String[] args) {
        IQuanLySach quanLy = new QuanLySachImpl();
        Scanner Sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n----- MENU QUAN LY SACH -----");
            System.out.println("1. Them sach giao trinh");
            System.out.println("2. Them sach tieu thuyet");
            System.out.println("3. Hien thi danh sach");
            System.out.println("4. Tim kiem sach");
            System.out.println("5. Xoa sach");
            System.out.println("0. Thoat");
            System.out.print("Chon: ");
            choice = Sc.nextInt();
            Sc.nextLine();

            switch (choice) {
                case 1 -> {
                    quanLy.themSach(new SachGiaoTrinh("GT01", "Lap trinh Java", "Nguyen Van A", 2024, 10, 100000, "Cong nghe thong tin"));
                }
                case 2 -> {
                    quanLy.themSach(new SachTieuThuyet("TT01", "Dac Nhan Tam", "Dale Carnegie", 2023, 5, 80000, "Ky nang song"));
                }
                case 3 -> quanLy.hienThiDanhSach();
                case 4 -> {
                    System.out.print("Nhap ma sach can tim: ");
                    Sach s = quanLy.timKiemSach(Sc.nextLine());
                    System.out.println(s != null ? s : "Khong tim thay!");
                }
                case 5 -> {
                    System.out.print("Nhap ma sach can xoa: ");
                    quanLy.xoaSach(Sc.nextLine());
                }
                case 0 -> System.out.println("Thoat chuong trinh!");
                default -> System.out.println("Lua chon khong hop le!");
            }
        } while (choice != 0);
    }
}
