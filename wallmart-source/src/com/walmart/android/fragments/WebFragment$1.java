// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.fragments;

import android.webkit.WebView;

// Referenced classes of package com.walmart.android.fragments:
//            WebFragment

class this._cls0
    implements com.walmart.android.app.hybrid.istener
{

    final WebFragment this$0;

    public void onCookiesCleared(WebView webview)
    {
        WebFragment.this.onCookiesCleared(webview);
    }

    public void onRestart()
    {
        restart();
    }

    Listener()
    {
        this$0 = WebFragment.this;
        super();
    }
}
