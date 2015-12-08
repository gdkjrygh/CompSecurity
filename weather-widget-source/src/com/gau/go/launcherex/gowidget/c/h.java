// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.c;

import android.os.SystemClock;
import android.util.SparseArray;
import android.view.View;
import com.gtp.a.a.b.c;

public class h
{

    private long a;
    private SparseArray b;

    public h()
    {
        b = new SparseArray();
        a = 1200L;
    }

    public void a(long l)
    {
        a = l;
    }

    public boolean a(int i)
    {
        long l = SystemClock.elapsedRealtime();
        long l1 = ((Long)b.get(i, Long.valueOf(0L))).longValue();
        boolean flag;
        if (l1 != 0L && l - l1 < a)
        {
            flag = true;
            c.a("QuickClickGuard", (new StringBuilder()).append("clickObjectId[").append(i).append("]").append(" is isQuickClick!").toString());
        } else
        {
            flag = false;
        }
        b.put(i, Long.valueOf(l));
        return flag;
    }

    public boolean a(View view)
    {
        return a(view.getId());
    }
}
