// �� ������� �迭 ����
public class ArrayCreateByValueListExample1 {

   public static void main(String[] args) {
      int[] scores = { 83, 90, 87 };
// ���ȣ�� �迭�� �ǹ���
//�������迭�� ������Ÿ���� scores������ �����ϰڴٴ� ����
//int[]
      
      System.out.println("scores[0] : " + scores[0]);
//scores[0]�� scores�迭������ 0���ε����� �ǹ���
      System.out.println("scores[1] : " + scores[1]);
//1���ε���
      System.out.println("scores[2] : " + scores[2]);
//2���ε���
      
      int sum = 0; //�հ�
      for (int i=0; i<3; i++) {
//i�� 0���� 3���� ���������� �� 2�� �ɶ����� ��3ȸ�ݺ�
         sum += scores[i];
//�ε����� ������ i,    0�� �ε����� sum������ �������� �ȴ�

      }
      System.out.println("���� : " + sum);//sum�������
      double avg = (double) sum / 3; 
//sum������ double������Ÿ������ ������ȯ�ϰ� 3���� �������ش�
//�� ���� avg����
      System.out.println("��� : " + avg); //���

   }
/*
 * Ÿ��[] = { ��0, ��1, ��2, ��3, ... };
 * 
 * Ÿ��[] = ����
 * ���� = new Ÿ��[] { ��0, ��1, ��2, ��3, ... };
 */
}