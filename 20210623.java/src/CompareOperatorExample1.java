// �� ������
public class CompareOperatorExample1 {
   public static void main(String[] args) {
      int num1 = 10;
      int num2 = 10;
      
      boolean result1 = (num1 == num2);
//==�� �ΰ��� ���� �������� �Ǵ��Ѵ�
//��ü�� ���� �ּҰ��� ���ϰ�
//�Ϲݵ����͸� �ش� �����͸� ���� ����
//��ü�� �ּҰ����� ��Ʈ���ϰ� ���� �������� �ּҰ��� �����
// ��� �� true ���� 1�� ����ȴ�   
//boolean �Ҹ� ������Ÿ���� true,false
//1��Ʈ�� �����Ͱ� ���µ�
//����, ���̳ĸ� �Ǵ��ϴ� �������� �ַ� ����
//���±���� �� �÷��׶�� ��
//�˰����� �����Ϸ��� �Ҷ� ���� ��Ÿ��
      boolean result2 = (num1 != num2);
//!=�� ���� ���� �ٸ����� �Ǵ��Ѵ�
      boolean result3 = (num1 <= num2);
//<= ���� num1�� �۰ų� �������� �Ǵ��ϴ°ſ���
      
      System.out.println("result1 = " + result1);
      System.out.println("result2 = " + result2);
      System.out.println("result3 = " + result3);
      
      char char1 = 'A';
      char char2 = 'B';
      boolean result4 = (char1 < char2);
//A�� 65, B�� 66
//char1 = 'A'65
//char2 = 'B'66
//B�� ��ũ�ϱ� true���ȴ�
      System.out.println("result4 = " + result4);
   }
}