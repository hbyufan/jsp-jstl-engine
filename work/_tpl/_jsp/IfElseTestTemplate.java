/*
 * $RCSfile: IfElseTestTemplate.java,v $$
 * $Revision: 1.1 $
 * $Date: 2017-02-09 $
 *
 * Copyright (C) 2008 Skin, Inc. All rights reserved.
 *
 * This software is the proprietary information of Skin, Inc.
 * Use is subject to license terms.
 *
 * home: E:/WorkSpace/ayada/webapp
 * path: /ifElseTest.jsp
 * lastModified: 2016-01-20 13:52:54 000
 * options: -fastJstl true
 * template.dependencies
 * -- /ifElseTest.jsp
 *
 * JSP generated by JspCompiler-1.0.1.4 (built 2017-02-09 00:51:31 481)
 */
package _tpl._jsp;

import java.io.Writer;
import com.skin.ayada.runtime.ExpressionContext;
import com.skin.ayada.runtime.JspWriter;
import com.skin.ayada.runtime.PageContext;
import com.skin.ayada.tagext.BodyContent;
import com.skin.ayada.tagext.BodyTag;
import com.skin.ayada.tagext.IterationTag;
import com.skin.ayada.tagext.JspFragment;
import com.skin.ayada.tagext.Tag;
import com.skin.ayada.template.JspTemplate;
import com.skin.ayada.util.ExpressionUtil;


/**
 * <p>Title: IfElseTestTemplate</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2006</p>
 * @author JspCompiler
 * @version 1.0
 */
@SuppressWarnings("unused")
public class IfElseTestTemplate extends JspTemplate {
    /**
     * @param args
     */
    public static void main(String[] args){
        java.io.StringWriter writer = new java.io.StringWriter();
        PageContext pageContext = com.skin.ayada.runtime.JspFactory.getPageContext(writer);
        IfElseTestTemplate template = new IfElseTestTemplate();

        try {
            template.execute(pageContext);
            System.out.println(writer.toString());
        }
        catch(Throwable throwable) {
            throwable.printStackTrace();
        }
    }

