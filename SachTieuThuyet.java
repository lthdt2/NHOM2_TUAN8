public class SachTieuThuyet extends Sach {
    private String theLoai;

    public SachTieuThuyet(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong, double giaCoBan, String theLoai) {
        super(maSach, tieuDe, tacGia, namXuatBan, soLuong, giaCoBan);
        this.theLoai = theLoai;
    }

    @Override
    public double tinhGiaBan() {
        return getGiaCoBan() * 1.1;
    }

    @Override
    public boolean kiemTraTonKho(int soLuongToiThieu) {
        return getSoLuong() >= soLuongToiThieu;
    }

    @Override
    public void capNhatViTri(String viTriMoi) {
        System.out.println("Da chuyen tieu thuyet \"" + getTieuDe() + "\" den khu vuc: " + viTriMoi);
    }

    @Override
    public String toString() {
        return super.toString() + ", The loai: " + theLoai + ", Gia ban: " + tinhGiaBan();
    }
}
