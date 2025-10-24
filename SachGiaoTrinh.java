public class SachGiaoTrinh extends Sach {
    private String monHoc;
    private String capDo;

    public SachGiaoTrinh(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong, double giaCoBan, String monHoc, String capDo) {
        super(maSach, tieuDe, tacGia, namXuatBan, giaCoBan);
        this.monHoc = monHoc;
        this.capDo = capDo;
    }
    @Override
    public double tinhGiaBan() {
        int soNam = 2025 - namXuatBan;
        return giaCoBan + soNam * 5000;
    }
    @Override
    public boolean kiemTraTonKho(int soLuongToiThieu) {
        return soLuong >= soLuongToiThieu;
    }
    @Override
    public void capNhatViTri(String viTriMoi) {
        System.out.println("Da chuyen sach " + tieuDe + "den khu vuc: " + viTriMoi);
    }
    @Override
    public String toString() {
        return "[Giao Trinh]" + super.toString() +
               ", Mon hoc: " + monHoc +
               ", Cap do: " +capDo +
               ", Gia ban: " + tinhGiaBan();
    }
}