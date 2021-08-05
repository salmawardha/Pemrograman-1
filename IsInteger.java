
   //InInteger class
import java.lang.NumberFormatException;
public class IsInteger {

public static  boolean IsaInteger (String s)throws  NumberFormatException 
{
    try
    {
        Integer.parseInt(s);//converts the string into an integer
        return true;
    }
    catch (NumberFormatException e)
    {
        return false;
    }
}

} 

