// ���ڿ� ��
public class StringEqualsExample {
   public static void main(String[] args) {
      String strVar1 = "�Ź�ö";
      //String������Ÿ��
      //C���� int,double...
      //java String������Ÿ�Ե���!
//
      String strVar2 = "�Ź�ö";
      //�Ź�ö ���ڿ� ��ü�� �ּҸ� strVar1�� strVar2
      //��� ���� �޸��ּҰ��� ���� �Ǿ��ִ�
      
      
      String strVar3 = new String("�Ź�ö");
//newŰ����� ��ü�� �����Ѵ�      
//new String ���ڿ���ü�� ���� �����Ѵ�      
      System.out.println(strVar1 == strVar2);
      System.out.println(strVar2 == strVar3);
      System.out.println();
      System.out.println(strVar1.equals(strVar2));
//��ü�ּҰ�����ü������ �޼���� Ŭ������ �Ӽ��� �����ϰ� �ִ°��̰�,
//�����Ҽ��ִ°���.
//strVar1.equals 
//��������޼���� ���� �پ��ִ� ������ ��ü������ ����Ű�� 
//�ּҰ��� ��ü�ϰ� ��ȣ�ȿ� �ִ� ��ü������ �ּҰ��� ��ü�ϰ� ������ ���ٶ�� �����̿���
      
      System.out.println(strVar1.equals(strVar3));
   }
}