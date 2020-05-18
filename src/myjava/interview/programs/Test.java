package myjava.interview.programs;

class Constructor1 {
	
	public int sum(Integer a,Integer b) {
		return a+b;
				
	}
	
	public int sum(int a,int b) {
		return a+b;
				
	}
	
	
	public static void main(String[] args) {
		Constructor1 c =new Constructor1();
		int a=5;
		Integer b=6;
		//int d=c.sum(a,b);
		System.out.println(a);
	}

}