package Q1_Main;



public abstract class Animal implements Dangerous {
	private String name;
	private boolean isSleeping;
	private String type;

	public boolean getIsSleep() {
		return getIsSleeping();
	}
	public String getName() {
		return name;
	}
	public Animal (String name, boolean isSleeping, String type) {
		this.name = name;
		this.setIsSleeping(isSleeping);
		this.type = type;
	}
	public Animal (String name, boolean isSleeping) {
		this.name = name;
		this.setIsSleeping(isSleeping);
		
	}
	public Animal ( String name,String type ) {
		this.name = name;
		this.type = type;
	}
	public Animal ( String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public abstract void say(); 
	
	public String toString() {
		return getClass().getSimpleName()+": " + getName() + ( getIsSleeping() ?  " is sleeping ...": " Awake " ) 
				+ "(type : " + getType() + ")" ;
	}
	public String dangerInfo() {
		return  "Is dangerous : " + isDangerous() + "\nYear of decision : " + YEAR ;
	}
	public boolean getIsSleeping() {
		return isSleeping;
	}
	public void setIsSleeping(boolean isSleeping) {
		this.isSleeping = isSleeping;
	}
		
	
	
	
}
