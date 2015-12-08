// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.codehaus.jackson.map.deser.std;

import java.util.Calendar;
import org.codehaus.jackson.map.DeserializationContext;
import org.codehaus.jackson.map.JsonMappingException;

// Referenced classes of package org.codehaus.jackson.map.deser.std:
//            StdKeyDeserializer

static final class  extends StdKeyDeserializer
{

    public volatile Object _parse(String s, DeserializationContext deserializationcontext)
        throws Exception
    {
        return _parse(s, deserializationcontext);
    }

    public Calendar _parse(String s, DeserializationContext deserializationcontext)
        throws IllegalArgumentException, JsonMappingException
    {
        s = deserializationcontext.parseDate(s);
        if (s == null)
        {
            return null;
        } else
        {
            return deserializationcontext.constructCalendar(s);
        }
    }

    protected ()
    {
        super(java/util/Calendar);
    }
}
