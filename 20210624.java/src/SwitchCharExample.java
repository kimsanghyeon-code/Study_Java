// char Ÿ���� Switch��
public class SwitchCharExample {
   public static void main(String[] args) {
      char grade = 'B'; //grade������ B��� ���ڸ� �ְ�
      
      switch (grade) {//switch���� ������
      case 'A'://�빮��A
      case 'a'://�ҹ���a �����ϳ��� �ɸ��� ����� �Ѵ�
         System.out.println("��� ȸ���Դϴ�.");
         break;//break���� ��Ÿ��
      case 'B':
      case 'b':
         System.out.println("�Ϲ� ȸ�� �Դϴ�.");
         break;
      default://a,b���� ���ڵ��� �ش�Ǵ� �����̴�.
         System.out.println("�մ��Դϴ�.");
         break;
      }      
   }
}