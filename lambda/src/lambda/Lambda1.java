package lambda;

/* 	���ٽ� (�ڹ� 8 ���� �߰�)
 * 	- �Լ��� ���
 * 	- �޼��带 �ϳ��� ������ ǥ��
 * 	
 */



public class Lambda1 {
	int max(int a, int b) {
		return a > b ? a : b;
	}
	
//	(int a, int b)->{return a > b ? a : b;}	
//	(int a, int b) -> a > b ? a : b;	
//	(a, b) -> a > b ? a : b;
	
	void printVar(String name, int i) {
		System.out.println(name+ " = " + i);
	}
	
//	(String name, int i) - > {System.out.println(name+ " = " + i);}
//	(String name, int i) - > System.out.println(name+ " = " + i);
//	(name, i) - > System.out.println(name+ " = " + i);
	
	int suqare(int x) {
		return x * x;
	}

//	(x) -> x * x;
	
	int roll() {
		return (int)(Math.random() * 6);
	}
	
//	() -> {return (int)(Math.random() * 6);}
//	() -> (int)(Math.random() * 6)


}