package HomeWork;

import org.xml.sax.Attributes;
@TagElement("systemprint")
public class SystemprintTag extends AbstractTag{
    public SystemprintTag(Tag parent, String qName, Attributes attributes) {
        super(parent, qName, attributes);
    }

    @Override
    public void print(StringBuilder stringBuilder) {
        stringBuilder.append("System.out.println(\"")
                .append(getAttr("inintial_value"))
                    .append("\");\n");

    }
}
