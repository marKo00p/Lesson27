package HomeWork;

import org.xml.sax.Attributes;
@TagElement("method")
public class MethodTag extends AbstractTag{
    public MethodTag(Tag parent, String qName, Attributes attributes) {
        super(parent, qName, attributes);
    }

    // <method name ="main" access_modifier="public" type="static" return_type="void">
    @Override
    public void print(StringBuilder stringBuilder) {
        stringBuilder.append(getAttr("access_modifier"))
                .append(" ")
                .append(getAttr("type"))
                .append(" ")
                .append(getAttr("return_type"))
                .append(" ")
                .append(getAttr("name"))
                .append(" ");


        printChildren(stringBuilder);
    }
}
