// Generated from C:/Users/Bashir/IdeaProjects/compiler/src/grammars/LanguageParser.g4 by ANTLR 4.13.2
package grammars;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LanguageParser}.
 */
public interface LanguageParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LanguageParser#template}.
	 * @param ctx the parse tree
	 */
	void enterTemplate(LanguageParser.TemplateContext ctx);
	/**
	 * Exit a parse tree produced by {@link LanguageParser#template}.
	 * @param ctx the parse tree
	 */
	void exitTemplate(LanguageParser.TemplateContext ctx);
	/**
	 * Enter a parse tree produced by {@link LanguageParser#node}.
	 * @param ctx the parse tree
	 */
	void enterNode(LanguageParser.NodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link LanguageParser#node}.
	 * @param ctx the parse tree
	 */
	void exitNode(LanguageParser.NodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link LanguageParser#htmlNode}.
	 * @param ctx the parse tree
	 */
	void enterHtmlNode(LanguageParser.HtmlNodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link LanguageParser#htmlNode}.
	 * @param ctx the parse tree
	 */
	void exitHtmlNode(LanguageParser.HtmlNodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link LanguageParser#doctype}.
	 * @param ctx the parse tree
	 */
	void enterDoctype(LanguageParser.DoctypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link LanguageParser#doctype}.
	 * @param ctx the parse tree
	 */
	void exitDoctype(LanguageParser.DoctypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link LanguageParser#htmlText}.
	 * @param ctx the parse tree
	 */
	void enterHtmlText(LanguageParser.HtmlTextContext ctx);
	/**
	 * Exit a parse tree produced by {@link LanguageParser#htmlText}.
	 * @param ctx the parse tree
	 */
	void exitHtmlText(LanguageParser.HtmlTextContext ctx);
	/**
	 * Enter a parse tree produced by {@link LanguageParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterHtmlElement(LanguageParser.HtmlElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link LanguageParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitHtmlElement(LanguageParser.HtmlElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link LanguageParser#normalElement}.
	 * @param ctx the parse tree
	 */
	void enterNormalElement(LanguageParser.NormalElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link LanguageParser#normalElement}.
	 * @param ctx the parse tree
	 */
	void exitNormalElement(LanguageParser.NormalElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link LanguageParser#selfClosingElement}.
	 * @param ctx the parse tree
	 */
	void enterSelfClosingElement(LanguageParser.SelfClosingElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link LanguageParser#selfClosingElement}.
	 * @param ctx the parse tree
	 */
	void exitSelfClosingElement(LanguageParser.SelfClosingElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link LanguageParser#openTag}.
	 * @param ctx the parse tree
	 */
	void enterOpenTag(LanguageParser.OpenTagContext ctx);
	/**
	 * Exit a parse tree produced by {@link LanguageParser#openTag}.
	 * @param ctx the parse tree
	 */
	void exitOpenTag(LanguageParser.OpenTagContext ctx);
	/**
	 * Enter a parse tree produced by {@link LanguageParser#closeTag}.
	 * @param ctx the parse tree
	 */
	void enterCloseTag(LanguageParser.CloseTagContext ctx);
	/**
	 * Exit a parse tree produced by {@link LanguageParser#closeTag}.
	 * @param ctx the parse tree
	 */
	void exitCloseTag(LanguageParser.CloseTagContext ctx);
	/**
	 * Enter a parse tree produced by {@link LanguageParser#selfClosingTag}.
	 * @param ctx the parse tree
	 */
	void enterSelfClosingTag(LanguageParser.SelfClosingTagContext ctx);
	/**
	 * Exit a parse tree produced by {@link LanguageParser#selfClosingTag}.
	 * @param ctx the parse tree
	 */
	void exitSelfClosingTag(LanguageParser.SelfClosingTagContext ctx);
	/**
	 * Enter a parse tree produced by {@link LanguageParser#htmlContent}.
	 * @param ctx the parse tree
	 */
	void enterHtmlContent(LanguageParser.HtmlContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link LanguageParser#htmlContent}.
	 * @param ctx the parse tree
	 */
	void exitHtmlContent(LanguageParser.HtmlContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link LanguageParser#styleBlock}.
	 * @param ctx the parse tree
	 */
	void enterStyleBlock(LanguageParser.StyleBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link LanguageParser#styleBlock}.
	 * @param ctx the parse tree
	 */
	void exitStyleBlock(LanguageParser.StyleBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link LanguageParser#cssBlock}.
	 * @param ctx the parse tree
	 */
	void enterCssBlock(LanguageParser.CssBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link LanguageParser#cssBlock}.
	 * @param ctx the parse tree
	 */
	void exitCssBlock(LanguageParser.CssBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link LanguageParser#cssSelector}.
	 * @param ctx the parse tree
	 */
	void enterCssSelector(LanguageParser.CssSelectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link LanguageParser#cssSelector}.
	 * @param ctx the parse tree
	 */
	void exitCssSelector(LanguageParser.CssSelectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link LanguageParser#cssDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterCssDeclaration(LanguageParser.CssDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link LanguageParser#cssDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitCssDeclaration(LanguageParser.CssDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cssNumericValue}
	 * labeled alternative in {@link LanguageParser#cssValue}.
	 * @param ctx the parse tree
	 */
	void enterCssNumericValue(LanguageParser.CssNumericValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cssNumericValue}
	 * labeled alternative in {@link LanguageParser#cssValue}.
	 * @param ctx the parse tree
	 */
	void exitCssNumericValue(LanguageParser.CssNumericValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cssColorValue}
	 * labeled alternative in {@link LanguageParser#cssValue}.
	 * @param ctx the parse tree
	 */
	void enterCssColorValue(LanguageParser.CssColorValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cssColorValue}
	 * labeled alternative in {@link LanguageParser#cssValue}.
	 * @param ctx the parse tree
	 */
	void exitCssColorValue(LanguageParser.CssColorValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cssUrlValue}
	 * labeled alternative in {@link LanguageParser#cssValue}.
	 * @param ctx the parse tree
	 */
	void enterCssUrlValue(LanguageParser.CssUrlValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cssUrlValue}
	 * labeled alternative in {@link LanguageParser#cssValue}.
	 * @param ctx the parse tree
	 */
	void exitCssUrlValue(LanguageParser.CssUrlValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cssStringValue}
	 * labeled alternative in {@link LanguageParser#cssValue}.
	 * @param ctx the parse tree
	 */
	void enterCssStringValue(LanguageParser.CssStringValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cssStringValue}
	 * labeled alternative in {@link LanguageParser#cssValue}.
	 * @param ctx the parse tree
	 */
	void exitCssStringValue(LanguageParser.CssStringValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cssIdentifierValue}
	 * labeled alternative in {@link LanguageParser#cssValue}.
	 * @param ctx the parse tree
	 */
	void enterCssIdentifierValue(LanguageParser.CssIdentifierValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cssIdentifierValue}
	 * labeled alternative in {@link LanguageParser#cssValue}.
	 * @param ctx the parse tree
	 */
	void exitCssIdentifierValue(LanguageParser.CssIdentifierValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link LanguageParser#scriptBlock}.
	 * @param ctx the parse tree
	 */
	void enterScriptBlock(LanguageParser.ScriptBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link LanguageParser#scriptBlock}.
	 * @param ctx the parse tree
	 */
	void exitScriptBlock(LanguageParser.ScriptBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link LanguageParser#scriptBody}.
	 * @param ctx the parse tree
	 */
	void enterScriptBody(LanguageParser.ScriptBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link LanguageParser#scriptBody}.
	 * @param ctx the parse tree
	 */
	void exitScriptBody(LanguageParser.ScriptBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link LanguageParser#jinjaNode}.
	 * @param ctx the parse tree
	 */
	void enterJinjaNode(LanguageParser.JinjaNodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link LanguageParser#jinjaNode}.
	 * @param ctx the parse tree
	 */
	void exitJinjaNode(LanguageParser.JinjaNodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link LanguageParser#jinjaExpression}.
	 * @param ctx the parse tree
	 */
	void enterJinjaExpression(LanguageParser.JinjaExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LanguageParser#jinjaExpression}.
	 * @param ctx the parse tree
	 */
	void exitJinjaExpression(LanguageParser.JinjaExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LanguageParser#jinjaExprBody}.
	 * @param ctx the parse tree
	 */
	void enterJinjaExprBody(LanguageParser.JinjaExprBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link LanguageParser#jinjaExprBody}.
	 * @param ctx the parse tree
	 */
	void exitJinjaExprBody(LanguageParser.JinjaExprBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link LanguageParser#jinjaStatement}.
	 * @param ctx the parse tree
	 */
	void enterJinjaStatement(LanguageParser.JinjaStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link LanguageParser#jinjaStatement}.
	 * @param ctx the parse tree
	 */
	void exitJinjaStatement(LanguageParser.JinjaStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link LanguageParser#jinjaStmtBody}.
	 * @param ctx the parse tree
	 */
	void enterJinjaStmtBody(LanguageParser.JinjaStmtBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link LanguageParser#jinjaStmtBody}.
	 * @param ctx the parse tree
	 */
	void exitJinjaStmtBody(LanguageParser.JinjaStmtBodyContext ctx);
}