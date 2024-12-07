package att2.task6.Classes;

import java.util.Objects;

public class Worker implements Comparable<Worker> {
    private String Name;
    private String Surname;
    private Resume resume;

    public Worker(String name, String surname, Resume resume) {
        Name = name;
        Surname = surname;
        this.resume = resume;
    }

    public String getName() {
        return Name;
    }

    public String getSurname() {
        return Surname;
    }

    public Resume getResume() {
        return resume;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Worker worker = (Worker) o;
        return Objects.equals(Name, worker.Name) && Objects.equals(Surname, worker.Surname) && Objects.equals(resume, worker.resume);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Name, Surname, resume);
    }

    @Override
    public int compareTo(Worker o) {
        return this.Surname.compareTo(o.Surname);
    }
}
