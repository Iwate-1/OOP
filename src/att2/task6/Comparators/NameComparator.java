package att2.task6.Comparators;

import att2.task6.Classes.Worker;

import java.util.Comparator;

public class NameComparator implements Comparator<Worker> {
    @Override
    public int compare(Worker o1, Worker o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
