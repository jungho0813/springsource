package lambda;

public class LambdaEx2 {
	public static void main(String[] args) {
		// Lambda2 �������̽��� ����ϰ� �ʹٸ�
		// 1) ���� Ŭ���� �ۼ� : Ŭ������ implements Lambda2
		// 2) �͸� ���� Ŭ���� �ۼ� 
		
//		Lambda2 lambda = new Lambda2() {
//			@Override
//			public void method() {
//				System.out.println("�͸� ���� Ŭ����");
//			}
//		};
//		
//		lambda.method();
		
		Lambda2 lambda = () -> System.out.println("�͸� ���� Ŭ����");
		lambda.method();
		
		lambda = () -> {
			int i = 10;
			System.out.println(i*i);
		};
		lambda.method();
		
	}
}
