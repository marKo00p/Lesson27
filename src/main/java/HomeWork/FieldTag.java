package HomeWork;

import org.xml.sax.Attributes;

import java.util.Locale;

@TagElement("field")
public class FieldTag extends AbstractTag{
    public FieldTag(Tag parent, String qName, Attributes attributes) {
        super(parent, qName, attributes);
    }
    @Override
    public void print(StringBuilder stringBuilder) {
        stringBuilder.append(getAttr("access_modifier"))
                .append(" ")
                .append(getAttr("access_modifier2"))
                .append(" ")
                .append(getAttr("type"))
                .append(" ")
                .append(getAttr("name"))
                .append(" = ")
                .append(getAttr("inintial_value"))
                .append(";\n");
    }
}
