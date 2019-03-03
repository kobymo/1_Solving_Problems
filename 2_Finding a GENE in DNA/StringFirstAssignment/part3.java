
/**
 * 여기에 part3 클래스 설명을 작성하십시오.
 * 
 * @author (작성자 이름) 
 * @version (버전번호나 날짜)
 */
public class part3 {
    public String twoOccurrences(String stringa, String stringb) {
        int firstIndex = stringb.indexOf(stringa);
        int secondIndex = stringb.indexOf(stringa,firstIndex+1);
            if (secondIndex == -1) {
                return "false";
            }else{
                return "true";
            }
    }
    
    public String lastPart(String stringa, String stringb) {
          
        int firstIndex = stringb.indexOf(stringa);
        int secondIndex = stringb.indexOf(stringa,firstIndex+1);
            if (secondIndex == -1) {
                return stringb;
            }else{
                return stringb.substring(firstIndex,secondIndex+1);
            }
        
    }
    
    public void TestFindGeneSimple() {
        String test = twoOccurrences("by", "A story by Abby Long");
        System.out.println("Result is " + test);
        
        test = twoOccurrences("atg", "ctgtatgta");
        System.out.println("Result is " + test);
        
        String sta = "an";
        String stb = "banana";
        test = lastPart(sta, stb);
        System.out.println("The part of the string after " + sta +" in " + stb +" is "+ test);
        
        sta = "zoo";
        stb = "forest";
        test = lastPart(sta, stb);
        System.out.println("The part of the string after " + sta +" in " + stb +" is "+ test);
        
        
        
    }    
}
