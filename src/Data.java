//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.ArrayList;
import java.util.List;
public class Data {
    public static void main(String[] args) {
        List<Student>students=new ArrayList<>();
        students.add(new Student("Khrystyna","f"));
        students.add(new Student("Katia","m"));
        students.add(new Student("Julia","f"));
        students.add(new Student("Maria","f"));
        students.add(new Student("Ivan","m"));
        students.add(new Student("Olha","f"));
        students.sort(new StudentComparator());
        for (Student student:students){
            System.out.println("Name: "+student.name+"  cSex:"+student.sex);
        }
    }
}