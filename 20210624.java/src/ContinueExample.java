// continue�� ����� for��
public class ContinueExample {
   public static void main(String[] args) {
      for(int i = 1; i <= 10; i++) {
         
         if(i %2 != 0)
            //i�� 2�� ������������ 0�̶� �����ʴٰ�
            //�´ٸ� for���� ��Ƽ���� ��������������
            //�����ϰ� ����� ���ϰ� 
            //for���� �ٽ� �����Ѵ�
            continue;
         System.out.println(i);
      }
      
   }
}