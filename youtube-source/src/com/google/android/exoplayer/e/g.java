// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer.e;

import java.util.Comparator;

// Referenced classes of package com.google.android.exoplayer.e:
//            h

final class g
    implements Comparator
{

    g()
    {
    }

    public final volatile int compare(Object obj, Object obj1)
    {
        obj = (h)obj;
        obj1 = (h)obj1;
        if (((h) (obj)).c < ((h) (obj1)).c)
        {
            return -1;
        }
        return ((h) (obj1)).c >= ((h) (obj)).c ? 0 : 1;
    }
}
