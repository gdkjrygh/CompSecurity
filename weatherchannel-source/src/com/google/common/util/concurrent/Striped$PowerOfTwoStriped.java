// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.util.concurrent;

import com.google.common.base.Preconditions;

// Referenced classes of package com.google.common.util.concurrent:
//            Striped

private static abstract class mask extends Striped
{

    final int mask;

    public final Object get(Object obj)
    {
        return getAt(indexFor(obj));
    }

    final int indexFor(Object obj)
    {
        int i = Striped.access$300(obj.hashCode());
        return mask & i;
    }

    A(int i)
    {
        super(null);
        boolean flag;
        if (i > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "Stripes must be positive");
        if (i > 0x40000000)
        {
            i = -1;
        } else
        {
            i = Striped.access$200(i) - 1;
        }
        mask = i;
    }
}
