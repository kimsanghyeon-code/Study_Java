// break ���� ���� case
public class SwitchNoBreakCaseExample {
   public static void main(String[] args) {
int time = (int)(Math.random() * 4) + 8; // 8~11 ������ ���� �̱�
//int num = (int) (Math.random()*n)+start   
//����ϰ� ���� ��ȣ�� n
//�����ϴ� ���ڸ� �ڿ� ������
//8���� �ϱ� �ڿ� 8�� ���ϰ�
//4���� ���ڸ� ���Ϸ��ϱ�. 
//�����޼��忡 4�� ���Ѱ��̴�
System.out.println("[����ð�: " + time + "��]");
      
      switch(time) {
      case 8:
         System.out.println("����մϴ�.");
      case 9:
         System.out.println("ȸ���մϴ�.");
      case 10:
         System.out.println("������ ���ϴ�.");
      default:
         System.out.println("�ܱ��� �����ϴ�.");
      }
   }
}