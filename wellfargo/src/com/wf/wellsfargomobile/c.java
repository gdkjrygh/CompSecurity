// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile;

import android.webkit.WebView;

// Referenced classes of package com.wf.wellsfargomobile:
//            BaseWebViewActivity

class c
    implements Runnable
{

    final String a;
    final BaseWebViewActivity b;

    c(BaseWebViewActivity basewebviewactivity, String s)
    {
        b = basewebviewactivity;
        a = s;
        super();
    }

    public void run()
    {
        b.webview.loadUrl((new StringBuilder()).append("javascript:").append(a).toString());
    }
}
