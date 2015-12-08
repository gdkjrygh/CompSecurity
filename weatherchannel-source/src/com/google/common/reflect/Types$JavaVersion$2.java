// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.reflect;

import com.google.common.base.Preconditions;
import java.lang.reflect.Type;

// Referenced classes of package com.google.common.reflect:
//            Types

static final class nit> extends nit>
{

    Type newArrayType(Type type)
    {
        if (type instanceof Class)
        {
            return Types.getArrayClass((Class)type);
        } else
        {
            return new peImpl(type);
        }
    }

    Type usedInGenericType(Type type)
    {
        return (Type)Preconditions.checkNotNull(type);
    }

    peImpl(String s, int i)
    {
        super(s, i, null);
    }
}
