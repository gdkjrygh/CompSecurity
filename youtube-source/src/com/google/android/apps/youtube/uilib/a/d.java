// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.uilib.a;

import com.google.android.apps.youtube.common.fromguava.c;

// Referenced classes of package com.google.android.apps.youtube.uilib.a:
//            e

final class d
{

    final e a;
    int b;

    private d(e e1)
    {
        a = (e)com.google.android.apps.youtube.common.fromguava.c.a(e1);
        b = 0;
    }

    d(e e1, byte byte0)
    {
        this(e1);
    }

    static boolean a(d d1, int i)
    {
        while (i < d1.b || i >= d1.b + d1.a.getCount()) 
        {
            return false;
        }
        return true;
    }

    static boolean b(d d1, int i)
    {
        return d1.a.getItemViewType(i - d1.b) == -1;
    }

    static int c(d d1, int i)
    {
        return i - d1.b;
    }
}
