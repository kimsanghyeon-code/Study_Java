// �ֻ����� ��ȣ�� �̴� ����
public class IfDiceExample {
   public static void main(String[] args) {
int num = (int)(Math.random()*6) + 1; 
//MathŬ������ ���м������� �ٷ�� Ŭ������
//random�޼��尡 �����µ� 0�� 1������ ���ڸ� �����ϰ� ������
//0.0�� 1.0 ���̿� �ֱ⶧���� 
//�ֻ����� �������� 
//�����޼������� �Ǽ�����
//������ ������ �������
// 0.0 <= Math.random() < 1.0
// ù° ���� 0.0
// �ι�°����Math.random()
//����°����1.0
// 1���� 10������ ������ �������� �ڵ忹��
//0.0*10 <= Math.random()*10 < 1.0*10
//0.0 <= Math.random()*10 < 10.0
//(int)0.0 <=(int) Math.random()*10 <(int) 10.0
//0 <= (int) Math.random()*10 < (int) 10
// (int) Math.random()*10=> 0~9
//0+1 <= (int) (Math.random()*10)+1 < (int) 10+1
//1 <= (int) (Math.random()*10)+1 < (int) 11
//���ͷ��� ���꿡�� ���Ǵ� ���ڳ� ���ڵ��� �ǹ���
//�����޼��尡 1�� 11���̿��� ������ ���ڰ� �������� 
//�ϱ����ؼ� ���׿� �߰��� ���ͷ����� �����������ø�
//�����޼��忡 �ٿ��� ������ �˰� ��

//(int) (Math.random()*10)+1
//�����޼��带 ����ȭ�Ѵٸ�
//n���� �������ڸ� ���Ϸ���, ���ۼ��ڴ� start��� �Ѵٸ�
//�������� ǥ���ϸ�
//int num = (int) (Math.random()*n)+start
//�ֻ����� 1���� 6������ ���ϱ�
//int num = (int) (Math.random()*6)+1

// �ֻ��� ��ȣ �ϳ� �̱�
      
      if(num == 1) {
         System.out.println("1���� ���Խ��ϴ�.");
      } else if(num == 2) {
         System.out.println("2���� ���Խ��ϴ�.");
      } else if(num == 3) {
         System.out.println("3���� ���Խ��ϴ�.");      
      } else if(num == 4) {
         System.out.println("4���� ���Խ��ϴ�.");
      } else if(num == 5) {
         System.out.println("5���� ���Խ��ϴ�.");
      } else {
         System.out.println("6���� ���Խ��ϴ�.");
      }
   }
}