package HomeWork;

import org.xml.sax.Attributes;
@TagElement("type")
public class TypeTag extends AbstractTag{
    public TypeTag(Tag parent, String qName, Attributes attributes) {
        super(parent, qName, attributes);
    }
    @Override
    public void print(StringBuilder stringBuilder) {
        stringBuilder.append(getAttr("access_modifier"))
                .append(" class ")
                .append(getAttr("name"))
                .append("{\n");
        printChildren(stringBuilder);
        stringBuilder.append("\n}");
    }
}
