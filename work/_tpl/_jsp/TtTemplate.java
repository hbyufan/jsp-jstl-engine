/*
 * $RCSfile: TtTemplate.java,v $$
 * $Revision: 1.1 $
 * $Date: 2017-02-09 $
 *
 * Copyright (C) 2008 Skin, Inc. All rights reserved.
 *
 * This software is the proprietary information of Skin, Inc.
 * Use is subject to license terms.
 *
 * home: E:/WorkSpace/ayada/webapp
 * path: /tt.jsp
 * lastModified: 2015-12-31 13:59:52 000
 * options: -fastJstl true
 * template.dependencies
 * -- /tt.jsp
 *
 * JSP generated by JspCompiler-1.0.1.4 (built 2017-02-09 00:51:42 712)
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
 * <p>Title: TtTemplate</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2006</p>
 * @author JspCompiler
 * @version 1.0
 */
@SuppressWarnings("unused")
public class TtTemplate extends JspTemplate {
    /**
     * @param args
     */
    public static void main(String[] args){
        java.io.StringWriter writer = new java.io.StringWriter();
        PageContext pageContext = com.skin.ayada.runtime.JspFactory.getPageContext(writer);
        TtTemplate template = new TtTemplate();

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
        // out.write("<!-- t:taglib prefix=\"d\" uri=\"http://localhost/ayada-taglib-default\"/ -->\r\n");
        out.write(_jsp_string_1, 0, _jsp_string_1.length);

        // NODE START: lineNumber: 3, offset: 1, length: 2, tagClassName: com.skin.ayada.jstl.core.CommentTag, tagInstanceName: _jsp_CommentTag_2
        // <c:comment>...</c:comment>
        if(com.skin.ayada.jstl.core.ContinueTag.getTrue()) {
        } // jsp.jstl.core.CommentTag END
        // NODE END: lineNumber: 3, tagClassName: com.skin.ayada.jstl.core.CommentTag, tagInstanceName: _jsp_CommentTag_2

        // TEXT: lineNumber: 3
        // out.write("\r\n");
        out.write(_jsp_string_4, 0, _jsp_string_4.length);

        // NODE START: lineNumber: 5, offset: 4, length: 2, tagClassName: com.skin.ayada.jstl.core.IfTag, tagInstanceName: _jsp_IfTag_5
        // <d:if test=\"${1 == 1}\">...</d:if>
        if(ExpressionUtil.getBoolean(expressionContext, "${1 == 1}")) {
        } // jsp.jstl.core.IfTag END
        // NODE END: lineNumber: 5, tagClassName: com.skin.ayada.jstl.core.IfTag, tagInstanceName: _jsp_IfTag_5

        // TEXT: lineNumber: 9
        // out.write("\r\n");
        out.write(_jsp_string_7, 0, _jsp_string_7.length);

        out.flush();
        jspWriter.flush();
    }

    protected static final char[] _jsp_string_1 = "<!-- t:taglib prefix=\"d\" uri=\"http://localhost/ayada-taglib-default\"/ -->\r\n".toCharArray();
    protected static final char[] _jsp_string_4 = "\r\n".toCharArray();
    protected static final char[] _jsp_string_7 = "\r\n".toCharArray();

}
