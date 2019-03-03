
/**
 * 여기에 Part2 클래스 설명을 작성하십시오.
 * 
 * @author (작성자 이름) 
 * @version (버전번호나 날짜)
 */
public class Part2 {

    public String findGeneSimple(String dna, String startCodon, String stopCodon) {
        String result = "";
            if (startCodon == "ATG") {
                dna = dna.toUpperCase();
            } else{
                dna = dna.toLowerCase();
            }
        
        int startIndex = dna.indexOf(startCodon);
            if (startIndex == -1) {
                return "";
                
            }
        int stopIndex = dna.indexOf(stopCodon,startIndex+3);
            if (stopIndex == -1) {
                return "";
            }
        
            if ( (stopIndex-startIndex) % 3 == 0 ) {
                result = dna.substring(startIndex,stopIndex +3);
            }
        return result;
    }
    
    public void TestFindGeneSimple() {
        String dna = "AAATGCTA";
        System.out.println("DNA Strand is " + dna);
        String gene = findGeneSimple(dna,"ATG","TAA");
        System.out.println("Gene is " + gene);
        
        dna = "AAAGCTAATGTAA";
        System.out.println("DNA Strand is " + dna);
        gene = findGeneSimple(dna,"ATG","TAA");
        System.out.println("Gene is " + gene);
        
        dna = "AAATGAAAGTAA";
        System.out.println("DNA Strand is " + dna);
        gene = findGeneSimple(dna,"ATG","TAA");
        System.out.println("Gene is " + gene);
        
        
    }    
}

    
 