package HomeWork;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.IOException;
import java.io.InputStream;

public class ClassParser extends DefaultHandler {

    Tag currentElement;
    Tag root;

    public static void main(String[] args) {
        new ClassParser().parse(Thread.currentThread().getContextClassLoader().getResourceAsStream("typeextended.xml"));
    }
        private void parse(InputStream inputStream){
        SAXParserFactory factory = SAXParserFactory.newInstance();

        try {
            SAXParser parser= factory.newSAXParser();
            parser.parse(inputStream,this);
        } catch (SAXException | IOException | ParserConfigurationException e) {
            throw new RuntimeException(e);
        }
    }

    private void pushTagElement(String qName, Attributes attributes){
        Tag tag = TagFactory.createTagElement(currentElement, qName, attributes);
        if(currentElement == null) {
            root = currentElement = tag;
        } else {
            currentElement.getChildren().add(tag);
            currentElement = tag;
        }
    }

    private void popTagElement() {
        if(currentElement == null) {
            throw  new IllegalStateException("Current Element is null");
        }
        currentElement = currentElement.getParent();
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        pushTagElement(qName, attributes);
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
       popTagElement();
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        super.characters(ch, start, length);
    }

    @Override
    public void endDocument() throws SAXException {
        StringBuilder stringBuilder = new StringBuilder();
        root.print(stringBuilder);
        System.out.println(stringBuilder);
    }
}
