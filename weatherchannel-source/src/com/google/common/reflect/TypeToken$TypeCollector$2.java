// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.reflect;

import java.util.Arrays;

// Referenced classes of package com.google.common.reflect:
//            TypeToken

static final class nit> extends nit>
{

    Iterable getInterfaces(Class class1)
    {
        return Arrays.asList(class1.getInterfaces());
    }

    volatile Iterable getInterfaces(Object obj)
    {
        return getInterfaces((Class)obj);
    }

    Class getRawType(Class class1)
    {
        return class1;
    }

    volatile Class getRawType(Object obj)
    {
        return getRawType((Class)obj);
    }

    Class getSuperclass(Class class1)
    {
        return class1.getSuperclass();
    }

    volatile Object getSuperclass(Object obj)
    {
        return getSuperclass((Class)obj);
    }

    _cls9()
    {
        super(null);
    }
}
