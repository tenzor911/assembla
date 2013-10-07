package homework.task.first;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class ClassObjectMapper {
    
    public void save(ClassSimpleBin mybin) {
        int a = mybin.index;
        String b = mybin.name;
        
        PrintWriter TestingFile = null;
        try   {
            TestingFile = new PrintWriter(new FileOutputStream("C:\\Users\\tenzor\\Documents\\NetBeansProjects\\assembla\\src\\homework\\task\\first\\file.txt"));
        }
        
        catch(FileNotFoundException e)  {
             System.out.println("Error opening file my_test_file.txt!");
             System.exit(0);
        }
        
        TestingFile.println(this.getClass().getSimpleName());
        TestingFile.close();
        System.out.println("Execution completed!");
    }
    
    public void saveByConfig() {
        
    }
}
