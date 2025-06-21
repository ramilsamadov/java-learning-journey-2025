package test;

import module16.Encapsulation.Worker;

public class Test {
	public static void main(String[] args) {
		Worker worker = new Worker();
		worker.setId(15L);
		worker.setSalary(4000);
		System.out.println("Worker id: " + worker.getId());
		System.out.println("Worker salary: "+worker.getSalary());
	}
}
