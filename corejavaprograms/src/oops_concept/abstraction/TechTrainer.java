package oops_concept.abstraction;

public class TechTrainer extends Trainer{
	@Override
	public void session()
	{
		System.out.println("Java session id going on");
	}
	@Override
	public void checks() 
	{
		System.out.println("Assignments are given from Inheritance");
	}

}
