package GitStdies;

import java.util.Iterator;

public class GitClass {
	

	public static void main(String[] args) {
		
		String name="my name is wahidullah sharifi";
		String rev="";
		String nM=name.substring(11,21);
		
		for(int i =nM.length()-1;i>=0;i--) {
			rev+=nM.charAt(i);
		
		}	System.out.println(name);
		System.out.println(nM);
		System.out.println(rev);
		
		String wow="khan";
		
		
		StringBuilder kk= new StringBuilder(wow);
	
		kk=kk.reverse();
		System.out.println(wow + " is now : " + kk);
		
		
   System.out.println("goooooooooooooooood");
		
		
	}
}
