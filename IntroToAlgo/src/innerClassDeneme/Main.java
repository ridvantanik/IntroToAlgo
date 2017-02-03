package innerClassDeneme;

import innerClassDeneme.OuterClass.InnerClass1;

public class Main {

	public static void main(String[] args) {

		OuterClass oc = new OuterClass();
		InnerClass1 ic1 = oc.new InnerClass1();
		ic1.fonksiyonOfInner1();
		
		InnerClass2 ic2 = new InnerClass2();
		ic2.fonksiyonOfInner2();
	
	}

}
