// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcuni.nbc.thevoice;

import android.webkit.ConsoleMessage;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

// Referenced classes of package com.nbcuni.nbc.thevoice:
//            PopupActivity

class this._cls0 extends WebChromeClient
{

    final PopupActivity this$0;

    public void onCloseWindow(WebView webview)
    {
        super.onCloseWindow(webview);
        finish();
    }

    public boolean onConsoleMessage(ConsoleMessage consolemessage)
    {
        return super.onConsoleMessage(consolemessage);
    }

    ()
    {
        this$0 = PopupActivity.this;
        super();
    }
}
