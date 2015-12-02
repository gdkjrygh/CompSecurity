// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.google.android.gms.ads.internal.InterstitialAdParameterParcel;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;

public final class me extends afm
    implements mp
{

    static final int a = Color.argb(0, 0, 0, 0);
    AdOverlayInfoParcel b;
    ml c;
    akk d;
    mh e;
    mn f;
    boolean g;
    FrameLayout h;
    android.webkit.WebChromeClient.CustomViewCallback i;
    boolean j;
    boolean k;
    RelativeLayout l;
    boolean m;
    int n;
    private final Activity o;
    private boolean p;
    private boolean q;
    private boolean r;

    public me(Activity activity)
    {
        g = false;
        j = false;
        k = false;
        m = false;
        n = 0;
        q = false;
        r = true;
        o = activity;
    }

    private void a(boolean flag)
    {
        android.widget.RelativeLayout.LayoutParams layoutparams;
        byte byte0;
        if (flag)
        {
            byte0 = 50;
        } else
        {
            byte0 = 32;
        }
        f = new mn(o, byte0, this);
        layoutparams = new android.widget.RelativeLayout.LayoutParams(-2, -2);
        layoutparams.addRule(10);
        if (flag)
        {
            byte0 = 11;
        } else
        {
            byte0 = 9;
        }
        layoutparams.addRule(byte0);
        f.a(flag, b.h);
        l.addView(f, layoutparams);
    }

    private void b(int i1)
    {
        d.a(i1);
    }

    private void b(boolean flag)
    {
        if (!p)
        {
            o.requestWindowFeature(1);
        }
        Object obj = o.getWindow();
        if (obj == null)
        {
            throw new mf("Invalid activity, no window available.");
        }
        if (!k || b.q != null && b.q.c)
        {
            ((Window) (obj)).setFlags(1024, 1024);
        }
        boolean flag3 = b.e.i().b();
        m = false;
        if (flag3)
        {
            if (b.k == ot.g().a())
            {
                boolean flag1;
                if (o.getResources().getConfiguration().orientation == 1)
                {
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
                m = flag1;
            } else
            if (b.k == ot.g().b())
            {
                boolean flag2;
                if (o.getResources().getConfiguration().orientation == 2)
                {
                    flag2 = true;
                } else
                {
                    flag2 = false;
                }
                m = flag2;
            }
        }
        of.a((new StringBuilder("Delay onShow to next orientation change: ")).append(m).toString());
        a(b.k);
        if (ot.g().a(((Window) (obj))))
        {
            of.a("Hardware acceleration on the AdActivity window enabled.");
        }
        if (!k)
        {
            l.setBackgroundColor(0xff000000);
        } else
        {
            l.setBackgroundColor(a);
        }
        o.setContentView(l);
        k();
        if (flag)
        {
            ot.f();
            d = akp.a(o, b.e.h(), true, flag3, null, b.n);
            d.i().a(null, null, b.f, b.j, true, b.o, null, b.e.i().a(), null);
            d.i().a(new _cls1());
            if (b.m != null)
            {
                d.loadUrl(b.m);
            } else
            if (b.i != null)
            {
                d.loadDataWithBaseURL(b.g, b.i, "text/html", "UTF-8", null);
            } else
            {
                throw new mf("No URL or HTML to display in ad overlay.");
            }
            if (b.e != null)
            {
                b.e.b(this);
            }
        } else
        {
            d = b.e;
            d.a(o);
        }
        d.a(this);
        obj = d.getParent();
        if (obj != null && (obj instanceof ViewGroup))
        {
            ((ViewGroup)obj).removeView(d.a());
        }
        if (k)
        {
            d.setBackgroundColor(a);
        }
        l.addView(d.a(), -1, -1);
        if (!flag && !m)
        {
            o();
        }
        a(flag3);
        if (d.j())
        {
            a(flag3, true);
        }
    }

    private void n()
    {
        if (o.isFinishing() && !q)
        {
            q = true;
            if (o.isFinishing())
            {
                if (d != null)
                {
                    b(n);
                    l.removeView(d.a());
                    if (e != null)
                    {
                        d.a(e.d);
                        d.a(false);
                        e.c.addView(d.a(), e.a, e.b);
                        e = null;
                    }
                }
                if (b != null && b.d != null)
                {
                    b.d.l();
                    return;
                }
            }
        }
    }

    private void o()
    {
        d.c();
    }

    public final void a()
    {
        n = 2;
        o.finish();
    }

    public final void a(int i1)
    {
        o.setRequestedOrientation(i1);
    }

    public final void a(int i1, int j1, int k1, int l1)
    {
        if (c != null)
        {
            c.a(i1, j1, k1, l1);
        }
    }

    public final void a(Bundle bundle)
    {
        boolean flag = false;
        if (bundle != null)
        {
            flag = bundle.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false);
        }
        j = flag;
        b = AdOverlayInfoParcel.a(o.getIntent());
        if (b == null)
        {
            throw new mf("Could not get info for ad overlay.");
        }
          goto _L1
_L10:
        return;
_L1:
        if (o.getIntent() != null)
        {
            r = o.getIntent().getBooleanExtra("shouldCallOnOverlayOpened", true);
        }
        if (b.q == null) goto _L3; else goto _L2
_L2:
        k = b.q.b;
_L9:
        if (bundle != null)
        {
            break MISSING_BLOCK_LABEL_191;
        }
        if (b.d != null && r)
        {
            b.d.m();
        }
        if (b.l != 1 && b.c != null)
        {
            b.c.e();
        }
        l = new mg(o, b.p);
        b.l;
        JVM INSTR tableswitch 1 4: default 368
    //                   1 271
    //                   2 277
    //                   3 301
    //                   4 307;
           goto _L4 _L5 _L6 _L7 _L8
_L4:
        throw new mf("Could not determine ad overlay type.");
_L3:
        k = false;
          goto _L9
_L5:
        try
        {
            b(false);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            of.e(bundle.getMessage());
            n = 3;
            o.finish();
        }
          goto _L10
_L6:
        e = new mh(b.e);
        b(false);
        return;
_L7:
        b(true);
        return;
_L8:
        if (j)
        {
            n = 3;
            o.finish();
            return;
        }
        ot.b();
        if (!mc.a(o, b.b, b.j))
        {
            n = 3;
            o.finish();
            return;
        }
          goto _L10
    }

    public final void a(View view, android.webkit.WebChromeClient.CustomViewCallback customviewcallback)
    {
        h = new FrameLayout(o);
        h.setBackgroundColor(0xff000000);
        h.addView(view, -1, -1);
        o.setContentView(h);
        k();
        i = customviewcallback;
        g = true;
    }

    public final void a(boolean flag, boolean flag1)
    {
        if (f != null)
        {
            f.a(flag, flag1);
        }
    }

    public final ml b()
    {
        return c;
    }

    public final void b(int i1, int j1, int k1, int l1)
    {
        if (c == null)
        {
            c = new ml(o, d);
            l.addView(c, 0, new android.view.ViewGroup.LayoutParams(-1, -1));
            c.a(i1, j1, k1, l1);
            d.i().a(false);
        }
    }

    public final void b(Bundle bundle)
    {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", j);
    }

    public final void c()
    {
        if (b != null && g)
        {
            a(b.k);
        }
        if (h != null)
        {
            o.setContentView(l);
            k();
            h.removeAllViews();
            h = null;
        }
        if (i != null)
        {
            i.onCustomViewHidden();
            i = null;
        }
        g = false;
    }

    public final void d()
    {
        n = 1;
        o.finish();
    }

    public final void e()
    {
    }

    public final void f()
    {
    }

    public final void g()
    {
        if (b != null && b.l == 4)
        {
            if (j)
            {
                n = 3;
                o.finish();
            } else
            {
                j = true;
            }
        }
        if (d != null && !d.o())
        {
            ot.g().b(d.a());
            return;
        } else
        {
            of.e("The webview does not exit. Ignoring action.");
            return;
        }
    }

    public final void h()
    {
        if (c != null)
        {
            c.c();
        }
        c();
        if (d != null && (!o.isFinishing() || e == null))
        {
            ot.g().a(d.a());
        }
        n();
    }

    public final void i()
    {
        n();
    }

    public final void j()
    {
        if (c != null)
        {
            c.a();
        }
        if (d != null)
        {
            l.removeView(d.a());
        }
        n();
    }

    public final void k()
    {
        p = true;
    }

    public final void l()
    {
        l.removeView(f);
        a(true);
    }

    public final void m()
    {
        if (m)
        {
            m = false;
            o();
        }
    }


    /* member class not found */
    class _cls1 {}

}
