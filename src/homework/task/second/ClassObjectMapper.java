package homework.task.second;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import java.io.File;

public class ClassObjectMapper {
    
    public void save(ClassSimpleBin mybin) {
        int a = mybin.index;
        String b = mybin.name;
        
        PrintWriter TestingFile = null;
        try   {
            TestingFile = new PrintWriter(new FileOutputStream("C:\\Users\\tenzor\\Documents\\NetBeansProjects\\Homework\\src\\task\\second\\my_test_file.txt"));
        }
        
        catch(FileNotFoundException e)  {
             System.out.println("Error opening file my_test_file.txt!");
             System.exit(0);
        }
        
        TestingFile.println(this.getClass().getSimpleName());
        TestingFile.close();
        System.out.println("Execution is completed!");
        
    }
    
    public void saveByConfig() {
        System.out.println("Reading config file...Please wait...");
        
        try {
            
            File fXmlFile = new File("C:\\Users\\tenzor\\Documents\\NetBeansProjects\\Homework\\src\\task\\second\\conf\\settings.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(fXmlFile);
            
            doc.getDocumentElement().normalize();
            
            System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
            
            NodeList nList = doc.getElementsByTagName("composition");
            Node nNode = nList.item(0);
            Element eElement = (Element) nNode;
            System.out.println("Composition id : " + eElement.getAttribute("id"));
            //System.out.println("First Name : " + eElement.getElementsByTagName("variable").item(0).getTextContent());
            
            
            
        }   catch (Exception e)  {
            e.printStackTrace();
        }
        
    }
}
