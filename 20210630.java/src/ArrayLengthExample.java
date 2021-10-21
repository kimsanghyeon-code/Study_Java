
public class ArrayLengthExample {
	public static void main(String[] args) {
		int[] scores = {83, 90, 87};
		int sum = 0;
		for(int i=0; i<scores.length; i++) {
			sum += scores[i];
		}
		System.out.println("총합 :" + sum);
		double avg = (double) sum/scores.length;
		System.out.println("평균 :" + avg);
	}

}


/*
//배열의 length 필드
public class ArrayLengthExample {
public static void main(String[] args) {
   int[] scores = {83, 90, 87 };
//int[] 정수형배열데이터타입. 이것이 있으면 뒤에오는 변수명에 
//적용될 데이터타입을 선언해줄 수 있음
//scores 정수형배열데이터타입이 적용된 배열변수
//scores배열변수에 이퀄뒤에 있는 중괄호안에 3개의 숫자가 저장이 된다
   int sum = 0; //sum은 누적합을 구함
for(int i=0; i<scores.length; i++) {

//for안에 i는 0으로 초기화를하고 i는 scores배열변수의 데이터갯수를 기록하고 있는 
//length속성(필드)에 들어있는 배열에 저장된 데이터의 갯수를 활용한다는 것이죠
//length필드는 함부로 변경할수있는 것이 아님. 자동으로 기록됨. 데이터의갯수
//3개가 들어갔으니까. scores.length는 3이 됨 i는 3보다 작을때까지 반복한다
//한번의 반복문이 실행되면 i는 후위증감 1씩 증가함
      sum += scores[i];
//중괄호안쪽에 scores[i] scores i인덱스를 sum에 대입연산자로 누적합을 계산
//sum = sum + scores[i];
   }
   System.out.println("총합 : " + sum);//for문이 종료되면 
//누적합 sum에 계산결과가 출력된다
   
   double avg = (double) sum / scores.length;
//(double) sum 은 sum변수를 double로 캐스팅연산을 해서 
//sum의 내용을 더블형데이터타입으로 강제변환했음 이유는 나누길할거니까
//(double) sum / scores.length 합계/갯수를 통해서 평균데이터를 뽑기위함
//double avg 에 결과를 넣어준다
   System.out.println("평균 : " + avg);
//평균을 출력함
}
}
*/