import java.util.Arrays;
import java.util.ArrayList;
 
class Divisible {
    public int[] divisible(int[] array, int divisor) {
    ArrayList<Integer> arrayList = new ArrayList<>();
    for(int number : array) {
     if(number % divisor == 0) {
       arrayList.add(number);
     }
    } 
        //ret에 array에 포함된 정수중, divisor로 나누어 떨어지는 숫자를 순서대로 넣으세요.
    int[] ret = new int[arrayList.size()];
    for (int i=0; i < ret.length; i++) {
        ret[i] = arrayList.get(i);
    }
    return ret;
    }
    // 아래는 테스트로 출력해 보기 위한 코드입니다.
    public static void main(String[] args) {
        Divisible div = new Divisible();
        int[] array = {5, 9, 7, 10};
        System.out.println( Arrays.toString( div.divisible(array, 5) ));
    }
}
