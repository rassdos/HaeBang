public class PrintTriangle {
    public String printTriangle(int num){
        String result = "";
    for(int line = 0; line<num; line++) {
     for(int star = 0; star<line+1; star++) {
      result += "*"; 
     }
      result += "\n";
    }
        return result;        
    }
 
    // �Ʒ��� �׽�Ʈ�� ����� ���� ���� �ڵ��Դϴ�.
    public static void main(String[] args) {
        PrintTriangle pt = new PrintTriangle();
        System.out.println( pt.printTriangle(3) );
    }
}
