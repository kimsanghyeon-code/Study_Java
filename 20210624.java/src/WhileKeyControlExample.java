// Ű����� while �� ����
public class WhileKeyControlExample {
   public static void main(String[] args) throws Exception {
      boolean run = true;
      //run�� Ʈ��
      int speed = 0;//speed�� 0
      int keyCode = 0;//keyCode�� 0
while(run) {//while���� ����
if(keyCode != 12 && keyCode != 10) { // Enter Ű�� �ԷµǸ� ĳ��������(13), �����ǵ�(10)�� �ԷµǹǷ� �� ���� ����
//���࿡ keyCode�� 12�� �ƴϰ� 10�ƴմϱ�. �̵ΰ��� ������ �����ϸ� �Ʒ��� ������ �����   
      System.out.println("\n-------------------------------");
            System.out.println(" 1.���� | 2.���� | 3.����"); // �޴� ����
            System.out.println("-------------------------------");
            System.out.print("����: ");
         }
         keyCode = System.in.read(); // Ű������ Ű �ڵ带 ����
         //�ý����� ����޼��带 ���ؼ� Ű������ Ű���� �Է¹���
         //�װ��� keyCode������ ������ ��
         
         if(keyCode == 49) { // 1�� �о��� ���
            speed++;//����1�� ������ Ű�ڵ尡 49�� ����
      //Ű���忡�� ����1�� 49
      //speed�������� 1�� �÷���
            System.out.println("���� �ӵ�=" + speed);
         }  else if(keyCode == 50) { // 2�� �о��� ���
            speed--;//����2�� �����ٸ� Ű�ڵ�� 50�� ������
            //speed�������� 1�� ���δ�
            System.out.println("���� �ӵ�=" + speed);
         } else if(keyCode == 51) { // 3�� �о��� ���
   // Ű����3�� ������ Ű�ڵ尡 51�� �Է¹����Ͱ� ������
            run = false; //  while ���� �����ϱ� ���� run ������ false�� ����
            //run�� false�� �־���
            //while���� �����ϰԵ�
         }
      }
      System.out.println("���α׷� ����");
   }
}