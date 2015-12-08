// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.c;

import java.lang.ref.WeakReference;

// Referenced classes of package com.gau.go.launcherex.gowidget.c:
//            c

class d
    implements Runnable
{

    private final int a;
    private final Object b;
    private final WeakReference c;

    d(c c1, int i, Object obj)
    {
        c = new WeakReference(c1);
        a = i;
        b = obj;
    }

    public void run()
    {
        c c1 = (c)c.get();
        if (c1 == null)
        {
            return;
        } else
        {
            com.gau.go.launcherex.gowidget.c.c.a(c1, a);
            c1.a(a, b);
            return;
        }
    }
}
