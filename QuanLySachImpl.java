import java.util.ArrayList;

public class QuanLySachImpl implements IQuanLySach {
    private ArrayList<Sach> danhSach = new ArrayList<>();

    @Override
    public void themSach(Sach s) {
        danhSach.add(s);
        System.out.println("✅ Đã thêm sách: " + s.getTieuDe());
    }

    @Override
    public Sach timKiemSach(String maSach) {
        for (Sach s : danhSach) {
            if (s.getMaSach().equalsIgnoreCase(maSach)) {
                return s;
            }
        }
        return null;
    }

    @Override
    public void xoaSach(String maSach) {
        boolean removed = danhSach.removeIf(s -> s.getMaSach().equalsIgnoreCase(maSach));
        if (removed)
            System.out.println("Da xoa sach co ma: " + maSach);
        else
            System.out.println("Khong tim thay sach co ma: " + maSach);
    }

    @Override
    public void hienThiDanhSach() {
        if (danhSach.isEmpty()) {
            System.out.println("Danh sach sach rong!");
            return;
        }

        System.out.println("===== DANH SACH SACH =====");
        for (Sach s : danhSach) {
            System.out.println(s);
        }
        System.out.println("===========================");
    }
}