    /**
     * @param pageContext
     * @throws Throwable
     */
    @Override
    @SuppressWarnings("unchecked")
    public void _execute(final PageContext pageContext) throws Throwable {
        JspWriter out = pageContext.getOut();
        JspWriter jspWriter = pageContext.getOut();
        ExpressionContext expressionContext = pageContext.getExpressionContext();
        // NODE START: lineNumber: 1, offset: 0, length: 2, tagClassName: com.skin.ayada.jstl.core.SetTag, tagInstanceName: _jsp_SetTag_1
        // <c:set var=\"var1\" value=\"2\"/>
        pageContext.setAttribute("var1", 2);
        // jsp.jstl.core.SetTag END
        // NODE END: lineNumber: 1, tagClassName: com.skin.ayada.jstl.core.SetTag, tagInstanceName: _jsp_SetTag_1

        // NODE START: lineNumber: 2, offset: 2, length: 2, tagClassName: com.skin.ayada.jstl.core.SetTag, tagInstanceName: _jsp_SetTag_3
        // <c:set var=\"var2\" value=\"5\"/>
        pageContext.setAttribute("var2", 5);
        // jsp.jstl.core.SetTag END
        // NODE END: lineNumber: 2, tagClassName: com.skin.ayada.jstl.core.SetTag, tagInstanceName: _jsp_SetTag_3

        // NODE START: lineNumber: 3, offset: 4, length: 12, tagClassName: com.skin.ayada.jstl.ext.IfTag, tagInstanceName: _jsp_IfTag_5
        // <s:if test=\"${var1 == 1}\">...</s:if>
        com.skin.ayada.jstl.ext.IfTag _jsp_IfTag_5 = new com.skin.ayada.jstl.ext.IfTag();
        try {
            _jsp_IfTag_5.setPageContext(pageContext);
            _jsp_IfTag_5.setParent((Tag)null);
            _jsp_IfTag_5.setTest(ExpressionUtil.getBoolean(expressionContext, "${var1 == 1}"));
            int _jsp_start_flag_5 = _jsp_IfTag_5.doStartTag();

            if(_jsp_start_flag_5 == Tag.SKIP_PAGE) {
                return;
            }
            if(_jsp_start_flag_5 != Tag.SKIP_BODY) {
                int _jsp_flag_5 = 0;

                do {
                // TEXT: lineNumber: 3
                // out.write("    <h1>var1 == 1</h1>\r\n");
                out.write(_jsp_string_6, 0, _jsp_string_6.length);

                // NODE START: lineNumber: 5, offset: 6, length: 3, tagClassName: com.skin.ayada.jstl.ext.IfTag, tagInstanceName: _jsp_IfTag_7
                // <s:if test=\"${var2 == 1}\">...</s:if>
                com.skin.ayada.jstl.ext.IfTag _jsp_IfTag_7 = new com.skin.ayada.jstl.ext.IfTag();
                try {
                    _jsp_IfTag_7.setPageContext(pageContext);
                    _jsp_IfTag_7.setParent(_jsp_IfTag_5);
                    _jsp_IfTag_7.setTest(ExpressionUtil.getBoolean(expressionContext, "${var2 == 1}"));
                    int _jsp_start_flag_7 = _jsp_IfTag_7.doStartTag();

                    if(_jsp_start_flag_7 == Tag.SKIP_PAGE) {
                        return;
                    }
                    if(_jsp_start_flag_7 != Tag.SKIP_BODY) {
                        int _jsp_flag_7 = 0;

                        do {
                        // TEXT: lineNumber: 5
                        // out.write("        <h1>var2 == 1</h1>\r\n");
                        out.write(_jsp_string_8, 0, _jsp_string_8.length);
                            _jsp_flag_7 = _jsp_IfTag_7.doAfterBody();
                        }
                        while(_jsp_flag_7 == IterationTag.EVAL_BODY_AGAIN);
                    }
                    _jsp_IfTag_7.doEndTag();
                }
                finally {
                    this.doFinally(_jsp_IfTag_7);
                }
                // NODE END: lineNumber: 5, tagClassName: com.skin.ayada.jstl.ext.IfTag, tagInstanceName: _jsp_IfTag_7

                // NODE START: lineNumber: 8, offset: 9, length: 3, tagClassName: com.skin.ayada.jstl.ext.ElseIfTag, tagInstanceName: _jsp_ElseIfTag_10
                // <s:elseif test=\"${var2 == 2}\">...</s:elseif>
                com.skin.ayada.jstl.ext.ElseIfTag _jsp_ElseIfTag_10 = new com.skin.ayada.jstl.ext.ElseIfTag();
                try {
                    _jsp_ElseIfTag_10.setPageContext(pageContext);
                    _jsp_ElseIfTag_10.setParent(_jsp_IfTag_5);
                    _jsp_ElseIfTag_10.setTest(ExpressionUtil.getBoolean(expressionContext, "${var2 == 2}"));
                    int _jsp_start_flag_10 = _jsp_ElseIfTag_10.doStartTag();

                    if(_jsp_start_flag_10 == Tag.SKIP_PAGE) {
                        return;
                    }
                    if(_jsp_start_flag_10 != Tag.SKIP_BODY) {
                        int _jsp_flag_10 = 0;

                        do {
                        // TEXT: lineNumber: 8
                        // out.write("        <h1>var2 == 2</h1>\r\n");
                        out.write(_jsp_string_11, 0, _jsp_string_11.length);
                            _jsp_flag_10 = _jsp_ElseIfTag_10.doAfterBody();
                        }
                        while(_jsp_flag_10 == IterationTag.EVAL_BODY_AGAIN);
                    }
                    _jsp_ElseIfTag_10.doEndTag();
                }
                finally {
                    this.doFinally(_jsp_ElseIfTag_10);
                }
                // NODE END: lineNumber: 8, tagClassName: com.skin.ayada.jstl.ext.ElseIfTag, tagInstanceName: _jsp_ElseIfTag_10

                // NODE START: lineNumber: 11, offset: 12, length: 3, tagClassName: com.skin.ayada.jstl.ext.ElseTag, tagInstanceName: _jsp_ElseTag_13
                // <s:else>...</s:else>
                com.skin.ayada.jstl.ext.ElseTag _jsp_ElseTag_13 = new com.skin.ayada.jstl.ext.ElseTag();
                try {
                    _jsp_ElseTag_13.setPageContext(pageContext);
                    _jsp_ElseTag_13.setParent(_jsp_IfTag_5);
                    int _jsp_start_flag_13 = _jsp_ElseTag_13.doStartTag();

                    if(_jsp_start_flag_13 == Tag.SKIP_PAGE) {
                        return;
                    }
                    if(_jsp_start_flag_13 != Tag.SKIP_BODY) {
                        int _jsp_flag_13 = 0;

                        do {
                        // TEXT: lineNumber: 11
                        // out.write("        <h1>var2 == ?</h1>\r\n");
                        out.write(_jsp_string_14, 0, _jsp_string_14.length);
                            _jsp_flag_13 = _jsp_ElseTag_13.doAfterBody();
                        }
                        while(_jsp_flag_13 == IterationTag.EVAL_BODY_AGAIN);
                    }
                    _jsp_ElseTag_13.doEndTag();
                }
                finally {
                    this.doFinally(_jsp_ElseTag_13);
                }
                // NODE END: lineNumber: 11, tagClassName: com.skin.ayada.jstl.ext.ElseTag, tagInstanceName: _jsp_ElseTag_13

                    _jsp_flag_5 = _jsp_IfTag_5.doAfterBody();
                }
                while(_jsp_flag_5 == IterationTag.EVAL_BODY_AGAIN);
            }
            _jsp_IfTag_5.doEndTag();
        }
        finally {
            this.doFinally(_jsp_IfTag_5);
        }
        // NODE END: lineNumber: 3, tagClassName: com.skin.ayada.jstl.ext.IfTag, tagInstanceName: _jsp_IfTag_5

        // TEXT: lineNumber: 14
        // out.write("## 11111\r\n");
        out.write(_jsp_string_17, 0, _jsp_string_17.length);

        // NODE START: lineNumber: 16, offset: 17, length: 12, tagClassName: com.skin.ayada.jstl.ext.ElseIfTag, tagInstanceName: _jsp_ElseIfTag_18
        // <s:elseif test=\"${var1 == 2}\">...</s:elseif>
        com.skin.ayada.jstl.ext.ElseIfTag _jsp_ElseIfTag_18 = new com.skin.ayada.jstl.ext.ElseIfTag();
        try {
            _jsp_ElseIfTag_18.setPageContext(pageContext);
            _jsp_ElseIfTag_18.setParent((Tag)null);
            _jsp_ElseIfTag_18.setTest(ExpressionUtil.getBoolean(expressionContext, "${var1 == 2}"));
            int _jsp_start_flag_18 = _jsp_ElseIfTag_18.doStartTag();

            if(_jsp_start_flag_18 == Tag.SKIP_PAGE) {
                return;
            }
            if(_jsp_start_flag_18 != Tag.SKIP_BODY) {
                int _jsp_flag_18 = 0;

                do {
                // TEXT: lineNumber: 16
                // out.write("    <h1>var1 == 2</h1>\r\n");
                out.write(_jsp_string_19, 0, _jsp_string_19.length);

                // NODE START: lineNumber: 18, offset: 19, length: 3, tagClassName: com.skin.ayada.jstl.ext.IfTag, tagInstanceName: _jsp_IfTag_20
                // <s:if test=\"${var2 == 1}\">...</s:if>
                com.skin.ayada.jstl.ext.IfTag _jsp_IfTag_20 = new com.skin.ayada.jstl.ext.IfTag();
                try {
                    _jsp_IfTag_20.setPageContext(pageContext);
                    _jsp_IfTag_20.setParent(_jsp_ElseIfTag_18);
                    _jsp_IfTag_20.setTest(ExpressionUtil.getBoolean(expressionContext, "${var2 == 1}"));
                    int _jsp_start_flag_20 = _jsp_IfTag_20.doStartTag();

                    if(_jsp_start_flag_20 == Tag.SKIP_PAGE) {
                        return;
                    }
                    if(_jsp_start_flag_20 != Tag.SKIP_BODY) {
                        int _jsp_flag_20 = 0;

                        do {
                        // TEXT: lineNumber: 18
                        // out.write("        <h1>var2 == 1</h1>\r\n");
                        out.write(_jsp_string_21, 0, _jsp_string_21.length);
                            _jsp_flag_20 = _jsp_IfTag_20.doAfterBody();
                        }
                        while(_jsp_flag_20 == IterationTag.EVAL_BODY_AGAIN);
                    }
                    _jsp_IfTag_20.doEndTag();
                }
                finally {
                    this.doFinally(_jsp_IfTag_20);
                }
                // NODE END: lineNumber: 18, tagClassName: com.skin.ayada.jstl.ext.IfTag, tagInstanceName: _jsp_IfTag_20

                // NODE START: lineNumber: 21, offset: 22, length: 3, tagClassName: com.skin.ayada.jstl.ext.ElseIfTag, tagInstanceName: _jsp_ElseIfTag_23
                // <s:elseif test=\"${var2 == 2}\">...</s:elseif>
                com.skin.ayada.jstl.ext.ElseIfTag _jsp_ElseIfTag_23 = new com.skin.ayada.jstl.ext.ElseIfTag();
                try {
                    _jsp_ElseIfTag_23.setPageContext(pageContext);
                    _jsp_ElseIfTag_23.setParent(_jsp_ElseIfTag_18);
                    _jsp_ElseIfTag_23.setTest(ExpressionUtil.getBoolean(expressionContext, "${var2 == 2}"));
                    int _jsp_start_flag_23 = _jsp_ElseIfTag_23.doStartTag();

                    if(_jsp_start_flag_23 == Tag.SKIP_PAGE) {
                        return;
                    }
                    if(_jsp_start_flag_23 != Tag.SKIP_BODY) {
                        int _jsp_flag_23 = 0;

                        do {
                        // TEXT: lineNumber: 21
                        // out.write("        <h1>var2 == 2</h1>\r\n");
                        out.write(_jsp_string_24, 0, _jsp_string_24.length);
                            _jsp_flag_23 = _jsp_ElseIfTag_23.doAfterBody();
                        }
                        while(_jsp_flag_23 == IterationTag.EVAL_BODY_AGAIN);
                    }
                    _jsp_ElseIfTag_23.doEndTag();
                }
                finally {
                    this.doFinally(_jsp_ElseIfTag_23);
                }
                // NODE END: lineNumber: 21, tagClassName: com.skin.ayada.jstl.ext.ElseIfTag, tagInstanceName: _jsp_ElseIfTag_23

                // NODE START: lineNumber: 24, offset: 25, length: 3, tagClassName: com.skin.ayada.jstl.ext.ElseTag, tagInstanceName: _jsp_ElseTag_26
                // <s:else>...</s:else>
                com.skin.ayada.jstl.ext.ElseTag _jsp_ElseTag_26 = new com.skin.ayada.jstl.ext.ElseTag();
                try {
                    _jsp_ElseTag_26.setPageContext(pageContext);
                    _jsp_ElseTag_26.setParent(_jsp_ElseIfTag_18);
                    int _jsp_start_flag_26 = _jsp_ElseTag_26.doStartTag();

                    if(_jsp_start_flag_26 == Tag.SKIP_PAGE) {
                        return;
                    }
                    if(_jsp_start_flag_26 != Tag.SKIP_BODY) {
                        int _jsp_flag_26 = 0;

                        do {
                        // TEXT: lineNumber: 24
                        // out.write("        <h1>var2 == ?</h1>\r\n");
                        out.write(_jsp_string_27, 0, _jsp_string_27.length);
                            _jsp_flag_26 = _jsp_ElseTag_26.doAfterBody();
                        }
                        while(_jsp_flag_26 == IterationTag.EVAL_BODY_AGAIN);
                    }
                    _jsp_ElseTag_26.doEndTag();
                }
                finally {
                    this.doFinally(_jsp_ElseTag_26);
                }
                // NODE END: lineNumber: 24, tagClassName: com.skin.ayada.jstl.ext.ElseTag, tagInstanceName: _jsp_ElseTag_26

                    _jsp_flag_18 = _jsp_ElseIfTag_18.doAfterBody();
                }
                while(_jsp_flag_18 == IterationTag.EVAL_BODY_AGAIN);
            }
            _jsp_ElseIfTag_18.doEndTag();
        }
        finally {
            this.doFinally(_jsp_ElseIfTag_18);
        }
        // NODE END: lineNumber: 16, tagClassName: com.skin.ayada.jstl.ext.ElseIfTag, tagInstanceName: _jsp_ElseIfTag_18

        // TEXT: lineNumber: 27
        // out.write("## 22222\r\n");
        out.write(_jsp_string_30, 0, _jsp_string_30.length);

        // NODE START: lineNumber: 29, offset: 30, length: 12, tagClassName: com.skin.ayada.jstl.ext.ElseTag, tagInstanceName: _jsp_ElseTag_31
        // <s:else>...</s:else>
        com.skin.ayada.jstl.ext.ElseTag _jsp_ElseTag_31 = new com.skin.ayada.jstl.ext.ElseTag();
        try {
            _jsp_ElseTag_31.setPageContext(pageContext);
            _jsp_ElseTag_31.setParent((Tag)null);
            int _jsp_start_flag_31 = _jsp_ElseTag_31.doStartTag();

            if(_jsp_start_flag_31 == Tag.SKIP_PAGE) {
                return;
            }
            if(_jsp_start_flag_31 != Tag.SKIP_BODY) {
                int _jsp_flag_31 = 0;

                do {
                // TEXT: lineNumber: 29
                // out.write("    <h1>var1 == ?</h1>\r\n");
                out.write(_jsp_string_32, 0, _jsp_string_32.length);

                // NODE START: lineNumber: 31, offset: 32, length: 3, tagClassName: com.skin.ayada.jstl.ext.IfTag, tagInstanceName: _jsp_IfTag_33
                // <s:if test=\"${var2 == 1}\">...</s:if>
                com.skin.ayada.jstl.ext.IfTag _jsp_IfTag_33 = new com.skin.ayada.jstl.ext.IfTag();
                try {
                    _jsp_IfTag_33.setPageContext(pageContext);
                    _jsp_IfTag_33.setParent(_jsp_ElseTag_31);
                    _jsp_IfTag_33.setTest(ExpressionUtil.getBoolean(expressionContext, "${var2 == 1}"));
                    int _jsp_start_flag_33 = _jsp_IfTag_33.doStartTag();

                    if(_jsp_start_flag_33 == Tag.SKIP_PAGE) {
                        return;
                    }
                    if(_jsp_start_flag_33 != Tag.SKIP_BODY) {
                        int _jsp_flag_33 = 0;

                        do {
                        // TEXT: lineNumber: 31
                        // out.write("        <h1>var2 == 1</h1>\r\n");
                        out.write(_jsp_string_34, 0, _jsp_string_34.length);
                            _jsp_flag_33 = _jsp_IfTag_33.doAfterBody();
                        }
                        while(_jsp_flag_33 == IterationTag.EVAL_BODY_AGAIN);
                    }
                    _jsp_IfTag_33.doEndTag();
                }
                finally {
                    this.doFinally(_jsp_IfTag_33);
                }
                // NODE END: lineNumber: 31, tagClassName: com.skin.ayada.jstl.ext.IfTag, tagInstanceName: _jsp_IfTag_33

                // NODE START: lineNumber: 34, offset: 35, length: 3, tagClassName: com.skin.ayada.jstl.ext.ElseIfTag, tagInstanceName: _jsp_ElseIfTag_36
                // <s:elseif test=\"${var2 == 2}\">...</s:elseif>
                com.skin.ayada.jstl.ext.ElseIfTag _jsp_ElseIfTag_36 = new com.skin.ayada.jstl.ext.ElseIfTag();
                try {
                    _jsp_ElseIfTag_36.setPageContext(pageContext);
                    _jsp_ElseIfTag_36.setParent(_jsp_ElseTag_31);
                    _jsp_ElseIfTag_36.setTest(ExpressionUtil.getBoolean(expressionContext, "${var2 == 2}"));
                    int _jsp_start_flag_36 = _jsp_ElseIfTag_36.doStartTag();

                    if(_jsp_start_flag_36 == Tag.SKIP_PAGE) {
                        return;
                    }
                    if(_jsp_start_flag_36 != Tag.SKIP_BODY) {
                        int _jsp_flag_36 = 0;

                        do {
                        // TEXT: lineNumber: 34
                        // out.write("        <h1>var2 == 2</h1>\r\n");
                        out.write(_jsp_string_37, 0, _jsp_string_37.length);
                            _jsp_flag_36 = _jsp_ElseIfTag_36.doAfterBody();
                        }
                        while(_jsp_flag_36 == IterationTag.EVAL_BODY_AGAIN);
                    }
                    _jsp_ElseIfTag_36.doEndTag();
                }
                finally {
                    this.doFinally(_jsp_ElseIfTag_36);
                }
                // NODE END: lineNumber: 34, tagClassName: com.skin.ayada.jstl.ext.ElseIfTag, tagInstanceName: _jsp_ElseIfTag_36

                // NODE START: lineNumber: 37, offset: 38, length: 3, tagClassName: com.skin.ayada.jstl.ext.ElseTag, tagInstanceName: _jsp_ElseTag_39
                // <s:else>...</s:else>
                com.skin.ayada.jstl.ext.ElseTag _jsp_ElseTag_39 = new com.skin.ayada.jstl.ext.ElseTag();
                try {
                    _jsp_ElseTag_39.setPageContext(pageContext);
                    _jsp_ElseTag_39.setParent(_jsp_ElseTag_31);
                    int _jsp_start_flag_39 = _jsp_ElseTag_39.doStartTag();

                    if(_jsp_start_flag_39 == Tag.SKIP_PAGE) {
                        return;
                    }
                    if(_jsp_start_flag_39 != Tag.SKIP_BODY) {
                        int _jsp_flag_39 = 0;

                        do {
                        // TEXT: lineNumber: 37
                        // out.write("        <h1>var2 == ?</h1>\r\n");
                        out.write(_jsp_string_40, 0, _jsp_string_40.length);
                            _jsp_flag_39 = _jsp_ElseTag_39.doAfterBody();
                        }
                        while(_jsp_flag_39 == IterationTag.EVAL_BODY_AGAIN);
                    }
                    _jsp_ElseTag_39.doEndTag();
                }
                finally {
                    this.doFinally(_jsp_ElseTag_39);
                }
                // NODE END: lineNumber: 37, tagClassName: com.skin.ayada.jstl.ext.ElseTag, tagInstanceName: _jsp_ElseTag_39

                    _jsp_flag_31 = _jsp_ElseTag_31.doAfterBody();
                }
                while(_jsp_flag_31 == IterationTag.EVAL_BODY_AGAIN);
            }
            _jsp_ElseTag_31.doEndTag();
        }
        finally {
            this.doFinally(_jsp_ElseTag_31);
        }
        // NODE END: lineNumber: 29, tagClassName: com.skin.ayada.jstl.ext.ElseTag, tagInstanceName: _jsp_ElseTag_31

        // TEXT: lineNumber: 40
        // out.write("\r\n\r\n    <s:if test=\"${1 == 1}\">\r\n        # 1\r\n    <s:elseif test=\"${1 == 1}\">\r\n        # 2\r\n    <s:elseif test=\"${1 == 1}\">\r\n        # 3\r\n    <s:else>\r\n        # 4\r\n    </s:if>\r\n\r\n\r\n");
        out.write(_jsp_string_43, 0, _jsp_string_43.length);

        out.flush();
        jspWriter.flush();
    }

