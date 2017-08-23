public class ReverseStr {
    public String reverseStr(String str){
    char[] array = str.toCharArray();
 
        for(int i=0; i<array.length; i++){
            for(int j=i; j<array.length; j++){
          char temp;
        if(array[i] < array[j]){
          temp = array[i];
          array[i] = array[j];
          array[j] = temp;
        }
      }
    }
        return String.valueOf(array);
    }
 
    // 아래는 테스트로 출력해 보기 위한 코드입니다.
    public static void main(String[] args) {
        ReverseStr rs = new ReverseStr();
        System.out.println( rs.reverseStr("Zbcdefg") );
    }
}
