package HomeWork;

import org.xml.sax.Attributes;

@TagElement("expression")
public class ExpressionTag extends AbstractTag{
    public ExpressionTag(Tag parent, String qName, Attributes attributes) {
        super(parent, qName, attributes);
    }

//    <expression name="result" a_value="a" b_value="b" multiplication_expression="*"/>

    @Override
    public void print(StringBuilder stringBuilder) {
        stringBuilder.append("System.out.println(")

                .append(getAttr("a_value"));
                if(getAttr("multiplication_expression").equals("*")) {
                    stringBuilder.append(" * ");
                }
                stringBuilder.append(getAttr("b_value"))
                        .append(");\n");

    }
}
