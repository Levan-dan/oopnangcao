public class FullTimeEmployee extends Employee {
    private double luongCoBan;

    public FullTimeEmployee() {
    }

    public double getLuongCoBan() {
        return luongCoBan;
    }

    public void setLuongCoBan(double luongCoBan) {
        this.luongCoBan = luongCoBan;
    }

    public FullTimeEmployee(String name, double luongCoBan) {
        super(name);
        this.luongCoBan = luongCoBan;
    }

    @Override
    public double tinhLuong() {
        return luongCoBan;
    }

    @Override
    public double addbonus(double tienbo){
        luongCoBan += tienbo;
        return luongCoBan;
    }
}
