/*
 * $RCSfile: BodycontentTestTemplate.java,v $$
 * $Revision: 1.1 $
 * $Date: 2017-02-09 $
 *
 * Copyright (C) 2008 Skin, Inc. All rights reserved.
 *
 * This software is the proprietary information of Skin, Inc.
 * Use is subject to license terms.
 *
 * home: E:/WorkSpace/ayada/webapp
 * path: /bodycontentTest.jsp
 * lastModified: 2013-11-28 18:09:44 000
 * options: -fastJstl true
 * template.dependencies
 * -- /bodycontentTest.jsp
 *
 * JSP generated by JspCompiler-1.0.1.4 (built 2017-02-09 00:51:26 650)
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
 * <p>Title: BodycontentTestTemplate</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2006</p>
 * @author JspCompiler
 * @version 1.0
 */
@SuppressWarnings("unused")
public class BodycontentTestTemplate extends JspTemplate {
    /**
     * @param args
     */
    public static void main(String[] args){
        java.io.StringWriter writer = new java.io.StringWriter();
        PageContext pageContext = com.skin.ayada.runtime.JspFactory.getPageContext(writer);
        BodycontentTestTemplate template = new BodycontentTestTemplate();

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
        // jsp:directive.page: lineNumber: 1
        // <jsp:directive.page contentType="text/html;charset=UTF-8"/>

        // NODE START: lineNumber: 2, offset: 2, length: 6, tagClassName: com.skin.ayada.jstl.core.MapTag, tagInstanceName: _jsp_MapTag_3
        // <c:map name=\"user\">...</c:map>
        com.skin.ayada.jstl.core.MapTag _jsp_MapTag_3 = new com.skin.ayada.jstl.core.MapTag();
        try {
            _jsp_MapTag_3.setPageContext(pageContext);
            _jsp_MapTag_3.setParent((Tag)null);
            _jsp_MapTag_3.setDynamicAttribute("name", "user");
            int _jsp_start_flag_3 = _jsp_MapTag_3.doStartTag();

            if(_jsp_start_flag_3 == Tag.SKIP_PAGE) {
                return;
            }
            if(_jsp_start_flag_3 != Tag.SKIP_BODY) {
                int _jsp_flag_3 = 0;

                do {
                // NODE START: lineNumber: 3, offset: 3, length: 2, tagClassName: com.skin.ayada.jstl.core.AttributeTag, tagInstanceName: _jsp_AttributeTag_4
                // <c:entry name=\"userName\" value=\"ayada\"/>
                _jsp_MapTag_3.setAttribute("userName", "ayada");
                // jsp.jstl.core.AttributeTag END
                // NODE END: lineNumber: 3, tagClassName: com.skin.ayada.jstl.core.AttributeTag, tagInstanceName: _jsp_AttributeTag_4

                // NODE START: lineNumber: 4, offset: 5, length: 2, tagClassName: com.skin.ayada.jstl.core.AttributeTag, tagInstanceName: _jsp_AttributeTag_6
                // <c:entry name=\"nickName\" value=\"ayada\"/>
                _jsp_MapTag_3.setAttribute("nickName", "ayada");
                // jsp.jstl.core.AttributeTag END
                // NODE END: lineNumber: 4, tagClassName: com.skin.ayada.jstl.core.AttributeTag, tagInstanceName: _jsp_AttributeTag_6

                    _jsp_flag_3 = _jsp_MapTag_3.doAfterBody();
                }
                while(_jsp_flag_3 == IterationTag.EVAL_BODY_AGAIN);
            }
            _jsp_MapTag_3.doEndTag();
        }
        finally {
            this.doFinally(_jsp_MapTag_3);
        }
        // NODE END: lineNumber: 2, tagClassName: com.skin.ayada.jstl.core.MapTag, tagInstanceName: _jsp_MapTag_3

        // TEXT: lineNumber: 5
        // out.write("<html>\r\n<head>\r\n<title>test</title>\r\n</head>\r\n<body version=\"1.0\">\r\n<p>");
        out.write(_jsp_string_9, 0, _jsp_string_9.length);

        // NODE START: lineNumber: 11, offset: 9, length: 2, tagClassName: com.skin.ayada.jstl.core.OutTag, tagInstanceName: _jsp_OutTag_10
        // <c:out value=\"${user.userName}\">...</c:out>
        com.skin.ayada.jstl.core.OutTag.write(out, ExpressionUtil.evaluate(expressionContext, "${user.userName}", null), false);
        // out.print(ExpressionUtil.getString(expressionContext, "${user.userName}"));
        // jsp.jstl.core.OutTag END
        // NODE END: lineNumber: 11, tagClassName: com.skin.ayada.jstl.core.OutTag, tagInstanceName: _jsp_OutTag_10

        // TEXT: lineNumber: 11
        // out.write("</p>\r\n<p>");
        out.write(_jsp_string_12, 0, _jsp_string_12.length);

        // NODE START: lineNumber: 12, offset: 12, length: 5, tagClassName: com.skin.ayada.jstl.core.OutTag, tagInstanceName: _jsp_OutTag_13
        // <c:out>...</c:out>
        out = pageContext.pushBody();
        // TEXT: lineNumber: 12
        // out.write("<span>");
        out.write(_jsp_string_14, 0, _jsp_string_14.length);
        // EXPRESSION: lineNumber: 12
        expressionContext.print(out, expressionContext.getString("user.userName"));
        // TEXT: lineNumber: 12
        // out.write("</span>");
        out.write(_jsp_string_16, 0, _jsp_string_16.length);
        pageContext.print((BodyContent)out, false);
        out = pageContext.popBody();
        // jsp.jstl.core.OutTag END
        // NODE END: lineNumber: 12, tagClassName: com.skin.ayada.jstl.core.OutTag, tagInstanceName: _jsp_OutTag_13

        // TEXT: lineNumber: 12
        // out.write("</p>\r\n<p>");
        out.write(_jsp_string_18, 0, _jsp_string_18.length);

        // NODE START: lineNumber: 13, offset: 18, length: 5, tagClassName: com.skin.ayada.jstl.core.OutTag, tagInstanceName: _jsp_OutTag_19
        // <c:out escapeXml=\"true\">...</c:out>
        out = pageContext.pushBody();
        // TEXT: lineNumber: 13
        // out.write("<span>");
        out.write(_jsp_string_20, 0, _jsp_string_20.length);
        // EXPRESSION: lineNumber: 13
        expressionContext.print(out, expressionContext.getString("user.userName"));
        // TEXT: lineNumber: 13
        // out.write("</span>");
        out.write(_jsp_string_22, 0, _jsp_string_22.length);
        pageContext.print((BodyContent)out, true);
        out = pageContext.popBody();
        // jsp.jstl.core.OutTag END
        // NODE END: lineNumber: 13, tagClassName: com.skin.ayada.jstl.core.OutTag, tagInstanceName: _jsp_OutTag_19

        // TEXT: lineNumber: 13
        // out.write("</p>\r\n</body>\r\n</html>");
        out.write(_jsp_string_24, 0, _jsp_string_24.length);

        out.flush();
        jspWriter.flush();
    }

    protected static final char[] _jsp_string_9 = "<html>\r\n<head>\r\n<title>test</title>\r\n</head>\r\n<body version=\"1.0\">\r\n<p>".toCharArray();
    protected static final char[] _jsp_string_12 = "</p>\r\n<p>".toCharArray();
    protected static final char[] _jsp_string_14 = "<span>".toCharArray();
    protected static final char[] _jsp_string_16 = "</span>".toCharArray();
    protected static final char[] _jsp_string_18 = "</p>\r\n<p>".toCharArray();
    protected static final char[] _jsp_string_20 = "<span>".toCharArray();
    protected static final char[] _jsp_string_22 = "</span>".toCharArray();
    protected static final char[] _jsp_string_24 = "</p>\r\n</body>\r\n</html>".toCharArray();

}
