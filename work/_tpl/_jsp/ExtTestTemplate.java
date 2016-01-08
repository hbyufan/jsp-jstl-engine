/*
 * $RCSfile: ExtTestTemplate.java,v $$
 * $Revision: 1.1 $
 * $Date: 2016-01-08 $
 *
 * Copyright (C) 2008 Skin, Inc. All rights reserved.
 *
 * This software is the proprietary information of Skin, Inc.
 * Use is subject to license terms.
 *
 * home: E:/WorkSpace/ayada/webapp
 * path: /extTest.log
 * lastModified: 2014-06-12 14:10:04 000
 * options: -fastJstl true
 * JSP generated by JspCompiler-1.0.1.2 (built 2016-01-08 22:06:49 730)
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
 * <p>Title: ExtTestTemplate</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2006</p>
 * @author JspCompiler
 * @version 1.0
 */
@SuppressWarnings("unused")
public class ExtTestTemplate extends JspTemplate {
    public static void main(String[] args){
        java.io.StringWriter writer = new java.io.StringWriter();
        PageContext pageContext = com.skin.ayada.runtime.JspFactory.getPageContext(writer);
        ExtTestTemplate template = new ExtTestTemplate();

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
        // out.write("<p>3 - Hello World!</p><p>#########################</p>\r\n<p>---------------- com.skin.ayada.jstl.core.TestTag ----------------</p>\r\n<p>myBoolean: false</p>\r\n<p>myChar: c</p>\r\n<p>myByte: 2</p>\r\n<p>myShort: 0</p>\r\n<p>myInt: 0</p>\r\n<p>myFloat: 0.0</p>\r\n<p>myDouble: 0.0</p>\r\n<p>myLong: 0</p>\r\n<p>myString: null</p>\r\n<p>---------------- com.skin.ayada.jstl.core.TestTag ----------------</p>\r\n<p>myBoolean: false</p>\r\n<p>myChar: \\0</p>\r\n<p>myByte: 0</p>\r\n<p>myShort: 0</p>\r\n<p>myInt: 0</p>\r\n<p>myFloat: 0.0</p>\r\n<p>myDouble: 0.0</p>\r\n<p>myLong: 1200</p>\r\n<p>myString: Hello</p>\r\n<p>---------------- com.skin.ayada.jstl.core.TestTag ----------------</p>\r\n<p>myBoolean: true</p>\r\n<p>myChar: c</p>\r\n<p>myByte: 1</p>\r\n<p>myShort: 0</p>\r\n<p>myInt: -1</p>\r\n<p>myFloat: 1.2</p>\r\n<p>myDouble: 2.3</p>\r\n<p>myLong: 5</p>\r\n<p>myString: Hello</p>\r\n[1, 2, 3, 4]\r\n<p>\r\n{1=test1, 2=test2, 3=test3}\r\n</p>\r\n<p>---------------- com.skin.ayada.jstl.core.TestTag ----------------</p>\r\n<p>myBoolean: false</p>\r\n<p>myChar: \\0</p>\r\n<p>myByte: 0</p>\r\n<p>myShort: 0</p>\r\n<p>myInt: 0</p>\r\n<p>myFloat: 0.0</p>\r\n<p>myDouble: 0.0</p>\r\n<p>myLong: 0</p>\r\n<p>myString: null</p>\r\n\r\n        \r\n            \r\n        \r\n            \r\n        \r\n            \r\n        \r\n            \r\n        \r\n            userList: [{userName=test_1, nickName=test_1}, {userName=test_ 2, nickName=test_ 2}, {userName=test_ 3, nickName=test_ 3}, {userName=test_ 4, nickName=test_ 4}, {userName=test_ 5, nickName=test_ 5}]\r\n\r\n        \r\n            \r\n        \r\n            \r\n        \r\n            \r\n        \r\n            \r\n        \r\n            userList: [{userName=test_1, nickName=test_1}, {userName=test_ 2, nickName=test_ 2}, {userName=test_ 3, nickName=test_ 3}, {userName=test_ 4, nickName=test_ 4}, {userName=test_ 5, nickName=test_ 5}, {userName=1_test_1}, {userName= 2_test_ 2}, {userName= 3_test_ 3}, {userName= 4_test_ 4}, {userName= 5_test_ 5}]\r\n");
        out.write(_jsp_string_1, 0, _jsp_string_1.length);

        out.flush();
        jspWriter.flush();
    }

    public static final char[] _jsp_string_1 = "<p>3 - Hello World!</p><p>#########################</p>\r\n<p>---------------- com.skin.ayada.jstl.core.TestTag ----------------</p>\r\n<p>myBoolean: false</p>\r\n<p>myChar: c</p>\r\n<p>myByte: 2</p>\r\n<p>myShort: 0</p>\r\n<p>myInt: 0</p>\r\n<p>myFloat: 0.0</p>\r\n<p>myDouble: 0.0</p>\r\n<p>myLong: 0</p>\r\n<p>myString: null</p>\r\n<p>---------------- com.skin.ayada.jstl.core.TestTag ----------------</p>\r\n<p>myBoolean: false</p>\r\n<p>myChar: \\0</p>\r\n<p>myByte: 0</p>\r\n<p>myShort: 0</p>\r\n<p>myInt: 0</p>\r\n<p>myFloat: 0.0</p>\r\n<p>myDouble: 0.0</p>\r\n<p>myLong: 1200</p>\r\n<p>myString: Hello</p>\r\n<p>---------------- com.skin.ayada.jstl.core.TestTag ----------------</p>\r\n<p>myBoolean: true</p>\r\n<p>myChar: c</p>\r\n<p>myByte: 1</p>\r\n<p>myShort: 0</p>\r\n<p>myInt: -1</p>\r\n<p>myFloat: 1.2</p>\r\n<p>myDouble: 2.3</p>\r\n<p>myLong: 5</p>\r\n<p>myString: Hello</p>\r\n[1, 2, 3, 4]\r\n<p>\r\n{1=test1, 2=test2, 3=test3}\r\n</p>\r\n<p>---------------- com.skin.ayada.jstl.core.TestTag ----------------</p>\r\n<p>myBoolean: false</p>\r\n<p>myChar: \\0</p>\r\n<p>myByte: 0</p>\r\n<p>myShort: 0</p>\r\n<p>myInt: 0</p>\r\n<p>myFloat: 0.0</p>\r\n<p>myDouble: 0.0</p>\r\n<p>myLong: 0</p>\r\n<p>myString: null</p>\r\n\r\n        \r\n            \r\n        \r\n            \r\n        \r\n            \r\n        \r\n            \r\n        \r\n            userList: [{userName=test_1, nickName=test_1}, {userName=test_ 2, nickName=test_ 2}, {userName=test_ 3, nickName=test_ 3}, {userName=test_ 4, nickName=test_ 4}, {userName=test_ 5, nickName=test_ 5}]\r\n\r\n        \r\n            \r\n        \r\n            \r\n        \r\n            \r\n        \r\n            \r\n        \r\n            userList: [{userName=test_1, nickName=test_1}, {userName=test_ 2, nickName=test_ 2}, {userName=test_ 3, nickName=test_ 3}, {userName=test_ 4, nickName=test_ 4}, {userName=test_ 5, nickName=test_ 5}, {userName=1_test_1}, {userName= 2_test_ 2}, {userName= 3_test_ 3}, {userName= 4_test_ 4}, {userName= 5_test_ 5}]\r\n".toCharArray();

}
