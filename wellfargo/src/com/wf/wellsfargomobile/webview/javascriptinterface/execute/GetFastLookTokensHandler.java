// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile.webview.javascriptinterface.execute;

import android.app.Activity;
import com.wf.wellsfargomobile.util.v;

// Referenced classes of package com.wf.wellsfargomobile.webview.javascriptinterface.execute:
//            BridgeExecuteHandler

public class GetFastLookTokensHandler extends BridgeExecuteHandler
{

    private static final String PACT = "pact";
    private static final String TAG = "GetFastLookTokensHandlr";
    private String pactToken;
    private String prefToken;

    public GetFastLookTokensHandler(Activity activity)
    {
        super(activity);
    }

    protected String calculateReturn()
    {
        return (new StringBuilder()).append("{\"pact\":\"").append(pactToken).append("\",").append("\"").append("prefToken").append("\":\"").append(prefToken).append("\"}").toString();
    }

    protected void executeInternal()
    {
        pactToken = v.c("pactToken");
        prefToken = v.c("prefToken");
    }
}
