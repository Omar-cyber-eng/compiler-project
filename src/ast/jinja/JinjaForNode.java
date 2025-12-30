package ast.jinja;

import visitor.ASTVisitor;

public class JinjaForNode extends JinjaNode {
    private String variable; // مثل: product
    private String collection; // مثل: products

    public JinjaForNode(String variable, String collection, int lineNumber) {
        super("JINJA_FOR: " + variable + " IN " + collection, lineNumber);
        this.variable = variable;
        this.collection = collection;
    }

    public String getVariable() {
        return variable;
    }

    public String getCollection() {
        return collection;
    }

    @Override
    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }
}