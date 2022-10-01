package HomeWork;

import org.xml.sax.Attributes;
@TagElement("statement")
public class StatementTag extends AbstractTag{
    public StatementTag(Tag parent, String qName, Attributes attributes) {
        super(parent, qName, attributes);
    }

    @Override
    public void print(StringBuilder stringBuilder) {
        printChildren(stringBuilder);
    }
}
