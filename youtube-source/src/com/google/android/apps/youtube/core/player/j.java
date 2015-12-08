// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.player;

import android.content.Context;
import android.net.Uri;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.google.android.apps.youtube.medialib.player.n;
import com.google.android.apps.youtube.medialib.player.o;
import java.util.Map;
import java.util.Set;

public abstract class j
    implements n, o
{

    protected final n a;
    private o b;

    public j(n n1)
    {
        a = n1;
        n1.a(this);
    }

    public final void a()
    {
        a.a();
    }

    public final void a(float f1, float f2)
    {
        a.a(f1, f2);
    }

    public void a(int i)
    {
        a.a(i);
    }

    public void a(Context context, Uri uri, Map map)
    {
        a.a(context, uri, map);
    }

    public final void a(Surface surface)
    {
        a.a(surface);
    }

    public final void a(SurfaceHolder surfaceholder)
    {
        a.a(surfaceholder);
    }

    public void a(n n1)
    {
        if (b != null)
        {
            b.a(this);
        }
    }

    public void a(o o1)
    {
        b = o1;
    }

    public final void a(boolean flag)
    {
        a.a(flag);
    }

    public final boolean a(int i, int k)
    {
        if (b != null)
        {
            return b.a(i, k);
        } else
        {
            return false;
        }
    }

    public boolean a(n n1, int i, int k)
    {
        if (b != null)
        {
            return b.a(this, i, k);
        } else
        {
            return false;
        }
    }

    public void b()
    {
        a.b();
    }

    public final void b(int i)
    {
        a.b(i);
    }

    public final void b(n n1)
    {
        if (b != null)
        {
            b.b(this);
        }
    }

    public final void b(n n1, int i, int k)
    {
        if (b != null)
        {
            b.b(this, i, k);
        }
    }

    public void c()
    {
        a.c();
    }

    public final void c(int i)
    {
        a.c(i);
    }

    public void d()
    {
        a.d();
    }

    public void d(int i)
    {
        e(i);
    }

    public int e()
    {
        return a.e();
    }

    protected final void e(int i)
    {
        if (b != null)
        {
            b.d(i);
        }
    }

    public final int f()
    {
        return a.f();
    }

    public final void g()
    {
        if (b != null)
        {
            b.g();
        }
    }

    public Set h()
    {
        return a.h();
    }
}
