public class GiangVien extends Person {

    public GiangVien(String name, String bYear) {
        super(name, bYear);
    }

    public String toString() {
        return "Giảng viên: " + getName() + ", năm sinh: " + getbYear();
    }
}
