parser grammar LanguageParser;

//Import JsonLexer
options { tokenVocab=LanguageLexer; }

/* =====================================================
 ROOT
 ===================================================== */

template
    : node* EOF
    ;

node
    : htmlNode
    | jinjaNode
    ;

/* =====================================================
 HTML NODES
 ===================================================== */

htmlNode
    : doctype
    | htmlElement
    | styleBlock
    | scriptBlock
    | htmlText
    ;

doctype
    : HTML_DOCTYPE
    ;

htmlText
    : HTML_TEXT
    ;

/* عناصر HTML */

htmlElement
    : normalElement
    | selfClosingElement
    ;

normalElement
    : openTag htmlContent closeTag
    ;

selfClosingElement
    : selfClosingTag
    ;

openTag
    : HTML_TAG_OPEN
    ;

closeTag
    : HTML_TAG_CLOSE
    ;

selfClosingTag
    : HTML_SELF_CLOSE
    ;

htmlContent
    : (htmlNode | jinjaNode)*
    ;

/* =====================================================
 STYLE / CSS
 ===================================================== */

styleBlock
    : STYLE_OPEN cssBlock* CSS_STYLE_CLOSE
    ;

cssBlock
    : cssSelector CSS_LBRACE cssDeclaration* CSS_RBRACE
    ;

cssSelector
    : CSS_ID_SELECTOR
    | CSS_CLASS_SELECTOR
    | CSS_ELEMENT_SELECTOR
    ;

cssDeclaration
    : CSS_IDENTIFIER CSS_COLON cssValue CSS_SEMI
    ;

cssValue
    : (CSS_NUMBER CSS_UNIT?)          # cssNumericValue
    | CSS_COLOR                       # cssColorValue
    | CSS_URL                         # cssUrlValue
    | CSS_STRING                      # cssStringValue
    | CSS_IDENTIFIER+                 # cssIdentifierValue
    ;

/* =====================================================
 SCRIPT BLOCK
 ===================================================== */

scriptBlock
    : SCRIPT_OPEN scriptBody? SCRIPT_CLOSE
    ;

scriptBody
    : SCRIPT_TEXT*
    ;

/* =====================================================
 JINJA2 NODES
 ===================================================== */

jinjaNode
    : jinjaExpression
    | jinjaStatement
    ;

/* {{ ... }} */

jinjaExpression
    : JINJA_EXPR_START jinjaExprBody? JINJA_EXPR_END
    ;

jinjaExprBody
    : (JINJA_ID
      | JINJA_INT
      | JINJA_FLOAT
      | JINJA_STRING
      | JINJA_ARITH_OP
      | JINJA_COMP_OP
      | JINJA_BOOL_OP
      | JINJA_LPAREN
      | JINJA_RPAREN
      | JINJA_COMMA
      | JINJA_DOT
      )*
    ;

/* {% ... %} */

jinjaStatement
    : JINJA_STMT_START jinjaStmtBody JINJA_STMT_END
    ;

jinjaStmtBody
    : (JINJA_IF
      | JINJA_ELSE
      | JINJA_FOR
      | JINJA_IN
      | JINJA_STMT_ID
      | JINJA_STMT_INT
      | JINJA_STMT_STRING
      | JINJA_OP
      )*
    ;
