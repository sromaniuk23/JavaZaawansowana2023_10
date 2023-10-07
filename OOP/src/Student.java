public class Student extends Person{
    String typeOfStudies;
    int academicYear;
    int costs;

    public String getTypeOfStudies() {
        return typeOfStudies;
    }

    public void setTypeOfStudies(String typeOfStudies) {
        this.typeOfStudies = typeOfStudies;
    }

    public int getAcademicYear() {
        return academicYear;
    }

    public void setAcademicYear(int academicYear) {
        this.academicYear = academicYear;
    }

    public int getCosts() {
        return costs;
    }

    public void setCosts(int costs) {
        this.costs = costs;
    }

    @Override
    public String toString() {
        return "Student{" +
                "typeOfStudies='" + typeOfStudies + '\'' +
                ", academicYear=" + academicYear +
                ", costs=" + costs +
                '}';
    }
}
