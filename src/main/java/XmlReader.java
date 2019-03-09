import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

public class XmlReader {
    public static void main(String[] args) {
        File dataFile = new File("src/main/resources/data.xml");
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        try{
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.parse(dataFile);
            document.getDocumentElement().normalize();

            System.out.println("Root: " + document.getDocumentElement().getNodeName());

        } catch (ParserConfigurationException  | SAXException | IOException exc){
            System.out.println("There has been an exception " + exc.getMessage());
        }
    }
}
