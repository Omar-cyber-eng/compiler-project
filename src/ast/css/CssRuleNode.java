package ast.css;

import visitor.ASTVisitor;
import java.util.ArrayList;
import java.util.List;

public class CssRuleNode extends CssNode {
    private String selector;

    public CssRuleNode(String selector, int lineNumber) {
        super("CSS_RULE: " + selector, lineNumber);
        this.selector = selector;
    }

    public String getSelector() {
        return selector;
    }

    @Override
    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }
}