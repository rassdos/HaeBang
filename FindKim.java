public class FindKim {
    public String findKim(String[] seoul){
        //x�� �輭���� ��ġ�� �����ϼ���.
        int x = 0;
    for(int i=0; i<seoul.length; i++) {
      if("Kim".equals(seoul[i])) {
        x = i;
      }
    }
        
        return "�輭���� "+ x + "�� �ִ�";
    }
    
    // ������ ���� �׽�Ʈ�ڵ��Դϴ�.
    public static void main(String[] args) {
        FindKim kim = new FindKim();
        String[] names = {"Queen", "Tod","Kim"};
        System.out.println(kim.findKim(names));
    }
}
