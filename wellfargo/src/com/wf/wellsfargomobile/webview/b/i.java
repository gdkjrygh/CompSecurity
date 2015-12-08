// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile.webview.b;

import android.webkit.WebView;
import com.wf.wellsfargomobile.BaseWebViewActivity;
import com.wf.wellsfargomobile.gcm.a;

// Referenced classes of package com.wf.wellsfargomobile.webview.b:
//            k

public class i extends k
{

    public i()
    {
    }

    public int a()
    {
        return 20;
    }

    public void a(BaseWebViewActivity basewebviewactivity, WebView webview)
    {
        webview.addJavascriptInterface(new a(basewebviewactivity), "Push");
    }
}
