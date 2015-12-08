// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.wecloud.message.frontia.richmedia;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.TextView;
import io.wecloud.message.e.c;
import io.wecloud.message.frontia.b;
import io.wecloud.message.h;
import io.wecloud.message.h.g;
import io.wecloud.message.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package io.wecloud.message.frontia.richmedia:
//            c, h, i, f, 
//            j, e, k, g, 
//            b

public class MediaViewActivity extends Activity
{

    protected static final String a = io/wecloud/message/frontia/richmedia/MediaViewActivity.getSimpleName();
    private List b;
    private String c;
    private WebView d;
    private f e;
    private String f;
    private boolean g;
    private boolean h;
    private boolean i;
    private boolean j;
    private boolean k;
    private int l;
    private int m;
    private k n;
    private io.wecloud.message.frontia.richmedia.b o;
    private int p;
    private b q;

    public MediaViewActivity()
    {
        g = false;
        h = true;
        i = false;
        j = true;
        k = false;
        l = 0;
        m = 0;
        n = null;
        o = null;
        p = 0;
        q = null;
    }

    public static k a(int i1, View view)
    {
        switch (i1)
        {
        default:
            return null;

        case 0: // '\0'
            return new io.wecloud.message.frontia.richmedia.c(view);
        }
    }

    static k a(MediaViewActivity mediaviewactivity)
    {
        return mediaviewactivity.n;
    }

    private void a()
    {
        if (o != null)
        {
            return;
        } else
        {
            o = new io.wecloud.message.frontia.richmedia.h(this);
            return;
        }
    }

    private void a(Intent intent)
    {
        d.setWebViewClient(new io.wecloud.message.frontia.richmedia.i(this));
        WebSettings websettings = d.getSettings();
        a(intent, websettings);
        websettings.setJavaScriptEnabled(true);
        websettings.setBuiltInZoomControls(false);
        e = new f(this);
        d.addJavascriptInterface(e, "GoPush");
        d.setVerticalScrollbarOverlay(true);
    }

    private void a(Intent intent, WebSettings websettings)
    {
        if (!io.wecloud.message.h.g.a(getApplicationContext()))
        {
            websettings.setCacheMode(3);
            return;
        }
        if (!intent.getBooleanExtra("load_cache", true))
        {
            websettings.setCacheMode(2);
            return;
        } else
        {
            websettings.setCacheMode(-1);
            return;
        }
    }

    private String b(String s)
    {
        StringBuilder stringbuilder = new StringBuilder(s);
        if (s.contains("?"))
        {
            stringbuilder.append('&');
        } else
        {
            stringbuilder.append('?');
        }
        return stringbuilder.toString();
    }

    static boolean b(MediaViewActivity mediaviewactivity)
    {
        return mediaviewactivity.h;
    }

    static WebView c(MediaViewActivity mediaviewactivity)
    {
        return mediaviewactivity.d;
    }

    private e c(String s)
    {
        if (s.equalsIgnoreCase("Global"))
        {
            return io.wecloud.message.frontia.richmedia.j.a(this);
        } else
        {
            io.wecloud.message.e.c.c(a, (new StringBuilder("Target module not found: ")).append(s).toString());
            return null;
        }
    }

    static int d(MediaViewActivity mediaviewactivity)
    {
        return mediaviewactivity.l;
    }

    static int e(MediaViewActivity mediaviewactivity)
    {
        return mediaviewactivity.m;
    }

    static boolean f(MediaViewActivity mediaviewactivity)
    {
        return mediaviewactivity.k;
    }

    static String g(MediaViewActivity mediaviewactivity)
    {
        return mediaviewactivity.f;
    }

    public void a(String s)
    {
        if (s == null)
        {
            io.wecloud.message.e.c.c(a, "Argument 'url' is null!");
        } else
        {
            Uri uri = Uri.parse(s);
            if (uri == null)
            {
                io.wecloud.message.e.c.c(a, (new StringBuilder("Illegal url :")).append(s).toString());
                return;
            }
            String s1 = uri.getHost();
            String s2 = uri.getLastPathSegment();
            if (s1 == null || s2 == null)
            {
                io.wecloud.message.e.c.c(a, (new StringBuilder("Illegal url :")).append(s).toString());
                return;
            }
            s = c(s1);
            if (s != null)
            {
                if (!b.contains(s))
                {
                    b.add(s);
                }
                c = s1;
                s.a(s2, uri);
                return;
            }
        }
    }

    public void a(String s, boolean flag)
    {
        while (d == null || s == null) 
        {
            return;
        }
        f = b(s);
        d.loadUrl(f);
    }

