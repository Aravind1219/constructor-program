package org.com;

public class Nlc {

	public Nlc() {
		System.out.println("aravind");
	}

	public Nlc(int Pincode) {
		System.out.println("neyveli "+ Pincode);
	}

	public Nlc(int Pincode,String City) {
		System.out.println("neyveli "+ Pincode+"\t"+City);
	}

	public Nlc(long cellno) {
		System.out.println("aravind cellno  "+ cellno);
	}

	public static void main(String[] args) {
		Nlc n = new Nlc();
		Nlc n1 = new Nlc(607803);
		Nlc n2 = new Nlc(607802, "cuddalore");
		Nlc n3 = new Nlc(9498896214l);





	}










}
