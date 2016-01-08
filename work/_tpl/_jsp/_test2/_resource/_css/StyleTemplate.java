/*
 * $RCSfile: StyleTemplate.java,v $$
 * $Revision: 1.1 $
 * $Date: 2016-01-08 $
 *
 * Copyright (C) 2008 Skin, Inc. All rights reserved.
 *
 * This software is the proprietary information of Skin, Inc.
 * Use is subject to license terms.
 *
 * home: E:/WorkSpace/ayada/webapp
 * path: /test2/resource/css/style.css
 * lastModified: 2013-09-05 17:59:32 000
 * options: -fastJstl true
 * JSP generated by JspCompiler-1.0.1.2 (built 2016-01-08 22:06:57 835)
 */
package _tpl._jsp._test2._resource._css;

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
 * <p>Title: StyleTemplate</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2006</p>
 * @author JspCompiler
 * @version 1.0
 */
@SuppressWarnings("unused")
public class StyleTemplate extends JspTemplate {
    public static void main(String[] args){
        java.io.StringWriter writer = new java.io.StringWriter();
        PageContext pageContext = com.skin.ayada.runtime.JspFactory.getPageContext(writer);
        StyleTemplate template = new StyleTemplate();

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
        // out.write("body{font-size: 14px;}\r\ntable{\r\n    width: 100%;\r\n    border-spacing: 0px 0px;\r\n    border-collapse: collapse;\r\n    background-color: #ffffff;\r\n}\r\n\r\ntable, table td, table th{\r\n    border: 1px #cdcdcd solid;\r\n    border-collapse: collapse;\r\n}\r\n\r\ntable tr td{padding-left: 4px;}\r\n\r\ntable.highlight tr.old{\r\n    background-color: #ffffff;\r\n}\r\n\r\ntable.highlight tr.even{\r\n    background-color: #f9f9f9;\r\n}\r\n\r\ntable.highlight tr.hover{\r\n    background-color: #e8f5fe;\r\n}\r\n\r\ntable.highlight tr.clicked{\r\n    background-color: #ffffdd;\r\n}");
        out.write(_jsp_string_1, 0, _jsp_string_1.length);

        out.flush();
        jspWriter.flush();
    }

    public static final char[] _jsp_string_1 = "body{font-size: 14px;}\r\ntable{\r\n    width: 100%;\r\n    border-spacing: 0px 0px;\r\n    border-collapse: collapse;\r\n    background-color: #ffffff;\r\n}\r\n\r\ntable, table td, table th{\r\n    border: 1px #cdcdcd solid;\r\n    border-collapse: collapse;\r\n}\r\n\r\ntable tr td{padding-left: 4px;}\r\n\r\ntable.highlight tr.old{\r\n    background-color: #ffffff;\r\n}\r\n\r\ntable.highlight tr.even{\r\n    background-color: #f9f9f9;\r\n}\r\n\r\ntable.highlight tr.hover{\r\n    background-color: #e8f5fe;\r\n}\r\n\r\ntable.highlight tr.clicked{\r\n    background-color: #ffffdd;\r\n}".toCharArray();

}
