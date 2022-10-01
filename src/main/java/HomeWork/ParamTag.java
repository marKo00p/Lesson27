package HomeWork;

import org.xml.sax.Attributes;

@TagElement("param")
public class ParamTag extends AbstractTag{
    public ParamTag(Tag parent, String qName, Attributes attributes) {
        super(parent, qName, attributes);
    }

    @Override
    public void print(StringBuilder stringBuilder) {
        stringBuilder.append(getAttr("type"));
        if((getAttr("isArray").equals("T"))) {
            stringBuilder.append("[] ");
        }
        stringBuilder.append(getAttr("name"));
    }
}
