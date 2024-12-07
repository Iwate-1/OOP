package task6Test;



import att2.task6.Classes.*;
import att2.task6.Comparators.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TestClasses {

    Resume resume1 = new Resume(10,"pedagogical",60000);
    Worker worker1 = new Worker("Зинаида", "Осипова",resume1);
    Worker worker2 = new Worker("Зинаида", "Осипова",resume1);
    Worker worker3 = new Worker("Зинаида", "Осипова",resume1);
    Resume resume2 = new Resume(1,"technical",100000);
    Worker worker4 = new Worker("Алег", "Кошкин", resume2);


    @Test
    public void equalsWorker() {
        Assertions.assertEquals(worker1, worker1); //рефлексивность

        Assertions.assertEquals(worker1, worker2);//Симметричность
        Assertions.assertEquals(worker2, worker1);

        Assertions.assertEquals(worker1, worker2);//Транзитивность
        Assertions.assertEquals(worker2, worker3);
        Assertions.assertEquals(worker1, worker3);

        Assertions.assertEquals(worker2, worker3);//Постоянность
        Assertions.assertEquals(worker2, worker3);

        Assertions.assertNotEquals(worker1, null);// неравенство с null
    }

    @Test
    public void hashCodeWorker(){
        Assertions.assertEquals(worker1.hashCode(), worker2.hashCode());//у равных объектов один hashCode
        Assertions.assertEquals(worker2.hashCode(), worker3.hashCode());
        Assertions.assertEquals(worker1.hashCode(), worker3.hashCode());
    }
    @Test
    public void sortResume(){
        List<Resume> resumeList = Arrays.asList(resume2, resume1);
        Collections.sort(resumeList);
        List<Resume> expectedList = Arrays.asList(resume1, resume2);
        Assertions.assertEquals(resumeList, expectedList);
    }

    @Test
    public void sortResumeComparator(){
        List<Resume> resumeList = Arrays.asList(resume2, resume1);
        EducationComparator educationComparator = new EducationComparator();
        Collections.sort(resumeList,educationComparator);
        List<Resume> exList = Arrays.asList(resume1, resume2);
        Assertions.assertEquals(resumeList, exList);

        ExperienceComparator experienceComparator = new ExperienceComparator();
        Collections.sort(resumeList,experienceComparator);
        List<Resume> ex1List = Arrays.asList(resume2, resume1);
        Assertions.assertEquals(resumeList, ex1List);
    }

    @Test
    public void sortWorker(){
        List<Worker> workerList = Arrays.asList(worker1,worker2,worker3,worker4);
        Collections.sort(workerList);
        List<Worker> exList = Arrays.asList(worker4, worker1, worker2, worker3);
        Assertions.assertEquals(workerList, exList);
    }

    @Test
    public void sortWorkerComparator(){
        List<Worker> workerList = Arrays.asList(worker1,worker4,worker3,worker2);
        ResumeComparator resumeComparator = new ResumeComparator();
        Collections.sort(workerList, resumeComparator);
        List<Worker> exList = Arrays.asList(worker3, worker1, worker2, worker4);
        Assertions.assertEquals(workerList, exList);

        NameComparator nameComparator = new NameComparator();
        Collections.sort(workerList,nameComparator);
        List<Worker> exList1 = Arrays.asList(worker4, worker1, worker2, worker3);
        Assertions.assertEquals(workerList, exList1);
    }

}