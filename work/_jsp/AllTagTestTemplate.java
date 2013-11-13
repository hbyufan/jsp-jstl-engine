/*
 * $RCSfile: AllTagTestTemplate.java,v $$
 * $Revision: 1.1 $
 * $Date: 2013-11-8 $
 *
 * Copyright (C) 2008 Skin, Inc. All rights reserved.
 *
 * This software is the proprietary information of Skin, Inc.
 * Use is subject to license terms.
 *
 * JSP generated by JspCompiler-0.1.1 (built Wed Nov 13 15:48:01 CST 2013)
 *
 */
package _jsp;

import com.skin.ayada.runtime.ExpressionContext;
import com.skin.ayada.runtime.JspWriter;
import com.skin.ayada.runtime.PageContext;
import com.skin.ayada.tagext.BodyContent;
import com.skin.ayada.tagext.IterationTag;
import com.skin.ayada.tagext.Tag;
import com.skin.ayada.template.JspTemplate;
import com.skin.ayada.util.ExpressionUtil;

/**
 * <p>Title: AllTagTestTemplate</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2006</p>
 * @author JspCompiler
 * @version 1.0
 */
public class AllTagTestTemplate extends JspTemplate
{
    /**
     * @param pageContext
     * @throws Exception
     */
    @Override
    public void execute(final PageContext pageContext) throws Exception
    {
        JspWriter out = pageContext.getOut();
        ExpressionContext expressionContext = pageContext.getExpressionContext();


        /* NODE START: lineNumber: 4, offset: 0, length: 2, tagClassName: com.skin.ayada.jstl.core.ImportTag, tagInstanceName: _tag_instance_1 */
        /* <t:import name="app:scrollpage" className="test.com.skin.ayada.taglib.ScrollPage"/> */
        pageContext.getTagLibrary().setup("app:scrollpage", "test.com.skin.ayada.taglib.ScrollPage");
        /* jsp.jstl.core.ImportTag END */
        /* NODE END: lineNumber: 4, tagClassName: com.skin.ayada.jstl.core.ImportTag, tagInstanceName: _tag_instance_1 */

        /* TEXT: lineNumber: 5 */
        out.write("<html>\r\n<head>\r\n<title>test</title>\r\n</head>\r\n<body version=\"1.0\">\r\n\r\n\r\n\r\n");

        /* NODE START: lineNumber: 23, offset: 3, length: 2, tagClassName: com.skin.ayada.jstl.core.SetTag, tagInstanceName: _tag_instance_4 */
        /* <c:set var="myVar" value="Hello, Ayada!"/> */
        pageContext.setAttribute("myVar", ExpressionUtil.evaluate(expressionContext, "Hello, Ayada!"));
        /* jsp.jstl.core.SetTag END */
        /* NODE END: lineNumber: 23, tagClassName: com.skin.ayada.jstl.core.SetTag, tagInstanceName: _tag_instance_4 */

        /* TEXT: lineNumber: 23 */
        out.write("\r\n<h1>");
        /* EXPRESSION: lineNumber: 24 */
        out.write(expressionContext.getString("myVar"));
        /* TEXT: lineNumber: 24 */
        out.write("</h1>\r\n\r\n");

        /* NODE START: lineNumber: 26, offset: 8, length: 2, tagClassName: com.skin.ayada.jstl.core.OutTag, tagInstanceName: _tag_instance_9 */
        /* <c:out value="c:out: Hello, Ayada!"/> */
        out.write(ExpressionUtil.getString(expressionContext, "c:out: Hello, Ayada!"));
        /* jsp.jstl.core.OutTag END */
        /* NODE END: lineNumber: 26, tagClassName: com.skin.ayada.jstl.core.OutTag, tagInstanceName: _tag_instance_9 */

        /* TEXT: lineNumber: 26 */
        out.write("\r\n<div style=\"background-color: #c0c0c0;\"></div>\r\n");

        /* NODE START: lineNumber: 28, offset: 11, length: 2, tagClassName: com.skin.ayada.jstl.core.OutTag, tagInstanceName: _tag_instance_12 */
        /* <c:out escapeXml="true" value="<div>Hello Ayada!</div>"/> */
        out.write(ExpressionUtil.getHtml(expressionContext, "<div>Hello Ayada!</div>"));
        /* jsp.jstl.core.OutTag END */
        /* NODE END: lineNumber: 28, tagClassName: com.skin.ayada.jstl.core.OutTag, tagInstanceName: _tag_instance_12 */

        /* TEXT: lineNumber: 28 */
        out.write("\r\n");

        /* NODE START: lineNumber: 29, offset: 14, length: 3, tagClassName: com.skin.ayada.jstl.core.OutTag, tagInstanceName: _tag_instance_15 */
        /* <c:out escapeXml="true">...</c:out> */
        out = pageContext.pushBody();
        /* TEXT: lineNumber: 29 */
        out.write("<h1>Hello Ayada!</h1>");
        pageContext.printBodyContent((BodyContent)out, true);
        out = pageContext.popBody();
        /* jsp.jstl.core.OutTag END */
        /* NODE END: lineNumber: 29, tagClassName: com.skin.ayada.jstl.core.OutTag, tagInstanceName: _tag_instance_15 */

        /* TEXT: lineNumber: 29 */
        out.write("\r\n\r\n");

        /* NODE START: lineNumber: 31, offset: 18, length: 3, tagClassName: com.skin.ayada.jstl.core.IfTag, tagInstanceName: _tag_instance_19 */
        /* <c:if test="${1 == 1}">...</c:if> */
        if(ExpressionUtil.getBoolean(expressionContext, "${1 == 1}")){
        /* TEXT: lineNumber: 31 */
        out.write("c:if test");
        } /* jsp.jstl.core.IfTag END */
        /* NODE END: lineNumber: 31, tagClassName: com.skin.ayada.jstl.core.IfTag, tagInstanceName: _tag_instance_19 */

        /* TEXT: lineNumber: 31 */
        out.write("\r\n\r\n");

        /* NODE START: lineNumber: 33, offset: 22, length: 20, tagClassName: com.skin.ayada.jstl.core.ForEachTag, tagInstanceName: _tag_instance_23 */
        /* <c:forEach varStatus="status" items="${userList}" var="user">...</c:forEach> */
        Object _for_each_old_var_23 = pageContext.getAttribute("user");
        Object _for_each_old_var_status_23 = pageContext.getAttribute("status");
        com.skin.ayada.jstl.core.ForEachTag _tag_instance_23 = new com.skin.ayada.jstl.core.ForEachTag();

        _tag_instance_23.setParent((Tag)null);
        _tag_instance_23.setPageContext(pageContext);
        _tag_instance_23.setItems(ExpressionUtil.evaluate(expressionContext, "${userList}"));
        pageContext.setAttribute("status", _tag_instance_23.getLoopStatus());
        _tag_instance_23.doStartTag();

        while(_tag_instance_23.hasNext()){
            pageContext.setAttribute("user", _tag_instance_23.next());
        /* TEXT: lineNumber: 33 */
        out.write("\r\n    <p>user: ");
        /* EXPRESSION: lineNumber: 34 */
        out.write(expressionContext.getString("user.userName"));
        /* TEXT: lineNumber: 34 */
        out.write("</p>\r\n    ");

        /* NODE START: lineNumber: 35, offset: 26, length: 14, tagClassName: com.skin.ayada.jstl.core.ChooseTag, tagInstanceName: _tag_instance_27 */
        /* <c:choose>...</c:choose> */
        boolean _tag_instance_27 = true;


        /* NODE START: lineNumber: 36, offset: 27, length: 3, tagClassName: com.skin.ayada.jstl.core.WhenTag, tagInstanceName: _tag_instance_28 */
        /* <c:when test="${user.userName == 'test1'}">...</c:when> */
        if(_tag_instance_27 && ExpressionUtil.getBoolean(expressionContext, "${user.userName == \'test1\'}")){
            _tag_instance_27 = false;
        /* TEXT: lineNumber: 36 */
        out.write("<p>test1, good man !</p>");
        } /* jsp.jstl.core.WhenTag END */
        /* NODE END: lineNumber: 36, tagClassName: com.skin.ayada.jstl.core.WhenTag, tagInstanceName: _tag_instance_28 */


        /* NODE START: lineNumber: 37, offset: 30, length: 3, tagClassName: com.skin.ayada.jstl.core.WhenTag, tagInstanceName: _tag_instance_31 */
        /* <c:when test="${user.userName == 'test2'}">...</c:when> */
        if(_tag_instance_27 && ExpressionUtil.getBoolean(expressionContext, "${user.userName == \'test2\'}")){
            _tag_instance_27 = false;
        /* TEXT: lineNumber: 37 */
        out.write("<p>test2, good man !</p>");
        } /* jsp.jstl.core.WhenTag END */
        /* NODE END: lineNumber: 37, tagClassName: com.skin.ayada.jstl.core.WhenTag, tagInstanceName: _tag_instance_31 */


        /* NODE START: lineNumber: 38, offset: 33, length: 3, tagClassName: com.skin.ayada.jstl.core.WhenTag, tagInstanceName: _tag_instance_34 */
        /* <c:when test="${user.userName == 'test3'}">...</c:when> */
        if(_tag_instance_27 && ExpressionUtil.getBoolean(expressionContext, "${user.userName == \'test3\'}")){
            _tag_instance_27 = false;
        /* TEXT: lineNumber: 38 */
        out.write("<p>test3, good man !</p>");
        } /* jsp.jstl.core.WhenTag END */
        /* NODE END: lineNumber: 38, tagClassName: com.skin.ayada.jstl.core.WhenTag, tagInstanceName: _tag_instance_34 */


        /* NODE START: lineNumber: 39, offset: 36, length: 3, tagClassName: com.skin.ayada.jstl.core.OtherwiseTag, tagInstanceName: _tag_instance_37 */
        /* <c:otherwise>...</c:otherwise> */
        if(_tag_instance_27){
            _tag_instance_27 = false;
        /* TEXT: lineNumber: 39 */
        out.write("<p>unknown user! Do you known \'bad egg\'? You! Are!</p>");
        } /* jsp.jstl.core.OtherwiseTag END */
        /* NODE END: lineNumber: 39, tagClassName: com.skin.ayada.jstl.core.OtherwiseTag, tagInstanceName: _tag_instance_37 */

        /* jsp.jstl.core.ChooseTag END */
        /* NODE END: lineNumber: 35, tagClassName: com.skin.ayada.jstl.core.ChooseTag, tagInstanceName: _tag_instance_27 */

        /* TEXT: lineNumber: 40 */
        out.write("\r\n");
        }
        _tag_instance_23.release();
        pageContext.setAttribute("user", _for_each_old_var_23);
        pageContext.setAttribute("status", _for_each_old_var_status_23);
        /* jsp.jstl.core.ForEachTag END */
        /* NODE END: lineNumber: 33, tagClassName: com.skin.ayada.jstl.core.ForEachTag, tagInstanceName: _tag_instance_23 */

        /* TEXT: lineNumber: 41 */
        out.write("\r\n\r\n");

        /* NODE START: lineNumber: 43, offset: 43, length: 14, tagClassName: com.skin.ayada.jstl.core.ChooseTag, tagInstanceName: _tag_instance_44 */
        /* <c:choose>...</c:choose> */
        boolean _tag_instance_44 = true;


        /* NODE START: lineNumber: 44, offset: 44, length: 3, tagClassName: com.skin.ayada.jstl.core.WhenTag, tagInstanceName: _tag_instance_45 */
        /* <c:when test="${1 == 1}">...</c:when> */
        if(_tag_instance_44 && ExpressionUtil.getBoolean(expressionContext, "${1 == 1}")){
            _tag_instance_44 = false;
        /* TEXT: lineNumber: 44 */
        out.write("1");
        } /* jsp.jstl.core.WhenTag END */
        /* NODE END: lineNumber: 44, tagClassName: com.skin.ayada.jstl.core.WhenTag, tagInstanceName: _tag_instance_45 */


        /* NODE START: lineNumber: 45, offset: 47, length: 3, tagClassName: com.skin.ayada.jstl.core.WhenTag, tagInstanceName: _tag_instance_48 */
        /* <c:when test="${2 == 2}">...</c:when> */
        if(_tag_instance_44 && ExpressionUtil.getBoolean(expressionContext, "${2 == 2}")){
            _tag_instance_44 = false;
        /* TEXT: lineNumber: 45 */
        out.write("2");
        } /* jsp.jstl.core.WhenTag END */
        /* NODE END: lineNumber: 45, tagClassName: com.skin.ayada.jstl.core.WhenTag, tagInstanceName: _tag_instance_48 */


        /* NODE START: lineNumber: 46, offset: 50, length: 3, tagClassName: com.skin.ayada.jstl.core.WhenTag, tagInstanceName: _tag_instance_51 */
        /* <c:when test="${3 == 3}">...</c:when> */
        if(_tag_instance_44 && ExpressionUtil.getBoolean(expressionContext, "${3 == 3}")){
            _tag_instance_44 = false;
        /* TEXT: lineNumber: 46 */
        out.write("3");
        } /* jsp.jstl.core.WhenTag END */
        /* NODE END: lineNumber: 46, tagClassName: com.skin.ayada.jstl.core.WhenTag, tagInstanceName: _tag_instance_51 */


        /* NODE START: lineNumber: 47, offset: 53, length: 3, tagClassName: com.skin.ayada.jstl.core.OtherwiseTag, tagInstanceName: _tag_instance_54 */
        /* <c:otherwise>...</c:otherwise> */
        if(_tag_instance_44){
            _tag_instance_44 = false;
        /* TEXT: lineNumber: 47 */
        out.write("otherwise");
        } /* jsp.jstl.core.OtherwiseTag END */
        /* NODE END: lineNumber: 47, tagClassName: com.skin.ayada.jstl.core.OtherwiseTag, tagInstanceName: _tag_instance_54 */

        /* jsp.jstl.core.ChooseTag END */
        /* NODE END: lineNumber: 43, tagClassName: com.skin.ayada.jstl.core.ChooseTag, tagInstanceName: _tag_instance_44 */

        /* TEXT: lineNumber: 48 */
        out.write("\r\n\r\n\r\n");

        /* NODE START: lineNumber: 51, offset: 58, length: 3, tagClassName: test.com.skin.ayada.taglib.ScrollPage, tagInstanceName: _tag_instance_59 */
        /* <app:scrollpage count="254" pageSize="10" pageNum="2">...</app:scrollpage> */
        test.com.skin.ayada.taglib.ScrollPage _tag_instance_59 = new test.com.skin.ayada.taglib.ScrollPage();
        _tag_instance_59.setParent((Tag)null);
        _tag_instance_59.setPageContext(pageContext);
        _tag_instance_59.setCount(ExpressionUtil.getInteger(expressionContext, "254"));
        _tag_instance_59.setPageSize(ExpressionUtil.getInteger(expressionContext, "10"));
        _tag_instance_59.setPageNum(ExpressionUtil.getInteger(expressionContext, "2"));
        int _tag_flag_59 = _tag_instance_59.doStartTag();

        if(_tag_flag_59 == Tag.SKIP_PAGE){
            return;
        }

        do{
        /* TEXT: lineNumber: 51 */
        out.write("haha");
            _tag_flag_59 = _tag_instance_59.doAfterBody();
        }
        while(_tag_flag_59 == IterationTag.EVAL_BODY_AGAIN);
        _tag_instance_59.doEndTag();
        _tag_instance_59.release();
        /* NODE END: lineNumber: 51, tagClassName: test.com.skin.ayada.taglib.ScrollPage, tagInstanceName: _tag_instance_59 */

        /* TEXT: lineNumber: 51 */
        out.write("\r\n</body>\r\n</html>");
        out.flush();
    }
}
