// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.codehaus.jackson.map.deser.std;

import java.lang.reflect.Method;
import org.codehaus.jackson.map.DeserializationContext;

// Referenced classes of package org.codehaus.jackson.map.deser.std:
//            StdKeyDeserializer

static final class _factoryMethod extends StdKeyDeserializer
{

    final Method _factoryMethod;

    public Object _parse(String s, DeserializationContext deserializationcontext)
        throws Exception
    {
        return _factoryMethod.invoke(null, new Object[] {
            s
        });
    }

    public (Method method)
    {
        super(method.getDeclaringClass());
        _factoryMethod = method;
    }
}
