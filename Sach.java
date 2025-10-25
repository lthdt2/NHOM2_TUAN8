// Yêu cầu 1: Xây dựng Abstract Class và Interfaces

// Giao diện tính giá bán
interface IGiaBan {
    double tinhGiaBan();
}

// Giao diện kiểm kê kho
interface IKiemKe {
    boolean kiemTraTonKho(int soLuongToiThieu);
    void capNhatViTri(String viTriMoi);
}

// Lớp trừu tượng Sách
public abstract class Sach implements IGiaBan, IKiemKe {
    private String maSach;
    private String tieuDe;
    private String tacGia;
    private int namXuatBan;
    private int soLuong;
    private double giaCoBan;

    public Sach(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong, double giaCoBan) {
        this.maSach = maSach;
        this.tieuDe = tieuDe;
        this.tacGia = tacGia;
        this.namXuatBan = namXuatBan;
        this.soLuong = soLuong;
        this.giaCoBan = giaCoBan;
    }

    // Getter & Setter
    public String getMaSach() { return maSach; }
    public String getTieuDe() { return tieuDe; }
    public String getTacGia() { return tacGia; }
    public int getNamXuatBan() { return namXuatBan; }
    public int getSoLuong() { return soLuong; }
    public double getGiaCoBan() { return giaCoBan; }

    public void setSoLuong(int soLuong) { this.soLuong = soLuong; }
    public void setGiaCoBan(double giaCoBan) { this.giaCoBan = giaCoBan; }

    @Override
    public String toString() {
        return "Ma: " + maSach + ", Tieu de: " + tieuDe + ", Tac gia: " + tacGia +
               ", Nam: " + namXuatBan + ", SL: " + soLuong + ", Gia co ban: " + giaCoBan;
    }
}
