// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile.webview.c;

import android.content.Context;
import android.webkit.WebView;
import com.wf.wellsfargomobile.BaseWebViewActivity;
import com.wf.wellsfargomobile.webview.b;
import java.util.regex.Pattern;

// Referenced classes of package com.wf.wellsfargomobile.webview.c:
//            ab, ac

public abstract class ae
    implements ab
{

    public ae()
    {
    }

    public ac a(BaseWebViewActivity basewebviewactivity, WebView webview, b b1)
    {
        basewebviewactivity = new ac();
        basewebviewactivity.a(true);
        return basewebviewactivity;
    }

    public ac a(BaseWebViewActivity basewebviewactivity, WebView webview, String s)
    {
        basewebviewactivity = new ac();
        basewebviewactivity.a(true);
        return basewebviewactivity;
    }

    public Pattern a(Context context)
    {
        return Pattern.compile(".*");
    }

    public ac a_(BaseWebViewActivity basewebviewactivity, WebView webview, String s)
    {
        basewebviewactivity = new ac();
        basewebviewactivity.a(true);
        return basewebviewactivity;
    }

    public ac b(BaseWebViewActivity basewebviewactivity, WebView webview, String s)
    {
        basewebviewactivity = new ac();
        basewebviewactivity.a(true);
        return basewebviewactivity;
    }
}
