// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.themestore.detail;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.android.a.aa;
import com.go.weatherex.themestore.an;
import com.jiubang.playsdk.a.k;
import com.jiubang.playsdk.a.y;
import com.jiubang.playsdk.adapter.PackageBroadcastReceiver;
import com.jiubang.playsdk.adapter.c;
import com.jiubang.playsdk.adapter.d;
import com.jiubang.playsdk.d.e;
import com.jiubang.playsdk.detail.a.a;
import com.jiubang.playsdk.main.o;

// Referenced classes of package com.go.weatherex.themestore.detail:
//            m, c, ThemeDetailView, ThemeFullPreview

public class b extends m
    implements k, com.jiubang.playsdk.adapter.b, c, d, com.jiubang.playsdk.detail.a.d
{

    private e n;
    private long o;
    private ThemeDetailView p;
    private PackageBroadcastReceiver q;
    private boolean r;
    private a s;
    private android.view.View.OnClickListener t;

    public b(o o1)
    {
        super(o1);
        r = false;
        t = new com.go.weatherex.themestore.detail.c(this);
        b();
    }

    static e a(b b1)
    {
        return b1.n;
    }

    private void m()
    {
        p = (ThemeDetailView)b;
        p.a(t);
    }

    private void s()
    {
        if (n == null)
        {
            return;
        } else
        {
            m.b.setText(n.b());
            s = new a(a, n);
            s.a(this);
            p.a(s);
            t();
            return;
        }
    }

    private void t()
    {
        if (u())
        {
            p.b(0x7f0804f3);
            return;
        }
        p.b(0x7f0804ed);
        com.jiubang.playsdk.d.a a1 = n.f();
        if (a1 != null && a1.m())
        {
            p.a(0x7f02026c);
            return;
        }
        if (a1 != null && a1.n())
        {
            p.a(0x7f02026c);
            return;
        } else
        {
            p.a(0x7f02026d);
            return;
        }
    }

    private boolean u()
    {
        com.jiubang.playsdk.d.a a1;
        if (!g.a(a))
        {
            if ((a1 = n.f()) != null && a1.h() != 0)
            {
                return false;
            }
        }
        return true;
    }

    public void a(int i1)
    {
        if (b.getParent().getParent() instanceof RelativeLayout)
        {
            RelativeLayout relativelayout = (RelativeLayout)b.getParent().getParent();
            ThemeFullPreview themefullpreview = (ThemeFullPreview)d.inflate(0x7f030111, relativelayout, false);
            themefullpreview.setClickable(true);
            themefullpreview.setFocusable(true);
            themefullpreview.setFocusableInTouchMode(true);
            themefullpreview.requestFocus();
            themefullpreview.a(n, i1);
            relativelayout.addView(themefullpreview);
        }
    }

    public void a(aa aa)
    {
    }

    public void a(e e1)
    {
        n = e1;
    }

    public void a(Object obj)
    {
        b((e)obj);
    }

    public void a(boolean flag, String s1)
    {
        if (!flag && !TextUtils.isEmpty(s1))
        {
            String s2 = j();
            if (!TextUtils.isEmpty(s2) && s1.contains(s2) && (a instanceof Activity))
            {
                ((Activity)a).finish();
            }
        }
    }

    public void b()
    {
        if (q == null)
        {
            q = new PackageBroadcastReceiver(a);
        }
        if (r)
        {
            c();
        }
        q.a(this);
        q.a(this);
        q.a(this);
        a.registerReceiver(q, q.a());
        r = true;
    }

    public void b(e e1)
    {
        if (e1 != null)
        {
            n = e1;
            o();
        }
    }

    public void c()
    {
        a.unregisterReceiver(q);
        q.a(null);
        q.a(null);
        q.a(null);
        r = false;
    }

    protected boolean d()
    {
        return n != null && n.f() != null;
    }

    protected void e()
    {
        m();
        if (d())
        {
            o();
            return;
        }
        if (o == 0L)
        {
            a("no detail data");
            return;
        } else
        {
            q();
            f.a(o, this);
            return;
        }
    }

    protected int f()
    {
        return 0x7f030110;
    }

    protected void g()
    {
        s();
    }

    public void h()
    {
    }

    public void i()
    {
        c();
        if (s != null)
        {
            s.a(null);
        }
    }

    public String j()
    {
        String s2 = "";
        String s1 = s2;
        if (n != null)
        {
            s1 = s2;
            if (n.f() != null)
            {
                s1 = n.f().c();
            }
        }
        return s1;
    }

    public void k()
    {
        if (s != null)
        {
            s.a();
        }
    }

    public void l()
    {
    }
}
