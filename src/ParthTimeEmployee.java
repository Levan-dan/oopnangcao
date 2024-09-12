public class ParthTimeEmployee extends Employee {
    private int time;
    private int tienMotGio;

private int luongPart;
    public ParthTimeEmployee(String name, int time, int tienMotGio) {
        super(name);
        this.time = time;
        this.tienMotGio = tienMotGio;
    }


    public int getLuongPart() {
        return luongPart;
    }

    public void setLuongPart(int luongPart) {
        this.luongPart = luongPart;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public int getTienMotGio() {
        return tienMotGio;
    }

    public void setTienMotGio(int tienMotGio) {
        this.tienMotGio = tienMotGio;
    }

    @Override
    public double tinhLuong() {
        luongPart = getTime() * getTienMotGio();
        return luongPart;
    }


    @Override
    public double addbonus(double tienbo){
         luongPart += tienbo;
         return luongPart;
    }

}
