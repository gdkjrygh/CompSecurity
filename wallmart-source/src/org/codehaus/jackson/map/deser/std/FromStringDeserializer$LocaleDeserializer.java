// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.codehaus.jackson.map.deser.std;

import java.io.IOException;
import java.util.Locale;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.map.DeserializationContext;

// Referenced classes of package org.codehaus.jackson.map.deser.std:
//            FromStringDeserializer

protected static class  extends FromStringDeserializer
{

    protected volatile Object _deserialize(String s, DeserializationContext deserializationcontext)
        throws IOException, JsonProcessingException
    {
        return _deserialize(s, deserializationcontext);
    }

    protected Locale _deserialize(String s, DeserializationContext deserializationcontext)
        throws IOException
    {
        int i = s.indexOf('_');
        if (i < 0)
        {
            return new Locale(s);
        }
        deserializationcontext = s.substring(0, i);
        s = s.substring(i + 1);
        i = s.indexOf('_');
        if (i < 0)
        {
            return new Locale(deserializationcontext, s);
        } else
        {
            return new Locale(deserializationcontext, s.substring(0, i), s.substring(i + 1));
        }
    }

    public ()
    {
        super(java/util/Locale);
    }
}
