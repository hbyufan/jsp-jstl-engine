/*
 * $RCSfile: OutTag.java,v $
 * $Revision: 1.1 $
 * $Date: 2013-02-19 $
 *
 * Copyright (C) 2008 Skin, Inc. All rights reserved.
 *
 * This software is the proprietary information of Skin, Inc.
 * Use is subject to license terms.
 */
package com.skin.ayada.jstl.core;

import java.io.IOException;
import java.io.Writer;

import com.skin.ayada.JspWriter;
import com.skin.ayada.PageContext;
import com.skin.ayada.tagext.BodyContent;
import com.skin.ayada.tagext.BodyTag;
import com.skin.ayada.tagext.BodyTagSupport;
import com.skin.ayada.tagext.Tag;
import com.skin.ayada.util.HtmlUtil;

/**
 * <p>Title: OutTag</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2006</p>
 * @author xuesong.net
 * @version 1.0
 */
public class OutTag extends BodyTagSupport {
    private Object value = null;
    private String defaultValue = null;
    private boolean escapeXml = false;

    /**
     * @return int
     */
    @Override
    public int doStartTag() throws Exception {
        if(this.value != null) {
            OutTag.print(this.pageContext, this.value, this.escapeXml);
            return Tag.SKIP_BODY;
        }

        if(this.defaultValue != null) {
            OutTag.print(this.pageContext, this.defaultValue, this.escapeXml);
            return Tag.SKIP_BODY;
        }
        return BodyTag.EVAL_BODY_BUFFERED;
    }

    /**
     * @return int
     */
    @Override
    public int doEndTag() throws Exception {
        BodyContent bodyContent = this.getBodyContent();

        if(bodyContent != null) {
            print(this.pageContext, bodyContent.getString().trim(), this.escapeXml);
        }
        return EVAL_PAGE;
    }

    /**
     * @param out
     * @param value
     * @param escapeXml
     * @throws IOException
     */
    public static void write(Writer out, Object value, boolean escapeXml) throws IOException {
        if(value != null) {
            String content = value.toString();

            if(escapeXml) {
                out.write(HtmlUtil.encode(content));
            }
            else {
                out.write(content);
            }
        }
    }

    /**
     * @param pageContext
     * @param value
     * @param escapeXml
     * @throws IOException
     */
    public static void print(PageContext pageContext, Object value, boolean escapeXml) throws IOException {
        if(value != null) {
            String content = value.toString();
            JspWriter out = pageContext.getOut();

            if(escapeXml) {
                out.print(HtmlUtil.encode(content));
            }
            else {
                out.print(content);
            }
        }
    }

    /**
     * @return the value
     */
    public Object getValue() {
        return this.value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(Object value) {
        this.value = value;
    }

    /**
     * @return boolean
     */
    public boolean getEscapeXml() {
        return this.escapeXml;
    }

    /**
     * @param escapeXml
     */
    public void setEscapeXml(boolean escapeXml) {
        this.escapeXml = escapeXml;
    }
}
