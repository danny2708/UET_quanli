import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        people.add(new SinhVien("Phạm Khánh Duy", "2005", "23020569"));
        people.add(new GiangVien("Trần Mạnh Cường", "1969"));
        people.add(new Person("Đặng Quốc Huy", "1980"));

        System.out.println("Trường công nghệ hàng đầu Việt Nam có: ");
        for (Person person : people) {
            System.out.println(person.toString());
        }

        System.out.println("Và sự tham gia của các diễn viên khác");

        scanner.close();
    }
}