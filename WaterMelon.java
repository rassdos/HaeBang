public class WaterMelon {
    public String watermelon(int n){
        String result = "";
    for(int i=0; i<n; i++) {
     result += (i % 2 == 0) ? "��" : "��";
    }
        return result;
    }
 
    // ������ ���� �׽�Ʈ�ڵ��Դϴ�.
    public static void  main(String[] args){
        WaterMelon wm = new WaterMelon();
        System.out.println("n�� 3�� ���: " + wm.watermelon(3));
        System.out.println("n�� 4�� ���: " + wm.watermelon(4));
    }
}

