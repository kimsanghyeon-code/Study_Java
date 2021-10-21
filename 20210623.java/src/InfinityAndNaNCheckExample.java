// Infinity �� NaN
public class InfinityAndNaNCheckExample {
   public static void main(String[] args) {
      int x = 5;
      double y = 0.0;
      
      double z = x / y;
      // double z = x % y;
      
System.out.println(Double.isInfinite(z));
//isInfinite�޼���� �μ��� �������� 
//���Ѵ����� �ľ��ϴ� �����޼�����
//DoubleŸ���� �������Ǵ�Ƽ�޼��带 �۵���Ŵ

System.out.println(Double.isNaN(z));
//Not a Number ���ڰ��� �ƴϴ�
//.isNaN�޼���� �Ǵ��ϴ� �ſ���
//���ڰ��� �ƴ��� �Ǵ��ϴ� �����޼�����
//���Ѵ���������� ���ڰ� �ƴ� ��Ȳ�� �ƴϴ�.
if (Double.isInfinite(z) || Double.isNaN(z)) {
//���Ѵ��̰ų�
//���ڰ� �ƴϰų�
//������������ ���˴����� ù��°������ ���̸� �ڿ� �ִ°�
//����� �����ʰ� ���ǽ��� ������

   System.out.println("�� ���� �Ұ�");
      } else {
         System.out.println(z + 2); // ������ �Ǵ� �ڵ�
         // Infinity + 2 -> Infinity,  NaN + 2 -> NaN
      }
   }
}