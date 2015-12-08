// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.globaltheme.b;

import java.util.Comparator;

// Referenced classes of package com.gau.go.launcherex.gowidget.weather.globaltheme.b:
//            b

public class c
    implements Comparator
{

    public c()
    {
    }

    public int a(b b1, b b2)
    {
        long l = b1.c() - b2.c();
        if (l == 0L)
        {
            return 0;
        }
        return l <= 0L ? -1 : 1;
    }

    public int compare(Object obj, Object obj1)
    {
        return a((b)obj, (b)obj1);
    }
}
