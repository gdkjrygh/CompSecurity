// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer.a;

import com.google.android.exoplayer.ag;
import com.google.android.exoplayer.ah;
import com.google.android.exoplayer.d.a.f;
import com.google.android.exoplayer.e.a;
import com.google.android.exoplayer.upstream.i;
import com.google.android.exoplayer.upstream.j;
import java.util.Map;

// Referenced classes of package com.google.android.exoplayer.a:
//            t, m

public final class u extends t
{

    private final f g;
    private final boolean h = false;

    public u(i i, j j, m m, int i1, f f1, long l1, 
            long l2, int j1, boolean flag)
    {
        super(i, j, m, i1, l1, l2, j1);
        g = f1;
    }

    public final boolean a(long l1, boolean flag)
    {
        long l2 = l1;
        if (h)
        {
            l2 = l1 - d;
        }
        flag = g.a(l2, flag);
        if (flag)
        {
            f();
        }
        return flag;
    }

    public final boolean a(ah ah1)
    {
        boolean flag1 = true;
        com.google.android.exoplayer.upstream.p p = e();
        boolean flag;
        if (p != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        com.google.android.exoplayer.e.a.b(flag);
        if ((g.a(p, ah1) & 4) != 0)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        if (h && flag)
        {
            ah1.f = ah1.f + d;
        }
        return flag;
    }

    public final ag k()
    {
        return g.c();
    }

    public final Map l()
    {
        return g.b();
    }
}
