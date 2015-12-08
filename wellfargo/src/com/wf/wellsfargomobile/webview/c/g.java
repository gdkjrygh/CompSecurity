// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile.webview.c;

import android.content.Context;
import android.webkit.WebView;
import com.wf.wellsfargomobile.BaseWebViewActivity;
import java.util.regex.Pattern;

// Referenced classes of package com.wf.wellsfargomobile.webview.c:
//            ae, ac

public class g extends ae
{

    public g()
    {
    }

    public int a()
    {
        return 21;
    }

    public Pattern a(Context context)
    {
        return Pattern.compile("mailto:.*");
    }

    public ac b(BaseWebViewActivity basewebviewactivity, WebView webview, String s)
    {
        return new ac();
    }
}
