// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.go.weather.sharephoto.b;

import java.util.Comparator;

// Referenced classes of package com.gtp.go.weather.sharephoto.b:
//            h

class i
    implements Comparator
{

    final h a;

    i(h h)
    {
        a = h;
        super();
    }

    public int a(Long long1, Long long2)
    {
        return (int)(long2.longValue() - long1.longValue());
    }

    public int compare(Object obj, Object obj1)
    {
        return a((Long)obj, (Long)obj1);
    }
}
