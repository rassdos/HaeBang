class StringExercise{
    String getMiddle(String word){
      int length = word.length();
      int location = length/2;
      if(length % 2 == 0) {
       word = word.substring(location-1, location+1);
      } else {
       word = word.substring(location, location+1);
      }  
      return word;
    }
    // 아래는 테스트로 출력해 보기 위한 코드입니다.
    public static void  main(String[] args){
        StringExercise se = new StringExercise();
        System.out.println(se.getMiddle("power"));
    }
}
