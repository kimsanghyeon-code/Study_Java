// ��ȯ���� ���� ������ �ս��� �߻����� �ʵ��� �Ѵ�.
public class CheckValueBeforeCasting {
   public static void main(String[] args) {
      int i = 12; 
      
      if (i < Byte.MIN_VALUE || i > Byte.MAX_VALUE) { // if( i<-128 || i>127)�� ����
//Byte.MIN_VALUE ����Ʈ������Ÿ�Կ��� ���� �������� �ҷ�����
//Byte.MAX_VALUE ����Ʈ������Ÿ�Կ��� ���� ū���� �ҷ�����
//������������ or��������
         System.out.println("byte Ÿ������ ��ȯ�� �� �����ϴ�.");
         System.out.println("���� �ٽ� Ȯ���� �ּ���");
         //����Ʈ������Ÿ������ ��ȯ�Ҽ��ִ��� Ȯ���Ѱ��̰�
      } else {
byte b = (byte) i;//���������� ����ߴٸ� byteĳ���ÿ�����
//�ؼ� int���� �����Ͱ� byte�� �Ǽ� b������ ����ȴ�
         System.out.println(b);
         //����� �Ѵ�
      }
   }
}