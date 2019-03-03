
/**
 * 여기에 Part1 클래스 설명을 작성하십시오.
 * 
 * @author (작성자 이름) 
 * @version (버전번호나 날짜)
 */
public class Part1 {
    public String findGeneSimple(String dna) {
        String result = "";
        int startIndex = dna.indexOf("ATG");
            if (startIndex == -1) {
                return "";
                
            }
        int endIndex = dna.indexOf("TAA",startIndex+3);
            if (endIndex == -1) {
                return "";
            }
        
            if ( (endIndex-startIndex) % 3 == 0 ) {
                result = dna.substring(startIndex,endIndex +3);
            }
        return result;
    }
    
    public void TestFindGeneSimple() {
        String dna = "AAATGCTA";
        System.out.println("DNA Strand is " + dna);
        String gene = findGeneSimple(dna);
        System.out.println("Gene is " + gene);
        
        dna = "AAAGCTAATGTAA";
        System.out.println("DNA Strand is " + dna);
        gene = findGeneSimple(dna);
        System.out.println("Gene is " + gene);
        
        dna = "AAATGAAAGTAA";
        System.out.println("DNA Strand is " + dna);
        gene = findGeneSimple(dna);
        System.out.println("Gene is " + gene);
        
        
    }    
}



