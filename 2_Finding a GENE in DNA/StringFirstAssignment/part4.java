
/**
 * 여기에 part4 클래스 설명을 작성하십시오.
 * 
 * @author (작성자 이름) 
 * @version (버전번호나 날짜)
 */

import edu.duke.*;
import java.io.*;


public class part4 {
     URLResource ur = new URLResource("http://www.dukelearntoprogram.com/course2/data/manylinks.html");
        for (String s : ur.lines()) {
           print s;
        }
    
}