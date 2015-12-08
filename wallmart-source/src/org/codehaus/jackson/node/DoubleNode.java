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

public final class DoubleNode extends NumericNode
{

    protected final double _value;

    public DoubleNode(double d)
    {
        _value = d;
    }

    public static DoubleNode valueOf(double d)
    {
        return new DoubleNode(d);
    }

    public String asText()
    {
        return NumberOutput.toString(_value);
    }

    public JsonToken asToken()
    {
        return JsonToken.VALUE_NUMBER_FLOAT;
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
            if (((DoubleNode)obj)._value != _value)
            {
                return false;
            }
        }
        return true;
    }

    public BigInteger getBigIntegerValue()
    {
        return getDecimalValue().toBigInteger();
    }

    public BigDecimal getDecimalValue()
    {
        return BigDecimal.valueOf(_value);
    }

    public double getDoubleValue()
    {
        return _value;
    }

    public int getIntValue()
    {
        return (int)_value;
    }

    public long getLongValue()
    {
        return (long)_value;
    }

    public org.codehaus.jackson.JsonParser.NumberType getNumberType()
    {
        return org.codehaus.jackson.JsonParser.NumberType.DOUBLE;
    }

    public Number getNumberValue()
    {
        return Double.valueOf(_value);
    }

    public int hashCode()
    {
        long l = Double.doubleToLongBits(_value);
        return (int)l ^ (int)(l >> 32);
    }

    public boolean isDouble()
    {
        return true;
    }

    public boolean isFloatingPointNumber()
    {
        return true;
    }

    public final void serialize(JsonGenerator jsongenerator, SerializerProvider serializerprovider)
        throws IOException, JsonProcessingException
    {
        jsongenerator.writeNumber(_value);
    }
}
