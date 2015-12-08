// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;

// Referenced classes of package com.google.android.gms.internal:
//            bn, br, cz, bu, 
//            do, db, ds, bf, 
//            bg, bt, bd, dj

public final class bp extends bn
{

    private final Activity a;
    private br b;
    private bt c;
    private db d;
    private bg e;
    private bu f;
    private FrameLayout g;
    private android.webkit.WebChromeClient.CustomViewCallback h;
    private boolean i;
    private boolean j;
    private RelativeLayout k;

    public bp(Activity activity)
    {
        i = false;
        j = false;
        a = activity;
    }

    public static void a(Context context, br br1)
    {
        Intent intent = new Intent();
        intent.setClassName(context, "com.google.android.gms.ads.AdActivity");
        intent.putExtra("com.google.android.gms.ads.internal.overlay.useClientJar", br1.en.iP);
        br.a(intent, br1);
        intent.addFlags(0x80000);
        context.startActivity(intent);
    }

    private void b(boolean flag)
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
        f = new bu(a, byte0);
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
        f.a(b.gP);
        k.addView(f, layoutparams);
    }

    private static android.widget.RelativeLayout.LayoutParams c(int l, int i1, int j1, int k1)
    {
        android.widget.RelativeLayout.LayoutParams layoutparams = new android.widget.RelativeLayout.LayoutParams(j1, k1);
        layoutparams.setMargins(l, i1, 0, 0);
        layoutparams.addRule(10);
        layoutparams.addRule(9);
        return layoutparams;
    }

    private void c(boolean flag)
    {
        a.requestWindowFeature(1);
        Window window = a.getWindow();
        window.setFlags(1024, 1024);
        a(b.orientation);
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            com.google.android.gms.internal.do.a("Enabling hardware acceleration on the AdActivity window.");
            window.setFlags(0x1000000, 0x1000000);
        }
        k = new RelativeLayout(a);
        k.setBackgroundColor(0xff000000);
        a.setContentView(k);
        boolean flag1 = b.gM.e().a();
        if (flag)
        {
            d = db.a(a, b.gM.d(), true, flag1, null, b.en);
            d.e().a(null, null, b.gN, b.gR, true);
            d.e().a(new bf(this));
            if (b.url != null)
            {
                d.loadUrl(b.url);
            } else
            if (b.gQ != null)
            {
                d.loadDataWithBaseURL(b.gO, b.gQ, "text/html", "UTF-8", null);
            } else
            {
                throw new a("No URL or HTML to display in ad overlay.");
            }
        } else
        {
            d = b.gM;
            d.setContext(a);
        }
        d.a(this);
        k.addView(d, -1, -1);
        if (!flag)
        {
            d.b();
        }
        b(flag1);
    }

    private void k()
    {
        if (a.isFinishing() && !j)
        {
            j = true;
            if (a.isFinishing())
            {
                if (d != null)
                {
                    d.a();
                    k.removeView(d);
                    if (e != null)
                    {
                        d.a(false);
                        e.c.addView(d, e.a, e.b);
                    }
                }
                if (b != null && b.gL != null)
                {
                    bi bi = b.gL;
                    return;
                }
            }
        }
    }

    public final void a()
    {
        a.finish();
    }

    public final void a(int l)
    {
        a.setRequestedOrientation(l);
    }

    public final void a(int l, int i1, int j1, int k1)
    {
        if (c != null)
        {
            c.setLayoutParams(c(l, i1, j1, k1));
        }
    }

    public final void a(Bundle bundle)
    {
        boolean flag = false;
        if (bundle != null)
        {
            flag = bundle.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false);
        }
        i = flag;
        b = br.a(a.getIntent());
        if (b == null)
        {
            throw new a("Could not get info for ad overlay.");
        }
          goto _L1
_L7:
        return;
_L1:
        if (bundle != null)
        {
            break MISSING_BLOCK_LABEL_119;
        }
        if (b.gL != null)
        {
            bundle = b.gL;
        }
        if (b.gS != 1 && b.gK != null)
        {
            bundle = b.gK;
        }
        b.gS;
        JVM INSTR tableswitch 1 4: default 250
    //                   1 167
    //                   2 173
    //                   3 197
    //                   4 203;
           goto _L2 _L3 _L4 _L5 _L6
_L2:
        throw new a("Could not determine ad overlay type.");
_L3:
        c(false);
        return;
_L4:
        try
        {
            e = new bg(b.gM);
            c(false);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            com.google.android.gms.internal.do.d(bundle.getMessage());
            a.finish();
        }
          goto _L7
_L5:
        c(true);
        return;
_L6:
        if (i)
        {
            a.finish();
            return;
        }
        if (bd.a(a, b.gJ, b.gR)) goto _L7; else goto _L8
_L8:
        a.finish();
        return;
    }

    public final void a(View view, android.webkit.WebChromeClient.CustomViewCallback customviewcallback)
    {
        g = new FrameLayout(a);
        g.setBackgroundColor(0xff000000);
        g.addView(view, -1, -1);
        a.setContentView(g);
        h = customviewcallback;
    }

    public final void a(boolean flag)
    {
        if (f != null)
        {
            f.a(flag);
        }
    }

    public final bt b()
    {
        return c;
    }

    public final void b(int l, int i1, int j1, int k1)
    {
        if (c == null)
        {
            c = new bt(a, d);
            k.addView(c, 0, c(l, i1, j1, k1));
            d.e().a(false);
        }
    }

    public final void b(Bundle bundle)
    {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", i);
    }

    public final void c()
    {
        if (b != null)
        {
            a(b.orientation);
        }
        if (g != null)
        {
            a.setContentView(k);
            g.removeAllViews();
            g = null;
        }
        if (h != null)
        {
            h.onCustomViewHidden();
            h = null;
        }
    }

    public final void d()
    {
    }

    public final void e()
    {
    }

    public final void f()
    {
        if (b != null && b.gS == 4)
        {
            if (i)
            {
                a.finish();
            } else
            {
                i = true;
            }
        }
        if (d != null)
        {
            dj.b(d);
        }
    }

    public final void g()
    {
        if (c != null)
        {
            c.c();
        }
        c();
        if (d != null && (!a.isFinishing() || e == null))
        {
            dj.a(d);
        }
        k();
    }

    public final void h()
    {
        k();
    }

    public final void i()
    {
        if (c != null)
        {
            c.a();
        }
        if (d != null)
        {
            k.removeView(d);
        }
        k();
    }

    public final void j()
    {
        k.removeView(f);
        b(true);
    }

    private class a extends Exception
    {

        public a(String s)
        {
            super(s);
        }
    }

}
