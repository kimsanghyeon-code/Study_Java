//import java.util.Scanner;

public class IfElseIfElseExample {
    public static void main(String[] args) {
       int score = 0;
       
//       Scanner scan = new Scanner(System.in);
//������Ÿ���̵Ǿ��ִ�Ŭ������ ��ü��������ü������
// �����ڿ� newŰ����� ScannerŬ������ ��ü�� �����
//System.in�� �����͸� �Է¹ް� ���ִ� ��
//scan��ü������ �ܺο��� �����͸� �Է¹޴� �۾��� ���ִ� ��ü       
 System.out.print("������ �Է��Ͻÿ�: ");
// score = scan.nextInt();
 //scan��ü������ nextInt�޼��带 �۵���Ų��
//������ �Է¹��� ���Ŀ� score������ �Է¹��� ������ �����Ѵ�
       
       if(score >= 90) {
          System.out.println("������ 100~90�Դϴ�");
          System.out.println("����� A �Դϴ�.");
       } else if(score >= 80) {
//80���̻��̳Ķ�� ����°���. score������ ����          
          System.out.println("������ 80~89 �Դϴ�.");
          System.out.println("����� B �Դϴ�.");
       } else if(score >= 70) {
          System.out.println("������ 70~79 �Դϴ�.");
          System.out.println("����� C �Դϴ�.");
       } else if(score >= 60) {
          System.out.println("������ 60~69 �Դϴ�.");
          System.out.println("����� D �Դϴ�.");
       } else {
//else ��𿡵� �������ʰ� �ɶ��� ����� ����� ����ش�          
          System.out.println("������ 60 �̸� �Դϴ�.");
          System.out.println("����� F �Դϴ�.");
       }
   }
}