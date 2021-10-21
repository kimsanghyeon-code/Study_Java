// 강제 타입 변환
public class CastingExample {
public static void main(String[] args) {
int intValue = 44032;//정수데이터를 intvalue변수에 저장
char charValue = (char) intValue;
//intvalue앞에 괄호를 열고 char이라는 키워드를 넣음
//이것때문에 intvalue변수의 값이 
//강제로 char형태로 전환이 됨
//char charValue 에 변환된 데이터를 저장을 함
//강제로 데이터타입을 변환하는 것을 캐스팅연산이라고 함
System.out.println(charValue);
//시스템단위에서 출력을 할때
//내용을 출력해주고 한줄의 개행을 해주는 메서드를 실행하라 
long longValue = 500;//long형데이터변수에 500저장
intValue = (int) longValue;
//int정수형으로 캐스팅연산을 해서 500을 오버라이팅함
System.out.println(intValue);
double doubleValue = 3.14;//3.14 실수데이터를
//doublevalue변수에 저장을 함
intValue = (int) doubleValue;//실수형변수에 캐스팅연산을
//해서 int정수값이 저장되는 변수로 전환을 함
//그리고 intvalue변수에 값을 저장을 함
System.out.println(intValue);
//실수형에서 정수형으로 변환하면서 데이터가 유실됐다
//데이터가 작은데에서 큰데로 갈때는 문제가없는데
//큰데이터에서 작은데이터로 이동시키면 데이터유실일어남
   }
}