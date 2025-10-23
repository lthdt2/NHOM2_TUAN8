public class SachTieuThuyet extends Sach {
    private String theLoai;
    private boolean laSachSeries;

    public SachTieuThuyet() {
        super();
    }

    public SachTieuThuyet(String maSach, String tieuDe, String tacGia, int namXuatBan,
                          int soLuong, double giaCoBan, String theLoai, boolean laSachSeries) {
        super(maSach, tieuDe, tacGia, namXuatBan, soLuong, giaCoBan);
        this.theLoai = theLoai;
        this.laSachSeries = laSachSeries;
    }

    public String getTheLoai() {
        return theLoai;
    }

    public boolean isLaSachSeries() {
        return laSachSeries;
    }

    @Override
    public double tinhGiaBan() {
        // Nếu là sách series, tăng 15.000đ
        return giaCoBan + (laSachSeries ? 15000 : 0);
    }

    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("The loai: " + theLoai);
        System.out.println("La sach series: " + (laSachSeries ? "Co" : "Khong"));
    }

    @Override
    public String toString() {
        return super.toString() + ", The loai: " + theLoai +
                ", La sach series: " + (laSachSeries ? "Co" : "Khong");
    }
}
