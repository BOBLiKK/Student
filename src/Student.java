import java.util.Arrays;

public class Student {

    private String name;
    private String surname;
    private int groupNumber;
    private int[] grades;

    public Student(String name, String surname, int groupNumber, int[] grades) {
        this.name = name;
        this.surname = surname;
        this.groupNumber = groupNumber;
        this.grades = grades;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(int groupNumber) {
        this.groupNumber = groupNumber;
    }

    public int[] getGrades() {
        return grades;
    }

    public void setGrades(int[] grades) {
        this.grades = grades;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Student student)) {
            return false;
        }

        if (getGroupNumber() != student.getGroupNumber()) {
            return false;
        }
        if (getName() != null ? !getName().equals(student.getName()) : student.getName() != null) {
            return false;
        }
        if (getSurname() != null ? !getSurname().equals(student.getSurname()) : student.getSurname() != null){
            return false;
        }

        return Arrays.equals(getGrades(), student.getGrades());
    }

    @Override
    public int hashCode() {
        int result = getName() != null ? getName().hashCode() : 0;
        result = 31 * result + (getSurname() != null ? getSurname().hashCode() : 0);
        result = 31 * result + getGroupNumber();
        result = 31 * result + Arrays.hashCode(getGrades());
        return result;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", groupNumber=" + groupNumber +
                ", grades=" + Arrays.toString(grades) +
                '}';
    }
}
