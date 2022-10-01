package HomeWork;

import org.xml.sax.Attributes;

@TagElement("xml")
public class XMLTag extends AbstractTag{
    public XMLTag(Tag parent, String qName, Attributes attributes) {
        super(parent, qName, attributes);
    }

    @Override
    public void print(StringBuilder stringBuilder) {
        printChildren(stringBuilder);

    }

}
