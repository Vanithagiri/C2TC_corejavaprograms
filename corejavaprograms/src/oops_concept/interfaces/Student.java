package oops_concept.interfaces;

public class Student implements Coder {

    @Override
    public void codingWorks() {
        System.out.println("Must wakeup at " + wakuptime);
        System.out.println("Working with the eclipse and Github");
    }
}