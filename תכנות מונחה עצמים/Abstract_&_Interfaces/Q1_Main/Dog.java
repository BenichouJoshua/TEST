package Q1_Main;


public class Dog extends Animal implements Comparable<Dog>  {
	public Dog(String name, boolean isSleeping, String type) {
		super(name, isSleeping,type);
	}
	
	public Dog(String name, boolean isSleeping) {
		super(name, isSleeping);
	}
	
	
	@Override
	public void say() {
		if (!getIsSleep() ) {
			System.out.println("Hav Hav");
		}
		else {
			System.out.println("Shh Dog sleeping...");
		}
	}
	
	@Override
	public boolean isDangerous () {
		final String [] DAN = {"Rottweiler" ,"Amstaff" ,"Bulldog"};
		for (String s : DAN) {
			if (s.equals(getType())) {
				return true;
			}
		}
		return false;
	}

	@Override
	public int compareTo(Dog o) {
		return toString().compareTo(o.toString());
	}

	
}
