package Q1_Main;

import java.util.Arrays;

public class Q1_Main_test {

	public static void main(String[] args) {
		Animal [] an = { new Dog("Tony", false , "Poodel"), new Dog("Mitzi", false,"Amstaf"),  
				new Dog("Bulldogile", true,"Bulldog") , new Dog("Dagi", true , "Poodel") , 
				new Dog("Staffi", false, "Amstaf"), new Dog("Goldog", true, "Poodel") , 
				new Dog("Bulldogile", false, " Amstaf" )	};
		
		singAlong(an);
		Arrays.sort(an);
		singAlong(an);
		}
	
	public static void singAlong(Animal [] an) {
		for (int i = 0; i < an.length; i++) {
			System.out.println(an[i]);
			an[i].say();
			System.out.println(an[i].dangerInfo());
			System.out.println();
			
		}
	}
		
	}


