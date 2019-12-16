package Q1_Main;



	public class Fish extends Animal{
		
	public Fish (String name,String type) {
		super(name,type);
	}
	
	
	public Fish(String name) {
		super(name);
	}

	
	@Override
	public void say() {
		System.out.println(" ");
	}
	
	@Override
	public String toString() {
		return getClass().getSimpleName()+": " + getName() + "(type : " + getType() + ")"  ;
	}
	@Override
	public String dangerInfo() {
		return "isdangerous  = " + isDangerous() + "\nYear of decision = " + YEAR;
	}
	
	@Override 
	public boolean isDangerous() {
		final String [] DAN = {"Shark" , "Whale"};
		for (String s : DAN) {
			if (s.equals(getType())) {
				return true;
			}
		}
		return false;
	}
	

}

