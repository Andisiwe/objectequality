package za.ac.cput.objectequality;

import junit.framework.Assert;
import junit.framework.TestCase;

/**
 * Created by student on 2015/02/12.
 */
public class TestObjectEquality extends TestCase {
    public void testEquality() throws Exception{
        ObjectEquality obj1 = new ObjectEquality("peter");
        ObjectEquality obj2 = new ObjectEquality("Andisiwe");

        Assert.assertTrue("Checking Object Equality", !obj1.equals(obj2));
    }
}
