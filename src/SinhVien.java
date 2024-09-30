public class SinhVien extends Person {
    private String id;

    public SinhVien(String name, String bYear, String id) {
        super(name, bYear);
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String toString() {
        return "Sinh viên: " + getName() + ", sinh năm " + getbYear() + ", MSV: " + id;
    }
}
