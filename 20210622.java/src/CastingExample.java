// ���� Ÿ�� ��ȯ
public class CastingExample {
public static void main(String[] args) {
int intValue = 44032;//���������͸� intvalue������ ����
char charValue = (char) intValue;
//intvalue�տ� ��ȣ�� ���� char�̶�� Ű���带 ����
//�̰Ͷ����� intvalue������ ���� 
//������ char���·� ��ȯ�� ��
//char charValue �� ��ȯ�� �����͸� ������ ��
//������ ������Ÿ���� ��ȯ�ϴ� ���� ĳ���ÿ����̶�� ��
System.out.println(charValue);
//�ý��۴������� ����� �Ҷ�
//������ ������ְ� ������ ������ ���ִ� �޼��带 �����϶� 
long longValue = 500;//long�������ͺ����� 500����
intValue = (int) longValue;
//int���������� ĳ���ÿ����� �ؼ� 500�� ������������
System.out.println(intValue);
double doubleValue = 3.14;//3.14 �Ǽ������͸�
//doublevalue������ ������ ��
intValue = (int) doubleValue;//�Ǽ��������� ĳ���ÿ�����
//�ؼ� int�������� ����Ǵ� ������ ��ȯ�� ��
//�׸��� intvalue������ ���� ������ ��
System.out.println(intValue);
//�Ǽ������� ���������� ��ȯ�ϸ鼭 �����Ͱ� ���ǵƴ�
//�����Ͱ� ���������� ū���� ������ ���������µ�
//ū�����Ϳ��� ���������ͷ� �̵���Ű�� �����������Ͼ
   }
}