package HomeWork;

import org.xml.sax.Attributes;

@TagElement("package")
public class PackageTag extends AbstractTag{
    public PackageTag(Tag parent, String qName, Attributes attributes) {
        super(parent, qName, attributes);
    }
    @Override
    public void print(StringBuilder stringBuilder) {
        stringBuilder.append("package ").append(getAttr("name")).append(";\n");
    }
}
