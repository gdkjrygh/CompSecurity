// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.ConcurrentModificationException;

// Referenced classes of package com.google.common.collect:
//            TreeMultiset

private static final class <init>
{

    private Object value;

    public void checkAndSet(Object obj, Object obj1)
    {
        if (value != obj)
        {
            throw new ConcurrentModificationException();
        } else
        {
            value = obj1;
            return;
        }
    }

    public Object get()
    {
        return value;
    }

    private ()
    {
    }

    ( )
    {
        this();
    }
}
