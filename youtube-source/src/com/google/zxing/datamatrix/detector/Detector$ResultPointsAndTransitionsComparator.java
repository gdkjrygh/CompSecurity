// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.datamatrix.detector;

import java.io.Serializable;
import java.util.Comparator;

// Referenced classes of package com.google.zxing.datamatrix.detector:
//            b, a

final class <init>
    implements Serializable, Comparator
{

    public final int compare(b b1, b b2)
    {
        return b1.c() - b2.c();
    }

    public final volatile int compare(Object obj, Object obj1)
    {
        return compare((b)obj, (b)obj1);
    }

    private ()
    {
    }

    (a a)
    {
        this();
    }
}
