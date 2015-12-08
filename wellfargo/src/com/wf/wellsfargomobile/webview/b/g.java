// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile.webview.b;

import android.webkit.WebView;
import com.wf.wellsfargomobile.BaseWebViewActivity;
import com.wf.wellsfargomobile.mrdc.i;
import com.wf.wellsfargomobile.mrdc.l;

// Referenced classes of package com.wf.wellsfargomobile.webview.b:
//            k

public class g extends k
{

    public g()
    {
    }

    public int a()
    {
        return 10;
    }

    public void a(BaseWebViewActivity basewebviewactivity, WebView webview)
    {
        webview.addJavascriptInterface(new i(basewebviewactivity), "Camera");
        webview.addJavascriptInterface(new l(basewebviewactivity), "PhotoTips");
    }
}
