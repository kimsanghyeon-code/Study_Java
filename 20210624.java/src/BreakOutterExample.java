//�ٱ��� �ݺ��� ����
public class BreakOutterExample {
   public static void main(String[] args) {
      Outter: for(char upper='A'; upper <= 'Z'; upper++) {
//����տ� ���̺��� �����ְ� 
//upper�� �빮�ڿ��̷� ���� �빮����Ʈ������ �ݺ��Ѵ�
         for (char lower='a'; lower < 'z'; lower++) {
//lower�� �ҹ��ڿ��̷� �����ϰ� �ҹ�����Ʈ������ �ݺ��Ѵ�
System.out.println(upper + "-" + lower);
//���ۿ� �ξ ����Ѵ�
            if(lower == 'g') {
//���࿡ �ξ�lower�� ����  g�� ���ٸ�               
//break�Ѵ� ��𿡼�? Outter���̺��� ������ ��ġ���� 
//���� ������for���� Outter�ε� �׼��ؿ��� ���ᰡ �ȴ�               
               break Outter;
            }
         }
      }
   //���α׷��� ���� �����ϰ� �ȴ�
      System.out.println("���α׷� ���� ����");
   }
}