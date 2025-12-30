package ast.jinja;

import visitor.ASTVisitor;

public class JinjaExpressionNode extends JinjaNode {
    public JinjaExpressionNode(int lineNumber) {
        super("JINJA_EXPRESSION", lineNumber);
    }

    @Override
    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }
}