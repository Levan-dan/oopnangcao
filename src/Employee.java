public class Employee {
    private String name;
    private double luong;

    public Employee() {

    }

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }

    public double tinhLuong() {
        return luong;
    }

    public double addbonus(double tienbo){
       luong += tienbo;
       return luong;

    }

    public void addbonus(Employee[] employees, double tienbo){
        for(Employee i : employees){
            i.addbonus(tienbo);
        }
    }

}
