import java.util.Collection;
import java.util.ArrayList;
import java.io.StringReader;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

public class Folders {

    public static void addFolderName(Node node, Collection<String> folderNames, char startingLetter){
      if(node.getNodeName() == "folder" && node.hasAttributes()){
        Node nameAttribute = node.getAttributes().getNamedItem("name");
        if(nameAttribute != null){
          String name = nameAttribute.getNodeValue();
          if(name.charAt(0) == startingLetter){
            folderNames.add(name);
          }
        }
      }
    }

    public static void searchLetter(NodeList childrens, Collection<String> folderNames, char startingLetter){
      for(int i = 0; i < childrens.getLength(); i++){
        Node node = childrens.item(i);
        addFolderName(node, folderNames, startingLetter);
        if(node.hasChildNodes()){
          searchLetter(node.getChildNodes(), folderNames, startingLetter);
        }
      }
    }

    public static Collection<String> folderNames(String xml, char startingLetter) throws Exception {
      DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
      DocumentBuilder builder = factory.newDocumentBuilder();
      StringReader reader = new StringReader(xml);
      InputSource input = new InputSource(reader);
      Document document = builder.parse(input);
      reader.close();

      Collection<String> folderNames = new ArrayList<String>();
      Node node = document.getDocumentElement();
      addFolderName(node, folderNames, startingLetter);
      if(node.hasChildNodes()){
        searchLetter(node.getChildNodes(), folderNames, startingLetter);
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