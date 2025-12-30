package ast.jinja;

import visitor.ASTVisitor;

public class JinjaIfNode extends JinjaNode {
    private String condition;

    public JinjaIfNode(String condition, int lineNumber) {
        super("JINJA_IF: " + condition, lineNumber);
        this.condition = condition;
    }

    public String getCondition() {
        return condition;
    }

    @Override
    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }
}