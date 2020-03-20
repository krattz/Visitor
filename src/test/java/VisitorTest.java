import org.junit.Assert;
import org.junit.Test;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import static org.junit.Assert.*;

public class VisitorTest {

    @Test
    public void save() throws IOException {
        File myobj = new File("newFile");
        FileWriter mywriter = new FileWriter("files.txt");
        mywriter.write("this new file");

        Assert.assertEquals(myobj.canWrite(), true);
        Assert.assertEquals(myobj.canRead(), true);

        System.out.println(myobj.createNewFile());

    }

    @Test
    public void load() throws FileNotFoundException {
        File myObj = new File("files.txt");
        Scanner myReader = new Scanner(myObj);
        Assert.assertEquals(myObj.exists(), true);
        Assert.assertEquals(myObj.canRead(), true);
        Assert.assertEquals(myObj.getName(), "files.txt");
    }
}