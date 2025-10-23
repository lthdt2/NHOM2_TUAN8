public class SachGiaoTrinh extends Sach {
    private String monHoc;
    private String capDo;

    public SachGiaoTrinh() {
        super();
    }

    public SachGiaoTrinh(String maSach, String tieuDe, String tacGia, int namXuatBan,
                         int soLuong, double giaCoBan, String monHoc, String capDo) {
        super(maSach, tieuDe, tacGia, namXuatBan, soLuong, giaCoBan);
        this.monHoc = monHoc;
        this.capDo = capDo;
    }

    public String getMonHoc() {
        return monHoc;
    }

    public String getCapDo() {
        return capDo;
    }

    @Override
    public double tinhGiaBan() {

        double giamGia = (2025 - namXuatBan) * 5000;
        return giaCoBan - giamGia > 0 ? giaCoBan - giamGia : giaCoBan;
    }

    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("Mon hoc: " + monHoc);
        System.out.println("Cap do: " + capDo);
    }

    @Override
    public String toString() {
        return super.toString() + ", Mon hoc: " + monHoc + ", Cap do: " + capDo;
    }
}
