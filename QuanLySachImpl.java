import java.util.ArrayList;

public class QuanLySachImpl implements IQuanLySach {
    private ArrayList<Sach> danhSach = new ArrayList<>();

    @Override
    public void themSach(Sach s) {
        danhSach.add(s);
        System.out.println("Đa them sach: " + s.getTieuDe());
    }

    @Override
    public void xoaSach(String maSach) {
        Sach s = timSachTheoMa(maSach);
        if (s != null) {
            danhSach.remove(s);
            System.out.println("Da xoa sach co ma: " + maSach);
        } else {
            System.out.println("Khong tim thay sach de xoa!");
        }
    }

    @Override
    public Sach timSachTheoMa(String maSach) {
        for (Sach s : danhSach) {
            if (s.getMaSach().equalsIgnoreCase(maSach)) {
                return s;
            }
        }
        return null;
    }

    @Override
    public void capNhatSoLuong(String maSach, int soLuongMoi) {
        Sach s = timSachTheoMa(maSach);
        if (s != null) {
            s.setSoLuong(soLuongMoi);
            System.out.println("Da cap nhat so luong cho ma " + maSach + " thanh: " + soLuongMoi);
        } else {
            System.out.println("Khong tim thay sach de cap nhat!");
        }
    }

    @Override
    public void hienThiTatCa() {
        if (danhSach.isEmpty()) {
            System.out.println("Danh sach trong!");
            return;
        }
        for (Sach s : danhSach) {
            s.hienThiThongTin();
        }
    }
}
