// ���� ������
public class ConditionalOperationExample {
   public static void main(String[] args) {
      int score = 85;
      char grade = (score > 90) ? 'A' : ((score > 80) ? 'B' : 'C');
      //���׿������ΰ��� �´µ�
      //������ �׷캰�� ��ø ���׿����ڰ� �Ȱſ���
      //���׿����ڰ� ǥ���ϱ⿡�� �ܼ��ؼ� 
      //�����ڵ带 �̷������ε� ������ִٴ� ���� ������ٰ� �Ǵܵ�
      System.out.println(score + "���� " + grade + "����Դϴ�.");
   }
}