// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile.webview.c;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.webkit.WebView;
import com.wf.wellsfargomobile.BaseWebViewActivity;
import com.wf.wellsfargomobile.WFApp;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.regex.Pattern;

// Referenced classes of package com.wf.wellsfargomobile.webview.c:
//            ae, ac

public class y extends ae
{

    public y()
    {
    }

    public int a()
    {
        return 120;
    }

    public Pattern a(Context context)
    {
        return Pattern.compile((new StringBuilder()).append(".*").append(context.getString(0x7f08016f)).append(".*").toString());
    }

    public ac b(BaseWebViewActivity basewebviewactivity, WebView webview, String s)
    {
        ac ac1 = new ac();
        if (s.contains(basewebviewactivity.getResources().getString(0x7f08016f)))
        {
            c(basewebviewactivity, webview, s);
        }
        return ac1;
    }

    protected void c(BaseWebViewActivity basewebviewactivity, WebView webview, String s)
    {
        try
        {
            URLDecoder.decode(s, "UTF-8");
            WFApp.i(Uri.parse(s).getQueryParameter("langPref"));
            basewebviewactivity.localeChanged();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (BaseWebViewActivity basewebviewactivity)
        {
            return;
        }
    }
}
