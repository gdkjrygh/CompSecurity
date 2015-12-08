// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile.webview.c;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.webkit.WebView;
import com.wf.wellsfargomobile.BaseWebViewActivity;
import java.util.regex.Pattern;

// Referenced classes of package com.wf.wellsfargomobile.webview.c:
//            ae, ac

public class f extends ae
{

    public f()
    {
    }

    public int a()
    {
        return 20;
    }

    public Pattern a(Context context)
    {
        return Pattern.compile("tel:.*");
    }

    public ac b(BaseWebViewActivity basewebviewactivity, WebView webview, String s)
    {
        webview = new ac();
        if (s.startsWith("tel:"))
        {
            try
            {
                basewebviewactivity.startActivity(new Intent("android.intent.action.DIAL", Uri.parse(s)));
            }
            // Misplaced declaration of an exception variable
            catch (BaseWebViewActivity basewebviewactivity) { }
            webview.a(false);
            webview.b(true);
        }
        return webview;
    }
}
