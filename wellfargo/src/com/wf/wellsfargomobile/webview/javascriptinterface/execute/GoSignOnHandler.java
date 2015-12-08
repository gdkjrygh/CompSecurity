// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile.webview.javascriptinterface.execute;

import android.app.Activity;
import com.wf.wellsfargomobile.BaseWebViewActivity;
import com.wf.wellsfargomobile.webview.javascriptinterface.a;

// Referenced classes of package com.wf.wellsfargomobile.webview.javascriptinterface.execute:
//            BridgeExecuteHandler

public class GoSignOnHandler extends BridgeExecuteHandler
{

    private static final String TAG = "GoSignOnHandler";
    private BaseWebViewActivity baseWebViewActivity;

    public GoSignOnHandler(Activity activity)
    {
        super(activity);
        baseWebViewActivity = (BaseWebViewActivity)activity;
    }

    protected String calculateReturn()
    {
        return "";
    }

    protected void executeInternal()
    {
        (new a(baseWebViewActivity)).goSignOn(" ");
    }

    protected boolean validateNonce(String s)
    {
        return true;
    }
}
