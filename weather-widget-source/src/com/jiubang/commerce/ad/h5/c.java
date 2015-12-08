// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.commerce.ad.h5;

import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.ProgressBar;

// Referenced classes of package com.jiubang.commerce.ad.h5:
//            b

public class c extends WebChromeClient
{

    final b a;

    public c(b b1)
    {
        a = b1;
        super();
    }

    public void onProgressChanged(WebView webview, int i)
    {
        if (i == 100)
        {
            b.a(a).setVisibility(8);
        } else
        {
            if (b.a(a).getVisibility() == 8)
            {
                b.a(a).setVisibility(0);
            }
            b.a(a).setProgress(i);
        }
        super.onProgressChanged(webview, i);
    }
}
