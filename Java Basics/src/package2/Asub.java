package package2;

import package1.*;

public class Asub extends A{
	public static void main(String[] args) {
		Asub asub=new Asub();
		//protected accessible only within sub and super classes
		System.out.println(asub.protectedMessage);
		C c2=new C();
		System.out.println(c2.defeaultMessage);

	}

}
