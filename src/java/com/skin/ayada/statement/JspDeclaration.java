/*
 * $RCSfile: Declaration.java,v $$
 * $Revision: 1.1 $
 * $Date: 2013-11-11 $
 *
 * Copyright (C) 2008 Skin, Inc. All rights reserved.
 *
 * This software is the proprietary information of Skin, Inc.
 * Use is subject to license terms.
 */
package com.skin.ayada.statement;

/**
 * <p>Title: Declaration</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2006</p>
 * @version 1.0
 */
public class JspDeclaration extends DataNode
{
    public JspDeclaration()
    {
        super(NodeType.JSP_DECLARATION_NAME, NodeType.JSP_DECLARATION);
        this.setClosed(NodeType.PAIR_CLOSED);
    }

    /**
     * @param nodeName
     */
    public JspDeclaration(String nodeName)
    {
        super(NodeType.JSP_DECLARATION_NAME, NodeType.JSP_DECLARATION);
        this.setClosed(NodeType.PAIR_CLOSED);
    }

    /**
     * @param nodeName
     * @param nodeType
     */
    protected JspDeclaration(String nodeName, int nodeType)
    {
        super(NodeType.JSP_DECLARATION_NAME, NodeType.JSP_DECLARATION);
        this.setClosed(NodeType.PAIR_CLOSED);
    }
    
    @Override
    public JspDeclaration clone()
    {
        JspDeclaration node = new JspDeclaration();
        node.setNodeName(this.getNodeName());
        node.setNodeType(this.getNodeType());
        node.setOffset(this.getOffset());
        node.setLength(this.getLength());
        node.setLineNumber(this.getLineNumber());
        node.setClosed(this.getClosed());
        node.setParent(this.getParent());
        node.append(this.getTextContent());
        return node;
    }
}
