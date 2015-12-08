// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads.a;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.webkit.WebView;
import android.widget.RelativeLayout;
import com.facebook.ads.AdListener;
import com.facebook.ads.AdSize;
import com.facebook.ads.AdView;
import com.facebook.ads.ImpressionListener;

// Referenced classes of package com.facebook.ads.a:
//            d, z, r, s, 
//            n, k, o, y, 
//            p, b, c

public class q extends RelativeLayout
    implements d
{

    private static final String a = com/facebook/ads/a/q.getSimpleName();
    private final AdView b;
    private final String c;
    private final AdSize d;
    private AdListener e;
    private ImpressionListener f;
    private WebView g;
    private k h;
    private z i;
    private final DisplayMetrics j;
    private int k;
    private long l;
    private b.a m;

    public q(AdView adview, String s1, AdSize adsize)
    {
        super(adview.getContext());
        e = null;
        f = null;
        if (adsize == null || adsize == AdSize.INTERSTITIAL)
        {
            throw new IllegalArgumentException("adSize");
        } else
        {
            b = adview;
            c = s1;
            d = adsize;
            j = getContext().getResources().getDisplayMetrics();
            a(getContext());
            i = new z(g, new _cls1(), 1000L, getContext());
            return;
        }
    }

    static int a(q q1, int i1)
    {
        q1.k = i1;
        return i1;
    }

    static long a(q q1, long l1)
    {
        q1.l = l1;
        return l1;
    }

    static b.a a(q q1, b.a a1)
    {
        q1.m = a1;
        return a1;
    }

    private void a(Context context)
    {
        g = new WebView(context);
        g.setVisibility(8);
        s.a(g, new a(null), new r());
        addView(g);
        h();
        if (d == AdSize.BANNER_HEIGHT_90)
        {
            context = n.d;
        } else
        if (d == AdSize.BANNER_HEIGHT_50)
        {
            context = n.c;
        } else
        {
            context = com.facebook.ads.a.n.b;
        }
        h = new k(getContext(), c, d, context, true, o.a, 1, e());
    }

    static void a(q q1, y y1)
    {
        q1.a(y1);
    }

    private void a(y y1)
    {
        if (g != null)
        {
            g.loadUrl("about:blank");
            g.clearCache(true);
            g.setVisibility(8);
            l = 0L;
            m = null;
            g.loadDataWithBaseURL(s.a(), y1.c(), "text/html", "utf-8", null);
            g.setVisibility(0);
        }
    }

    static boolean a(q q1)
    {
        return q1.g();
    }

    static k b(q q1)
    {
        return q1.h;
    }

    static ImpressionListener c(q q1)
    {
        return q1.f;
    }

    static AdView d(q q1)
    {
        return q1.b;
    }

    static String d()
    {
        return a;
    }

    private j.b e()
    {
        return new _cls2();
    }

    static z e(q q1)
    {
        return q1.i;
    }

    static AdListener f(q q1)
    {
        return q1.e;
    }

    private void f()
    {
        if (h == null)
        {
            throw new RuntimeException("No request controller available, has the AdView been destroyed?");
        } else
        {
            return;
        }
    }

    private boolean g()
    {
        int i1 = (int)Math.ceil((float)d.getWidth() * j.density);
        int j1 = (int)Math.ceil((float)d.getHeight() * j.density);
        return p.a(getContext(), this, i1, j1, k);
    }

    private void h()
    {
        if (g != null)
        {
            android.widget.RelativeLayout.LayoutParams layoutparams;
            int i1;
            if ((int)((float)j.widthPixels / j.density) >= d.getWidth())
            {
                i1 = j.widthPixels;
            } else
            {
                i1 = (int)Math.ceil((float)d.getWidth() * j.density);
            }
            layoutparams = new android.widget.RelativeLayout.LayoutParams(i1, (int)Math.ceil((float)d.getHeight() * j.density));
            layoutparams.addRule(14);
            g.setLayoutParams(layoutparams);
        }
    }

    public void a()
    {
        h.a();
    }

    public void b()
    {
        f();
        h.b();
    }

    public void c()
    {
        if (h != null)
        {
            h.c();
            h = null;
        }
        i.c();
        i.g();
        if (g != null)
        {
            s.a(g);
            removeView(g);
            g.destroy();
            g = null;
        }
    }

    protected void onConfigurationChanged(Configuration configuration)
    {
        super.onConfigurationChanged(configuration);
        h();
    }

    protected void onWindowVisibilityChanged(int i1)
    {
        super.onWindowVisibilityChanged(i1);
        if (h != null)
        {
            h.a(i1);
        }
        if (i1 == 0)
        {
            i.b();
            if (l > 0L && m != null)
            {
                com.facebook.ads.a.c.a(com.facebook.ads.a.b.a(l, m));
            }
            return;
        } else
        {
            i.c();
            return;
        }
    }

    public void setAdListener(AdListener adlistener)
    {
        e = adlistener;
    }

    public void setImpressionListener(ImpressionListener impressionlistener)
    {
        f = impressionlistener;
    }


    private class _cls1
        implements f.a
    {

        final q a;

        public boolean a()
        {
            return q.a(a);
        }

        public void b()
        {
            if (com.facebook.ads.a.q.b(a) != null)
            {
                com.facebook.ads.a.q.b(a).a("on imp sent");
            }
        }

        public void c()
        {
            if (q.c(a) != null)
            {
                q.c(a).onLoggingImpression(q.d(a));
            }
        }

        public boolean d()
        {
            return false;
        }

        _cls1()
        {
            a = q.this;
            super();
        }
    }


    private class a extends WebViewClient
    {

        final q a;

        public void onLoadResource(WebView webview, String s1)
        {
            q.e(a).f();
        }

        public void onReceivedSslError(WebView webview, SslErrorHandler sslerrorhandler, SslError sslerror)
        {
            if (p.a())
            {
                sslerrorhandler.proceed();
                return;
            } else
            {
                sslerrorhandler.cancel();
                return;
            }
        }

        public boolean shouldOverrideUrlLoading(WebView webview, String s1)
        {
            if (q.f(a) != null)
            {
                q.f(a).onAdClicked(q.d(a));
            }
            webview = Uri.parse(s1);
            webview = com.facebook.ads.a.a.b.a(a.getContext(), webview);
            s1 = ((y)q.e(a).a()).j();
            s1.put("adInterstitialUniqueId", UUID.randomUUID().toString());
            if (webview != null)
            {
                try
                {
                    q.a(a, webview.a());
                    q.a(a, System.currentTimeMillis());
                    webview.a(s1);
                }
                // Misplaced declaration of an exception variable
                catch (WebView webview)
                {
                    Log.e(q.d(), "Error executing action", webview);
                }
            }
            return true;
        }

        private a()
        {
            a = q.this;
            super();
        }

        a(_cls1 _pcls1)
        {
            this();
        }
    }


    private class _cls2
        implements j.b
    {

        final q a;

        public void a(AdError aderror)
        {
            q.e(a).c();
            if (q.f(a) != null)
            {
                q.f(a).onError(q.d(a), aderror);
            }
        }

        public void a(l l1)
        {
            e e1;
            q.e(a).c();
            e1 = l1.d();
            if (e1 == null || !(e1 instanceof y)) goto _L2; else goto _L1
_L1:
            q.e(a).a((y)e1);
            q.a(a, (y)e1);
            if (q.f(a) != null)
            {
                q.f(a).onAdLoaded(q.d(a));
            }
            q.a(a, l1.c());
_L4:
            return;
_L2:
            if (e1 != null)
            {
                break; /* Loop/switch isn't completed */
            }
            if (q.f(a) != null)
            {
                AdListener adlistener = q.f(a);
                AdView adview = q.d(a);
                if (l1.e() != null)
                {
                    l1 = l1.e();
                } else
                {
                    l1 = AdError.INTERNAL_ERROR;
                }
                adlistener.onError(adview, l1);
            }
            if (com.facebook.ads.a.q.b(a) != null)
            {
                com.facebook.ads.a.q.b(a).a("on no fill");
                return;
            }
            if (true) goto _L4; else goto _L3
_L3:
            if (q.f(a) != null)
            {
                q.f(a).onError(q.d(a), AdError.INTERNAL_ERROR);
            }
            if (com.facebook.ads.a.q.b(a) != null)
            {
                com.facebook.ads.a.q.b(a).a("on internal error");
                return;
            }
            if (true) goto _L4; else goto _L5
_L5:
        }

        _cls2()
        {
            a = q.this;
            super();
        }
    }

}
