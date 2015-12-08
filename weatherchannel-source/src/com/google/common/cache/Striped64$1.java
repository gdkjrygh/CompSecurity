// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.cache;

import java.lang.reflect.Field;
import java.security.PrivilegedExceptionAction;
import sun.misc.Unsafe;

// Referenced classes of package com.google.common.cache:
//            Striped64

static final class ion
    implements PrivilegedExceptionAction
{

    public volatile Object run()
        throws Exception
    {
        return run();
    }

    public Unsafe run()
        throws Exception
    {
        Field afield[] = sun/misc/Unsafe.getDeclaredFields();
        int j = afield.length;
        for (int i = 0; i < j; i++)
        {
            Object obj = afield[i];
            ((Field) (obj)).setAccessible(true);
            obj = ((Field) (obj)).get(null);
            if (sun/misc/Unsafe.isInstance(obj))
            {
                return (Unsafe)sun/misc/Unsafe.cast(obj);
            }
        }

        throw new NoSuchFieldError("the Unsafe");
    }

    ion()
    {
    }
}
