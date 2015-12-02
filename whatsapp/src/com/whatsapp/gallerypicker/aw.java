// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.gallerypicker;

import java.util.Comparator;

// Referenced classes of package com.whatsapp.gallerypicker:
//            bo, bq

class aw
    implements Comparator
{

    private aw()
    {
    }

    aw(bq bq)
    {
        this();
    }

    public int a(bo bo1, bo bo2)
    {
        if (bo1.e != bo2.e)
        {
            return bo1.e >= bo2.e ? -1 : 1;
        } else
        {
            return bo1.b - bo2.b;
        }
    }

    public int compare(Object obj, Object obj1)
    {
        return a((bo)obj, (bo)obj1);
    }
}
