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
        //ret�� array�� ���Ե� ������, divisor�� ������ �������� ���ڸ� ������� ��������.
    int[] ret = new int[arrayList.size()];
    for (int i=0; i < ret.length; i++) {
        ret[i] = arrayList.get(i);
    }
    return ret;
    }
    // �Ʒ��� �׽�Ʈ�� ����� ���� ���� �ڵ��Դϴ�.
    public static void main(String[] args) {
        Divisible div = new Divisible();
        int[] array = {5, 9, 7, 10};
        System.out.println( Arrays.toString( div.divisible(array, 5) ));
    }
}
