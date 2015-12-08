// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vividsolutions.jts.c.c;

import java.util.Comparator;

// Referenced classes of package com.vividsolutions.jts.c.c:
//            c

public static final class 
    implements Comparator
{

    public final int compare(Object obj, Object obj1)
    {
        obj = (c)obj;
        obj1 = (c)obj1;
        double d = (((c) (obj)).a + ((c) (obj)).b) / 2D;
        double d1 = (((c) (obj1)).a + ((c) (obj1)).b) / 2D;
        if (d < d1)
        {
            return -1;
        }
        return d <= d1 ? 0 : 1;
    }

    public ()
    {
    }
}
