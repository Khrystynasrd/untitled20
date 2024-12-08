import java.util.Comparator;
public class StudentComparator implements  Comparator<Student>{
    public int compare (Student s1, Student s2){
        int sex = s1.sex.compareTo(s2.sex);
        if(sex!=0){
            return sex;
        }
        return s1.name.compareTo(s2.name);
    }
}