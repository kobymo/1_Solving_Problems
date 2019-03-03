
/**
 * 여기에 Part2 클래스 설명을 작성하십시오.
 * 
 * @author (작성자 이름) 
 * @version (버전번호나 날짜)
 */
public class Part2 {
    public String howmany(String stringa, String stringb){
        int startIndex = stringb.indexOf(stringa);
        int counting = -1;
        if (startIndex ==-1){
            return "none";
        }
        while (startIndex < (stringb.length()-stringa.length())){
            String currWord = stringb.substring(startIndex, startIndex+ stringa.length());
            counting += 1;
            if (currWord.isEmpty()){
                break;
            }
            startIndex = stringb.indexOf(currWord, startIndex) + currWord.length();
            
        }
        return "Result is " + counting;
    }

    public void testOn() {
        
        String test = howmany("GAA", "ATGAACGAATTGAATC");
        System.out.println(test);
        
    }
    
}
