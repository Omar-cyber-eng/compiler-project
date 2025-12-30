package ast.css;

import ast.ASTNode;

public abstract class CssNode extends ASTNode {
    public CssNode(String nodeName, int lineNumber) {
        super(nodeName, lineNumber);
    }
}