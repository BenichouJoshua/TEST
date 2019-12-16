package Q1_Main;



public class Cat extends Animal {
	public Cat(String name, boolean isSleeping) {
		super(name, isSleeping);
	}

	@Override
	public void say() {
		if (!getIsSleep()) {
			System.out.println("Miaou Miaou");
		}
		else {
			System.out.println("Shh the cat sleeping...");
		}
	}
	@Override
	public boolean isDangerous() {
		return false;
	}
	@Override
	public String toString() {
		return getClass().getSimpleName() + ":" + getName() 
		+  ( getIsSleeping() ?  " is sleeping ...": " Awake " );
	}
	@Override
	public String dangerInfo() {
		return "isdangerous  = " + isDangerous() + "\nYear of decision = " + YEAR;
	}
	
	
}
