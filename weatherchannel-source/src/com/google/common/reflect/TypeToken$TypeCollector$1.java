// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.reflect;


// Referenced classes of package com.google.common.reflect:
//            TypeToken

static final class nit> extends nit>
{

    Iterable getInterfaces(TypeToken typetoken)
    {
        return typetoken.getGenericInterfaces();
    }

    volatile Iterable getInterfaces(Object obj)
    {
        return getInterfaces((TypeToken)obj);
    }

    Class getRawType(TypeToken typetoken)
    {
        return typetoken.getRawType();
    }

    volatile Class getRawType(Object obj)
    {
        return getRawType((TypeToken)obj);
    }

    TypeToken getSuperclass(TypeToken typetoken)
    {
        return typetoken.getGenericSuperclass();
    }

    volatile Object getSuperclass(Object obj)
    {
        return getSuperclass((TypeToken)obj);
    }

    _cls9()
    {
        super(null);
    }
}
