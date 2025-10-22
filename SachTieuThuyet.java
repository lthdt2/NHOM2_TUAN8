public class SachTieuThuyet extends Sach {
    private String theLoai;
    private boolean laSachSeries;

    public SachTieuThuyet(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong,
                          double giaCoBan, String theLoai, boolean laSachSeries) {
        super(maSach, tieuDe, tacGia, namXuatBan, giaCoBan);
        this.theLoai = theLoai;
        this.laSachSeries = laSachSeries;
    }

    @Override
    public double tinhGiaBan() {
        return giaCoBan + (laSachSeries ? 15000 : 0);
    }

    @Override
    public boolean kiemTraTonKho(int  soLuongToiThieu) {
        return soLuong >= soLuongToiThieu;
    }

    @Override
    public void capNhatViTri(String viTriMoi) {
        System.out.println("Da chuyen tieu thuyet " + tieuDe + "den khu vuc: " + viTriMoi);
    }

    @Override
    public String toString() {
        return "[Tieu thuyet] " + super.toString() +
                ", Thể loại: " + theLoai +
                ", Là series: " + (laSachSeries ? "Có" : "Không") +
                ", Giá bán: " + tinhGiaBan();
    }
}