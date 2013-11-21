/*
 * $RCSfile: Variable.java,v $$
 * $Revision: 1.1 $
 * $Date: 2013-11-21 $
 *
 * Copyright (C) 2008 WanMei, Inc. All rights reserved.
 *
 * This software is the proprietary information of WanMei, Inc.
 * Use is subject to license terms.
 */
package com.skin.ayada.statement;

/**
 * <p>Title: Variable</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2006</p>
 * @version 1.0
 */
public class Variable extends DataNode
{
    public Variable()
    {
        super(NodeType.VARI_NAME, NodeType.VARIABLE);
    }

    /**
     * @param nodeName
     */
    public Variable(String nodeName)
    {
        super(NodeType.VARI_NAME, NodeType.VARIABLE);
    }

    /**
     * @param nodeName
     * @param nodeType
     */
    protected Variable(String nodeName, int nodeType)
    {
        super(NodeType.VARI_NAME, NodeType.VARIABLE);
    }

    /**
     * @return TextNode
     */
    public Variable clone()
    {
        Variable node = new Variable();
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
