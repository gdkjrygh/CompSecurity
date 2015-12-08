// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.codehaus.jackson.map.deser.std;

import org.codehaus.jackson.map.DeserializationContext;
import org.codehaus.jackson.map.JsonMappingException;

// Referenced classes of package org.codehaus.jackson.map.deser.std:
//            StdKeyDeserializer

static final class  extends StdKeyDeserializer
{

    public Character _parse(String s, DeserializationContext deserializationcontext)
        throws JsonMappingException
    {
        if (s.length() == 1)
        {
            return Character.valueOf(s.charAt(0));
        } else
        {
            throw deserializationcontext.weirdKeyException(_keyClass, s, "can only convert 1-character Strings");
        }
    }

    public volatile Object _parse(String s, DeserializationContext deserializationcontext)
        throws Exception
    {
        return _parse(s, deserializationcontext);
    }

    ()
    {
        super(java/lang/Character);
    }
}
