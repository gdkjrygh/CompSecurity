// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import java.util.Comparator;

// Referenced classes of package com.whatsapp:
//            PlaceInfo, t3

class afu
    implements Comparator
{

    final t3 a;

    afu(t3 t3)
    {
        a = t3;
        super();
    }

    public int a(PlaceInfo placeinfo, PlaceInfo placeinfo1)
    {
        return placeinfo.dist >= placeinfo1.dist ? 1 : -1;
    }

    public int compare(Object obj, Object obj1)
    {
        return a((PlaceInfo)obj, (PlaceInfo)obj1);
    }
}
