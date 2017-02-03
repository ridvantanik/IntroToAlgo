package innerClassDeneme;

public class OuterClass {
	
	class InnerClass1{
		void fonksiyonOfInner1(){
			System.out.println("InnerClass1 : fonksiyonOfInner1");
		}
	}
	
	public void outerFonksiyon(){
		InnerClass1 ic = new InnerClass1();
		ic.fonksiyonOfInner1();
	}
	
	public static void main(String[] args) {
		OuterClass oc = new OuterClass();
		InnerClass1 ic1 = oc.new InnerClass1();
		ic1.fonksiyonOfInner1();
		
		InnerClass2 ic2 = new InnerClass2();
		ic2.fonksiyonOfInner2();
	}

}


class InnerClass2{
	void fonksiyonOfInner2(){
		System.out.println("InnerClass2 : fonksiyonOfInner2");
	}
}
