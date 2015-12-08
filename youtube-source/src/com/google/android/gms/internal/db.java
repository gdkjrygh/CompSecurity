// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.DownloadListener;
import android.webkit.WebSettings;
import android.webkit.WebView;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal:
//            cz, dj, dl, eg, 
//            eh, ds, dv, dr, 
//            ac, do, hh, bp

public final class db extends WebView
    implements DownloadListener
{

    private final ds a;
    private final dr b;
    private final Object c = new Object();
    private final hh d;
    private final cz e;
    private bp f;
    private ac g;
    private boolean h;
    private boolean i;

    private db(dr dr1, ac ac1, boolean flag, boolean flag1, hh hh1, cz cz1)
    {
        super(dr1);
        b = dr1;
        g = ac1;
        h = flag;
        d = hh1;
        e = cz1;
        setBackgroundColor(0);
        ac1 = getSettings();
        ac1.setJavaScriptEnabled(true);
        ac1.setSavePassword(false);
        ac1.setSupportMultipleWindows(true);
        ac1.setJavaScriptCanOpenWindowsAutomatically(true);
        dj.a(dr1, cz1.iM, ac1);
        if (android.os.Build.VERSION.SDK_INT >= 17)
        {
            dl.a(getContext(), ac1);
            ac1.setMediaPlaybackRequiresUserGesture(false);
        } else
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            dl.a(getContext(), ac1);
        }
        setDownloadListener(this);
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            a = new eg(this, flag1);
        } else
        {
            a = new ds(this, flag1);
        }
        setWebViewClient(a);
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            setWebChromeClient(new eh(this));
        } else
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            setWebChromeClient(new dv(this));
        }
        i();
    }

    public static db a(Context context, ac ac1, boolean flag, boolean flag1, hh hh1, cz cz1)
    {
        return new db(new dr(context), ac1, flag, flag1, null, cz1);
    }

    private void i()
    {
        Object obj = c;
        obj;
        JVM INSTR monitorenter ;
        if (!h && !g.eK) goto _L2; else goto _L1
_L1:
        if (android.os.Build.VERSION.SDK_INT >= 14) goto _L4; else goto _L3
_L3:
        com.google.android.gms.internal.do.a("Disabling hardware acceleration on an overlay.");
        j();
_L5:
        return;
_L4:
        com.google.android.gms.internal.do.a("Enabling hardware acceleration on an overlay.");
        k();
          goto _L5
        Exception exception;
        exception;
        throw exception;
_L2:
label0:
        {
            if (android.os.Build.VERSION.SDK_INT >= 18)
            {
                break label0;
            }
            com.google.android.gms.internal.do.a("Disabling hardware acceleration on an AdView.");
            j();
        }
          goto _L5
        com.google.android.gms.internal.do.a("Enabling hardware acceleration on an AdView.");
        k();
          goto _L5
    }

    private void j()
    {
        synchronized (c)
        {
            if (!i && android.os.Build.VERSION.SDK_INT >= 11)
            {
                setLayerType(1, null);
            }
            i = true;
        }
    }

    private void k()
    {
        synchronized (c)
        {
            if (i && android.os.Build.VERSION.SDK_INT >= 11)
            {
                setLayerType(0, null);
            }
            i = false;
        }
    }

    public final void a()
    {
        HashMap hashmap = new HashMap(1);
        hashmap.put("version", e.iM);
        a("onhide", ((Map) (hashmap)));
    }

    public final void a(bp bp)
    {
        synchronized (c)
        {
            f = bp;
        }
    }

    public final void a(String s, Map map)
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("javascript:AFMA_ReceiveMessage('");
        stringbuilder.append(s);
        stringbuilder.append("'");
        if (map != null)
        {
            try
            {
                s = dj.a(map).toString();
                stringbuilder.append(",");
                stringbuilder.append(s);
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                com.google.android.gms.internal.do.d("Could not convert AFMA event parameters to JSON.");
                return;
            }
        }
        stringbuilder.append(");");
        com.google.android.gms.internal.do.c((new StringBuilder("Dispatching AFMA event: ")).append(stringbuilder).toString());
        loadUrl(stringbuilder.toString());
    }

    public final void a(boolean flag)
    {
        synchronized (c)
        {
            h = flag;
            i();
        }
    }

    public final void b()
    {
        HashMap hashmap = new HashMap(1);
        hashmap.put("version", e.iM);
        a("onshow", hashmap);
    }

    public final bp c()
    {
        bp bp;
        synchronized (c)
        {
            bp = f;
        }
        return bp;
    }

    public final ac d()
    {
        ac ac1;
        synchronized (c)
        {
            ac1 = g;
        }
        return ac1;
    }

    public final ds e()
    {
        return a;
    }

    public final hh f()
    {
        return d;
    }

    public final cz g()
    {
        return e;
    }

    public final boolean h()
    {
        boolean flag;
        synchronized (c)
        {
            flag = h;
        }
        return flag;
    }

    public final void onDownloadStart(String s, String s1, String s2, String s3, long l)
    {
        try
        {
            s1 = new Intent("android.intent.action.VIEW");
            s1.setDataAndType(Uri.parse(s), s3);
            getContext().startActivity(s1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            com.google.android.gms.internal.do.a((new StringBuilder("Couldn't find an Activity to view url/mimetype: ")).append(s).append(" / ").append(s3).toString());
        }
    }

    protected final void onMeasure(int l, int i1)
    {
        int j1;
        int k1;
        int l1;
        int i2;
label0:
        {
            k1 = 0x7fffffff;
            int j2;
            synchronized (c)
            {
                if (!isInEditMode() && !h)
                {
                    break label0;
                }
                super.onMeasure(l, i1);
            }
            return;
        }
        j2 = android.view.View.MeasureSpec.getMode(l);
        j1 = android.view.View.MeasureSpec.getSize(l);
        i2 = android.view.View.MeasureSpec.getMode(i1);
        l1 = android.view.View.MeasureSpec.getSize(i1);
        break MISSING_BLOCK_LABEL_59;
_L3:
        if (g.widthPixels <= l && g.heightPixels <= i1)
        {
            break MISSING_BLOCK_LABEL_200;
        }
        com.google.android.gms.internal.do.d((new StringBuilder("Not enough space to show ad. Needs ")).append(g.widthPixels).append("x").append(g.heightPixels).append(" pixels, but only has ").append(j1).append("x").append(l1).append(" pixels.").toString());
        if (getVisibility() != 8)
        {
            setVisibility(4);
        }
        setMeasuredDimension(0, 0);
_L1:
        obj;
        JVM INSTR monitorexit ;
        return;
        if (getVisibility() != 8)
        {
            setVisibility(0);
        }
        setMeasuredDimension(g.widthPixels, g.heightPixels);
          goto _L1
        if (j2 != 0x80000000 && j2 != 0x40000000)
        {
            l = 0x7fffffff;
        } else
        {
            l = j1;
        }
        if (i2 != 0x80000000)
        {
            i1 = k1;
            if (i2 != 0x40000000)
            {
                continue; /* Loop/switch isn't completed */
            }
        }
        i1 = l1;
        if (true) goto _L3; else goto _L2
_L2:
    }

    public final boolean onTouchEvent(MotionEvent motionevent)
    {
        if (d != null)
        {
            d.a(motionevent);
        }
        return super.onTouchEvent(motionevent);
    }

    public final void setContext(Context context)
    {
        b.setBaseContext(context);
    }
}
