import java.util.Scanner;
/**
 * ������ ����ϱ�
 * 
 */
public class ForMultiplicationTableExample {
   public static void main(String[] args) {
      int m = 0;
      boolean flag = false;//�÷��װ� �������� ����
      Scanner sc = new Scanner(System.in);
      //ScannerŬ����������Ÿ���� ������ sc��ü��������
      //new Scanner(System.in);
      //newŰ����� ��ĳ��Ŭ������ü�����ϴ� ��
      //�����Ǵ� ��ü���� system�� ���ؼ� ������ �����͸�
      //��ü�� �޾Ƽ� 
      //sc��ü������ �־��ش�
      
      while(!flag) 
      //flag�� false�� �ʱ�ȭ�Ǿ�����
      //flag�տ� !������ �پ true�� ��
      //
      {
System.out.print("����ϱ� ���ϴ� ���� �Է��Ͻÿ�(0.exit): ");
m = sc.nextInt();
//sc��ü������ nextInt�޼��尡 ������ ��
//�ܺο��� �Է°��� ���� 
//�װ��� m���� ���� �����
         if( m == 0) {//m�� 0�� ���ٸ�
            //0�� �Էµƴٸ�
            flag = true;//flag�� true�� �־��ٰ�
            continue;
//�̹�ȸ�������ϴµ� while���� ������������ �ʴ´�
//while���� �ٽ� �����ϴµ�, �׶��� flat�� true�� ������ ����
//!���������� false�� �Ǽ� while�� �����ϰ� �Ǵ°ſ���
            //0���־����ϱ�. 
         }
System.out.println("**** ������ " + m + "�� ****");
//�Է°��� �������� �պκ��� �ǰ� i�� �����ܿ��� �ڿ� ��ġ�� ��Ұ� �ȴ�
         for(int i = 2; i <= 9; i++ ) {
            System.out.printf( "%2d x %2d  = %2d\n",  m,  i,  (m * i));
         }
         System.out.println("-----------------------------");
      }
      sc.close();//sc��ü������ ����Ŀ� �ݴ´� �����Ų��
      System.out.println("���α׷� ����");
   }
}