    protected void onActivityResult(int i1, int j1, Intent intent)
    {
        super.onActivityResult(i1, j1, intent);
        break MISSING_BLOCK_LABEL_7;
        while (true) 
        {
            do
            {
                do
                {
                    return;
                } while (j1 != -1 || intent == null);
                if (b == null || b.size() <= 0)
                {
                    break;
                }
                Iterator iterator = b.iterator();
                while (iterator.hasNext()) 
                {
                    ((e)iterator.next()).a(i1, intent);
                }
            } while (true);
            if (c != null)
            {
                e e1 = c(c);
                if (e1 != null)
                {
                    e1.a(i1, intent);
                    return;
                }
            }
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        bundle = getIntent();
        Object obj = bundle.getBundleExtra("content");
        if (obj != null)
        {
            q = new b();
            q.a(((Bundle) (obj)));
        }
        f = bundle.getStringExtra("url");
        if (TextUtils.isEmpty(f))
        {
            if (TextUtils.isEmpty(q.n()))
            {
                finish();
                io.wecloud.message.e.c.b(a, "Url is null");
                return;
            }
            f = q.n();
        }
        p = bundle.getIntExtra("app_type", 0);
        int i1 = bundle.getIntExtra("contentview_layoutid", i.a);
        int j1 = bundle.getIntExtra("addwebview_viewid", h.b);
        l = bundle.getIntExtra("error_viewid", h.c);
        m = bundle.getIntExtra("loading_viewid", h.d);
        g = bundle.getBooleanExtra("show_title", false);
        android.view.ViewGroup.LayoutParams layoutparams;
        if (g)
        {
            requestWindowFeature(7);
        } else
        {
            requestWindowFeature(1);
        }
        obj = getLayoutInflater().inflate(i1, null);
        setContentView(((View) (obj)));
        d = new WebView(this);
        ((ViewGroup)findViewById(j1)).addView(d, 0);
        layoutparams = d.getLayoutParams();
        layoutparams.width = -1;
        layoutparams.height = -1;
        d.setLayoutParams(layoutparams);
        n = a(p, ((View) (obj)));
        if (n != null)
        {
            a();
            n.a(o);
        }
        k = bundle.getBooleanExtra("request_focus", false);
        if (k)
        {
            d.requestFocus();
        }
        i = bundle.getBooleanExtra("proc_suicide", false);
        j = bundle.getBooleanExtra("auto_suicide", true);
        a(bundle);
        b = new ArrayList();
        h = bundle.getBooleanExtra("show_loading", true);
        a(f, h);
    }

    protected void onDestroy()
    {
        if (d != null)
        {
            d.destroy();
            d = null;
        }
        System.gc();
        super.onDestroy();
        if (i)
        {
            io.wecloud.message.h.h.a(getApplicationContext()).a();
        }
    }

    public boolean onKeyDown(int i1, KeyEvent keyevent)
    {
        if (p == 0 && i1 == 4 && d.canGoBack())
        {
            d.goBack();
            return true;
        }
        if (j)
        {
            i = true;
        }
        return super.onKeyDown(i1, keyevent);
    }

    protected void onNewIntent(Intent intent)
    {
        super.onNewIntent(intent);
        if (intent == null)
        {
            return;
        }
        Bundle bundle = intent.getBundleExtra("content");
        if (bundle != null)
        {
            q = new b();
            q.a(bundle);
        }
        f = intent.getStringExtra("url");
        if (TextUtils.isEmpty(f))
        {
            if (TextUtils.isEmpty(q.n()))
            {
                finish();
                io.wecloud.message.e.c.b(a, "Url is null");
                return;
            }
            f = q.n();
        }
        a(f, h);
    }

    protected void onRestoreInstanceState(Bundle bundle)
    {
        if (bundle == null)
        {
            return;
        } else
        {
            c = bundle.getString("current_module");
            i = bundle.getBoolean("proc_suicide", false);
            super.onRestoreInstanceState(bundle);
            return;
        }
    }

    protected void onSaveInstanceState(Bundle bundle)
    {
        bundle.putString("current_module", c);
        bundle.putBoolean("proc_suicide", i);
        super.onSaveInstanceState(bundle);
    }

    public void setTitle(CharSequence charsequence)
    {
        if (g)
        {
            TextView textview = (TextView)findViewById(0x1020016);
            if (textview != null)
            {
                textview.setText(charsequence);
                textview.setOnClickListener(new io.wecloud.message.frontia.richmedia.g(this));
            }
        }
    }

}
