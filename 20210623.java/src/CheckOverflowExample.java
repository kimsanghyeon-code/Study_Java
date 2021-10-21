// ��� ���� ���� �����÷ο츦 Ž��
public class CheckOverflowExample {
   public static void main(String[] args) {
try { //try ������ �����ؾ��ϴ� ��
int result = safeAdd(2000000000, 2000000000);
//���ο��� safeAdd�޼��带 ȣ����
//�Ʒ��� �޼��带 �۵���Ų������ ������� result������ �����Ѵ�
         System.out.println(result);
//result�������� ����Ѵ�
} catch(ArithmeticException e) { // ���� ó�� �ڵ�
//���ܰ�ü���� e�� �������ó���� �ڷ����� �޾Ƽ�
   //�Ʒ��� �ڵ带 �����Ѵ�
System.out.println("�����÷ο찡 �߻��Ͽ� ��Ȯ�ϰ� ����� �� ����");
      }
   }
   
public static int safeAdd(int left, int right) {
//int left, int right�ܺο��� ������ �����ʹ� int���������� ����
if(right > 0) {//�ι�°�μ��� 0���� ū�� �װ� ������ �Ʒ��� �߰�ȣ�� ����
if(left > (Integer.MAX_VALUE - right)) { // ���� �߻� �ڵ�
   //int������Ÿ���� �ִ밪�ҷ��ͼ� right�����ι�°�μ����� ��������
   //ù��°�Էµ� �μ��� ���ؼ� ù��°�Էµ� ���� ũ��
throw new ArithmeticException("�����÷ο� �߻�");
//�����ƽ�ͻ��� ��� ���ܰ� �߻��ߴٰ� �ϴ� newŰ����
//���ܿ� ���� ��ü�� �߻���Ų��
         }
      } else { // right <= 0 �� ���
if(left < (Integer.MIN_VALUE - right))
//���࿡ int�� �ּҰ����� right�����ι�°�μ��� ���µ�
//�װ����� ù��°�μ��� left������ �������� 
   //������ �ּҰ����� ���� ��Ȳ
{
throw new ArithmeticException("�����÷ο� �߻�"); // ���� �߻� �ڵ�
//�ּҰ����� ���� ���, �ִ밪���� ū ��� ��� ������ܹ߻���Ŵ
         }
      }
      return left + right;
//���� ������ ���� �ش���������� 
//�ִ밪���� �۰� �ּҰ����� ū ��쿡�� �ΰ��� �μ��� ���� ���ؼ� �������
   }
}