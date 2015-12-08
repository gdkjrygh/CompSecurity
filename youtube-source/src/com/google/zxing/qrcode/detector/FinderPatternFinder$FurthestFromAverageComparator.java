// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.qrcode.detector;

import java.io.Serializable;
import java.util.Comparator;

// Referenced classes of package com.google.zxing.qrcode.detector:
//            d, e

final class <init>
    implements Serializable, Comparator
{

    private final float average;

    public final int compare(d d1, d d2)
    {
        float f = Math.abs(d2.c() - average);
        float f1 = Math.abs(d1.c() - average);
        if (f < f1)
        {
            return -1;
        }
        return f != f1 ? 1 : 0;
    }

    public final volatile int compare(Object obj, Object obj1)
    {
        return compare((d)obj, (d)obj1);
    }

    private (float f)
    {
        average = f;
    }

    average(float f, e e)
    {
        this(f);
    }
}
