/*
 * $RCSfile: ExpressionContext.java,v $$
 * $Revision: 1.1 $
 * $Date: 2013-02-20 $
 *
 * Copyright (C) 2008 Skin, Inc. All rights reserved.
 *
 * This software is the proprietary information of Skin, Inc.
 * Use is subject to license terms.
 */
package com.skin.ayada.runtime;

/**
 * <p>Title: ExpressionContext</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2006</p>
 * @author xuesong.net
 * @version 1.0
 */
public interface ExpressionContext
{
    /**
     * @param expression
     * @return Object
     */
    public Object getValue(String expression);

    /**
     * @param expression
     * @return Object
     */
    public boolean getBoolean(String expression);

    /**
     * @param expression
     * @return Object
     */
    public boolean getInteger(String expression);

    /**
     * @param expression
     * @return Object
     */
    public String getString(String expression);

    /**
     * @param pageContext the pageContext to set
     */
    public void setPageContext(PageContext pageContext);

    /**
     * @return the pageContext
     */
    public PageContext getPageContext();

    /**
     * release the current ExpressionContext
     */
    public void release();
}