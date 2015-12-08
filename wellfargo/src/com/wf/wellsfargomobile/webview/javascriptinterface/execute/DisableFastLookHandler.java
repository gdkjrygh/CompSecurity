// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile.webview.javascriptinterface.execute;

import android.app.Activity;
import com.wf.wellsfargomobile.MainActivity;

// Referenced classes of package com.wf.wellsfargomobile.webview.javascriptinterface.execute:
//            BridgeExecuteHandler

public class DisableFastLookHandler extends BridgeExecuteHandler
{

    private static final String TAG = "DisableFastLookHandler";
    private boolean executeFailed;
    private MainActivity mainActivity;

    public DisableFastLookHandler(Activity activity)
    {
        super(activity);
        executeFailed = false;
        mainActivity = (MainActivity)activity;
    }

    protected String calculateReturn()
    {
        return "null";
    }

    protected void executeInternal()
    {
        if (payload.getResultCallback() != null)
        {
            mainActivity.c(payload.getResultCallback().getFunctionName());
        }
    }
}
