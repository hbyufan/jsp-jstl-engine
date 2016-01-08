/*
 * $RCSfile: Test2Template.java,v $$
 * $Revision: 1.1 $
 * $Date: 2016-01-08 $
 *
 * Copyright (C) 2008 Skin, Inc. All rights reserved.
 *
 * This software is the proprietary information of Skin, Inc.
 * Use is subject to license terms.
 *
 * home: E:/WorkSpace/ayada/webapp
 * path: /test2.jsp
 * lastModified: 2016-01-08 16:36:40 000
 * options: -fastJstl true
 * JSP generated by JspCompiler-1.0.1.2 (built 2016-01-08 22:06:58 132)
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
 * <p>Title: Test2Template</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2006</p>
 * @author JspCompiler
 * @version 1.0
 */
@SuppressWarnings("unused")
public class Test2Template extends JspTemplate {
    public static void main(String[] args){
        java.io.StringWriter writer = new java.io.StringWriter();
        PageContext pageContext = com.skin.ayada.runtime.JspFactory.getPageContext(writer);
        Test2Template template = new Test2Template();

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
        // TEXT: lineNumber: 1
        // out.write("<html>\r\n<head>\r\n<title>test</title>\r\n<meta http-equiv=\"Content-Type\" content=\"text/html;\"/>\r\n<style type=\"text/css\">\r\nbody{font-size: 10pt; color: #333333;}\r\nthead{ font-weight: bold; background-color: #c8fbaf;}\r\ntd{font-size: 10pt; text-align: center;}\r\n.odd{background-color: #f3defb;}\r\n.even{background-color: #effff8;}\r\n</style>\r\n</head>\r\n<body>\r\n    <h1>test</h1>\r\n    <table>\r\n        <thead>\r\n            <tr>\r\n                <th>test1</th>\r\n                <th>test2</th>\r\n                <th>test3</th>\r\n                <th>test4</th>\r\n                <th>test5</th>\r\n            </tr>\r\n        </thead>\r\n        <tbody>\r\n            ");
        out.write(_jsp_string_1, 0, _jsp_string_1.length);

        // NODE START: lineNumber: 26, offset: 1, length: 22, tagClassName: com.skin.ayada.jstl.core.ForEachTag, tagInstanceName: _jsp_ForEachTag_2
        // <c:forEach items=\"${userList}\" var=\"user\" varStatus=\"status\">...</c:forEach>
        Object _jsp_old_var_2 = pageContext.getAttribute("user");
        Object _jsp_old_var_status_2 = pageContext.getAttribute("status");
        com.skin.ayada.jstl.core.ForEachTag _jsp_ForEachTag_2 = new com.skin.ayada.jstl.core.ForEachTag();
        _jsp_ForEachTag_2.setParent((Tag)null);
        _jsp_ForEachTag_2.setPageContext(pageContext);
        _jsp_ForEachTag_2.setVar("user");
        _jsp_ForEachTag_2.setItems(ExpressionUtil.evaluate(expressionContext, "${userList}", null));
        _jsp_ForEachTag_2.setVarStatus("status");
        if(_jsp_ForEachTag_2.doStartTag() != Tag.SKIP_BODY) {
            while(true) {
                // TEXT: lineNumber: 26
                // out.write("\r\n            <tr ");
                out.write(_jsp_string_3, 0, _jsp_string_3.length);

                // NODE START: lineNumber: 27, offset: 3, length: 2, tagClassName: com.skin.ayada.jstl.core.OutTag, tagInstanceName: _jsp_OutTag_4
                // <c:out value=\"${(status.index &amp; 1) == 1 ? &#39;odd&#39; : &#39;even&#39;}\"/>
                com.skin.ayada.jstl.core.OutTag.write(out, ExpressionUtil.evaluate(expressionContext, "${(status.index & 1) == 1 ? \'odd\' : \'even\'}", null), false);
                // out.print(ExpressionUtil.getString(expressionContext, "${(status.index & 1) == 1 ? \'odd\' : \'even\'}"));
                // jsp.jstl.core.OutTag END
                // NODE END: lineNumber: 27, tagClassName: com.skin.ayada.jstl.core.OutTag, tagInstanceName: _jsp_OutTag_4

                // TEXT: lineNumber: 27
                // out.write(">\r\n                <td>");
                out.write(_jsp_string_6, 0, _jsp_string_6.length);
                // EXPRESSION: lineNumber: 28
                expressionContext.print(out, expressionContext.getString("status.index + 1"));
                // TEXT: lineNumber: 28
                // out.write("</td>\r\n                <td>");
                out.write(_jsp_string_8, 0, _jsp_string_8.length);
                // EXPRESSION: lineNumber: 29
                expressionContext.print(out, expressionContext.getString("model.code"));
                // TEXT: lineNumber: 29
                // out.write("</td>\r\n                <td>");
                out.write(_jsp_string_10, 0, _jsp_string_10.length);
                // EXPRESSION: lineNumber: 30
                expressionContext.print(out, expressionContext.getString("model.name"));
                // TEXT: lineNumber: 30
                // out.write("</td>\r\n                <td>");
                out.write(_jsp_string_12, 0, _jsp_string_12.length);
                // EXPRESSION: lineNumber: 31
                expressionContext.print(out, expressionContext.getString("model.date"));
                // TEXT: lineNumber: 31
                // out.write("</td>\r\n                <td>");
                out.write(_jsp_string_14, 0, _jsp_string_14.length);
                // EXPRESSION: lineNumber: 32
                expressionContext.print(out, expressionContext.getString("model.value"));
                // TEXT: lineNumber: 32
                // out.write("</td>\r\n                <td style=\"color: red\">");
                out.write(_jsp_string_16, 0, _jsp_string_16.length);

                // NODE START: lineNumber: 33, offset: 16, length: 2, tagClassName: com.skin.ayada.jstl.core.IfTag, tagInstanceName: _jsp_IfTag_17
                // <c:if test=\"${model.value &gt; 105.5}\">...</c:if>
                if(ExpressionUtil.getBoolean(expressionContext, "${model.value > 105.5}")) {
                } // jsp.jstl.core.IfTag END
                // NODE END: lineNumber: 33, tagClassName: com.skin.ayada.jstl.core.IfTag, tagInstanceName: _jsp_IfTag_17

                // TEXT: lineNumber: 33
                // out.write("</td>\r\n                <td style=\"color: red\">");
                out.write(_jsp_string_19, 0, _jsp_string_19.length);

                // NODE START: lineNumber: 34, offset: 19, length: 2, tagClassName: com.skin.ayada.jstl.core.IfTag, tagInstanceName: _jsp_IfTag_20
                // <c:if test=\"${model.value &gt; 105.5}\">...</c:if>
                if(ExpressionUtil.getBoolean(expressionContext, "${model.value > 105.5}")) {
                } // jsp.jstl.core.IfTag END
                // NODE END: lineNumber: 34, tagClassName: com.skin.ayada.jstl.core.IfTag, tagInstanceName: _jsp_IfTag_20

                // TEXT: lineNumber: 34
                // out.write("</td>\r\n            </tr>\r\n            ");
                out.write(_jsp_string_22, 0, _jsp_string_22.length);
                if(_jsp_ForEachTag_2.doAfterBody() != IterationTag.EVAL_BODY_AGAIN) {
                    break;
                }
            }
        }
        _jsp_ForEachTag_2.release();
        pageContext.setAttribute("user", _jsp_old_var_2);
        pageContext.setAttribute("status", _jsp_old_var_status_2);
        // jsp.jstl.core.ForEachTag END
        // NODE END: lineNumber: 26, tagClassName: com.skin.ayada.jstl.core.ForEachTag, tagInstanceName: _jsp_ForEachTag_2

        // TEXT: lineNumber: 36
        // out.write("\r\n        </tbody>\r\n    </table>\r\n</body>\r\n</html>\r\n");
        out.write(_jsp_string_24, 0, _jsp_string_24.length);

        out.flush();
        jspWriter.flush();
    }

