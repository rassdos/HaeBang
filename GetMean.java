public class GetMean {
    public int getMean(int[] array) {
      
      int sum = 0; //sum ���� ����
      
      for(int i=0; i<array.length; i++) {
       sum += array[i];  //sum ���� array �迭 �� ����
      }
        return sum / array.length; //sum���� array ũ��� ����
    }

    public static void main(String[] args) {
        int x[] = {5, 4, 3};
        GetMean getMean = new GetMean();
        // �Ʒ��� �׽�Ʈ�� ����� ���� ���� �ڵ��Դϴ�.
        System.out.println("��հ� : " + getMean.getMean(x));
    }
}

