package baitapGPT;

class circle {
    private double banKinh;
    private String mauSac;

    public circle(double banKinh, String mauSac) {
        this.banKinh = banKinh;
        this.mauSac = mauSac;
    }

    public double getBanKinh() {
        return banKinh;
    }

    public void setBanKinh(double banKinh) {
        this.banKinh = banKinh;
    }

    public String getMauSac() {
        return mauSac;
    }

    public void setMauSac(String mauSac) {
        this.mauSac = mauSac;
    }

    public double dienTichHinhTron() {
        return (Math.PI * Math.pow(banKinh, 2));
    }
}

class rectangle {
    private double chieuDai;
    private double chieuRong;
    private String mauSac;

    public rectangle(double chieuDai, double chieuRong, String mauSac) {
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
        this.mauSac = mauSac;
    }

    public double getChieuDai() {
        return chieuDai;
    }

    public void setChieuDai(double chieuDai) {
        this.chieuDai = chieuDai;
    }

    public double getChieuRong() {
        return chieuRong;
    }

    public void setChieuRong(double chieuRong) {
        this.chieuRong = chieuRong;
    }

    public String getMauSac() {
        return mauSac;
    }

    public void setMauSac(String mauSac) {
        this.mauSac = mauSac;
    }

    public double dienTichHinhChuNhat() {
        return chieuDai * chieuRong;
    }
}

class triangle {
    private double a;
    private double b;
    private double c;
    private String mauSac;

    public triangle(double a, double b, double c, String mauSac) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.mauSac = mauSac;
    }

    public double geta() {
        return a;
    }

    public void seta(Double a) {
        this.a = a;
    }

    public double getb() {
        return b;
    }

    public void setb(Double b) {
        this.b = b;
    }

    public double getc() {
        return c;
    }

    public void setc(Double c) {
        this.c = c;
    }

    public String getMauSac() {
        return mauSac;
    }

    public void setMauSac(String mauSac) {
        this.mauSac = mauSac;

    }

    public double dienTichHinhTamGiac() {
        double p = (a + b + c) / 2;
        double dientich = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return dientich;
    }
}

public class tinhDienTich {
    public static void main(String[] args) {

    }
}
