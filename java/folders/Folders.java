import java.util.Collection;
import java.util.ArrayList;
import java.io.StringReader;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.NamedNodeMap;
import org.xml.sax.InputSource;

public class Folders {
    public static Collection<String> folderNames(String xml, char startingLetter) throws Exception {
      DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
      DocumentBuilder builder = factory.newDocumentBuilder();
      StringReader reader = new StringReader(xml);
      InputSource input = new InputSource(reader);
      Document document = builder.parse(input);
      reader.close();

      Collection<String> folderNames = new ArrayList<String>();
      Node node = document.getDocumentElement();
      while (node != null){
        if(node.getNodeName() == "folder" && node.hasAttributes()){
          Node nameAttribute = node.getAttributes().getNamedItem("name");
          if(nameAttribute != null){
            String name = nameAttribute.getNodeValue();
            if(name.charAt(0) == startingLetter){
              folderNames.add(name);
            }
          }
        }
        if(node.hasChildNodes()){
          node = node.getFirstChild();
        }else{
          Node tmp = node.getNextSibling();
          if(tmp != null){
            node = tmp;
          } else {
            tmp = node.getParentNode();
            if(tmp != null){
              node = tmp.getNextSibling();
            }else{
              node = null;
            }
          }
        }
      }
      return folderNames;
    }

    public static void main(String[] args) throws Exception {
        String xml =
                "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" +
                "<folder name=\"c\">" +
                    "<folder name=\"program files\">" +
                      "<folder name=\"uninstall information\" />" +
                    "</folder>" +
                    "<folder name=\"users\" />" +
                "</folder>";

        Collection<String> names = folderNames(xml, 'u');
        for(String name: names)
            System.out.println(name);
    }
}