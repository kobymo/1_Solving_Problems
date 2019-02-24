import edu.duke.*;
import java.io.File;

public class PerimeterAssignmentRunner {
    public double getPerimeter (Shape s) {
        // Start with totalPerim = 0
        double totalPerim = 0.0;
        // Start wth prevPt = the last point 
        Point prevPt = s.getLastPoint();
        // For each point currPt in the shape,
        for (Point currPt : s.getPoints()) {
            // Find distance from prevPt point to currPt 
            double currDist = prevPt.distance(currPt);
            // Update totalPerim by currDist
            totalPerim = totalPerim + currDist;
            // Update prevPt to be currPt
            prevPt = currPt;
        }
        // totalPerim is the answer
        return totalPerim;
    }

    public int getNumPoints (Shape s) {
        // Put code here
        int cum_numpoint = 0;
        
        //Point prevPt = s.getLastPoint();
        // For each point currPt in the shape,
        for (Point currPt : s.getPoints()) {
            
            cum_numpoint = cum_numpoint + 1;
            
            
        }
        
        
        return cum_numpoint;
    }

    public double getAverageLength(Shape s) {
        double totalPerim = 0.0;
        int cum_numpoint = 0;
        
        Point prevPt = s.getLastPoint();
        
        for (Point currPt : s.getPoints()) {
            // Find distance from prevPt point to currPt 
            double currDist = prevPt.distance(currPt);
            // Update totalPerim by currDist
            totalPerim = totalPerim + currDist;
            
            cum_numpoint = cum_numpoint + 1;
            
            // Update prevPt to be currPt
            prevPt = currPt;
        }
        
        return totalPerim/cum_numpoint;
        
    }

    public double getLargestSide(Shape s) {
        // Put code here
        Point prevPt = s.getLastPoint();
        
        double prevDist = 0.0; 
         
        
        for (Point currPt : s.getPoints()) {
            // Find distance from prevPt point to currPt 
            double currDist = prevPt.distance(currPt);
            // Update totalPerim by currDist
                if (currDist > prevDist) {
                    prevDist = currDist ;
                }
            prevPt = currPt;
        }
        
        return prevDist;
        
    }

    public double getLargestX(Shape s) {
        // Put code here
        Point prevPt = s.getLastPoint();
        
        double largeX = 0.0; 
        int curX = 0;
        
        for (Point currPt : s.getPoints()) {
            // Find distance from prevPt point to currPt 
            double currDist = prevPt.distance(currPt);
                curX = currPt.getX();
                if (curX > largeX) {
                    largeX = curX ;
                }
            
        }
        
        return largeX;
        
    }

    public double getLargestPerimeterMultipleFiles() {
        // Put code here
        return 0.0;
    }

    public String getFileWithLargestPerimeter() {
        // Put code here
        File temp = null;    // replace this code
        return temp.getName();
    }

    public void testPerimeter () {
        FileResource fr = new FileResource();
        Shape s = new Shape(fr);
        double length = getPerimeter(s);
        System.out.println("perimeter = " + length);
    }
    
    public void testAll(){
        FileResource fr = new FileResource();
        Shape s = new Shape(fr);
        
        double length = getPerimeter(s);
        System.out.println("perimeter = " + length);
        
        double number_of_Points = getNumPoints(s);
        System.out.println("number_of_points = " +number_of_Points);
        
        double average = getAverageLength(s);
        System.out.println("Average =" + average);
        
        double largeside = getLargestSide(s);
        System.out.println("Largest sdie =" + largeside);
        
        double largex = getLargestX(s);
        System.out.println("Largest X value =" + largex);
    
    }
    
    
    public void testPerimeterMultipleFiles() {
        // Put code here
        
        DirectoryResource dr = new DirectoryResource();
        double largelen = 0.0;
        
        for (File f : dr.selectedFiles()) {
            FileResource fr = new FileResource(f);
            Shape s = new Shape(fr);
            double length = getPerimeter(s);
            System.out.println("perimeter = " + length);
            
            if (length > largelen) {
                largelen = length;
            
            }
        }
        System.out.println("The largest length = " + largelen);
        
    }

        
        
        //double length = getPerimeter(s);
        //System.out.println("perimeter = " + length);
        
    
    public void testFileWithLargestPerimeter() {
        // Put code here
    }

    // This method creates a triangle that you can use to test your other methods
    public void triangle(){
        Shape triangle = new Shape();
        triangle.addPoint(new Point(0,0));
        triangle.addPoint(new Point(6,0));
        triangle.addPoint(new Point(3,6));
        for (Point p : triangle.getPoints()){
            System.out.println(p);
        }
        double peri = getPerimeter(triangle);
        System.out.println("perimeter = "+peri);
    }

    // This method prints names of all files in a chosen folder that you can use to test your other methods
    public void printFileNames() {
        DirectoryResource dr = new DirectoryResource();
        for (File f : dr.selectedFiles()) {
            System.out.println(f);
        }
    }

    public static void main (String[] args) {
        PerimeterAssignmentRunner pr = new PerimeterAssignmentRunner();
        pr.testPerimeter();
    }
}
