// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.wecloud.message.frontia.richmedia;

import android.graphics.Bitmap;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import io.wecloud.message.e.c;

// Referenced classes of package io.wecloud.message.frontia.richmedia:
//            MediaViewActivity, k

public class i extends WebViewClient
{

    final MediaViewActivity a;

    public i(MediaViewActivity mediaviewactivity)
    {
        a = mediaviewactivity;
        super();
    }

    public void onPageFinished(WebView webview, String s)
    {
        if (MediaViewActivity.a(a) != null)
        {
            MediaViewActivity.a(a).b(webview, s);
        }
        io.wecloud.message.frontia.richmedia.MediaViewActivity.c(a).setVisibility(0);
        if (MediaViewActivity.f(a))
        {
            io.wecloud.message.frontia.richmedia.MediaViewActivity.c(a).requestFocus();
        }
        if (!MediaViewActivity.b(a)) goto _L2; else goto _L1
_L1:
        View view = a.findViewById(MediaViewActivity.d(a));
        if (view != null)
        {
            view.setVisibility(4);
        }
        view = a.findViewById(MediaViewActivity.e(a));
        if (view != null)
        {
            view.setVisibility(4);
        }
_L4:
        super.onPageFinished(webview, s);
        return;
_L2:
        View view1 = a.findViewById(MediaViewActivity.e(a));
        if (view1 != null)
        {
            view1.setVisibility(4);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void onPageStarted(WebView webview, String s, Bitmap bitmap)
    {
        if (MediaViewActivity.a(a) != null)
        {
            MediaViewActivity.a(a).a(webview, s, bitmap);
        }
        if (!MediaViewActivity.b(a)) goto _L2; else goto _L1
_L1:
        io.wecloud.message.frontia.richmedia.MediaViewActivity.c(a).setVisibility(4);
        View view = a.findViewById(MediaViewActivity.d(a));
        if (view != null)
        {
            view.setVisibility(4);
        }
        view = a.findViewById(MediaViewActivity.e(a));
        if (view != null)
        {
            view.setVisibility(0);
        }
_L4:
        super.onPageStarted(webview, s, bitmap);
        return;
_L2:
        View view1 = a.findViewById(MediaViewActivity.e(a));
        if (view1 != null)
        {
            view1.setVisibility(4);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void onReceivedError(WebView webview, int j, String s, String s1)
    {
        if (MediaViewActivity.a(a) != null)
        {
            MediaViewActivity.a(a).a(webview, j, s, s1);
        }
        io.wecloud.message.frontia.richmedia.MediaViewActivity.c(a).setVisibility(4);
        View view = a.findViewById(MediaViewActivity.d(a));
        if (view != null)
        {
            view.setVisibility(0);
        }
        view = a.findViewById(MediaViewActivity.e(a));
        if (view != null)
        {
            view.setVisibility(4);
        }
        c.c(MediaViewActivity.a, (new StringBuilder("Error on loading: ")).append(s1).toString());
        c.c(MediaViewActivity.a, (new StringBuilder("Error on loading: errCode=")).append(j).append(", des:").append(s).toString());
        super.onReceivedError(webview, j, s, s1);
    }

    public boolean shouldOverrideUrlLoading(WebView webview, String s)
    {
        if (MediaViewActivity.a(a) != null)
        {
            MediaViewActivity.a(a).a(webview, s);
        }
        if (s.startsWith("gopush"))
        {
            c.b(MediaViewActivity.a, (new StringBuilder("WebApp interact - url:")).append(s).toString());
            a.a(s);
            return true;
        }
        if (s.startsWith("gosms"))
        {
            c.b(MediaViewActivity.a, (new StringBuilder("WebApp interact diyTheme - url:")).append(s).toString());
            a.a(s);
            return true;
        } else
        {
            return false;
        }
    }
}
