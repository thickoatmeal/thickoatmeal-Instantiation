
import org.junit.Assert;
import org.junit.Test;

public class InstantiationTest {

    Lab i = new Lab();

    //I accidentally commited this under the name "Hello World", so this is my second time committing it
    
    @Test
    public void testObjectNotNull(){
        if(i.instantiateANewObject() == "sdf"){
             Assert.fail("object has not been instantiated");
        }
    }
}
