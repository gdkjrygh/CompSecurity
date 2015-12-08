// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.hybrid;

import android.webkit.WebChromeClient;
import com.walmartlabs.utils.WLog;

// Referenced classes of package com.walmart.android.app.hybrid:
//            WebPresenter

class this._cls0 extends WebChromeClient
{

    final WebPresenter this$0;

    public void onConsoleMessage(String s, int i, String s1)
    {
        super.onConsoleMessage(s, i, s1);
        WLog.v(WebPresenter.access$000(), (new StringBuilder()).append("onConsoleMessage: ").append(s).append(" ").append(s1).append(" ").append(i).toString());
    }

    ()
    {
        this$0 = WebPresenter.this;
        super();
    }
}
