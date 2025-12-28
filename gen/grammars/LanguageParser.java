// Generated from C:/Users/Bashir/IdeaProjects/compiler/src/grammars/LanguageParser.g4 by ANTLR 4.13.2
package grammars;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class LanguageParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		HTML_DOCTYPE=1, HTML_COMMENT=2, STYLE_OPEN=3, SCRIPT_OPEN=4, JINJA_EXPR_START=5, 
		JINJA_STMT_START=6, JINJA_COMMENT=7, HTML_TAG_OPEN=8, HTML_SELF_CLOSE=9, 
		HTML_TAG_CLOSE=10, HTML_TEXT=11, HTML_ATTR_NAME=12, HTML_ATTR_EQUALS=13, 
		HTML_ATTR_VALUE=14, HTML_WS=15, CSS_STYLE_CLOSE=16, CSS_COMMENT=17, CSS_ID_SELECTOR=18, 
		CSS_CLASS_SELECTOR=19, CSS_ELEMENT_SELECTOR=20, CSS_LBRACE=21, CSS_RBRACE=22, 
		CSS_COLON=23, CSS_SEMI=24, CSS_COMMA=25, CSS_NUMBER=26, CSS_UNIT=27, CSS_COLOR=28, 
		CSS_URL=29, CSS_STRING=30, CSS_IDENTIFIER=31, CSS_WS=32, SCRIPT_CLOSE=33, 
		SCRIPT_TEXT=34, JINJA_EXPR_END=35, JINJA_ID=36, JINJA_INT=37, JINJA_FLOAT=38, 
		JINJA_STRING=39, JINJA_ARITH_OP=40, JINJA_COMP_OP=41, JINJA_BOOL_OP=42, 
		JINJA_LPAREN=43, JINJA_RPAREN=44, JINJA_COMMA=45, JINJA_DOT=46, JINJA_WS=47, 
		JINJA_STMT_END=48, JINJA_IF=49, JINJA_ELSE=50, JINJA_FOR=51, JINJA_IN=52, 
		JINJA_STMT_ID=53, JINJA_STMT_INT=54, JINJA_STMT_STRING=55, JINJA_OP=56, 
		JINJA_STMT_WS=57;
	public static final int
		RULE_template = 0, RULE_node = 1, RULE_htmlNode = 2, RULE_doctype = 3, 
		RULE_htmlText = 4, RULE_htmlElement = 5, RULE_normalElement = 6, RULE_selfClosingElement = 7, 
		RULE_openTag = 8, RULE_closeTag = 9, RULE_selfClosingTag = 10, RULE_htmlContent = 11, 
		RULE_styleBlock = 12, RULE_cssBlock = 13, RULE_cssSelector = 14, RULE_cssDeclaration = 15, 
		RULE_cssValue = 16, RULE_scriptBlock = 17, RULE_scriptBody = 18, RULE_jinjaNode = 19, 
		RULE_jinjaExpression = 20, RULE_jinjaExprBody = 21, RULE_jinjaStatement = 22, 
		RULE_jinjaStmtBody = 23;
	private static String[] makeRuleNames() {
		return new String[] {
			"template", "node", "htmlNode", "doctype", "htmlText", "htmlElement", 
			"normalElement", "selfClosingElement", "openTag", "closeTag", "selfClosingTag", 
			"htmlContent", "styleBlock", "cssBlock", "cssSelector", "cssDeclaration", 
			"cssValue", "scriptBlock", "scriptBody", "jinjaNode", "jinjaExpression", 
			"jinjaExprBody", "jinjaStatement", "jinjaStmtBody"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'<style>'", "'<script>'", "'{{'", "'{%'", null, null, 
			null, null, null, null, "'='", null, null, "'</style>'", null, null, 
			null, null, "'{'", "'}'", "':'", "';'", "','", null, null, null, null, 
			null, null, null, "'</script>'", null, "'}}'", null, null, null, null, 
			null, null, null, null, null, null, null, null, "'%}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "HTML_DOCTYPE", "HTML_COMMENT", "STYLE_OPEN", "SCRIPT_OPEN", "JINJA_EXPR_START", 
			"JINJA_STMT_START", "JINJA_COMMENT", "HTML_TAG_OPEN", "HTML_SELF_CLOSE", 
			"HTML_TAG_CLOSE", "HTML_TEXT", "HTML_ATTR_NAME", "HTML_ATTR_EQUALS", 
			"HTML_ATTR_VALUE", "HTML_WS", "CSS_STYLE_CLOSE", "CSS_COMMENT", "CSS_ID_SELECTOR", 
			"CSS_CLASS_SELECTOR", "CSS_ELEMENT_SELECTOR", "CSS_LBRACE", "CSS_RBRACE", 
			"CSS_COLON", "CSS_SEMI", "CSS_COMMA", "CSS_NUMBER", "CSS_UNIT", "CSS_COLOR", 
			"CSS_URL", "CSS_STRING", "CSS_IDENTIFIER", "CSS_WS", "SCRIPT_CLOSE", 
			"SCRIPT_TEXT", "JINJA_EXPR_END", "JINJA_ID", "JINJA_INT", "JINJA_FLOAT", 
			"JINJA_STRING", "JINJA_ARITH_OP", "JINJA_COMP_OP", "JINJA_BOOL_OP", "JINJA_LPAREN", 
			"JINJA_RPAREN", "JINJA_COMMA", "JINJA_DOT", "JINJA_WS", "JINJA_STMT_END", 
			"JINJA_IF", "JINJA_ELSE", "JINJA_FOR", "JINJA_IN", "JINJA_STMT_ID", "JINJA_STMT_INT", 
			"JINJA_STMT_STRING", "JINJA_OP", "JINJA_STMT_WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "LanguageParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public LanguageParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TemplateContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(LanguageParser.EOF, 0); }
		public List<NodeContext> node() {
			return getRuleContexts(NodeContext.class);
		}
		public NodeContext node(int i) {
			return getRuleContext(NodeContext.class,i);
		}
		public TemplateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_template; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageParserListener ) ((LanguageParserListener)listener).enterTemplate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageParserListener ) ((LanguageParserListener)listener).exitTemplate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageParserVisitor ) return ((LanguageParserVisitor<? extends T>)visitor).visitTemplate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TemplateContext template() throws RecognitionException {
		TemplateContext _localctx = new TemplateContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_template);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2938L) != 0)) {
				{
				{
				setState(48);
				node();
				}
				}
				setState(53);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(54);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NodeContext extends ParserRuleContext {
		public HtmlNodeContext htmlNode() {
			return getRuleContext(HtmlNodeContext.class,0);
		}
		public JinjaNodeContext jinjaNode() {
			return getRuleContext(JinjaNodeContext.class,0);
		}
		public NodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_node; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageParserListener ) ((LanguageParserListener)listener).enterNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageParserListener ) ((LanguageParserListener)listener).exitNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageParserVisitor ) return ((LanguageParserVisitor<? extends T>)visitor).visitNode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NodeContext node() throws RecognitionException {
		NodeContext _localctx = new NodeContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_node);
		try {
			setState(58);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case HTML_DOCTYPE:
			case STYLE_OPEN:
			case SCRIPT_OPEN:
			case HTML_TAG_OPEN:
			case HTML_SELF_CLOSE:
			case HTML_TEXT:
				enterOuterAlt(_localctx, 1);
				{
				setState(56);
				htmlNode();
				}
				break;
			case JINJA_EXPR_START:
			case JINJA_STMT_START:
				enterOuterAlt(_localctx, 2);
				{
				setState(57);
				jinjaNode();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlNodeContext extends ParserRuleContext {
		public DoctypeContext doctype() {
			return getRuleContext(DoctypeContext.class,0);
		}
		public HtmlElementContext htmlElement() {
			return getRuleContext(HtmlElementContext.class,0);
		}
		public StyleBlockContext styleBlock() {
			return getRuleContext(StyleBlockContext.class,0);
		}
		public ScriptBlockContext scriptBlock() {
			return getRuleContext(ScriptBlockContext.class,0);
		}
		public HtmlTextContext htmlText() {
			return getRuleContext(HtmlTextContext.class,0);
		}
		public HtmlNodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlNode; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageParserListener ) ((LanguageParserListener)listener).enterHtmlNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageParserListener ) ((LanguageParserListener)listener).exitHtmlNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageParserVisitor ) return ((LanguageParserVisitor<? extends T>)visitor).visitHtmlNode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlNodeContext htmlNode() throws RecognitionException {
		HtmlNodeContext _localctx = new HtmlNodeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_htmlNode);
		try {
			setState(65);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case HTML_DOCTYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(60);
				doctype();
				}
				break;
			case HTML_TAG_OPEN:
			case HTML_SELF_CLOSE:
				enterOuterAlt(_localctx, 2);
				{
				setState(61);
				htmlElement();
				}
				break;
			case STYLE_OPEN:
				enterOuterAlt(_localctx, 3);
				{
				setState(62);
				styleBlock();
				}
				break;
			case SCRIPT_OPEN:
				enterOuterAlt(_localctx, 4);
				{
				setState(63);
				scriptBlock();
				}
				break;
			case HTML_TEXT:
				enterOuterAlt(_localctx, 5);
				{
				setState(64);
				htmlText();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DoctypeContext extends ParserRuleContext {
		public TerminalNode HTML_DOCTYPE() { return getToken(LanguageParser.HTML_DOCTYPE, 0); }
		public DoctypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doctype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageParserListener ) ((LanguageParserListener)listener).enterDoctype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageParserListener ) ((LanguageParserListener)listener).exitDoctype(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageParserVisitor ) return ((LanguageParserVisitor<? extends T>)visitor).visitDoctype(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DoctypeContext doctype() throws RecognitionException {
		DoctypeContext _localctx = new DoctypeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_doctype);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			match(HTML_DOCTYPE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlTextContext extends ParserRuleContext {
		public TerminalNode HTML_TEXT() { return getToken(LanguageParser.HTML_TEXT, 0); }
		public HtmlTextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlText; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageParserListener ) ((LanguageParserListener)listener).enterHtmlText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageParserListener ) ((LanguageParserListener)listener).exitHtmlText(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageParserVisitor ) return ((LanguageParserVisitor<? extends T>)visitor).visitHtmlText(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlTextContext htmlText() throws RecognitionException {
		HtmlTextContext _localctx = new HtmlTextContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_htmlText);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			match(HTML_TEXT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlElementContext extends ParserRuleContext {
		public NormalElementContext normalElement() {
			return getRuleContext(NormalElementContext.class,0);
		}
		public SelfClosingElementContext selfClosingElement() {
			return getRuleContext(SelfClosingElementContext.class,0);
		}
		public HtmlElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageParserListener ) ((LanguageParserListener)listener).enterHtmlElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageParserListener ) ((LanguageParserListener)listener).exitHtmlElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageParserVisitor ) return ((LanguageParserVisitor<? extends T>)visitor).visitHtmlElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlElementContext htmlElement() throws RecognitionException {
		HtmlElementContext _localctx = new HtmlElementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_htmlElement);
		try {
			setState(73);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case HTML_TAG_OPEN:
				enterOuterAlt(_localctx, 1);
				{
				setState(71);
				normalElement();
				}
				break;
			case HTML_SELF_CLOSE:
				enterOuterAlt(_localctx, 2);
				{
				setState(72);
				selfClosingElement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NormalElementContext extends ParserRuleContext {
		public OpenTagContext openTag() {
			return getRuleContext(OpenTagContext.class,0);
		}
		public HtmlContentContext htmlContent() {
			return getRuleContext(HtmlContentContext.class,0);
		}
		public CloseTagContext closeTag() {
			return getRuleContext(CloseTagContext.class,0);
		}
		public NormalElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_normalElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageParserListener ) ((LanguageParserListener)listener).enterNormalElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageParserListener ) ((LanguageParserListener)listener).exitNormalElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageParserVisitor ) return ((LanguageParserVisitor<? extends T>)visitor).visitNormalElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NormalElementContext normalElement() throws RecognitionException {
		NormalElementContext _localctx = new NormalElementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_normalElement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			openTag();
			setState(76);
			htmlContent();
			setState(77);
			closeTag();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SelfClosingElementContext extends ParserRuleContext {
		public SelfClosingTagContext selfClosingTag() {
			return getRuleContext(SelfClosingTagContext.class,0);
		}
		public SelfClosingElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selfClosingElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageParserListener ) ((LanguageParserListener)listener).enterSelfClosingElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageParserListener ) ((LanguageParserListener)listener).exitSelfClosingElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageParserVisitor ) return ((LanguageParserVisitor<? extends T>)visitor).visitSelfClosingElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelfClosingElementContext selfClosingElement() throws RecognitionException {
		SelfClosingElementContext _localctx = new SelfClosingElementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_selfClosingElement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			selfClosingTag();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OpenTagContext extends ParserRuleContext {
		public TerminalNode HTML_TAG_OPEN() { return getToken(LanguageParser.HTML_TAG_OPEN, 0); }
		public OpenTagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_openTag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageParserListener ) ((LanguageParserListener)listener).enterOpenTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageParserListener ) ((LanguageParserListener)listener).exitOpenTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageParserVisitor ) return ((LanguageParserVisitor<? extends T>)visitor).visitOpenTag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpenTagContext openTag() throws RecognitionException {
		OpenTagContext _localctx = new OpenTagContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_openTag);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			match(HTML_TAG_OPEN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CloseTagContext extends ParserRuleContext {
		public TerminalNode HTML_TAG_CLOSE() { return getToken(LanguageParser.HTML_TAG_CLOSE, 0); }
		public CloseTagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_closeTag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageParserListener ) ((LanguageParserListener)listener).enterCloseTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageParserListener ) ((LanguageParserListener)listener).exitCloseTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageParserVisitor ) return ((LanguageParserVisitor<? extends T>)visitor).visitCloseTag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CloseTagContext closeTag() throws RecognitionException {
		CloseTagContext _localctx = new CloseTagContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_closeTag);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			match(HTML_TAG_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SelfClosingTagContext extends ParserRuleContext {
		public TerminalNode HTML_SELF_CLOSE() { return getToken(LanguageParser.HTML_SELF_CLOSE, 0); }
		public SelfClosingTagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selfClosingTag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageParserListener ) ((LanguageParserListener)listener).enterSelfClosingTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageParserListener ) ((LanguageParserListener)listener).exitSelfClosingTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageParserVisitor ) return ((LanguageParserVisitor<? extends T>)visitor).visitSelfClosingTag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelfClosingTagContext selfClosingTag() throws RecognitionException {
		SelfClosingTagContext _localctx = new SelfClosingTagContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_selfClosingTag);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			match(HTML_SELF_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlContentContext extends ParserRuleContext {
		public List<HtmlNodeContext> htmlNode() {
			return getRuleContexts(HtmlNodeContext.class);
		}
		public HtmlNodeContext htmlNode(int i) {
			return getRuleContext(HtmlNodeContext.class,i);
		}
		public List<JinjaNodeContext> jinjaNode() {
			return getRuleContexts(JinjaNodeContext.class);
		}
		public JinjaNodeContext jinjaNode(int i) {
			return getRuleContext(JinjaNodeContext.class,i);
		}
		public HtmlContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlContent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageParserListener ) ((LanguageParserListener)listener).enterHtmlContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageParserListener ) ((LanguageParserListener)listener).exitHtmlContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageParserVisitor ) return ((LanguageParserVisitor<? extends T>)visitor).visitHtmlContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlContentContext htmlContent() throws RecognitionException {
		HtmlContentContext _localctx = new HtmlContentContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_htmlContent);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2938L) != 0)) {
				{
				setState(89);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case HTML_DOCTYPE:
				case STYLE_OPEN:
				case SCRIPT_OPEN:
				case HTML_TAG_OPEN:
				case HTML_SELF_CLOSE:
				case HTML_TEXT:
					{
					setState(87);
					htmlNode();
					}
					break;
				case JINJA_EXPR_START:
				case JINJA_STMT_START:
					{
					setState(88);
					jinjaNode();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(93);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StyleBlockContext extends ParserRuleContext {
		public TerminalNode STYLE_OPEN() { return getToken(LanguageParser.STYLE_OPEN, 0); }
		public TerminalNode CSS_STYLE_CLOSE() { return getToken(LanguageParser.CSS_STYLE_CLOSE, 0); }
		public List<CssBlockContext> cssBlock() {
			return getRuleContexts(CssBlockContext.class);
		}
		public CssBlockContext cssBlock(int i) {
			return getRuleContext(CssBlockContext.class,i);
		}
		public StyleBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_styleBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageParserListener ) ((LanguageParserListener)listener).enterStyleBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageParserListener ) ((LanguageParserListener)listener).exitStyleBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageParserVisitor ) return ((LanguageParserVisitor<? extends T>)visitor).visitStyleBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StyleBlockContext styleBlock() throws RecognitionException {
		StyleBlockContext _localctx = new StyleBlockContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_styleBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			match(STYLE_OPEN);
			setState(98);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1835008L) != 0)) {
				{
				{
				setState(95);
				cssBlock();
				}
				}
				setState(100);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(101);
			match(CSS_STYLE_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CssBlockContext extends ParserRuleContext {
		public CssSelectorContext cssSelector() {
			return getRuleContext(CssSelectorContext.class,0);
		}
		public TerminalNode CSS_LBRACE() { return getToken(LanguageParser.CSS_LBRACE, 0); }
		public TerminalNode CSS_RBRACE() { return getToken(LanguageParser.CSS_RBRACE, 0); }
		public List<CssDeclarationContext> cssDeclaration() {
			return getRuleContexts(CssDeclarationContext.class);
		}
		public CssDeclarationContext cssDeclaration(int i) {
			return getRuleContext(CssDeclarationContext.class,i);
		}
		public CssBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageParserListener ) ((LanguageParserListener)listener).enterCssBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageParserListener ) ((LanguageParserListener)listener).exitCssBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageParserVisitor ) return ((LanguageParserVisitor<? extends T>)visitor).visitCssBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssBlockContext cssBlock() throws RecognitionException {
		CssBlockContext _localctx = new CssBlockContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_cssBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			cssSelector();
			setState(104);
			match(CSS_LBRACE);
			setState(108);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CSS_IDENTIFIER) {
				{
				{
				setState(105);
				cssDeclaration();
				}
				}
				setState(110);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(111);
			match(CSS_RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CssSelectorContext extends ParserRuleContext {
		public TerminalNode CSS_ID_SELECTOR() { return getToken(LanguageParser.CSS_ID_SELECTOR, 0); }
		public TerminalNode CSS_CLASS_SELECTOR() { return getToken(LanguageParser.CSS_CLASS_SELECTOR, 0); }
		public TerminalNode CSS_ELEMENT_SELECTOR() { return getToken(LanguageParser.CSS_ELEMENT_SELECTOR, 0); }
		public CssSelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssSelector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageParserListener ) ((LanguageParserListener)listener).enterCssSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageParserListener ) ((LanguageParserListener)listener).exitCssSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageParserVisitor ) return ((LanguageParserVisitor<? extends T>)visitor).visitCssSelector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssSelectorContext cssSelector() throws RecognitionException {
		CssSelectorContext _localctx = new CssSelectorContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_cssSelector);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1835008L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CssDeclarationContext extends ParserRuleContext {
		public TerminalNode CSS_IDENTIFIER() { return getToken(LanguageParser.CSS_IDENTIFIER, 0); }
		public TerminalNode CSS_COLON() { return getToken(LanguageParser.CSS_COLON, 0); }
		public CssValueContext cssValue() {
			return getRuleContext(CssValueContext.class,0);
		}
		public TerminalNode CSS_SEMI() { return getToken(LanguageParser.CSS_SEMI, 0); }
		public CssDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageParserListener ) ((LanguageParserListener)listener).enterCssDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageParserListener ) ((LanguageParserListener)listener).exitCssDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageParserVisitor ) return ((LanguageParserVisitor<? extends T>)visitor).visitCssDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssDeclarationContext cssDeclaration() throws RecognitionException {
		CssDeclarationContext _localctx = new CssDeclarationContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_cssDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			match(CSS_IDENTIFIER);
			setState(116);
			match(CSS_COLON);
			setState(117);
			cssValue();
			setState(118);
			match(CSS_SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CssValueContext extends ParserRuleContext {
		public CssValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssValue; }
	 
		public CssValueContext() { }
		public void copyFrom(CssValueContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssNumericValueContext extends CssValueContext {
		public TerminalNode CSS_NUMBER() { return getToken(LanguageParser.CSS_NUMBER, 0); }
		public TerminalNode CSS_UNIT() { return getToken(LanguageParser.CSS_UNIT, 0); }
		public CssNumericValueContext(CssValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageParserListener ) ((LanguageParserListener)listener).enterCssNumericValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageParserListener ) ((LanguageParserListener)listener).exitCssNumericValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageParserVisitor ) return ((LanguageParserVisitor<? extends T>)visitor).visitCssNumericValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssStringValueContext extends CssValueContext {
		public TerminalNode CSS_STRING() { return getToken(LanguageParser.CSS_STRING, 0); }
		public CssStringValueContext(CssValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageParserListener ) ((LanguageParserListener)listener).enterCssStringValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageParserListener ) ((LanguageParserListener)listener).exitCssStringValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageParserVisitor ) return ((LanguageParserVisitor<? extends T>)visitor).visitCssStringValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssIdentifierValueContext extends CssValueContext {
		public List<TerminalNode> CSS_IDENTIFIER() { return getTokens(LanguageParser.CSS_IDENTIFIER); }
		public TerminalNode CSS_IDENTIFIER(int i) {
			return getToken(LanguageParser.CSS_IDENTIFIER, i);
		}
		public CssIdentifierValueContext(CssValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageParserListener ) ((LanguageParserListener)listener).enterCssIdentifierValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageParserListener ) ((LanguageParserListener)listener).exitCssIdentifierValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageParserVisitor ) return ((LanguageParserVisitor<? extends T>)visitor).visitCssIdentifierValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssUrlValueContext extends CssValueContext {
		public TerminalNode CSS_URL() { return getToken(LanguageParser.CSS_URL, 0); }
		public CssUrlValueContext(CssValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageParserListener ) ((LanguageParserListener)listener).enterCssUrlValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageParserListener ) ((LanguageParserListener)listener).exitCssUrlValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageParserVisitor ) return ((LanguageParserVisitor<? extends T>)visitor).visitCssUrlValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssColorValueContext extends CssValueContext {
		public TerminalNode CSS_COLOR() { return getToken(LanguageParser.CSS_COLOR, 0); }
		public CssColorValueContext(CssValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageParserListener ) ((LanguageParserListener)listener).enterCssColorValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageParserListener ) ((LanguageParserListener)listener).exitCssColorValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageParserVisitor ) return ((LanguageParserVisitor<? extends T>)visitor).visitCssColorValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssValueContext cssValue() throws RecognitionException {
		CssValueContext _localctx = new CssValueContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_cssValue);
		int _la;
		try {
			setState(132);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CSS_NUMBER:
				_localctx = new CssNumericValueContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(120);
				match(CSS_NUMBER);
				setState(122);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CSS_UNIT) {
					{
					setState(121);
					match(CSS_UNIT);
					}
				}

				}
				}
				break;
			case CSS_COLOR:
				_localctx = new CssColorValueContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(124);
				match(CSS_COLOR);
				}
				break;
			case CSS_URL:
				_localctx = new CssUrlValueContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(125);
				match(CSS_URL);
				}
				break;
			case CSS_STRING:
				_localctx = new CssStringValueContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(126);
				match(CSS_STRING);
				}
				break;
			case CSS_IDENTIFIER:
				_localctx = new CssIdentifierValueContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(128); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(127);
					match(CSS_IDENTIFIER);
					}
					}
					setState(130); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==CSS_IDENTIFIER );
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ScriptBlockContext extends ParserRuleContext {
		public TerminalNode SCRIPT_OPEN() { return getToken(LanguageParser.SCRIPT_OPEN, 0); }
		public TerminalNode SCRIPT_CLOSE() { return getToken(LanguageParser.SCRIPT_CLOSE, 0); }
		public ScriptBodyContext scriptBody() {
			return getRuleContext(ScriptBodyContext.class,0);
		}
		public ScriptBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scriptBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageParserListener ) ((LanguageParserListener)listener).enterScriptBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageParserListener ) ((LanguageParserListener)listener).exitScriptBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageParserVisitor ) return ((LanguageParserVisitor<? extends T>)visitor).visitScriptBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScriptBlockContext scriptBlock() throws RecognitionException {
		ScriptBlockContext _localctx = new ScriptBlockContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_scriptBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			match(SCRIPT_OPEN);
			setState(136);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(135);
				scriptBody();
				}
				break;
			}
			setState(138);
			match(SCRIPT_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ScriptBodyContext extends ParserRuleContext {
		public List<TerminalNode> SCRIPT_TEXT() { return getTokens(LanguageParser.SCRIPT_TEXT); }
		public TerminalNode SCRIPT_TEXT(int i) {
			return getToken(LanguageParser.SCRIPT_TEXT, i);
		}
		public ScriptBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scriptBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageParserListener ) ((LanguageParserListener)listener).enterScriptBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageParserListener ) ((LanguageParserListener)listener).exitScriptBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageParserVisitor ) return ((LanguageParserVisitor<? extends T>)visitor).visitScriptBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScriptBodyContext scriptBody() throws RecognitionException {
		ScriptBodyContext _localctx = new ScriptBodyContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_scriptBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SCRIPT_TEXT) {
				{
				{
				setState(140);
				match(SCRIPT_TEXT);
				}
				}
				setState(145);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class JinjaNodeContext extends ParserRuleContext {
		public JinjaExpressionContext jinjaExpression() {
			return getRuleContext(JinjaExpressionContext.class,0);
		}
		public JinjaStatementContext jinjaStatement() {
			return getRuleContext(JinjaStatementContext.class,0);
		}
		public JinjaNodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinjaNode; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageParserListener ) ((LanguageParserListener)listener).enterJinjaNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageParserListener ) ((LanguageParserListener)listener).exitJinjaNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageParserVisitor ) return ((LanguageParserVisitor<? extends T>)visitor).visitJinjaNode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JinjaNodeContext jinjaNode() throws RecognitionException {
		JinjaNodeContext _localctx = new JinjaNodeContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_jinjaNode);
		try {
			setState(148);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case JINJA_EXPR_START:
				enterOuterAlt(_localctx, 1);
				{
				setState(146);
				jinjaExpression();
				}
				break;
			case JINJA_STMT_START:
				enterOuterAlt(_localctx, 2);
				{
				setState(147);
				jinjaStatement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class JinjaExpressionContext extends ParserRuleContext {
		public TerminalNode JINJA_EXPR_START() { return getToken(LanguageParser.JINJA_EXPR_START, 0); }
		public TerminalNode JINJA_EXPR_END() { return getToken(LanguageParser.JINJA_EXPR_END, 0); }
		public JinjaExprBodyContext jinjaExprBody() {
			return getRuleContext(JinjaExprBodyContext.class,0);
		}
		public JinjaExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinjaExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageParserListener ) ((LanguageParserListener)listener).enterJinjaExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageParserListener ) ((LanguageParserListener)listener).exitJinjaExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageParserVisitor ) return ((LanguageParserVisitor<? extends T>)visitor).visitJinjaExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JinjaExpressionContext jinjaExpression() throws RecognitionException {
		JinjaExpressionContext _localctx = new JinjaExpressionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_jinjaExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			match(JINJA_EXPR_START);
			setState(152);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(151);
				jinjaExprBody();
				}
				break;
			}
			setState(154);
			match(JINJA_EXPR_END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class JinjaExprBodyContext extends ParserRuleContext {
		public List<TerminalNode> JINJA_ID() { return getTokens(LanguageParser.JINJA_ID); }
		public TerminalNode JINJA_ID(int i) {
			return getToken(LanguageParser.JINJA_ID, i);
		}
		public List<TerminalNode> JINJA_INT() { return getTokens(LanguageParser.JINJA_INT); }
		public TerminalNode JINJA_INT(int i) {
			return getToken(LanguageParser.JINJA_INT, i);
		}
		public List<TerminalNode> JINJA_FLOAT() { return getTokens(LanguageParser.JINJA_FLOAT); }
		public TerminalNode JINJA_FLOAT(int i) {
			return getToken(LanguageParser.JINJA_FLOAT, i);
		}
		public List<TerminalNode> JINJA_STRING() { return getTokens(LanguageParser.JINJA_STRING); }
		public TerminalNode JINJA_STRING(int i) {
			return getToken(LanguageParser.JINJA_STRING, i);
		}
		public List<TerminalNode> JINJA_ARITH_OP() { return getTokens(LanguageParser.JINJA_ARITH_OP); }
		public TerminalNode JINJA_ARITH_OP(int i) {
			return getToken(LanguageParser.JINJA_ARITH_OP, i);
		}
		public List<TerminalNode> JINJA_COMP_OP() { return getTokens(LanguageParser.JINJA_COMP_OP); }
		public TerminalNode JINJA_COMP_OP(int i) {
			return getToken(LanguageParser.JINJA_COMP_OP, i);
		}
		public List<TerminalNode> JINJA_BOOL_OP() { return getTokens(LanguageParser.JINJA_BOOL_OP); }
		public TerminalNode JINJA_BOOL_OP(int i) {
			return getToken(LanguageParser.JINJA_BOOL_OP, i);
		}
		public List<TerminalNode> JINJA_LPAREN() { return getTokens(LanguageParser.JINJA_LPAREN); }
		public TerminalNode JINJA_LPAREN(int i) {
			return getToken(LanguageParser.JINJA_LPAREN, i);
		}
		public List<TerminalNode> JINJA_RPAREN() { return getTokens(LanguageParser.JINJA_RPAREN); }
		public TerminalNode JINJA_RPAREN(int i) {
			return getToken(LanguageParser.JINJA_RPAREN, i);
		}
		public List<TerminalNode> JINJA_COMMA() { return getTokens(LanguageParser.JINJA_COMMA); }
		public TerminalNode JINJA_COMMA(int i) {
			return getToken(LanguageParser.JINJA_COMMA, i);
		}
		public List<TerminalNode> JINJA_DOT() { return getTokens(LanguageParser.JINJA_DOT); }
		public TerminalNode JINJA_DOT(int i) {
			return getToken(LanguageParser.JINJA_DOT, i);
		}
		public JinjaExprBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinjaExprBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageParserListener ) ((LanguageParserListener)listener).enterJinjaExprBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageParserListener ) ((LanguageParserListener)listener).exitJinjaExprBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageParserVisitor ) return ((LanguageParserVisitor<? extends T>)visitor).visitJinjaExprBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JinjaExprBodyContext jinjaExprBody() throws RecognitionException {
		JinjaExprBodyContext _localctx = new JinjaExprBodyContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_jinjaExprBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 140668768878592L) != 0)) {
				{
				{
				setState(156);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 140668768878592L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(161);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class JinjaStatementContext extends ParserRuleContext {
		public TerminalNode JINJA_STMT_START() { return getToken(LanguageParser.JINJA_STMT_START, 0); }
		public JinjaStmtBodyContext jinjaStmtBody() {
			return getRuleContext(JinjaStmtBodyContext.class,0);
		}
		public TerminalNode JINJA_STMT_END() { return getToken(LanguageParser.JINJA_STMT_END, 0); }
		public JinjaStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinjaStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageParserListener ) ((LanguageParserListener)listener).enterJinjaStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageParserListener ) ((LanguageParserListener)listener).exitJinjaStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageParserVisitor ) return ((LanguageParserVisitor<? extends T>)visitor).visitJinjaStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JinjaStatementContext jinjaStatement() throws RecognitionException {
		JinjaStatementContext _localctx = new JinjaStatementContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_jinjaStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			match(JINJA_STMT_START);
			setState(163);
			jinjaStmtBody();
			setState(164);
			match(JINJA_STMT_END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class JinjaStmtBodyContext extends ParserRuleContext {
		public List<TerminalNode> JINJA_IF() { return getTokens(LanguageParser.JINJA_IF); }
		public TerminalNode JINJA_IF(int i) {
			return getToken(LanguageParser.JINJA_IF, i);
		}
		public List<TerminalNode> JINJA_ELSE() { return getTokens(LanguageParser.JINJA_ELSE); }
		public TerminalNode JINJA_ELSE(int i) {
			return getToken(LanguageParser.JINJA_ELSE, i);
		}
		public List<TerminalNode> JINJA_FOR() { return getTokens(LanguageParser.JINJA_FOR); }
		public TerminalNode JINJA_FOR(int i) {
			return getToken(LanguageParser.JINJA_FOR, i);
		}
		public List<TerminalNode> JINJA_IN() { return getTokens(LanguageParser.JINJA_IN); }
		public TerminalNode JINJA_IN(int i) {
			return getToken(LanguageParser.JINJA_IN, i);
		}
		public List<TerminalNode> JINJA_STMT_ID() { return getTokens(LanguageParser.JINJA_STMT_ID); }
		public TerminalNode JINJA_STMT_ID(int i) {
			return getToken(LanguageParser.JINJA_STMT_ID, i);
		}
		public List<TerminalNode> JINJA_STMT_INT() { return getTokens(LanguageParser.JINJA_STMT_INT); }
		public TerminalNode JINJA_STMT_INT(int i) {
			return getToken(LanguageParser.JINJA_STMT_INT, i);
		}
		public List<TerminalNode> JINJA_STMT_STRING() { return getTokens(LanguageParser.JINJA_STMT_STRING); }
		public TerminalNode JINJA_STMT_STRING(int i) {
			return getToken(LanguageParser.JINJA_STMT_STRING, i);
		}
		public List<TerminalNode> JINJA_OP() { return getTokens(LanguageParser.JINJA_OP); }
		public TerminalNode JINJA_OP(int i) {
			return getToken(LanguageParser.JINJA_OP, i);
		}
		public JinjaStmtBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinjaStmtBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageParserListener ) ((LanguageParserListener)listener).enterJinjaStmtBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageParserListener ) ((LanguageParserListener)listener).exitJinjaStmtBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageParserVisitor ) return ((LanguageParserVisitor<? extends T>)visitor).visitJinjaStmtBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JinjaStmtBodyContext jinjaStmtBody() throws RecognitionException {
		JinjaStmtBodyContext _localctx = new JinjaStmtBodyContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_jinjaStmtBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 143552238122434560L) != 0)) {
				{
				{
				setState(166);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 143552238122434560L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(171);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u00019\u00ad\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0001\u0000\u0005\u0000"+
		"2\b\u0000\n\u0000\f\u00005\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0003\u0001;\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0003\u0002B\b\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0003\u0005J\b\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b"+
		"\u0005\u000bZ\b\u000b\n\u000b\f\u000b]\t\u000b\u0001\f\u0001\f\u0005\f"+
		"a\b\f\n\f\f\fd\t\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0005\rk\b"+
		"\r\n\r\f\rn\t\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0003"+
		"\u0010{\b\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0004"+
		"\u0010\u0081\b\u0010\u000b\u0010\f\u0010\u0082\u0003\u0010\u0085\b\u0010"+
		"\u0001\u0011\u0001\u0011\u0003\u0011\u0089\b\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0012\u0005\u0012\u008e\b\u0012\n\u0012\f\u0012\u0091\t\u0012\u0001"+
		"\u0013\u0001\u0013\u0003\u0013\u0095\b\u0013\u0001\u0014\u0001\u0014\u0003"+
		"\u0014\u0099\b\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0005\u0015\u009e"+
		"\b\u0015\n\u0015\f\u0015\u00a1\t\u0015\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0017\u0005\u0017\u00a8\b\u0017\n\u0017\f\u0017\u00ab"+
		"\t\u0017\u0001\u0017\u0000\u0000\u0018\u0000\u0002\u0004\u0006\b\n\f\u000e"+
		"\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.\u0000\u0003"+
		"\u0001\u0000\u0012\u0014\u0001\u0000$.\u0001\u000018\u00ab\u00003\u0001"+
		"\u0000\u0000\u0000\u0002:\u0001\u0000\u0000\u0000\u0004A\u0001\u0000\u0000"+
		"\u0000\u0006C\u0001\u0000\u0000\u0000\bE\u0001\u0000\u0000\u0000\nI\u0001"+
		"\u0000\u0000\u0000\fK\u0001\u0000\u0000\u0000\u000eO\u0001\u0000\u0000"+
		"\u0000\u0010Q\u0001\u0000\u0000\u0000\u0012S\u0001\u0000\u0000\u0000\u0014"+
		"U\u0001\u0000\u0000\u0000\u0016[\u0001\u0000\u0000\u0000\u0018^\u0001"+
		"\u0000\u0000\u0000\u001ag\u0001\u0000\u0000\u0000\u001cq\u0001\u0000\u0000"+
		"\u0000\u001es\u0001\u0000\u0000\u0000 \u0084\u0001\u0000\u0000\u0000\""+
		"\u0086\u0001\u0000\u0000\u0000$\u008f\u0001\u0000\u0000\u0000&\u0094\u0001"+
		"\u0000\u0000\u0000(\u0096\u0001\u0000\u0000\u0000*\u009f\u0001\u0000\u0000"+
		"\u0000,\u00a2\u0001\u0000\u0000\u0000.\u00a9\u0001\u0000\u0000\u00000"+
		"2\u0003\u0002\u0001\u000010\u0001\u0000\u0000\u000025\u0001\u0000\u0000"+
		"\u000031\u0001\u0000\u0000\u000034\u0001\u0000\u0000\u000046\u0001\u0000"+
		"\u0000\u000053\u0001\u0000\u0000\u000067\u0005\u0000\u0000\u00017\u0001"+
		"\u0001\u0000\u0000\u00008;\u0003\u0004\u0002\u00009;\u0003&\u0013\u0000"+
		":8\u0001\u0000\u0000\u0000:9\u0001\u0000\u0000\u0000;\u0003\u0001\u0000"+
		"\u0000\u0000<B\u0003\u0006\u0003\u0000=B\u0003\n\u0005\u0000>B\u0003\u0018"+
		"\f\u0000?B\u0003\"\u0011\u0000@B\u0003\b\u0004\u0000A<\u0001\u0000\u0000"+
		"\u0000A=\u0001\u0000\u0000\u0000A>\u0001\u0000\u0000\u0000A?\u0001\u0000"+
		"\u0000\u0000A@\u0001\u0000\u0000\u0000B\u0005\u0001\u0000\u0000\u0000"+
		"CD\u0005\u0001\u0000\u0000D\u0007\u0001\u0000\u0000\u0000EF\u0005\u000b"+
		"\u0000\u0000F\t\u0001\u0000\u0000\u0000GJ\u0003\f\u0006\u0000HJ\u0003"+
		"\u000e\u0007\u0000IG\u0001\u0000\u0000\u0000IH\u0001\u0000\u0000\u0000"+
		"J\u000b\u0001\u0000\u0000\u0000KL\u0003\u0010\b\u0000LM\u0003\u0016\u000b"+
		"\u0000MN\u0003\u0012\t\u0000N\r\u0001\u0000\u0000\u0000OP\u0003\u0014"+
		"\n\u0000P\u000f\u0001\u0000\u0000\u0000QR\u0005\b\u0000\u0000R\u0011\u0001"+
		"\u0000\u0000\u0000ST\u0005\n\u0000\u0000T\u0013\u0001\u0000\u0000\u0000"+
		"UV\u0005\t\u0000\u0000V\u0015\u0001\u0000\u0000\u0000WZ\u0003\u0004\u0002"+
		"\u0000XZ\u0003&\u0013\u0000YW\u0001\u0000\u0000\u0000YX\u0001\u0000\u0000"+
		"\u0000Z]\u0001\u0000\u0000\u0000[Y\u0001\u0000\u0000\u0000[\\\u0001\u0000"+
		"\u0000\u0000\\\u0017\u0001\u0000\u0000\u0000][\u0001\u0000\u0000\u0000"+
		"^b\u0005\u0003\u0000\u0000_a\u0003\u001a\r\u0000`_\u0001\u0000\u0000\u0000"+
		"ad\u0001\u0000\u0000\u0000b`\u0001\u0000\u0000\u0000bc\u0001\u0000\u0000"+
		"\u0000ce\u0001\u0000\u0000\u0000db\u0001\u0000\u0000\u0000ef\u0005\u0010"+
		"\u0000\u0000f\u0019\u0001\u0000\u0000\u0000gh\u0003\u001c\u000e\u0000"+
		"hl\u0005\u0015\u0000\u0000ik\u0003\u001e\u000f\u0000ji\u0001\u0000\u0000"+
		"\u0000kn\u0001\u0000\u0000\u0000lj\u0001\u0000\u0000\u0000lm\u0001\u0000"+
		"\u0000\u0000mo\u0001\u0000\u0000\u0000nl\u0001\u0000\u0000\u0000op\u0005"+
		"\u0016\u0000\u0000p\u001b\u0001\u0000\u0000\u0000qr\u0007\u0000\u0000"+
		"\u0000r\u001d\u0001\u0000\u0000\u0000st\u0005\u001f\u0000\u0000tu\u0005"+
		"\u0017\u0000\u0000uv\u0003 \u0010\u0000vw\u0005\u0018\u0000\u0000w\u001f"+
		"\u0001\u0000\u0000\u0000xz\u0005\u001a\u0000\u0000y{\u0005\u001b\u0000"+
		"\u0000zy\u0001\u0000\u0000\u0000z{\u0001\u0000\u0000\u0000{\u0085\u0001"+
		"\u0000\u0000\u0000|\u0085\u0005\u001c\u0000\u0000}\u0085\u0005\u001d\u0000"+
		"\u0000~\u0085\u0005\u001e\u0000\u0000\u007f\u0081\u0005\u001f\u0000\u0000"+
		"\u0080\u007f\u0001\u0000\u0000\u0000\u0081\u0082\u0001\u0000\u0000\u0000"+
		"\u0082\u0080\u0001\u0000\u0000\u0000\u0082\u0083\u0001\u0000\u0000\u0000"+
		"\u0083\u0085\u0001\u0000\u0000\u0000\u0084x\u0001\u0000\u0000\u0000\u0084"+
		"|\u0001\u0000\u0000\u0000\u0084}\u0001\u0000\u0000\u0000\u0084~\u0001"+
		"\u0000\u0000\u0000\u0084\u0080\u0001\u0000\u0000\u0000\u0085!\u0001\u0000"+
		"\u0000\u0000\u0086\u0088\u0005\u0004\u0000\u0000\u0087\u0089\u0003$\u0012"+
		"\u0000\u0088\u0087\u0001\u0000\u0000\u0000\u0088\u0089\u0001\u0000\u0000"+
		"\u0000\u0089\u008a\u0001\u0000\u0000\u0000\u008a\u008b\u0005!\u0000\u0000"+
		"\u008b#\u0001\u0000\u0000\u0000\u008c\u008e\u0005\"\u0000\u0000\u008d"+
		"\u008c\u0001\u0000\u0000\u0000\u008e\u0091\u0001\u0000\u0000\u0000\u008f"+
		"\u008d\u0001\u0000\u0000\u0000\u008f\u0090\u0001\u0000\u0000\u0000\u0090"+
		"%\u0001\u0000\u0000\u0000\u0091\u008f\u0001\u0000\u0000\u0000\u0092\u0095"+
		"\u0003(\u0014\u0000\u0093\u0095\u0003,\u0016\u0000\u0094\u0092\u0001\u0000"+
		"\u0000\u0000\u0094\u0093\u0001\u0000\u0000\u0000\u0095\'\u0001\u0000\u0000"+
		"\u0000\u0096\u0098\u0005\u0005\u0000\u0000\u0097\u0099\u0003*\u0015\u0000"+
		"\u0098\u0097\u0001\u0000\u0000\u0000\u0098\u0099\u0001\u0000\u0000\u0000"+
		"\u0099\u009a\u0001\u0000\u0000\u0000\u009a\u009b\u0005#\u0000\u0000\u009b"+
		")\u0001\u0000\u0000\u0000\u009c\u009e\u0007\u0001\u0000\u0000\u009d\u009c"+
		"\u0001\u0000\u0000\u0000\u009e\u00a1\u0001\u0000\u0000\u0000\u009f\u009d"+
		"\u0001\u0000\u0000\u0000\u009f\u00a0\u0001\u0000\u0000\u0000\u00a0+\u0001"+
		"\u0000\u0000\u0000\u00a1\u009f\u0001\u0000\u0000\u0000\u00a2\u00a3\u0005"+
		"\u0006\u0000\u0000\u00a3\u00a4\u0003.\u0017\u0000\u00a4\u00a5\u00050\u0000"+
		"\u0000\u00a5-\u0001\u0000\u0000\u0000\u00a6\u00a8\u0007\u0002\u0000\u0000"+
		"\u00a7\u00a6\u0001\u0000\u0000\u0000\u00a8\u00ab\u0001\u0000\u0000\u0000"+
		"\u00a9\u00a7\u0001\u0000\u0000\u0000\u00a9\u00aa\u0001\u0000\u0000\u0000"+
		"\u00aa/\u0001\u0000\u0000\u0000\u00ab\u00a9\u0001\u0000\u0000\u0000\u0011"+
		"3:AIY[blz\u0082\u0084\u0088\u008f\u0094\u0098\u009f\u00a9";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}