// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.codehaus.jackson.map.deser.std;

import java.io.IOException;
import java.util.Currency;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.map.DeserializationContext;

// Referenced classes of package org.codehaus.jackson.map.deser.std:
//            FromStringDeserializer

public static class  extends FromStringDeserializer
{

    protected volatile Object _deserialize(String s, DeserializationContext deserializationcontext)
        throws IOException, JsonProcessingException
    {
        return _deserialize(s, deserializationcontext);
    }

    protected Currency _deserialize(String s, DeserializationContext deserializationcontext)
        throws IllegalArgumentException
    {
        return Currency.getInstance(s);
    }

    public ()
    {
        super(java/util/Currency);
    }
}
