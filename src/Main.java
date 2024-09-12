public class Main {
    public static void main(String[] args){
        FullTimeEmployee fullTime = new FullTimeEmployee("Dat", 6000);
        ParthTimeEmployee partTime = new ParthTimeEmployee("Tuyet", 50, 20);
        Employee employee = new Employee();

        System.out.println("Luong full time cua nhan vien " + fullTime.getName() + " la :" + fullTime.tinhLuong());
        System.out.println("Luong part time cua nhan vien " + partTime.getName() + " la: " + partTime.tinhLuong());


        System.out.println("Nhan vien chinh thuc duoc sau khi dc bo la:");
        System.out.println(fullTime.addbonus(500));
        System.out.println(partTime.addbonus(200));

        System.out.println("Tong luong cua all nhan vien thuong chung them 100k la:");
        Employee[] nhaVien = {fullTime, partTime};
        employee.addbonus(nhaVien, 100);
        System.out.println(fullTime.getLuongCoBan());
        System.out.println(partTime.getLuongPart());

    }
}