    protected static final char[] _jsp_string_6 = "    <h1>var1 == 1</h1>\r\n".toCharArray();
    protected static final char[] _jsp_string_8 = "        <h1>var2 == 1</h1>\r\n".toCharArray();
    protected static final char[] _jsp_string_11 = "        <h1>var2 == 2</h1>\r\n".toCharArray();
    protected static final char[] _jsp_string_14 = "        <h1>var2 == ?</h1>\r\n".toCharArray();
    protected static final char[] _jsp_string_17 = "## 11111\r\n".toCharArray();
    protected static final char[] _jsp_string_19 = "    <h1>var1 == 2</h1>\r\n".toCharArray();
    protected static final char[] _jsp_string_21 = "        <h1>var2 == 1</h1>\r\n".toCharArray();
    protected static final char[] _jsp_string_24 = "        <h1>var2 == 2</h1>\r\n".toCharArray();
    protected static final char[] _jsp_string_27 = "        <h1>var2 == ?</h1>\r\n".toCharArray();
    protected static final char[] _jsp_string_30 = "## 22222\r\n".toCharArray();
    protected static final char[] _jsp_string_32 = "    <h1>var1 == ?</h1>\r\n".toCharArray();
    protected static final char[] _jsp_string_34 = "        <h1>var2 == 1</h1>\r\n".toCharArray();
    protected static final char[] _jsp_string_37 = "        <h1>var2 == 2</h1>\r\n".toCharArray();
    protected static final char[] _jsp_string_40 = "        <h1>var2 == ?</h1>\r\n".toCharArray();
    protected static final char[] _jsp_string_43 = "\r\n\r\n    <s:if test=\"${1 == 1}\">\r\n        # 1\r\n    <s:elseif test=\"${1 == 1}\">\r\n        # 2\r\n    <s:elseif test=\"${1 == 1}\">\r\n        # 3\r\n    <s:else>\r\n        # 4\r\n    </s:if>\r\n\r\n\r\n".toCharArray();

}
