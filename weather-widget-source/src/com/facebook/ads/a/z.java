// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads.a;

import android.content.Context;
import android.webkit.WebView;
import java.util.Collections;
import java.util.Map;

// Referenced classes of package com.facebook.ads.a:
//            f, y, ag, ad

public class z extends f
{

    private WebView c;
    private volatile boolean d;

    public z(WebView webview, f.a a1, long l, Context context)
    {
        super(a1, l, context);
        c = webview;
    }

    private void a(Map map)
    {
        String s = ((y)b).e();
        if (ag.a(s))
        {
            return;
        } else
        {
            (new ad(map)).execute(new String[] {
                s
            });
            return;
        }
    }

    public void a(y y1)
    {
        super.a(y1);
        d = false;
    }

    protected void e()
    {
        this;
        JVM INSTR monitorenter ;
        y y1 = (y)b;
        if (c != null && !ag.a(y1.f()))
        {
            c.loadUrl((new StringBuilder()).append("javascript:").append(y1.f()).toString());
        }
        a(Collections.singletonMap("evt", "native_imp"));
        if (a != null)
        {
            a.b();
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void f()
    {
        this;
        JVM INSTR monitorenter ;
        if (d) goto _L2; else goto _L1
_L1:
        e e1 = b;
        if (e1 != null) goto _L3; else goto _L2
_L2:
        this;
        JVM INSTR monitorexit ;
        return;
_L3:
        y y1 = (y)b;
        if (c != null && !ag.a(y1.d()))
        {
            c.loadUrl((new StringBuilder()).append("javascript:").append(y1.d()).toString());
        }
        b();
        d = true;
        if (true) goto _L2; else goto _L4
_L4:
        Exception exception;
        exception;
        throw exception;
    }

    public void g()
    {
        this;
        JVM INSTR monitorenter ;
        c = null;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void h()
    {
        a(Collections.singletonMap("evt", "interstitial_displayed"));
    }
}
