/*
 * $RCSfile: TagFactory.java,v $$
 * $Revision: 1.1 $
 * $Date: 2013-02-19 $
 *
 * Copyright (C) 2008 Skin, Inc. All rights reserved.
 *
 * This software is the proprietary information of Skin, Inc.
 * Use is subject to license terms.
 */
package com.skin.ayada.runtime;

import java.util.Map;

import com.skin.ayada.tagext.Tag;

/**
 * <p>Title: TagFactory</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2006</p>
 * @author xuesong.net
 * @version 1.0
 */
public interface TagFactory {
    /**
     * @return Tag
     */
    Tag create();

    /**
     * @param tagName
     */
    void setTagName(String tagName);

    /**
     * @return String
     */
    String getTagName();

    /**
     * @param className
     */
    void setClassName(String className);

    /**
     * @return String
     */
    String getClassName();

    /**
     * @param tag
     * @param attributes
     * @param expressionContext
     */
    void setAttributes(Tag tag, Map<String, String> attributes, ExpressionContext expressionContext);
}