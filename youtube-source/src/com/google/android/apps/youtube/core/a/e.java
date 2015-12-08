// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.a;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.youtube.common.fromguava.c;
import java.util.Set;

// Referenced classes of package com.google.android.apps.youtube.core.a:
//            g, f

public abstract class e
{

    public static final g a = new g("IGNORE_VIEW_TYPE");
    private f b;
    private boolean c;

    public e()
    {
        c = true;
    }

    public abstract View a(int i, View view, ViewGroup viewgroup);

    public abstract Object a(int i);

    final void a(f f1)
    {
        b = f1;
    }

    protected abstract void a(Set set);

    public final void a(boolean flag)
    {
        if (c)
        {
            if (!c)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            c = flag;
            f();
        }
    }

    public abstract int b();

    public boolean b(int i)
    {
        boolean flag;
        if (i < b())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        com.google.android.apps.youtube.common.fromguava.c.a(flag, (new StringBuilder()).append(i).append(" out of range 0..").append(b() - 1).toString());
        return true;
    }

    public boolean c()
    {
        return false;
    }

    public abstract g e(int i);

    public long f(int i)
    {
        return (long)i;
    }

    protected final void f()
    {
        if (b != null)
        {
            b.a(this);
        }
    }

    final int g()
    {
        if (c)
        {
            return b();
        } else
        {
            return 0;
        }
    }

}
