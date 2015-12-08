// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.codehaus.jackson.node;

import java.io.IOException;
import org.codehaus.jackson.JsonGenerator;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.JsonToken;
import org.codehaus.jackson.map.SerializerProvider;

// Referenced classes of package org.codehaus.jackson.node:
//            ValueNode

public final class BooleanNode extends ValueNode
{

    public static final BooleanNode FALSE = new BooleanNode();
    public static final BooleanNode TRUE = new BooleanNode();

    private BooleanNode()
    {
    }

    public static BooleanNode getFalse()
    {
        return FALSE;
    }

    public static BooleanNode getTrue()
    {
        return TRUE;
    }

    public static BooleanNode valueOf(boolean flag)
    {
        if (flag)
        {
            return TRUE;
        } else
        {
            return FALSE;
        }
    }

    public boolean asBoolean()
    {
        return this == TRUE;
    }

    public boolean asBoolean(boolean flag)
    {
        return this == TRUE;
    }

    public double asDouble(double d)
    {
        return this != TRUE ? 0.0D : 1.0D;
    }

    public int asInt(int i)
    {
        return this != TRUE ? 0 : 1;
    }

    public long asLong(long l)
    {
        return this != TRUE ? 0L : 1L;
    }

    public String asText()
    {
        if (this == TRUE)
        {
            return "true";
        } else
        {
            return "false";
        }
    }

    public JsonToken asToken()
    {
        if (this == TRUE)
        {
            return JsonToken.VALUE_TRUE;
        } else
        {
            return JsonToken.VALUE_FALSE;
        }
    }

    public boolean equals(Object obj)
    {
        return obj == this;
    }

    public boolean getBooleanValue()
    {
        return this == TRUE;
    }

    public boolean isBoolean()
    {
        return true;
    }

    public final void serialize(JsonGenerator jsongenerator, SerializerProvider serializerprovider)
        throws IOException, JsonProcessingException
    {
        boolean flag;
        if (this == TRUE)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        jsongenerator.writeBoolean(flag);
    }

}