    public static final char[] _jsp_string_1 = "<html>\r\n<head>\r\n<title>test</title>\r\n<meta http-equiv=\"Content-Type\" content=\"text/html;\"/>\r\n<style type=\"text/css\">\r\nbody{font-size: 10pt; color: #333333;}\r\nthead{ font-weight: bold; background-color: #c8fbaf;}\r\ntd{font-size: 10pt; text-align: center;}\r\n.odd{background-color: #f3defb;}\r\n.even{background-color: #effff8;}\r\n</style>\r\n</head>\r\n<body>\r\n    <h1>test</h1>\r\n    <table>\r\n        <thead>\r\n            <tr>\r\n                <th>test1</th>\r\n                <th>test2</th>\r\n                <th>test3</th>\r\n                <th>test4</th>\r\n                <th>test5</th>\r\n            </tr>\r\n        </thead>\r\n        <tbody>\r\n            ".toCharArray();
    public static final char[] _jsp_string_3 = "\r\n            <tr ".toCharArray();
    public static final char[] _jsp_string_6 = ">\r\n                <td>".toCharArray();
    public static final char[] _jsp_string_8 = "</td>\r\n                <td>".toCharArray();
    public static final char[] _jsp_string_10 = "</td>\r\n                <td>".toCharArray();
    public static final char[] _jsp_string_12 = "</td>\r\n                <td>".toCharArray();
    public static final char[] _jsp_string_14 = "</td>\r\n                <td>".toCharArray();
    public static final char[] _jsp_string_16 = "</td>\r\n                <td style=\"color: red\">".toCharArray();
    public static final char[] _jsp_string_19 = "</td>\r\n                <td style=\"color: red\">".toCharArray();
    public static final char[] _jsp_string_22 = "</td>\r\n            </tr>\r\n            ".toCharArray();
    public static final char[] _jsp_string_24 = "\r\n        </tbody>\r\n    </table>\r\n</body>\r\n</html>\r\n".toCharArray();

}