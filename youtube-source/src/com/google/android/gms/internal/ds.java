// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.net.Uri;
import android.net.UrlQuerySanitizer;
import android.os.Handler;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.google.android.gms.internal:
//            y, do, db, bp, 
//            ac, br, o, q, 
//            dn, dt, du, i, 
//            hh, bo, ka, bi, 
//            p, bl

public class ds extends WebViewClient
{

    protected final db a;
    private final HashMap b = new HashMap();
    private final Object c = new Object();
    private ka d;
    private bi e;
    private du f;
    private p g;
    private boolean h;
    private boolean i;
    private bl j;

    public ds(db db1, boolean flag)
    {
        h = false;
        a = db1;
        i = flag;
    }

    private void a(Uri uri)
    {
        String s = uri.getPath();
        y y1 = (y)b.get(s);
        if (y1 != null)
        {
            HashMap hashmap = new HashMap();
            Object obj = new UrlQuerySanitizer();
            ((UrlQuerySanitizer) (obj)).setAllowUnregisteredParamaters(true);
            ((UrlQuerySanitizer) (obj)).setUnregisteredParameterValueSanitizer(UrlQuerySanitizer.getAllButNulLegal());
            ((UrlQuerySanitizer) (obj)).parseUrl(uri.toString());
            for (uri = ((UrlQuerySanitizer) (obj)).getParameterList().iterator(); uri.hasNext(); hashmap.put(((android.net.UrlQuerySanitizer.ParameterValuePair) (obj)).mParameter, ((android.net.UrlQuerySanitizer.ParameterValuePair) (obj)).mValue))
            {
                obj = (android.net.UrlQuerySanitizer.ParameterValuePair)uri.next();
            }

            if (com.google.android.gms.internal.do.a(2))
            {
                com.google.android.gms.internal.do.c((new StringBuilder("Received GMSG: ")).append(s).toString());
                String s1;
                for (uri = hashmap.keySet().iterator(); uri.hasNext(); com.google.android.gms.internal.do.c((new StringBuilder("  ")).append(s1).append(": ").append((String)hashmap.get(s1)).toString()))
                {
                    s1 = (String)uri.next();
                }

            }
            y1.a(a, hashmap);
            return;
        } else
        {
            com.google.android.gms.internal.do.d((new StringBuilder("No GMSG handler found for GMSG: ")).append(uri).toString());
            return;
        }
    }

    private void a(br br1)
    {
        bp.a(a.getContext(), br1);
    }

    public final void a(bo bo1)
    {
        bi bi = null;
        boolean flag = a.h();
        ka ka;
        if (flag && !a.d().eK)
        {
            ka = null;
        } else
        {
            ka = d;
        }
        if (!flag)
        {
            bi = e;
        }
        a(new br(bo1, ka, bi, j, a.g()));
    }

    public final void a(du du1)
    {
        f = du1;
    }

    public final void a(ka ka, bi bi, p p, bl bl, boolean flag)
    {
        a("/appEvent", ((y) (new o(p))));
        a("/canOpenURLs", q.a);
        a("/click", q.b);
        a("/close", q.c);
        a("/customClose", q.d);
        a("/httpTrack", q.e);
        a("/log", q.f);
        a("/open", q.g);
        a("/touch", q.h);
        a("/video", q.i);
        d = null;
        e = null;
        g = p;
        j = bl;
        h = true;
    }

    public final void a(String s, y y1)
    {
        b.put(s, y1);
    }

    public final void a(boolean flag)
    {
        h = flag;
    }

    public final void a(boolean flag, int k)
    {
        ka ka;
        if (a.h() && !a.d().eK)
        {
            ka = null;
        } else
        {
            ka = d;
        }
        a(new br(ka, e, j, a, flag, k, a.g()));
    }

    public final void a(boolean flag, int k, String s)
    {
        bi bi = null;
        boolean flag1 = a.h();
        ka ka;
        if (flag1 && !a.d().eK)
        {
            ka = null;
        } else
        {
            ka = d;
        }
        if (!flag1)
        {
            bi = e;
        }
        a(new br(ka, bi, g, j, a, flag, k, s, a.g()));
    }

    public final void a(boolean flag, int k, String s, String s1)
    {
        bi bi = null;
        boolean flag1 = a.h();
        ka ka;
        if (flag1 && !a.d().eK)
        {
            ka = null;
        } else
        {
            ka = d;
        }
        if (!flag1)
        {
            bi = e;
        }
        a(new br(ka, bi, g, j, a, flag, k, s, s1, a.g()));
    }

    public final boolean a()
    {
        boolean flag;
        synchronized (c)
        {
            flag = i;
        }
        return flag;
    }

    public final void b()
    {
        Object obj = c;
        obj;
        JVM INSTR monitorenter ;
        bp bp1;
        h = false;
        i = true;
        bp1 = a.c();
        if (bp1 == null)
        {
            break MISSING_BLOCK_LABEL_51;
        }
        if (dn.b())
        {
            break MISSING_BLOCK_LABEL_54;
        }
        dn.a.post(new dt(this, bp1));
_L2:
        obj;
        JVM INSTR monitorexit ;
        return;
        bp1.j();
        if (true) goto _L2; else goto _L1
_L1:
        Exception exception;
        exception;
        throw exception;
    }

    public final void onPageFinished(WebView webview, String s)
    {
        if (f != null)
        {
            f.a(a);
            f = null;
        }
    }

    public final boolean shouldOverrideUrlLoading(WebView webview, String s)
    {
        Uri uri;
        com.google.android.gms.internal.do.c((new StringBuilder("AdWebView shouldOverrideUrlLoading: ")).append(s).toString());
        uri = Uri.parse(s);
        if (!"gmsg".equalsIgnoreCase(uri.getScheme()) || !"mobileads.google.com".equalsIgnoreCase(uri.getHost())) goto _L2; else goto _L1
_L1:
        a(uri);
_L4:
        return true;
_L2:
        if (h && webview == a)
        {
            String s1 = uri.getScheme();
            boolean flag;
            if ("http".equalsIgnoreCase(s1) || "https".equalsIgnoreCase(s1))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag)
            {
                return super.shouldOverrideUrlLoading(webview, s);
            }
        }
        if (a.willNotDraw())
        {
            break MISSING_BLOCK_LABEL_225;
        }
        hh hh1 = a.f();
        webview = uri;
        if (hh1 != null)
        {
            webview = uri;
            try
            {
                if (hh1.a(uri))
                {
                    webview = hh1.a(uri, a.getContext());
                }
            }
            // Misplaced declaration of an exception variable
            catch (WebView webview)
            {
                com.google.android.gms.internal.do.d((new StringBuilder("Unable to append parameter to URL: ")).append(s).toString());
                webview = uri;
            }
        }
        a(new bo("android.intent.action.VIEW", webview.toString(), null, null, null, null, null));
        continue; /* Loop/switch isn't completed */
        com.google.android.gms.internal.do.d((new StringBuilder("AdWebView unable to handle URL: ")).append(s).toString());
        if (true) goto _L4; else goto _L3
_L3:
    }
}
