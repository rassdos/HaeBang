import java.util.Arrays;
 
public class GetMinMaxString {
    public String getMinMaxString(String str) {
 
        String[] array = str.split(" ");
        int[] arrayInt = new int[array.length];
 
        for (int i = 0; i < arrayInt.length; i++) {
            arrayInt[i] = Integer.parseInt(array[i]);
        }
 
        Arrays.sort(arrayInt);
        String result = arrayInt[0] + " " + arrayInt[arrayInt.length - 1] ;
 
        return result;
 
    }
 
    public static void main(String[] args) {
        String str = "9 19";
        GetMinMaxString minMax = new GetMinMaxString();
        // �Ʒ��� �׽�Ʈ�� ����� ���� ���� �ڵ��Դϴ�.
        System.out.println("�ִ밪�� �ּҰ���? " + minMax.getMinMaxString(str));
    }
}