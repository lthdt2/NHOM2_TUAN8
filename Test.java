public class Test {
    public static void main(String[] args) {
    
        IQuanLySach ql = new QuanLySachImpl();

        SachGiaoTrinh sg1 = new SachGiaoTrinh("GT01", "Giai Tich 1", "Nguyen Van A", 2020, 10, 50000, "Toan hoc", "Dai hoc");
        SachGiaoTrinh sg2 = new SachGiaoTrinh("GT02", "VVat Ly Co Ban", "Tran Thi B", 2021, 5, 55000, "Vat ly", "Pho thong");

        // Tạo sách tiểu thuyết
        SachTieuThuyet st1 = new SachTieuThuyet("TT01", "Harry Potter", "J.K. Rowling", 1997, 20, 70000, "Gia tuong", true);
        SachTieuThuyet st2 = new SachTieuThuyet("TT02", "Nha Gia Kim", "Paulo Coelho", 1988, 15, 60000, "Triet ly", false);

        // Thêm sách vào danh sách
        ql.themSach(sg1);
        ql.themSach(sg2);
        ql.themSach(st1);
        ql.themSach(st2);

        System.out.println("=== DANH SACH BAN DAU ===");
        ql.hienThiTatCa();

        System.out.println("\n=== TIM SACH CO MA 'TT01' ===");
        Sach tim = ql.timSachTheoMa("TT01");
        if (tim != null) tim.hienThiThongTin();

        System.out.println("\n=== CAP NHAT SO LUONG 'GT02' ===");
        ql.capNhatSoLuong("GT02", 12);
        ql.hienThiTatCa();

        System.out.println("\n=== XOA SACH 'TT02' ===");
        ql.xoaSach("TT02");
        ql.hienThiTatCa();
    }
}
