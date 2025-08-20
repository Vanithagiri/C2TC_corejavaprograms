package oops_concept.interfaces;

public class Trainer implements Coder {

    @Override
    public void codingWorks() {
        System.out.println("Must wakeup at " + wakuptime);
        System.out.println("Checking with the students Github");
    }
}