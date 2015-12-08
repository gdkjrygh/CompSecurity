// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.media;

import android.content.ComponentName;
import android.content.Context;
import android.os.Handler;

// Referenced classes of package android.support.v7.media:
//            h, i, g, u, 
//            e, k, j

public abstract class f
{

    private final Context a;
    private final i b;
    private final h c;
    private g d;
    private e e;
    private boolean f;
    private k g;
    private boolean h;

    public f(Context context)
    {
        this(context, null);
    }

    f(Context context, i j)
    {
        c = new h(this, (byte)0);
        if (context == null)
        {
            throw new IllegalArgumentException("context must not be null");
        }
        a = context;
        if (j == null)
        {
            b = new i(new ComponentName(context, getClass()));
            return;
        } else
        {
            b = j;
            return;
        }
    }

    static void a(f f1)
    {
        f1.h = false;
        if (f1.d != null)
        {
            f1.d.a(f1, f1.g);
        }
    }

    static void b(f f1)
    {
        f1.f = false;
        f1.b(f1.e);
    }

    public final Context a()
    {
        return a;
    }

    public j a(String s)
    {
        return null;
    }

    public final void a(e e1)
    {
        u.d();
        if (e != e1 && (e == null || !e.equals(e1)))
        {
            e = e1;
            if (!f)
            {
                f = true;
                c.sendEmptyMessage(2);
                return;
            }
        }
    }

    public final void a(g g1)
    {
        u.d();
        d = g1;
    }

    public final void a(k k)
    {
        u.d();
        if (g != k)
        {
            g = k;
            if (!h)
            {
                h = true;
                c.sendEmptyMessage(1);
            }
        }
    }

    public final Handler b()
    {
        return c;
    }

    public void b(e e1)
    {
    }

    public final i c()
    {
        return b;
    }

    public final e d()
    {
        return e;
    }

    public final k e()
    {
        return g;
    }
}
