import java.util.ArrayList;
import java.util.List;

public class ComputerMarks {
    public static void main(String[] args) {

        marks m1 = new marks("Vishal", "19CS101", 95);
        marks m2 = new marks("Vishesh", "19CS102", 96);
        marks m3 = new marks("Yash", "19CS105", 97);

        List<marks> marksList = new ArrayList();
        marksList.add(m1);
        marksList.add(m2);
        marksList.add(m3);


        for (marks mark: marksList){
            System.out.println(mark.name + "(" + mark.rollNo + ") : " + mark.marks);
        }
    }
}

class marks{
    String name;
    String rollNo;
    int marks;
    public marks(String name, String rollNo, int marks){
        this.name = name;
        this.rollNo  = rollNo;
        this.marks = marks;
    }
}
