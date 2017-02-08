/*
 * $RCSfile: LayoutTest2Template.java,v $$
 * $Revision: 1.1 $
 * $Date: 2017-02-09 $
 *
 * Copyright (C) 2008 Skin, Inc. All rights reserved.
 *
 * This software is the proprietary information of Skin, Inc.
 * Use is subject to license terms.
 *
 * home: E:/WorkSpace/ayada/webapp
 * path: /layoutTest2.jsp
 * lastModified: 2017-02-07 14:47:04 000
 * options: -fastJstl true
 * template.dependencies
 * -- /layoutTest2.jsp
 *
 * JSP generated by JspCompiler-1.0.1.4 (built 2017-02-09 00:51:33 792)
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
 * <p>Title: LayoutTest2Template</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2006</p>
 * @author JspCompiler
 * @version 1.0
 */
@SuppressWarnings("unused")
public class LayoutTest2Template extends JspTemplate {
    /**
     * @param args
     */
    public static void main(String[] args){
        java.io.StringWriter writer = new java.io.StringWriter();
        PageContext pageContext = com.skin.ayada.runtime.JspFactory.getPageContext(writer);
        LayoutTest2Template template = new LayoutTest2Template();

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
        // NODE START: lineNumber: 1, offset: 0, length: 24, tagClassName: com.skin.ayada.taglib.ActionTag, tagInstanceName: _jsp_ActionTag_1
        // <c:invoke page=\"/layout/default.jsp\">...</c:invoke>
        com.skin.ayada.taglib.ActionTag _jsp_ActionTag_1 = new com.skin.ayada.taglib.ActionTag();
        try {
            _jsp_ActionTag_1.setPageContext(pageContext);
            _jsp_ActionTag_1.setParent((Tag)null);
            _jsp_ActionTag_1.setPage("/layout/default.jsp");
            int _jsp_start_flag_1 = _jsp_ActionTag_1.doStartTag();

            if(_jsp_start_flag_1 == Tag.SKIP_PAGE) {
                return;
            }
            if(_jsp_start_flag_1 != Tag.SKIP_BODY) {
                int _jsp_flag_1 = 0;

                do {
                // NODE START: lineNumber: 2, offset: 1, length: 2, tagClassName: com.skin.ayada.jstl.core.AttributeTag, tagInstanceName: _jsp_AttributeTag_2
                // <c:attribute name=\"title\" value=\"base layout test\"/>
                _jsp_ActionTag_1.setAttribute("title", "base layout test");
                // jsp.jstl.core.AttributeTag END
                // NODE END: lineNumber: 2, tagClassName: com.skin.ayada.jstl.core.AttributeTag, tagInstanceName: _jsp_AttributeTag_2

                // NODE START: lineNumber: 3, offset: 3, length: 9, tagClassName: com.skin.ayada.jstl.core.AttributeTag, tagInstanceName: _jsp_AttributeTag_4
                // <c:attribute name=\"header\">...</c:attribute>
                out = pageContext.pushBody();
                // TEXT: lineNumber: 3
                // out.write("        <ul>\r\n");
                out.write(_jsp_string_5, 0, _jsp_string_5.length);

                // NODE START: lineNumber: 5, offset: 5, length: 5, tagClassName: com.skin.ayada.jstl.core.ForEachTag, tagInstanceName: _jsp_ForEachTag_6
                // <c:forEach items=\"1,2,3\" var=\"myInt\">...</c:forEach>
                Object _jsp_old_var_6 = pageContext.getAttribute("myInt");
                com.skin.ayada.jstl.core.ForEachTag _jsp_ForEachTag_6 = new com.skin.ayada.jstl.core.ForEachTag();
                _jsp_ForEachTag_6.setParent((Tag)null);
                _jsp_ForEachTag_6.setPageContext(pageContext);
                _jsp_ForEachTag_6.setVar("myInt");
                _jsp_ForEachTag_6.setItems("1,2,3");
                if(_jsp_ForEachTag_6.doStartTag() != Tag.SKIP_BODY) {
                    while(true) {
                        // TEXT: lineNumber: 5
                        // out.write("                <li>");
                        out.write(_jsp_string_7, 0, _jsp_string_7.length);
                        // VARIABLE: lineNumber: 6
                        expressionContext.print(out, pageContext.getAttribute("myInt"));
                        // TEXT: lineNumber: 6
                        // out.write("</li>\r\n");
                        out.write(_jsp_string_9, 0, _jsp_string_9.length);
                        if(_jsp_ForEachTag_6.doAfterBody() != IterationTag.EVAL_BODY_AGAIN) {
                            break;
                        }
                    }
                }
                _jsp_ForEachTag_6.release();
                pageContext.setAttribute("myInt", _jsp_old_var_6);
                // jsp.jstl.core.ForEachTag END
                // NODE END: lineNumber: 5, tagClassName: com.skin.ayada.jstl.core.ForEachTag, tagInstanceName: _jsp_ForEachTag_6

                // TEXT: lineNumber: 7
                // out.write("        </ul>\r\n");
                out.write(_jsp_string_11, 0, _jsp_string_11.length);
                _jsp_ActionTag_1.setAttribute("header", ((BodyContent)out).getString());
                out = pageContext.popBody();
                // jsp.jstl.core.AttributeTag END
                // NODE END: lineNumber: 3, tagClassName: com.skin.ayada.jstl.core.AttributeTag, tagInstanceName: _jsp_AttributeTag_4

                // NODE START: lineNumber: 10, offset: 12, length: 8, tagClassName: com.skin.ayada.jstl.core.AttributeTag, tagInstanceName: _jsp_AttributeTag_13
                // <c:attribute name=\"body\">...</c:attribute>
                out = pageContext.pushBody();
                // NODE START: lineNumber: 11, offset: 13, length: 2, tagClassName: com.skin.ayada.jstl.core.SetTag, tagInstanceName: _jsp_SetTag_14
                // <c:set var=\"myString\" value=\"${StringUtil.replace(&#39;abc&#39;, &#39;b&#39;, &#39;\\n&#39;)}\"/>
                pageContext.setAttribute("myString", ExpressionUtil.evaluate(expressionContext, "${StringUtil.replace('abc', 'b', '\\n')}", null));
                // jsp.jstl.core.SetTag END
                // NODE END: lineNumber: 11, tagClassName: com.skin.ayada.jstl.core.SetTag, tagInstanceName: _jsp_SetTag_14

                // TEXT: lineNumber: 11
                // out.write("        <p>myString: [");
                out.write(_jsp_string_16, 0, _jsp_string_16.length);

                // NODE START: lineNumber: 12, offset: 16, length: 2, tagClassName: com.skin.ayada.jstl.core.OutTag, tagInstanceName: _jsp_OutTag_17
                // <c:out value=\"${myString}\"/>
                com.skin.ayada.jstl.core.OutTag.write(out, pageContext.getAttribute("myString"), false);
                // out.print(ExpressionUtil.getString(expressionContext, "${myString}"));
                // jsp.jstl.core.OutTag END
                // NODE END: lineNumber: 12, tagClassName: com.skin.ayada.jstl.core.OutTag, tagInstanceName: _jsp_OutTag_17

                // TEXT: lineNumber: 12
                // out.write("]</p>\r\n");
                out.write(_jsp_string_19, 0, _jsp_string_19.length);
                _jsp_ActionTag_1.setAttribute("body", ((BodyContent)out).getString());
                out = pageContext.popBody();
                // jsp.jstl.core.AttributeTag END
                // NODE END: lineNumber: 10, tagClassName: com.skin.ayada.jstl.core.AttributeTag, tagInstanceName: _jsp_AttributeTag_13

                // NODE START: lineNumber: 14, offset: 20, length: 3, tagClassName: com.skin.ayada.jstl.core.AttributeTag, tagInstanceName: _jsp_AttributeTag_21
                // <c:attribute name=\"body\">...</c:attribute>
                out = pageContext.pushBody();
                // TEXT: lineNumber: 14
                // out.write("        <div>copy right</div>\r\n");
                out.write(_jsp_string_22, 0, _jsp_string_22.length);
                _jsp_ActionTag_1.setAttribute("body", ((BodyContent)out).getString());
                out = pageContext.popBody();
                // jsp.jstl.core.AttributeTag END
                // NODE END: lineNumber: 14, tagClassName: com.skin.ayada.jstl.core.AttributeTag, tagInstanceName: _jsp_AttributeTag_21

                    _jsp_flag_1 = _jsp_ActionTag_1.doAfterBody();
                }
                while(_jsp_flag_1 == IterationTag.EVAL_BODY_AGAIN);
            }
            _jsp_ActionTag_1.doEndTag();
        }
        finally {
            this.doFinally(_jsp_ActionTag_1);
        }
        // NODE END: lineNumber: 1, tagClassName: com.skin.ayada.taglib.ActionTag, tagInstanceName: _jsp_ActionTag_1


        out.flush();
        jspWriter.flush();
    }

    protected static final char[] _jsp_string_5 = "        <ul>\r\n".toCharArray();
    protected static final char[] _jsp_string_7 = "                <li>".toCharArray();
    protected static final char[] _jsp_string_9 = "</li>\r\n".toCharArray();
    protected static final char[] _jsp_string_11 = "        </ul>\r\n".toCharArray();
    protected static final char[] _jsp_string_16 = "        <p>myString: [".toCharArray();
    protected static final char[] _jsp_string_19 = "]</p>\r\n".toCharArray();
    protected static final char[] _jsp_string_22 = "        <div>copy right</div>\r\n".toCharArray();

}
