package org.com;

public class Neyveli {


	public Neyveli() {//4
		this(607803, "cuddalore");
		System.out.println("kishore");
	}

	public Neyveli(int Pincode) {//2
		this(987654324l);
		System.out.println("neyveli "+ Pincode);
	}

	public Neyveli(int Pincode,String City) {//3
		this(6423);
		System.out.println("neyveli "+ Pincode+"\t"+City);
	}

	public Neyveli(long cellno) {//1
		System.out.println("aravind cellno  "+ cellno);
	}




	public static void main(String[] args) {
		Neyveli ne = new Neyveli();
		

	}


}
