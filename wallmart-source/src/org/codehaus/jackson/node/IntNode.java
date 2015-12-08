// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.codehaus.jackson.node;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import org.codehaus.jackson.JsonGenerator;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.JsonToken;
import org.codehaus.jackson.io.NumberOutput;
import org.codehaus.jackson.map.SerializerProvider;

// Referenced classes of package org.codehaus.jackson.node:
//            NumericNode

public final class IntNode extends NumericNode
{

    private static final IntNode CANONICALS[];
    static final int MAX_CANONICAL = 10;
    static final int MIN_CANONICAL = -1;
    final int _value;

    public IntNode(int i)
    {
        _value = i;
    }

    public static IntNode valueOf(int i)
    {
        if (i > 10 || i < -1)
        {
            return new IntNode(i);
        } else
        {
            return CANONICALS[i + 1];
        }
    }

    public boolean asBoolean(boolean flag)
    {
        return _value != 0;
    }

    public String asText()
    {
        return NumberOutput.toString(_value);
    }

    public JsonToken asToken()
    {
        return JsonToken.VALUE_NUMBER_INT;
    }

    public boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (obj == null)
            {
                return false;
            }
            if (obj.getClass() != getClass())
            {
                return false;
            }
            if (((IntNode)obj)._value != _value)
            {
                return false;
            }
        }
        return true;
    }

    public BigInteger getBigIntegerValue()
    {
        return BigInteger.valueOf(_value);
    }

    public BigDecimal getDecimalValue()
    {
        return BigDecimal.valueOf(_value);
    }

    public double getDoubleValue()
    {
        return (double)_value;
    }

    public int getIntValue()
    {
        return _value;
    }

    public long getLongValue()
    {
        return (long)_value;
    }

    public org.codehaus.jackson.JsonParser.NumberType getNumberType()
    {
        return org.codehaus.jackson.JsonParser.NumberType.INT;
    }

    public Number getNumberValue()
    {
        return Integer.valueOf(_value);
    }

    public int hashCode()
    {
        return _value;
    }

    public boolean isInt()
    {
        return true;
    }

    public boolean isIntegralNumber()
    {
        return true;
    }

    public final void serialize(JsonGenerator jsongenerator, SerializerProvider serializerprovider)
        throws IOException, JsonProcessingException
    {
        jsongenerator.writeNumber(_value);
    }

    static 
    {
        CANONICALS = new IntNode[12];
        for (int i = 0; i < 12; i++)
        {
            CANONICALS[i] = new IntNode(i - 1);
        }

    }
}
