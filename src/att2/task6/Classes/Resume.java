package att2.task6.Classes;

import java.util.Objects;

public class Resume implements Comparable<Resume> {
    private int experience;
    private String education;
    private int salary;

    public Resume(int experience, String education, int salary) {
        this.experience = experience;
        this.education = education;
        this.salary = salary;
    }

    public int getExperience() {
        return experience;
    }

    public String getEducation() {
        return education;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Resume resume = (Resume) o;
        return experience == resume.experience && salary == resume.salary && Objects.equals(education, resume.education);
    }

    @Override
    public int hashCode() {
        return Objects.hash(experience, education, salary);
    }

    @Override
    public int compareTo(Resume o) {
        return this.salary - o.salary;
    }
}
