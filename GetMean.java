public class GetMean {
    public int getMean(int[] array) {
      
      int sum = 0; //sum 변수 선언
      
      for(int i=0; i<array.length; i++) {
       sum += array[i];  //sum 값에 array 배열 수 더함
      }
        return sum / array.length; //sum값을 array 크기로 나눔
    }

    public static void main(String[] args) {
        int x[] = {5, 4, 3};
        GetMean getMean = new GetMean();
        // 아래는 테스트로 출력해 보기 위한 코드입니다.
        System.out.println("평균값 : " + getMean.getMean(x));
    }
}

