package att2.task6.Comparators;

import att2.task6.Classes.Resume;

import java.util.Comparator;

public class ExperienceComparator implements Comparator<Resume> {
    @Override
    public int compare(Resume o1, Resume o2) {
        return o1.getExperience() - o2.getExperience();
    }
}
