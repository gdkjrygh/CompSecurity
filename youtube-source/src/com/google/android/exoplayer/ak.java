// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer;

import com.google.android.exoplayer.e.a;

// Referenced classes of package com.google.android.exoplayer:
//            e

public abstract class ak
    implements e
{

    private int a;

    public ak()
    {
    }

    protected abstract int a();

    public void a(int l, Object obj)
    {
    }

    protected abstract void a(long l);

    protected void a(long l, boolean flag)
    {
    }

    protected void b()
    {
    }

    protected abstract void b(long l);

    final void b(long l, boolean flag)
    {
        boolean flag1 = true;
        if (a != 1)
        {
            flag1 = false;
        }
        com.google.android.exoplayer.e.a.b(flag1);
        a = 2;
        a(l, flag);
    }

    protected void c()
    {
    }

    protected abstract long d();

    protected abstract long e();

    protected abstract long f();

    protected void g()
    {
    }

    protected void h()
    {
    }

    protected abstract boolean i();

    protected abstract boolean j();

    protected boolean k()
    {
        return false;
    }

    protected final int p()
    {
        return a;
    }

    final int q()
    {
label0:
        {
            boolean flag1 = false;
            boolean flag;
            if (a == 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            com.google.android.exoplayer.e.a.b(flag);
            a = a();
            if (a != 0 && a != 1)
            {
                flag = flag1;
                if (a != -1)
                {
                    break label0;
                }
            }
            flag = true;
        }
        com.google.android.exoplayer.e.a.b(flag);
        return a;
    }

    final void r()
    {
        boolean flag;
        if (a == 2)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        com.google.android.exoplayer.e.a.b(flag);
        a = 3;
        g();
    }

    final void s()
    {
        boolean flag;
        if (a == 3)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        com.google.android.exoplayer.e.a.b(flag);
        a = 2;
        h();
    }

    final void t()
    {
        boolean flag;
        if (a == 2)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        com.google.android.exoplayer.e.a.b(flag);
        a = 1;
        b();
    }

    final void u()
    {
        boolean flag;
        if (a != 2 && a != 3 && a != -2)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        com.google.android.exoplayer.e.a.b(flag);
        a = -2;
        c();
    }
}
