package ast.jinja;

import visitor.ASTVisitor;

public class JinjaVariableNode extends JinjaNode {
    private String name;

    public JinjaVariableNode(String name, int lineNumber) {
        super("JINJA_VAR: " + name, lineNumber);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }
}