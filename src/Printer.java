import java.util.Arrays;

public class Printer {

    public void print(StudentsRepository students){

        Student[] result = students.findWithAllGradesGreaterThan(9);
        System.out.println(Arrays.toString(result));
    }
}
