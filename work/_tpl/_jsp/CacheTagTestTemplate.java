/*
 * $RCSfile: CacheTagTestTemplate.java,v $$
 * $Revision: 1.1 $
 * $Date: 2016-01-14 $
 *
 * Copyright (C) 2008 Skin, Inc. All rights reserved.
 *
 * This software is the proprietary information of Skin, Inc.
 * Use is subject to license terms.
 *
 * home: E:/WorkSpace/ayada/webapp
 * path: /cacheTagTest.jsp
 * lastModified: 2016-01-12 15:37:44 000
 * options: -fastJstl true
 * JSP generated by JspCompiler-1.0.1.2 (built 2016-01-14 23:16:58 875)
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
 * <p>Title: CacheTagTestTemplate</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2006</p>
 * @author JspCompiler
 * @version 1.0
 */
@SuppressWarnings("unused")
public class CacheTagTestTemplate extends JspTemplate {
    public static void main(String[] args){
        java.io.StringWriter writer = new java.io.StringWriter();
        PageContext pageContext = com.skin.ayada.runtime.JspFactory.getPageContext(writer);
        CacheTagTestTemplate template = new CacheTagTestTemplate();

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
        // TEXT: lineNumber: 13
        // out.write("\r\n<h1>CacheTag Test</h1>\r\n");
        out.write(_jsp_string_1, 0, _jsp_string_1.length);

        // NODE START: lineNumber: 15, offset: 1, length: 2, tagClassName: com.skin.ayada.jstl.core.BeanTag, tagInstanceName: _jsp_BeanTag_2
        // <c:bean name=\"cacheClient\" className=\"test.com.skin.ayada.util.CacheClient\"/>
        com.skin.ayada.jstl.core.BeanTag _jsp_BeanTag_2 = new com.skin.ayada.jstl.core.BeanTag();
        _jsp_BeanTag_2.setPageContext(pageContext);
        _jsp_BeanTag_2.setParent((Tag)null);
        _jsp_BeanTag_2.setName("cacheClient");
        _jsp_BeanTag_2.setClassName("test.com.skin.ayada.util.CacheClient");
        int _jsp_start_flag_2 = _jsp_BeanTag_2.doStartTag();

        if(_jsp_start_flag_2 == Tag.SKIP_PAGE) {
            return;
        }
        if(_jsp_start_flag_2 != Tag.SKIP_BODY) {
            _jsp_BeanTag_2.doAfterBody();
        }
        _jsp_BeanTag_2.doEndTag();
        _jsp_BeanTag_2.release();
        // NODE END: lineNumber: 15, tagClassName: com.skin.ayada.jstl.core.BeanTag, tagInstanceName: _jsp_BeanTag_2

        // TEXT: lineNumber: 15
        // out.write("\r\n<div>\r\n");
        out.write(_jsp_string_4, 0, _jsp_string_4.length);

        // NODE START: lineNumber: 21, offset: 4, length: 3, tagClassName: com.skin.ayada.jstl.core.CacheTag, tagInstanceName: _jsp_CacheTag_5
        // <c:cache key=\"keyTest\" expires=\"120\">...</c:cache>
        com.skin.ayada.jstl.core.CacheTag _jsp_CacheTag_5 = new com.skin.ayada.jstl.core.CacheTag();
        _jsp_CacheTag_5.setPageContext(pageContext);
        _jsp_CacheTag_5.setParent((Tag)null);
        _jsp_CacheTag_5.setKey("keyTest");
        _jsp_CacheTag_5.setExpires(120);
        int _jsp_start_flag_5 = _jsp_CacheTag_5.doStartTag();

        if(_jsp_start_flag_5 == Tag.SKIP_PAGE) {
            return;
        }
        if(_jsp_start_flag_5 != Tag.SKIP_BODY) {
            int _jsp_flag_5 = 0;
            if(_jsp_start_flag_5 == BodyTag.EVAL_BODY_BUFFERED) {
                BodyContent _jsp_body_content_5 = pageContext.pushBody();
                _jsp_CacheTag_5.setBodyContent(_jsp_body_content_5);
                _jsp_CacheTag_5.doInitBody();
                out = _jsp_body_content_5;
            }

            do {
                // TEXT: lineNumber: 21
                // out.write("    <h1>1. Hello World !</h1>\r\n");
                out.write(_jsp_string_6, 0, _jsp_string_6.length);
                _jsp_flag_5 = _jsp_CacheTag_5.doAfterBody();
            }
            while(_jsp_flag_5 == IterationTag.EVAL_BODY_AGAIN);
            if(_jsp_start_flag_5 == BodyTag.EVAL_BODY_BUFFERED) {
                out = pageContext.popBody();
            }
        }
        _jsp_CacheTag_5.doEndTag();
        _jsp_CacheTag_5.release();
        // NODE END: lineNumber: 21, tagClassName: com.skin.ayada.jstl.core.CacheTag, tagInstanceName: _jsp_CacheTag_5

        // TEXT: lineNumber: 23
        // out.write("\r\n\r\n");
        out.write(_jsp_string_8, 0, _jsp_string_8.length);

        // NODE START: lineNumber: 29, offset: 8, length: 3, tagClassName: com.skin.ayada.jstl.core.CacheTag, tagInstanceName: _jsp_CacheTag_9
        // <c:cache key=\"keyTest\" expires=\"120\">...</c:cache>
        com.skin.ayada.jstl.core.CacheTag _jsp_CacheTag_9 = new com.skin.ayada.jstl.core.CacheTag();
        _jsp_CacheTag_9.setPageContext(pageContext);
        _jsp_CacheTag_9.setParent((Tag)null);
        _jsp_CacheTag_9.setKey("keyTest");
        _jsp_CacheTag_9.setExpires(120);
        int _jsp_start_flag_9 = _jsp_CacheTag_9.doStartTag();

        if(_jsp_start_flag_9 == Tag.SKIP_PAGE) {
            return;
        }
        if(_jsp_start_flag_9 != Tag.SKIP_BODY) {
            int _jsp_flag_9 = 0;
            if(_jsp_start_flag_9 == BodyTag.EVAL_BODY_BUFFERED) {
                BodyContent _jsp_body_content_9 = pageContext.pushBody();
                _jsp_CacheTag_9.setBodyContent(_jsp_body_content_9);
                _jsp_CacheTag_9.doInitBody();
                out = _jsp_body_content_9;
            }

            do {
                // TEXT: lineNumber: 29
                // out.write("        <h1>2. Hello World !</h1>\r\n");
                out.write(_jsp_string_10, 0, _jsp_string_10.length);
                _jsp_flag_9 = _jsp_CacheTag_9.doAfterBody();
            }
            while(_jsp_flag_9 == IterationTag.EVAL_BODY_AGAIN);
            if(_jsp_start_flag_9 == BodyTag.EVAL_BODY_BUFFERED) {
                out = pageContext.popBody();
            }
        }
        _jsp_CacheTag_9.doEndTag();
        _jsp_CacheTag_9.release();
        // NODE END: lineNumber: 29, tagClassName: com.skin.ayada.jstl.core.CacheTag, tagInstanceName: _jsp_CacheTag_9

        // TEXT: lineNumber: 31
        // out.write("</div>\r\n");
        out.write(_jsp_string_12, 0, _jsp_string_12.length);

        out.flush();
        jspWriter.flush();
    }

    public static final char[] _jsp_string_1 = "\r\n<h1>CacheTag Test</h1>\r\n".toCharArray();
    public static final char[] _jsp_string_4 = "\r\n<div>\r\n".toCharArray();
    public static final char[] _jsp_string_6 = "    <h1>1. Hello World !</h1>\r\n".toCharArray();
    public static final char[] _jsp_string_8 = "\r\n\r\n".toCharArray();
    public static final char[] _jsp_string_10 = "        <h1>2. Hello World !</h1>\r\n".toCharArray();
    public static final char[] _jsp_string_12 = "</div>\r\n".toCharArray();

}