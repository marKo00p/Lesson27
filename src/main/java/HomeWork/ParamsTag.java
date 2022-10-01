package HomeWork;

import org.xml.sax.Attributes;

@TagElement("params")
public class ParamsTag extends AbstractTag{
    public ParamsTag(Tag parent, String qName, Attributes attributes) {

        super(parent, qName, attributes);
    }

    @Override
    public void print(StringBuilder stringBuilder) {
        stringBuilder.append("(");
        printChildren(stringBuilder);
        stringBuilder.append(")");
    }
}
