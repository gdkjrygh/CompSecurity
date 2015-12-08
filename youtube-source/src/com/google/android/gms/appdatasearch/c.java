// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.appdatasearch;

import java.util.Comparator;

// Referenced classes of package com.google.android.gms.appdatasearch:
//            b

final class c
    implements Comparator
{

    c()
    {
    }

    public final int compare(Object obj, Object obj1)
    {
        obj = (b)obj;
        obj1 = (b)obj1;
        int j = (int)Math.signum(((b) (obj1)).c - ((b) (obj)).c);
        int i = j;
        if (j == 0)
        {
            i = ((b) (obj)).b.compareTo(((b) (obj1)).b);
        }
        return i;
    }
}
