// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.urbanairship.js;

import android.webkit.WebView;

// Referenced classes of package com.urbanairship.js:
//            UAJavascriptInterface

class val.finishAction
    implements Runnable
{

    final UAJavascriptInterface this$0;
    final String val$finishAction;

    public void run()
    {
        if (android.os.erface >= 19)
        {
            UAJavascriptInterface.access$000(UAJavascriptInterface.this).evaluateJavascript(val$finishAction, null);
            return;
        } else
        {
            UAJavascriptInterface.access$000(UAJavascriptInterface.this).loadUrl((new StringBuilder()).append("javascript:").append(val$finishAction).toString());
            return;
        }
    }

    ()
    {
        this$0 = final_uajavascriptinterface;
        val$finishAction = String.this;
        super();
    }
}
