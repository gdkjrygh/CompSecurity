// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile.webview.javascriptinterface.execute;

import android.app.Activity;
import com.wf.wellsfargomobile.util.l;

// Referenced classes of package com.wf.wellsfargomobile.webview.javascriptinterface.execute:
//            BridgeExecuteHandler

public class WriteReviewHandler extends BridgeExecuteHandler
{

    private static final String TAG = "WriteReviewHandler";
    private Activity activity;

    public WriteReviewHandler(Activity activity1)
    {
        super(activity1);
        activity = activity1;
    }

    protected String calculateReturn()
    {
        return null;
    }

    protected void executeInternal()
    {
        l.a(activity);
    }

    protected boolean validateNonce(String s)
    {
        return true;
    }
}
