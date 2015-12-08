// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile.webview.c;

import android.webkit.WebView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import com.wf.wellsfargomobile.BaseWebViewActivity;

// Referenced classes of package com.wf.wellsfargomobile.webview.c:
//            ae, ac

public class aa extends ae
{

    public aa()
    {
    }

    public int a()
    {
        return 9999;
    }

    public ac a_(BaseWebViewActivity basewebviewactivity, WebView webview, String s)
    {
        basewebviewactivity.webviewProgressDialog.setVisibility(0);
        basewebviewactivity.loading.setVisibility(8);
        basewebviewactivity = new ac();
        basewebviewactivity.a(true);
        return basewebviewactivity;
    }
}
