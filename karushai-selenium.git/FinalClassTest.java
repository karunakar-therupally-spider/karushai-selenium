final class FinalClassTest{
	int s =10;
	
	static  void m1(){
		System.out.println("static hi");
	}
	
	final void m2(){
		System.out.println("hi");
	}
	
	final cvoid m2(String s){
		System.out.println("hi" +s);
	}
	
	public static void main(String[] args){
		FinalClassTest f = new FinalClassTest();
	//	FinalClassTest f1 = new FinalClassChild();
		//f.s = 20;
		System.out.println("variable s:" + f.s);
		f.m1();
		f.m2(" kk");
		f.m2();
	}

}

//class FinalClassChild extends FinalClassTest {
		//int s = 20;
		/*
		 static void m1(){
			System.out.println("static hello..");
		}
		
		void m2(){
		System.out.println("hello");
	}*/
	
//}