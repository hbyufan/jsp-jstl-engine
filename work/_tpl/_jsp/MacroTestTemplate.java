/*
 * $RCSfile: MacroTestTemplate.java,v $$
 * $Revision: 1.1 $
 * $Date: 2014-07-12 $
 *
 * Copyright (C) 2008 Skin, Inc. All rights reserved.
 *
 * This software is the proprietary information of Skin, Inc.
 * Use is subject to license terms.
 *
 * home: E:\WorkSpace\ayada\webapp
 * path: macroTest.jsp
 * lastModified: 2014-07-12 22:06:03 870
 * options: -fastJstl true
 * JSP generated by JspCompiler-1.0.1.0 (built 2014-07-12 22:08:04 395)
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
 * <p>Title: MacroTestTemplate</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2006</p>
 * @author JspCompiler
 * @version 1.0
 */
@SuppressWarnings("unused")
public class MacroTestTemplate extends JspTemplate{
    public static void main(String[] args){
        java.io.StringWriter writer = new java.io.StringWriter();
        PageContext pageContext = com.skin.ayada.runtime.JspFactory.getDefaultPageContext(writer);
        MacroTestTemplate template = new MacroTestTemplate();

        try{
            template.execute(pageContext);
            System.out.println(writer.toString());
        }
        catch(Throwable throwable)
        {
            throwable.printStackTrace();
        }
    }



    /**
     * @param pageContext
     * @throws Throwable
     */
    @Override
    public void _execute(final PageContext pageContext) throws Throwable{
        JspWriter out = pageContext.getOut();
        JspWriter jspWriter = pageContext.getOut();
        ExpressionContext expressionContext = pageContext.getExpressionContext();

        /* NODE START: lineNumber: 1, offset: 0, length: 4, tagClassName: com.skin.ayada.jstl.core.MapTag, tagInstanceName: _jsp_MapTag_1 */
        /* <c:map name="user">...</c:map> */
        com.skin.ayada.jstl.core.MapTag _jsp_MapTag_1 = new com.skin.ayada.jstl.core.MapTag();
        _jsp_MapTag_1.setPageContext(pageContext);
        _jsp_MapTag_1.setParent((Tag)null);
        _jsp_MapTag_1.setDynamicAttribute("name", "user");
        int _jsp_start_flag_1 = _jsp_MapTag_1.doStartTag();

        if(_jsp_start_flag_1 == Tag.SKIP_PAGE){
            return;
        }
        if(_jsp_start_flag_1 != Tag.SKIP_BODY){
            int _jsp_flag_1 = 0;

            do{
                /* NODE START: lineNumber: 2, offset: 1, length: 2, tagClassName: com.skin.ayada.jstl.core.AttributeTag, tagInstanceName: _jsp_AttributeTag_2 */
                /* <c:entry name="userName" value="xuesong.net"/> */
                _jsp_MapTag_1.setAttribute("userName", "xuesong.net");
                /* jsp.jstl.core.AttributeTag END */
                /* NODE END: lineNumber: 2, tagClassName: com.skin.ayada.jstl.core.AttributeTag, tagInstanceName: _jsp_AttributeTag_2 */

                _jsp_flag_1 = _jsp_MapTag_1.doAfterBody();
            }
            while(_jsp_flag_1 == IterationTag.EVAL_BODY_AGAIN);
        }
        _jsp_MapTag_1.doEndTag();
        _jsp_MapTag_1.release();
        /* NODE END: lineNumber: 1, tagClassName: com.skin.ayada.jstl.core.MapTag, tagInstanceName: _jsp_MapTag_1 */

        /* TEXT: lineNumber: 3 */
        out.write("\r\n\r\n");

        /* NODE START: lineNumber: 5, offset: 5, length: 4, tagClassName: com.skin.ayada.jstl.core.MacroTag, tagInstanceName: _jsp_MacroTag_6 */
        /* <c:macro name="myTestMacro">...</c:macro> */
        com.skin.ayada.jstl.core.MacroTag _jsp_MacroTag_6 = new com.skin.ayada.jstl.core.MacroTag();
        _jsp_MacroTag_6.setPageContext(pageContext);
        _jsp_MacroTag_6.setParent((Tag)null);
        _jsp_MacroTag_6.setName("myTestMacro");
        int _jsp_start_flag_6 = _jsp_MacroTag_6.doStartTag();

        if(_jsp_start_flag_6 == Tag.SKIP_PAGE){
            return;
        }
        if(_jsp_start_flag_6 != Tag.SKIP_BODY){
            int _jsp_flag_6 = 0;

            do{
                /* NODE START: lineNumber: 6, offset: 6, length: 2, tagClassName: com.skin.ayada.jstl.core.ParameterTag, tagInstanceName: _jsp_ParameterTag_7 */
                /* <c:param name="user" value="${user}"/> */
                com.skin.ayada.jstl.core.ParameterTag _jsp_ParameterTag_7 = new com.skin.ayada.jstl.core.ParameterTag();
                _jsp_ParameterTag_7.setPageContext(pageContext);
                _jsp_ParameterTag_7.setParent(_jsp_MacroTag_6);
                _jsp_ParameterTag_7.setName("user");
                _jsp_ParameterTag_7.setValue(ExpressionUtil.evaluate(expressionContext, "${user}", null));
                int _jsp_start_flag_7 = _jsp_ParameterTag_7.doStartTag();

                if(_jsp_start_flag_7 == Tag.SKIP_PAGE){
                    return;
                }
                if(_jsp_start_flag_7 != Tag.SKIP_BODY){
                    _jsp_ParameterTag_7.doAfterBody();
                }
                _jsp_ParameterTag_7.doEndTag();
                _jsp_ParameterTag_7.release();
                /* NODE END: lineNumber: 6, tagClassName: com.skin.ayada.jstl.core.ParameterTag, tagInstanceName: _jsp_ParameterTag_7 */

                _jsp_flag_6 = _jsp_MacroTag_6.doAfterBody();
            }
            while(_jsp_flag_6 == IterationTag.EVAL_BODY_AGAIN);
        }
        _jsp_MacroTag_6.doEndTag();
        _jsp_MacroTag_6.release();
        /* NODE END: lineNumber: 5, tagClassName: com.skin.ayada.jstl.core.MacroTag, tagInstanceName: _jsp_MacroTag_6 */

        /* TEXT: lineNumber: 7 */
        out.write("\r\n");


        out.flush();
        jspWriter.flush();
    }


}
