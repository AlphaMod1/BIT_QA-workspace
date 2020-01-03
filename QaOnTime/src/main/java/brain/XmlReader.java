package brain;


import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
 
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class XmlReader {
	
	public List<String> read() {
		List<String> xmlContent = new ArrayList<String>();
		try {

            File file = new File("src\\main\\resources\\myxml.xml");
            DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
            Document document = documentBuilder.parse(file); 
            document.getDocumentElement().normalize();
            NodeList nodeList = document.getElementsByTagName("profile");
            for (int index = 0; index < nodeList.getLength(); index++) {
                Node node = nodeList.item(index);
 
                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element eElement = (Element) node;
                    xmlContent.add(eElement.getElementsByTagName("address").item(0).getTextContent()+",ThisIsASplitThing,"+eElement.getElementsByTagName("email").item(0).getTextContent());
                }
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
            e.printStackTrace();
        }
		return xmlContent;
    }
	

}
