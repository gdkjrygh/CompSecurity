// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.media;

import android.content.IntentFilter;
import android.os.Bundle;
import android.view.Display;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package android.support.v7.media:
//            c, u, y, s, 
//            ac, f

public final class ad
{

    private final ac a;
    private final String b;
    private final String c;
    private String d;
    private String e;
    private boolean f;
    private boolean g;
    private final ArrayList h = new ArrayList();
    private int i;
    private int j;
    private int k;
    private int l;
    private int m;
    private Display n;
    private int o;
    private Bundle p;
    private c q;

    ad(ac ac1, String s1, String s2)
    {
        o = -1;
        a = ac1;
        b = s1;
        c = s2;
    }

    static String a(ad ad1)
    {
        return ad1.b;
    }

    static boolean b(ad ad1)
    {
        return ad1.f;
    }

    static String c(ad ad1)
    {
        return ad1.c;
    }

    static c d(ad ad1)
    {
        return ad1.q;
    }

    final int a(c c1)
    {
label0:
        {
            int j1 = 1;
            boolean flag1 = false;
            boolean flag = false;
            int i1 = ((flag1) ? 1 : 0);
            if (q != c1)
            {
                q = c1;
                i1 = ((flag1) ? 1 : 0);
                if (c1 != null)
                {
                    i1 = ((flag) ? 1 : 0);
                    if (!u.a(d, c1.b()))
                    {
                        d = c1.b();
                        i1 = 1;
                    }
                    if (!u.a(e, c1.c()))
                    {
                        e = c1.c();
                        i1 = 1;
                    }
                    if (f != c1.d())
                    {
                        f = c1.d();
                    } else
                    {
                        j1 = i1;
                    }
                    i1 = j1;
                    if (g != c1.e())
                    {
                        g = c1.e();
                        i1 = j1 | true;
                    }
                    j1 = i1;
                    if (!h.equals(c1.f()))
                    {
                        h.clear();
                        h.addAll(c1.f());
                        j1 = i1 | 1;
                    }
                    i1 = j1;
                    if (i != c1.g())
                    {
                        i = c1.g();
                        i1 = j1 | true;
                    }
                    j1 = i1;
                    if (j != c1.h())
                    {
                        j = c1.h();
                        j1 = i1 | 1;
                    }
                    i1 = j1;
                    if (k != c1.k())
                    {
                        k = c1.k();
                        i1 = j1 | 3;
                    }
                    j1 = i1;
                    if (l != c1.i())
                    {
                        l = c1.i();
                        j1 = i1 | 3;
                    }
                    i1 = j1;
                    if (m != c1.j())
                    {
                        m = c1.j();
                        i1 = j1 | 3;
                    }
                    j1 = i1;
                    if (o != c1.l())
                    {
                        o = c1.l();
                        n = null;
                        j1 = i1 | 5;
                    }
                    if (u.a(p, c1.m()))
                    {
                        break label0;
                    }
                    p = c1.m();
                    i1 = j1 | 1;
                }
            }
            return i1;
        }
        return j1;
    }

    public final String a()
    {
        return d;
    }

    public final void a(int i1)
    {
        u.d();
        u.a.a(this, Math.min(m, Math.max(0, i1)));
    }

    public final boolean a(s s1)
    {
        if (s1 == null)
        {
            throw new IllegalArgumentException("selector must not be null");
        } else
        {
            u.d();
            return s1.a(h);
        }
    }

    public final boolean a(String s1)
    {
        if (s1 == null)
        {
            throw new IllegalArgumentException("category must not be null");
        }
        u.d();
        int j1 = h.size();
        for (int i1 = 0; i1 < j1; i1++)
        {
            if (((IntentFilter)h.get(i1)).hasCategory(s1))
            {
                return true;
            }
        }

        return false;
    }

    public final String b()
    {
        return e;
    }

    public final void b(int i1)
    {
        u.d();
        if (i1 != 0)
        {
            u.a.b(this, i1);
        }
    }

    public final boolean c()
    {
        return f;
    }

    public final boolean d()
    {
        return g;
    }

    public final boolean e()
    {
        u.d();
        return u.a.d() == this;
    }

    public final boolean f()
    {
        u.d();
        return u.a.c() == this;
    }

    public final List g()
    {
        return h;
    }

    public final int h()
    {
        return i;
    }

    public final int i()
    {
        return j;
    }

    public final int j()
    {
        return k;
    }

    public final int k()
    {
        return l;
    }

    public final int l()
    {
        return m;
    }

    public final Bundle m()
    {
        return p;
    }

    public final void n()
    {
        u.d();
        u.a.a(this);
    }

    final String o()
    {
        return b;
    }

    final f p()
    {
        return a.a();
    }

    public final String toString()
    {
        return (new StringBuilder("MediaRouter.RouteInfo{ uniqueId=")).append(c).append(", name=").append(d).append(", description=").append(e).append(", enabled=").append(f).append(", connecting=").append(g).append(", playbackType=").append(i).append(", playbackStream=").append(j).append(", volumeHandling=").append(k).append(", volume=").append(l).append(", volumeMax=").append(m).append(", presentationDisplayId=").append(o).append(", extras=").append(p).append(", providerPackageName=").append(a.b()).append(" }").toString();
    }
}
