import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] grades = new int[5];
        Student[] students = new Student[10];
        Student student1 = new Student("Viktor", "Ivanov", 6, grades);
        students[0] = student1;
        Student student2 = new Student("Anton", "Kuzmich", 6, grades);
        students[1] = student2;
        Student student3 = new Student("Vika", "Ivanova", 6, grades);
        students[2] = student3;
        Student student4 = new Student("Sergey", "Bely", 6, grades);
        students[3] = student4;
        Student student5 = new Student("Aphanasiy", "Rybov", 6, grades);
        students[4] = student5;
        Student student6 = new Student("Gerbert", "Shield", 6, grades);
        students[5] = student6;
        Student student7 = new Student("Bill", "Gates", 6, grades);
        students[6] = student7;
        Student student8 = new Student("Walter", "White", 6, grades);
        students[7] = student8;
        Student student9 = new Student("Saul", "Goodman", 6, grades);
        students[8] = student9;
        Student student10 = new Student("Jessy", "Pinkman", 6, grades);
        students[9] = student10;

        for(int i = 0; i < 10; i++){
            int[] grades2 = new int[]{i+1, i+1, i+1, i+1, i+1 };
            students[i].setGrades(grades2);
        }

        Student[] result = findWithAllGradesGreaterThan(students, 9);
        System.out.println(Arrays.toString(result));
    }

    private static Student[] findWithAllGradesGreaterThan(Student[] students, int targetGrade){
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

    private static boolean isAllGreaterOrEqualThan(int[] grades, int target){
        for(int grade : grades){
            if(grade < target){
                return false;
            }
        }
        return true;
    }
}