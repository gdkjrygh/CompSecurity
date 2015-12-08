// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile.webview.b;

import android.content.IntentFilter;
import android.webkit.WebView;
import com.wf.wellsfargomobile.BaseWebViewActivity;

// Referenced classes of package com.wf.wellsfargomobile.webview.b:
//            k, e, f

public class d extends k
{

    public d()
    {
    }

    public int a()
    {
        return 40;
    }

    public void a(BaseWebViewActivity basewebviewactivity, WebView webview)
    {
        webview.setDownloadListener(new e(this, basewebviewactivity));
        basewebviewactivity.receiver = new f(this, basewebviewactivity);
        basewebviewactivity.registerReceiver(basewebviewactivity.receiver, new IntentFilter("android.intent.action.DOWNLOAD_COMPLETE"), "android.permission.SEND_DOWNLOAD_COMPLETED_INTENTS", null);
    }
}
