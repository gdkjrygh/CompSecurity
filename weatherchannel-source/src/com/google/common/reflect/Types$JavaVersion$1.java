// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.reflect;

import com.google.common.base.Preconditions;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;

// Referenced classes of package com.google.common.reflect:
//            Types

static final class nit> extends nit>
{

    GenericArrayType newArrayType(Type type)
    {
        return new peImpl(type);
    }

    volatile Type newArrayType(Type type)
    {
        return newArrayType(type);
    }

    Type usedInGenericType(Type type)
    {
        Preconditions.checkNotNull(type);
        Object obj = type;
        if (type instanceof Class)
        {
            Class class1 = (Class)type;
            obj = type;
            if (class1.isArray())
            {
                obj = new peImpl(class1.getComponentType());
            }
        }
        return ((Type) (obj));
    }

    peImpl(String s, int i)
    {
        super(s, i, null);
    }
}
