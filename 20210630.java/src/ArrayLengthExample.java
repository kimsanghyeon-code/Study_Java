
public class ArrayLengthExample {
	public static void main(String[] args) {
		int[] scores = {83, 90, 87};
		int sum = 0;
		for(int i=0; i<scores.length; i++) {
			sum += scores[i];
		}
		System.out.println("���� :" + sum);
		double avg = (double) sum/scores.length;
		System.out.println("��� :" + avg);
	}

}


/*
//�迭�� length �ʵ�
public class ArrayLengthExample {
public static void main(String[] args) {
   int[] scores = {83, 90, 87 };
//int[] �������迭������Ÿ��. �̰��� ������ �ڿ����� ������ 
//����� ������Ÿ���� �������� �� ����
//scores �������迭������Ÿ���� ����� �迭����
//scores�迭������ �����ڿ� �ִ� �߰�ȣ�ȿ� 3���� ���ڰ� ������ �ȴ�
   int sum = 0; //sum�� �������� ����
for(int i=0; i<scores.length; i++) {

//for�ȿ� i�� 0���� �ʱ�ȭ���ϰ� i�� scores�迭������ �����Ͱ����� ����ϰ� �ִ� 
//length�Ӽ�(�ʵ�)�� ����ִ� �迭�� ����� �������� ������ Ȱ���Ѵٴ� ������
//length�ʵ�� �Ժη� �����Ҽ��ִ� ���� �ƴ�. �ڵ����� ��ϵ�. �������ǰ���
//3���� �����ϱ�. scores.length�� 3�� �� i�� 3���� ���������� �ݺ��Ѵ�
//�ѹ��� �ݺ����� ����Ǹ� i�� �������� 1�� ������
      sum += scores[i];
//�߰�ȣ���ʿ� scores[i] scores i�ε����� sum�� ���Կ����ڷ� �������� ���
//sum = sum + scores[i];
   }
   System.out.println("���� : " + sum);//for���� ����Ǹ� 
//������ sum�� ������� ��µȴ�
   
   double avg = (double) sum / scores.length;
//(double) sum �� sum������ double�� ĳ���ÿ����� �ؼ� 
//sum�� ������ ������������Ÿ������ ������ȯ���� ������ �������ҰŴϱ�
//(double) sum / scores.length �հ�/������ ���ؼ� ��յ����͸� �̱�����
//double avg �� ����� �־��ش�
   System.out.println("��� : " + avg);
//����� �����
}
}
*/