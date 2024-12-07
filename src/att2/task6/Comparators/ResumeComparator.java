package att2.task6.Comparators;

import att2.task6.Classes.Worker;

import java.util.Comparator;

public class ResumeComparator implements Comparator<Worker> {
    @Override
    public int compare(Worker o1, Worker o2) {
        return o1.getResume().compareTo(o2.getResume());
    }
}
