// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.codehaus.jackson.type;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public abstract class TypeReference
    implements Comparable
{

    final Type _type;

    protected TypeReference()
    {
        Type type = getClass().getGenericSuperclass();
        if (type instanceof Class)
        {
            throw new IllegalArgumentException("Internal error: TypeReference constructed without actual type information");
        } else
        {
            _type = ((ParameterizedType)type).getActualTypeArguments()[0];
            return;
        }
    }

    public volatile int compareTo(Object obj)
    {
        return compareTo((TypeReference)obj);
    }

    public int compareTo(TypeReference typereference)
    {
        return 0;
    }

    public Type getType()
    {
        return _type;
    }
}
