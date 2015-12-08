// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.messagecenter.view;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;

// Referenced classes of package com.gau.go.launcherex.gowidget.messagecenter.view:
//            g, e

public class MessageCenterWebView extends FrameLayout
{

    private WebView a;
    private LinearLayout b;
    private TextView c;
    private Handler d;
    private g e;
    private String f;
    private String g;

    public MessageCenterWebView(Context context)
    {
        super(context);
        a = null;
        b = null;
        c = null;
        d = new Handler();
        e = null;
        f = null;
        g = null;
    }

    public MessageCenterWebView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a = null;
        b = null;
        c = null;
        d = new Handler();
        e = null;
        f = null;
        g = null;
    }

    static void a(MessageCenterWebView messagecenterwebview)
    {
        messagecenterwebview.c();
    }

    private void b()
    {
        new DisplayMetrics();
        float f1 = getResources().getDisplayMetrics().density;
        if (f1 == 1.5F)
        {
            a.getSettings().setDefaultZoom(android.webkit.WebSettings.ZoomDensity.MEDIUM);
            return;
        }
        if (f1 == 2.0F)
        {
            a.getSettings().setDefaultZoom(android.webkit.WebSettings.ZoomDensity.MEDIUM);
            return;
        } else
        {
            a.getSettings().setDefaultZoom(android.webkit.WebSettings.ZoomDensity.FAR);
            return;
        }
    }

    static void b(MessageCenterWebView messagecenterwebview)
    {
        messagecenterwebview.d();
    }

    static String c(MessageCenterWebView messagecenterwebview)
    {
        return messagecenterwebview.f;
    }

    private void c()
    {
        if (b != null && b.getVisibility() == 4)
        {
            b.setVisibility(0);
        }
    }

    static String d(MessageCenterWebView messagecenterwebview)
    {
        return messagecenterwebview.g;
    }

    private void d()
    {
        if (b != null && b.getVisibility() == 0)
        {
            b.setVisibility(4);
        }
    }

    static TextView e(MessageCenterWebView messagecenterwebview)
    {
        return messagecenterwebview.c;
    }

    static Handler f(MessageCenterWebView messagecenterwebview)
    {
        return messagecenterwebview.d;
    }

    public void a()
    {
        if (a != null)
        {
            a.stopLoading();
            a = null;
        }
        e = null;
    }

    public void a(Activity activity, String s, int i)
    {
        a = (WebView)findViewById(0x7f090429);
        c = (TextView)findViewById(0x7f09042c);
        b = (LinearLayout)findViewById(0x7f09042a);
        activity = a.getSettings();
        activity.setJavaScriptEnabled(true);
        activity.setDomStorageEnabled(true);
        activity.setDefaultTextEncodingName("utf-8");
        a.setVerticalScrollbarOverlay(true);
        e = new g(this);
        a.setWebViewClient(e);
        a.setWebChromeClient(new e(this));
        b();
    }

    public void a(String s)
    {
        e.a(s);
        a.loadUrl(s);
    }

    public void a(String s, String s1)
    {
        f = s;
        g = s1;
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
    }

    public boolean onKeyDown(int i, KeyEvent keyevent)
    {
        if (i == 4 && a != null && a.canGoBack())
        {
            a.goBack();
            return true;
        } else
        {
            return false;
        }
    }
}
