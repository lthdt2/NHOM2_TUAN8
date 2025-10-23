// Yêu cầu 3: Trừu tượng hóa dịch vụ quản lý

import java.util.ArrayList;
import java.util.List;

// Interface quản lý sách
interface IQuanLySach {
    void themSach(Sach sach);
    Sach timKiemSach(String maSach);
    void xoaSach(String maSach);
    void hienThiDanhSach();
}

// Lớp triển khai giao diện
class QuanLySachImpl implements IQuanLySach {
    private List<Sach> danhSach = new ArrayList<>();

    @Override
    public void themSach(Sach sach) {
        danhSach.add(sach);
        System.out.println("Da them: " + sach.getTieuDe());
    }

    @Override
    public Sach timKiemSach(String maSach) {
        for (Sach s : danhSach) {
            if (s.getMaSach().equalsIgnoreCase(maSach)) return s;
        }
        return null;
    }

    @Override
    public void xoaSach(String maSach) {
        Sach s = timKiemSach(maSach);
        if (s != null) {
            danhSach.remove(s);
            System.out.println("Da xoa sach co ma: " + maSach);
        } else {
            System.out.println("Khong tim thay sach co ma: " + maSach);
        }
    }

    @Override
    public void hienThiDanhSach() {
        if (danhSach.isEmpty()) {
            System.out.println("Danh sach trong!");
        } else {
            for (Sach s : danhSach) System.out.println(s);
        }
    }
}
