// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.qr;

import android.util.Log;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

// Referenced classes of package com.walmart.android.app.qr:
//            QRWebViewClient

class this._cls0 extends WebChromeClient
{

    final QRWebViewClient this$0;

    public void onConsoleMessage(String s, int i, String s1)
    {
        super.onConsoleMessage(s, i, s1);
        Log.e(QRWebViewClient.TAG, (new StringBuilder()).append("Console: ").append(s).append(" ").append(s1).append(" ").append(i).append(' ').append(QRWebViewClient.access$000(QRWebViewClient.this).getContentHeight()).append(" ").append(QRWebViewClient.access$000(QRWebViewClient.this).getHeight()).toString());
    }

    ()
    {
        this$0 = QRWebViewClient.this;
        super();
    }
}
