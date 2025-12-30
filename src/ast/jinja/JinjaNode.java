package ast.jinja;

import ast.ASTNode;

public abstract class JinjaNode extends ASTNode {
    public JinjaNode(String nodeName, int lineNumber) {
        super(nodeName, lineNumber);
    }
}