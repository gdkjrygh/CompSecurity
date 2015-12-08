// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.codehaus.jackson.node;

import java.math.BigDecimal;
import java.math.BigInteger;

// Referenced classes of package org.codehaus.jackson.node:
//            POJONode, ArrayNode, BinaryNode, BooleanNode, 
//            NullNode, IntNode, DoubleNode, LongNode, 
//            DecimalNode, BigIntegerNode, ObjectNode, TextNode, 
//            NumericNode, ValueNode

public class JsonNodeFactory
{

    public static final JsonNodeFactory instance = new JsonNodeFactory();

    protected JsonNodeFactory()
    {
    }

    public POJONode POJONode(Object obj)
    {
        return new POJONode(obj);
    }

    public ArrayNode arrayNode()
    {
        return new ArrayNode(this);
    }

    public BinaryNode binaryNode(byte abyte0[])
    {
        return BinaryNode.valueOf(abyte0);
    }

    public BinaryNode binaryNode(byte abyte0[], int i, int j)
    {
        return BinaryNode.valueOf(abyte0, i, j);
    }

    public BooleanNode booleanNode(boolean flag)
    {
        if (flag)
        {
            return BooleanNode.getTrue();
        } else
        {
            return BooleanNode.getFalse();
        }
    }

    public NullNode nullNode()
    {
        return NullNode.getInstance();
    }

    public NumericNode numberNode(byte byte0)
    {
        return IntNode.valueOf(byte0);
    }

    public NumericNode numberNode(double d)
    {
        return DoubleNode.valueOf(d);
    }

    public NumericNode numberNode(float f)
    {
        return DoubleNode.valueOf(f);
    }

    public NumericNode numberNode(int i)
    {
        return IntNode.valueOf(i);
    }

    public NumericNode numberNode(long l)
    {
        return LongNode.valueOf(l);
    }

    public NumericNode numberNode(BigDecimal bigdecimal)
    {
        return DecimalNode.valueOf(bigdecimal);
    }

    public NumericNode numberNode(BigInteger biginteger)
    {
        return BigIntegerNode.valueOf(biginteger);
    }

    public NumericNode numberNode(short word0)
    {
        return IntNode.valueOf(word0);
    }

    public ValueNode numberNode(Byte byte1)
    {
        if (byte1 == null)
        {
            return nullNode();
        } else
        {
            return IntNode.valueOf(byte1.intValue());
        }
    }

    public ValueNode numberNode(Double double1)
    {
        if (double1 == null)
        {
            return nullNode();
        } else
        {
            return DoubleNode.valueOf(double1.doubleValue());
        }
    }

    public ValueNode numberNode(Float float1)
    {
        if (float1 == null)
        {
            return nullNode();
        } else
        {
            return DoubleNode.valueOf(float1.doubleValue());
        }
    }

    public ValueNode numberNode(Integer integer)
    {
        if (integer == null)
        {
            return nullNode();
        } else
        {
            return IntNode.valueOf(integer.intValue());
        }
    }

    public ValueNode numberNode(Long long1)
    {
        if (long1 == null)
        {
            return nullNode();
        } else
        {
            return LongNode.valueOf(long1.longValue());
        }
    }

    public ValueNode numberNode(Short short1)
    {
        if (short1 == null)
        {
            return nullNode();
        } else
        {
            return IntNode.valueOf(short1.shortValue());
        }
    }

    public ObjectNode objectNode()
    {
        return new ObjectNode(this);
    }

    public TextNode textNode(String s)
    {
        return TextNode.valueOf(s);
    }

}
