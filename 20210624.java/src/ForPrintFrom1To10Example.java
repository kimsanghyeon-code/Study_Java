//1 ���� 10���� ����ϱ�
public class ForPrintFrom1To10Example {
   public static void main(String[] args) {
      int sum = 0;
      //sum�� �������� ���ϱ����� ������
      for(int i = 1; i <= 10; i++) {
//i�� 1���� ������
//i�� 10���� �۰ų� ����������
//�߰�ȣ���� �����Ѵ�
         System.out.println(i);
         //���پ� ����ְ� ������ ��
         sum += i;
         //i�� ���� sum�� �����հ谡 ����� �ȴ�
         //System.out.println(sum);
      }
      System.out.println(sum);//�ݺ����� ������ sum
      //�������� ����Ѵ�
   }
}