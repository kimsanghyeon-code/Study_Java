
public class MainStringArrayArgument {
	public static void main(String[] args) {
		if(args.length !=2) {
			System.out.println("프로그램의 사용법");
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
//main() 메소드의 매개 변수
public class MainStringArrayArgument {
public static void main(String[] args) {
   if(args.length != 2) { // 입력된 데이터 개수가 두 개가 아닐 경우
      System.out.println("프로그램의 사용법");
      System.out.println("java MainStringArrayArgument num1 num2"); //일종의 가이드인데. 클래스에 대한 인수가 2개가 아니고 1개이거나 3개이런식으로 나오면 데이터를 num1 num2해서 두개를 입력하라고 출력메시지를 띄움
      System.exit(0); // 프로그램 강제 종료
   }
   //그게 아니면 두개의 숫자가 들어왔으니

   String strNum1 = args[0]; // 첫 번째 데이터 얻기
//외부에서 입력값 args[0]인덱스값을 strNum1에 넣음
   String strNum2 = args[1]; // 두 번째 데이터 얻기
//외부에서 입력값 args[1]인덱스값을 strNum2에 넣음
//String문자열클래스데이터타입을 적용한 strNum1과 Num2에 외부에서 들어온 데이터가 저장이 된다 문자열로 들어왔는데
   
   int num1 = Integer.parseInt(strNum1); // 문자열을 정수로 변환
//Integer.parseInt 정수형클래스의 parseInt메서드에 의해서 strNum1이 정수로 변환이 됨 그리고 그것을 num1변수에 저장한다
   int num2 = Integer.parseInt(strNum2); // 문자열을 정수로 변환
//Integer.parseInt 정수형클래스의 parseInt메서드에 의해서 strNum2이 정수로 변환이 됨 그리고 그것을 num2변수에 저장한다
   
   int result = num1 + num2;
//num1과 num2변수를 더한다 더하고 result변수에 그결과를 저장한다
   System.out.println(num1 + " + " + num2 + " = " + result);
//result값을 출력함
}
}
//실행하려면
//run => run configurations에서
//Main탭을 클릭하고 main class를 MainStringArrayArgument 으로 설정함

//Argument탭을 클릭하고  program arguments에는 10 한칸띄우고 20을 입력함 그리고apply를 클릭하고 run을 클릭함

*/