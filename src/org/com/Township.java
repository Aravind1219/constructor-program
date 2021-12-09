package org.com;

public class Township extends Town {

	public Township() {//3
		super("PSG");
    System.out.println("Aravind kishore");
	}
	
	public Township(int id) {//6
		this(54867.23d);
	    System.out.println("Aravind kishore roll no"+ id);
		}
	public Township(double salary) {//5
	    System.out.println("Aravind kishore salary"+"\t"+salary);
		}
	
	
	public static void main(String[] args) {
		
		Township t = new Township();
		Township t1 = new Township(18401);
		
	}
	
	
	
	
}
