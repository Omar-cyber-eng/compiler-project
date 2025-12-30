package ast.css;

import visitor.ASTVisitor;

public class CssDeclarationNode extends CssNode {
    private String property;
    private String value;

    public CssDeclarationNode(String property, String value, int lineNumber) {
        super("CSS_DECLARATION: " + property + " = " + value, lineNumber);
        this.property = property;
        this.value = value;
    }

    public String getProperty() {
        return property;
    }

    public String getValue() {
        return value;
    }

    @Override
    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }
}