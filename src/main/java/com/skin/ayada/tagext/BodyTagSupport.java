/*
 * $RCSfile: BodyTagSupport.java,v $
 * $Revision: 1.1 $
 * $Date: 2013-02-19 $
 *
 * Copyright (C) 2008 Skin, Inc. All rights reserved.
 *
 * This software is the proprietary information of Skin, Inc.
 * Use is subject to license terms.
 */
package com.skin.ayada.tagext;

import com.skin.ayada.JspWriter;

/**
 * <p>Title: BodyTagSupport</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2006</p>
 * @author xuesong.net
 * @version 1.0
 */
public class BodyTagSupport extends TagSupport implements BodyTag {
    protected BodyContent bodyContent;

    /**
     * @return int
     * @throws Exception
     */
    @Override
    public int doStartTag() throws Exception {
        return EVAL_BODY_BUFFERED;
    }

    /**
     * @return int
     * @throws Exception
     */
    @Override
    public int doEndTag() throws Exception {
        return super.doEndTag();
    }

    /**
     * @param bodyContent
     */
    @Override
    public void setBodyContent(BodyContent bodyContent) {
        this.bodyContent = bodyContent;
    }

    /**
     * @throws Exception
     */
    @Override
    public void doInitBody() throws Exception {
    }

    /**
     * @throws Exception
     */
    @Override
    public int doAfterBody() throws Exception {
        return SKIP_BODY;
    }

    /**
     * release
     */
    @Override
    public void release() {
        this.bodyContent = null;
        super.release();
    }

    /**
     * @return BodyContent
     */
    public BodyContent getBodyContent() {
        return this.bodyContent;
    }

    /**
     * @return JspWriter
     */
    public JspWriter getPreviousOut() {
        return this.bodyContent.getEnclosingWriter();
    }
}
