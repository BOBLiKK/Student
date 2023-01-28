import java.util.Arrays;

public class Printer {

    private int size;
    Student[] students;

    public Printer(Student[] ourStudents){
        this.size = ourStudents.length;
        students = new Student[size];

        for(int i = 0; i < this.size; i++){
            this.students[i] = ourStudents[i];
        }
    }

    public  Student[] findWithAllGradesGreaterThan(int targetGrade){
        Student[] result = new Student[10];
        int count = 0;
        for(Student student : students){
            int[] grades = student.getGrades();
            if(isAllGreaterOrEqualThan(grades, targetGrade)){
                result[count++] = student;
            }
        }
        Student[] destination = new Student[count];
        System.arraycopy(result, 0, destination, 0, count);
        return destination;
    }

    public boolean isAllGreaterOrEqualThan(int[] grades, int target){
        for(int grade : grades){
            if(grade < target){
                return false;
            }
        }
        return true;
    }

    public void print(){

        Student[] result = findWithAllGradesGreaterThan(9);
        System.out.println(Arrays.toString(result));
    }

}
