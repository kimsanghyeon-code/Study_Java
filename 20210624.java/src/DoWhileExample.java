import java.util.Scanner;

// do-while ��
public class DoWhileExample {
   public static void main(String[] args) {
       System.out.println("�޼����� �Է��ϼ���");
       System.out.println("���α׷��� �����Ϸ��� q�� �Է��ϼ���.");
       
 Scanner scanner = new Scanner(System.in); // Scanner ��ü ����
 //��ĳ�ʰ�ü�� �����ϰ� ��ĳ��Ŭ����������Ÿ���� ���� scanner��ü������ ������
   String inputString;//�ԷµǾ����� �����͸� ������ ��������
       
       do {
          System.out.print(">");
          inputString = scanner.nextLine(); // Ű����� �Է��� ���ڿ� ����.
          //Ű���带 �Է¹��� ������ �����͸� �޴´�
          //inputString������ ������ ��
          System.out.println(inputString);
          //����� ������ ����Ѵ�
       } while( !inputString.equals("q")); // ���ڿ��� ���� ���� equals() �޼ҵ带 ���
       //inputString������ �ִ� ���� q��� ���ڸ� �����ִ� ���� equls�޼����� �۾��̴�
       //�Է��Ѱ��� q�̸� equals�޼���� ���� ����ϰ���
       //!������ �־ ���� ���� ���ͼ� true���Ǹ� 
       //���°� ���������� while������ü�� false�� �Ǿ������
       
       System.out.println("");
       System.out.println("���α׷� ����");
   }
}