// Generated from C:/Users/Bashir/IdeaProjects/compiler/src/grammars/LanguageParser.g4 by ANTLR 4.13.2
package grammars;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link LanguageParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface LanguageParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link LanguageParser#template}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplate(LanguageParser.TemplateContext ctx);
	/**
	 * Visit a parse tree produced by {@link LanguageParser#node}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNode(LanguageParser.NodeContext ctx);
	/**
	 * Visit a parse tree produced by {@link LanguageParser#htmlNode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlNode(LanguageParser.HtmlNodeContext ctx);
	/**
	 * Visit a parse tree produced by {@link LanguageParser#doctype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoctype(LanguageParser.DoctypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link LanguageParser#htmlText}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlText(LanguageParser.HtmlTextContext ctx);
	/**
	 * Visit a parse tree produced by {@link LanguageParser#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlElement(LanguageParser.HtmlElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link LanguageParser#normalElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormalElement(LanguageParser.NormalElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link LanguageParser#selfClosingElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelfClosingElement(LanguageParser.SelfClosingElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link LanguageParser#openTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpenTag(LanguageParser.OpenTagContext ctx);
	/**
	 * Visit a parse tree produced by {@link LanguageParser#closeTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCloseTag(LanguageParser.CloseTagContext ctx);
	/**
	 * Visit a parse tree produced by {@link LanguageParser#selfClosingTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelfClosingTag(LanguageParser.SelfClosingTagContext ctx);
	/**
	 * Visit a parse tree produced by {@link LanguageParser#htmlContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlContent(LanguageParser.HtmlContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link LanguageParser#styleBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStyleBlock(LanguageParser.StyleBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link LanguageParser#cssBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssBlock(LanguageParser.CssBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link LanguageParser#cssSelector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssSelector(LanguageParser.CssSelectorContext ctx);
	/**
	 * Visit a parse tree produced by {@link LanguageParser#cssDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssDeclaration(LanguageParser.CssDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cssNumericValue}
	 * labeled alternative in {@link LanguageParser#cssValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssNumericValue(LanguageParser.CssNumericValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cssColorValue}
	 * labeled alternative in {@link LanguageParser#cssValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssColorValue(LanguageParser.CssColorValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cssUrlValue}
	 * labeled alternative in {@link LanguageParser#cssValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssUrlValue(LanguageParser.CssUrlValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cssStringValue}
	 * labeled alternative in {@link LanguageParser#cssValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssStringValue(LanguageParser.CssStringValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cssIdentifierValue}
	 * labeled alternative in {@link LanguageParser#cssValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssIdentifierValue(LanguageParser.CssIdentifierValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link LanguageParser#scriptBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScriptBlock(LanguageParser.ScriptBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link LanguageParser#scriptBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScriptBody(LanguageParser.ScriptBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link LanguageParser#jinjaNode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaNode(LanguageParser.JinjaNodeContext ctx);
	/**
	 * Visit a parse tree produced by {@link LanguageParser#jinjaExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaExpression(LanguageParser.JinjaExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LanguageParser#jinjaExprBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaExprBody(LanguageParser.JinjaExprBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link LanguageParser#jinjaStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaStatement(LanguageParser.JinjaStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link LanguageParser#jinjaStmtBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaStmtBody(LanguageParser.JinjaStmtBodyContext ctx);
}