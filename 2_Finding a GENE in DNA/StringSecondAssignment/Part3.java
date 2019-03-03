
/**
 * 여기에 Part3 클래스 설명을 작성하십시오.
 * 
 * @author (작성자 이름) 
 * @version (버전번호나 날짜)
 */
public class Part3 {
    public int findStopCodon(String dna, int startIndex, String stopCodon){
        int currIndex = dna.indexOf(stopCodon, startIndex+3);
        while (currIndex != -1) {
            if ( (currIndex - startIndex) % 3 == 0){
                return currIndex;
            }
            else{
            currIndex = dna.indexOf(stopCodon,currIndex);
            
            }
            
            System.out.println("loop");
            
        }
        return dna.length(); 
    }
    
    public void testFindStop() {
        String dna = "xxxyyyzzzTAAxxxyyyzzzTAAxx";
        int dex = findStopCodon(dna,0,"TAA");
        if(dex!=9) System.out.println("error on 9");
    
        
    }
    
    public String findGene(String dna, int sijak) {
        int startIndex = dna.indexOf("ATG", sijak);
        if (startIndex == -1) {
            return "";
        }
        int taaIndex = findStopCodon(dna, startIndex, "TAA");
        int tagIndex = findStopCodon(dna, startIndex, "TAG");
        int tgaIndex = findStopCodon(dna, startIndex, "TGA");
        int minIndex = Math.min(taaIndex, Math.min(tagIndex, tgaIndex));
        if (minIndex == dna.length()) {
            return "";
        }
        return dna.substring(startIndex, minIndex+3);
    }
    
    public void testfindGene(){
        String dna = "AGCGCGATGACTTTTAA";
        String test = findGene(dna, 0);
        System.out.println("Result is " + test);
    }
    
    public void printAllGenes(String dna){
        System.out.println("====");
        int startIndex=0;
        int counting = -1;
        while (true){
            String currGene = findGene(dna, startIndex);
            

            counting +=1;
            if (currGene.isEmpty()){
                
                break;
            }
            System.out.println(counting);
            startIndex = dna.indexOf(currGene, startIndex) + currGene.length();
        }
        
        System.out.println("Count =" + counting);
    }
    
    public void testOn(String dna) {
        System.out.println("Testing printAllGenes on " + dna);
        printAllGenes(dna);
    }
    public void test(){
        testOn("ATGATCTAATTTATGCTGCAACGGTGAAGA");
        //testOn("");
        
    }
}
