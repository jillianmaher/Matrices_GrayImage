import java.util.*;

public class Main 
{
    public static void main(String[] args) 
    {
    	GrayImage image = new GrayImage(4,5);
      System.out.println( image );
    	System.out.println( image.countWhitePixels() );
    	image.processImage();    	
    	System.out.println( image );
    }
}
