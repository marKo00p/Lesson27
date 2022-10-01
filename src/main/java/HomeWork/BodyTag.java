package HomeWork;

import org.xml.sax.Attributes;

@TagElement("body")
public class BodyTag extends AbstractTag{
    public BodyTag(Tag parent, String qName, Attributes attributes) {
        super(parent, qName, attributes);
    }

    @Override
    public void print(StringBuilder stringBuilder) {
        stringBuilder.append("{\n");
        printChildren(stringBuilder);
        stringBuilder.append("\n}");
    }
}
