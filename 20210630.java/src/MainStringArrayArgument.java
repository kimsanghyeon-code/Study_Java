
public class MainStringArrayArgument {
	public static void main(String[] args) {
		if(args.length !=2) {
			System.out.println("���α׷��� ����");
			System.out.println("java MainStringArrayArgument num1 num2");
			System.exit(0);
		}
		String strNum1 = args[0];
		String strNum2 = args[1];
		
		int num1 = Integer.parseInt(strNum1);
		int num2 = Integer.parseInt(strNum2);
		
		int result = num1 + num2;
		System.out.println(num1 + " + " + num2 + "="+result);
	}
	}


/*
//main() �޼ҵ��� �Ű� ����
public class MainStringArrayArgument {
public static void main(String[] args) {
   if(args.length != 2) { // �Էµ� ������ ������ �� ���� �ƴ� ���
      System.out.println("���α׷��� ����");
      System.out.println("java MainStringArrayArgument num1 num2"); //������ ���̵��ε�. Ŭ������ ���� �μ��� 2���� �ƴϰ� 1���̰ų� 3���̷������� ������ �����͸� num1 num2�ؼ� �ΰ��� �Է��϶�� ��¸޽����� ���
      System.exit(0); // ���α׷� ���� ����
   }
   //�װ� �ƴϸ� �ΰ��� ���ڰ� ��������

   String strNum1 = args[0]; // ù ��° ������ ���
//�ܺο��� �Է°� args[0]�ε������� strNum1�� ����
   String strNum2 = args[1]; // �� ��° ������ ���
//�ܺο��� �Է°� args[1]�ε������� strNum2�� ����
//String���ڿ�Ŭ����������Ÿ���� ������ strNum1�� Num2�� �ܺο��� ���� �����Ͱ� ������ �ȴ� ���ڿ��� ���Դµ�
   
   int num1 = Integer.parseInt(strNum1); // ���ڿ��� ������ ��ȯ
//Integer.parseInt ������Ŭ������ parseInt�޼��忡 ���ؼ� strNum1�� ������ ��ȯ�� �� �׸��� �װ��� num1������ �����Ѵ�
   int num2 = Integer.parseInt(strNum2); // ���ڿ��� ������ ��ȯ
//Integer.parseInt ������Ŭ������ parseInt�޼��忡 ���ؼ� strNum2�� ������ ��ȯ�� �� �׸��� �װ��� num2������ �����Ѵ�
   
   int result = num1 + num2;
//num1�� num2������ ���Ѵ� ���ϰ� result������ �װ���� �����Ѵ�
   System.out.println(num1 + " + " + num2 + " = " + result);
//result���� �����
}
}
//�����Ϸ���
//run => run configurations����
//Main���� Ŭ���ϰ� main class�� MainStringArrayArgument ���� ������

//Argument���� Ŭ���ϰ�  program arguments���� 10 ��ĭ���� 20�� �Է��� �׸���apply�� Ŭ���ϰ� run�� Ŭ����

*/