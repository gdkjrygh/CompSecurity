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

public final class LongNode extends NumericNode
{

    final long _value;

    public LongNode(long l)
    {
        _value = l;
    }

    public static LongNode valueOf(long l)
    {
        return new LongNode(l);
    }

    public boolean asBoolean(boolean flag)
    {
        return _value != 0L;
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
            if (((LongNode)obj)._value != _value)
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
        return (int)_value;
    }

    public long getLongValue()
    {
        return _value;
    }

    public org.codehaus.jackson.JsonParser.NumberType getNumberType()
    {
        return org.codehaus.jackson.JsonParser.NumberType.LONG;
    }

    public Number getNumberValue()
    {
        return Long.valueOf(_value);
    }

    public int hashCode()
    {
        return (int)_value ^ (int)(_value >> 32);
    }

    public boolean isIntegralNumber()
    {
        return true;
    }

    public boolean isLong()
    {
        return true;
    }

    public final void serialize(JsonGenerator jsongenerator, SerializerProvider serializerprovider)
        throws IOException, JsonProcessingException
    {
        jsongenerator.writeNumber(_value);
    }
}
