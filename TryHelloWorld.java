import java.util.Arrays;
 
class TryHelloWorld {
    public int[] gcdlcm(int a, int b) {
      int mul = a * b;
      int[] answer = new int[2];
      if(a < b) {
       int temp = a;
        a = b;
        b = temp;
      }
      while(b > 0) {
        int temp = b;
        b = a % b;
        a = temp;
      }
        answer[0] = a;
          answer[1] = mul / answer[0];
        return answer;
    }
 
    // �Ʒ��� �׽�Ʈ�� ����� ���� ���� �ڵ��Դϴ�.
    public static void main(String[] args) {
        TryHelloWorld c = new TryHelloWorld();
        System.out.println(Arrays.toString(c.gcdlcm(4, 18)));
    }
}