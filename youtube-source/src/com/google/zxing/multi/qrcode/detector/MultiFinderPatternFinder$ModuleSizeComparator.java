// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.multi.qrcode.detector;

import com.google.zxing.qrcode.detector.d;
import java.io.Serializable;
import java.util.Comparator;

// Referenced classes of package com.google.zxing.multi.qrcode.detector:
//            a

final class <init>
    implements Serializable, Comparator
{

    public final int compare(d d1, d d2)
    {
        float f = d2.c() - d1.c();
        if ((double)f < 0.0D)
        {
            return -1;
        }
        return (double)f <= 0.0D ? 0 : 1;
    }

    public final volatile int compare(Object obj, Object obj1)
    {
        return compare((d)obj, (d)obj1);
    }

    private ()
    {
    }

    (a a)
    {
        this();
    }
}
