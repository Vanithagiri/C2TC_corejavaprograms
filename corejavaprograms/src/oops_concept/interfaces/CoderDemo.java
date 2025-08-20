package oops_concept.interfaces;

public class CoderDemo {

    public static void main(String[] args) {
        Coder c = new Student();
        c.codingWorks();

        c = new Trainer();
        c.codingWorks();
    }
}