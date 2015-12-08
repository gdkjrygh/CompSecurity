// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.themestore.detail;

import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.go.weatherex.themestore.an;
import com.jiubang.playsdk.a.k;
import com.jiubang.playsdk.a.y;
import com.jiubang.playsdk.adapter.PackageBroadcastReceiver;
import com.jiubang.playsdk.adapter.b;
import com.jiubang.playsdk.adapter.c;
import com.jiubang.playsdk.adapter.d;
import com.jiubang.playsdk.detail.ThemeLocalDetailView;
import com.jiubang.playsdk.detail.a.g;
import com.jiubang.playsdk.detail.a.l;
import com.jiubang.playsdk.detail.a.n;
import com.jiubang.playsdk.f.a;
import com.jiubang.playsdk.f.j;
import com.jiubang.playsdk.main.e;
import com.jiubang.playsdk.main.o;
import com.jiubang.playsdk.views.ConfirmDialogView;
import java.util.List;

// Referenced classes of package com.go.weatherex.themestore.detail:
//            m, g, j, k, 
//            l, h, i, ThemeDetailView, 
//            ThemeFullPreview

public class f extends m
    implements b, c, d, com.jiubang.playsdk.detail.a.d, e
{

    private com.jiubang.playsdk.a.a n;
    private int o;
    private ThemeLocalDetailView p;
    private ThemeDetailView q;
    private g r;
    private l s;
    private com.jiubang.playsdk.detail.a.e t;
    private PackageBroadcastReceiver u;
    private boolean v;
    private k w;
    private Dialog x;
    private ConfirmDialogView y;

    public f(o o1)
    {
        super(o1);
        t = null;
        v = false;
        w = new com.go.weatherex.themestore.detail.g(this);
        b();
    }

    static ThemeLocalDetailView a(f f1)
    {
        return f1.p;
    }

    private void a(int i1, String s1)
    {
        if (x == null)
        {
            x = (new android.app.AlertDialog.Builder(a)).create();
            y = ConfirmDialogView.a(a);
            y.a(new com.go.weatherex.themestore.detail.j(this));
            y.b(new com.go.weatherex.themestore.detail.k(this));
        }
        x.show();
        String s2 = a(a, s1);
        y.a(s2);
        y.a(i1);
        y.b(s1);
        x.setContentView(y);
    }

    private void a(View view)
    {
        view.setClickable(false);
        (new Handler()).postDelayed(new com.go.weatherex.themestore.detail.l(this, view), 500L);
    }

    static void a(f f1, int i1, String s1)
    {
        f1.a(i1, s1);
    }

    static void a(f f1, List list)
    {
        f1.a(list);
    }

    private void a(List list)
    {
        int i1 = v();
        p.b(0x7f0804ee);
        p.c(0x7f020271);
        s = new l(a, list, i1);
        p.c(s);
        p.a(new h(this));
    }

    static Dialog b(f f1)
    {
        return f1.x;
    }

    static void b(f f1, List list)
    {
        f1.b(list);
    }

    private void b(com.jiubang.playsdk.a.a a1)
    {
        a1 = g.c(a, a1);
        p.a(new n(a, a1, o));
    }

    private void b(List list)
    {
        p.b(0x7f0804ef);
        p.c(0x7f020272);
        r = new g(a, list, o);
        p.b(r);
        r.a(new i(this));
    }

    static ConfirmDialogView c(f f1)
    {
        return f1.y;
    }

    private void s()
    {
        o = t();
        if (b instanceof ThemeDetailView)
        {
            q = (ThemeDetailView)b;
            View view = g.a(a, n, this);
            if (view != null)
            {
                com.jiubang.playsdk.f.a.a(view);
                q.addView(view);
            }
        } else
        if (b instanceof ThemeLocalDetailView)
        {
            p = (ThemeLocalDetailView)b;
            return;
        }
    }

    private int t()
    {
        int i1 = a.getResources().getDimensionPixelSize(0x7f0c0018);
        int j1 = a.getResources().getDimensionPixelSize(0x7f0c004b);
        int k1 = com.jiubang.playsdk.f.j.a(2.0F);
        return (u() - i1 * 2 - (j1 + k1) * 2) / 3;
    }

    private int u()
    {
        boolean flag = true;
        if (a.getResources().getConfiguration().orientation != 1)
        {
            flag = false;
        }
        if (flag)
        {
            return j.c;
        } else
        {
            return j.d;
        }
    }

    private int v()
    {
        int i1 = a.getResources().getDimensionPixelSize(0x7f0c0018);
        int j1 = a.getResources().getDimensionPixelSize(0x7f0c001d);
        return (u() - i1 * 2 - j1 * 2) / 3;
    }

    private boolean w()
    {
        return n.f();
    }

    private void x()
    {
        q.a(n);
        z();
        if (n.g())
        {
            q.a(g.a(a, n));
            return;
        } else
        {
            java.util.ArrayList arraylist = g.c(a, n);
            t = new com.jiubang.playsdk.detail.a.e(a, arraylist);
            t.a(this);
            q.a(t);
            return;
        }
    }

    private void y()
    {
        b(n);
        z();
        j();
    }

    private void z()
    {
        if (n.e())
        {
            m.g.setVisibility(0);
        } else
        {
            m.g.setVisibility(8);
        }
        if (!g.e(a, n)) goto _L2; else goto _L1
_L1:
        if (p != null)
        {
            p.a(0x7f0804e8);
            p.a(this);
        }
        if (q != null)
        {
            q.b(0x7f0804e8);
            q.a(this);
        }
_L4:
        return;
_L2:
        if (!g.j(a, n))
        {
            break; /* Loop/switch isn't completed */
        }
        if (p != null)
        {
            p.a(0x7f080508);
            p.a(this);
        }
        if (q != null)
        {
            q.b(0x7f080508);
            q.a(this);
            return;
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (g.d(a, n))
        {
            break; /* Loop/switch isn't completed */
        }
        if (p != null)
        {
            p.a(0x7f0804f0);
            p.a(this);
        }
        if (q != null)
        {
            q.b(0x7f0804f0);
            q.a(this);
            return;
        }
        if (true) goto _L4; else goto _L5
_L5:
        if (p != null)
        {
            p.a(0x7f0804f1);
        }
        if (q != null)
        {
            q.b(0x7f0804f1);
            q.a(false);
            return;
        }
        if (true) goto _L4; else goto _L6
_L6:
    }

    public String a(Context context, String s1)
    {
        int i1;
        if ("com.jb.gokeyboard".equals(s1))
        {
            i1 = 0x7f080504;
        } else
        if ("com.gau.go.launcherex".equals(s1))
        {
            i1 = 0x7f080501;
        } else
        if ("com.jiubang.goscreenlock".equals(s1))
        {
            i1 = 0x7f080503;
        } else
        if ("com.jb.gosms".equals(s1))
        {
            i1 = 0x7f080500;
        } else
        {
            i1 = 0x7f080502;
        }
        return context.getString(0x7f0804fe, new Object[] {
            context.getString(i1)
        });
    }

    public void a(int i1)
    {
        if (t != null && (b.getParent().getParent() instanceof RelativeLayout))
        {
            RelativeLayout relativelayout = (RelativeLayout)b.getParent().getParent();
            ThemeFullPreview themefullpreview = (ThemeFullPreview)d.inflate(0x7f030111, relativelayout, false);
            themefullpreview.setClickable(true);
            themefullpreview.setFocusable(true);
            themefullpreview.setFocusableInTouchMode(true);
            themefullpreview.requestFocus();
            themefullpreview.a(t.a(), i1);
            relativelayout.addView(themefullpreview);
        }
    }

    public void a(com.jiubang.playsdk.a.a a1)
    {
        n = a1;
    }

    public void a(boolean flag, String s1)
    {
        if (r != null)
        {
            r.a();
            r.notifyDataSetChanged();
        }
        if (s != null)
        {
            s.a();
            s.notifyDataSetChanged();
        }
    }

    public void b()
    {
        if (u == null)
        {
            u = new PackageBroadcastReceiver(a);
        }
        if (v)
        {
            c();
        }
        u.a(this);
        u.a(this);
        u.a(this);
        a.registerReceiver(u, u.a());
        v = true;
    }

    public void c()
    {
        a.unregisterReceiver(u);
        u.a(null);
        u.a(null);
        u.a(null);
        v = false;
    }

    protected boolean d()
    {
        return n != null;
    }

    protected void e()
    {
        s();
        if (d())
        {
            o();
            return;
        } else
        {
            a("no detail data");
            return;
        }
    }

    protected int f()
    {
        int i1 = 0x7f0300b4;
        if (w())
        {
            i1 = 0x7f030110;
        }
        return i1;
    }

    protected void g()
    {
        p();
        if (q != null)
        {
            x();
        } else
        if (p != null)
        {
            y();
            return;
        }
    }

    public void h()
    {
        if (n == null)
        {
            return;
        } else
        {
            String s1 = com.jiubang.playsdk.f.e.d(a);
            s1 = n.f(s1);
            m.b.setText(s1);
            return;
        }
    }

    public void i()
    {
        if (t != null)
        {
            t = null;
        }
        if (s != null)
        {
            s = null;
        }
        if (r != null)
        {
            r = null;
        }
        c();
    }

    protected void j()
    {
        p.a();
        String s1 = n.a();
        com.jiubang.playsdk.a.y.a().a(s1, 1, f.b().l(), w);
    }

    public void k()
    {
        z();
    }

    public void l()
    {
    }

    public void m()
    {
        z();
    }

    public void onClick(View view)
    {
        if (view.getId() != 0x7f090539 && view.getId() != 0x7f0903f9)
        {
            break MISSING_BLOCK_LABEL_112;
        }
        if (!g.j(a, n) || g.e(a, n)) goto _L2; else goto _L1
_L1:
        g.k(a, n);
_L4:
        return;
_L2:
        if (g.d(a, n)) goto _L4; else goto _L3
_L3:
        g.f(a, n);
        a(view);
        return;
        super.onClick(view);
        return;
    }
}
