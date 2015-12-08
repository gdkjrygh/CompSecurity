// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.codehaus.jackson.node;

import java.math.BigDecimal;
import java.math.BigInteger;

// Referenced classes of package org.codehaus.jackson.node:
//            ValueNode

public abstract class NumericNode extends ValueNode
{

    protected NumericNode()
    {
    }

    public double asDouble()
    {
        return getDoubleValue();
    }

    public double asDouble(double d)
    {
        return getDoubleValue();
    }

    public int asInt()
    {
        return getIntValue();
    }

    public int asInt(int i)
    {
        return getIntValue();
    }

    public long asLong()
    {
        return getLongValue();
    }

    public long asLong(long l)
    {
        return getLongValue();
    }

    public abstract String asText();

    public abstract BigInteger getBigIntegerValue();

    public abstract BigDecimal getDecimalValue();

    public abstract double getDoubleValue();

    public abstract int getIntValue();

    public abstract long getLongValue();

    public abstract org.codehaus.jackson.JsonParser.NumberType getNumberType();

    public abstract Number getNumberValue();

    public final boolean isNumber()
    {
        return true;
    }
}
