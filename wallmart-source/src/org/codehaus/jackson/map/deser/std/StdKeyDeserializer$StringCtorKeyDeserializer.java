// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.codehaus.jackson.map.deser.std;

import java.lang.reflect.Constructor;
import org.codehaus.jackson.map.DeserializationContext;

// Referenced classes of package org.codehaus.jackson.map.deser.std:
//            StdKeyDeserializer

static final class _ctor extends StdKeyDeserializer
{

    protected final Constructor _ctor;

    public Object _parse(String s, DeserializationContext deserializationcontext)
        throws Exception
    {
        return _ctor.newInstance(new Object[] {
            s
        });
    }

    public (Constructor constructor)
    {
        super(constructor.getDeclaringClass());
        _ctor = constructor;
    }
}
