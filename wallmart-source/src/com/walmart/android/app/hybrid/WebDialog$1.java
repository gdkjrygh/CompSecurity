// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.hybrid;

import android.webkit.ConsoleMessage;
import android.webkit.WebChromeClient;
import com.walmartlabs.utils.WLog;

// Referenced classes of package com.walmart.android.app.hybrid:
//            WebDialog

class this._cls0 extends WebChromeClient
{

    final WebDialog this$0;

    public boolean onConsoleMessage(ConsoleMessage consolemessage)
    {
        WLog.i(WebDialog.TAG, consolemessage.message());
        return true;
    }

    ()
    {
        this$0 = WebDialog.this;
        super();
    }
}
