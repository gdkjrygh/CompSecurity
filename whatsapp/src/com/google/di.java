// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google;

import java.io.Serializable;
import java.util.Comparator;

// Referenced classes of package com.google:
//            f2, fg

final class di
    implements Comparator, Serializable
{

    private final float a;

    private di(float f)
    {
        a = f;
    }

    di(float f, fg fg)
    {
        this(f);
    }

    public int a(f2 f2_1, f2 f2_2)
    {
        float f = Math.abs(f2_2.c() - a);
        float f1 = Math.abs(f2_1.c() - a);
        if (f < f1)
        {
            return -1;
        }
        return f != f1 ? 1 : 0;
    }

    public int compare(Object obj, Object obj1)
    {
        return a((f2)obj, (f2)obj1);
    }
}
