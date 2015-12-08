// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile.webview.javascriptinterface.execute;

import android.app.Activity;
import com.wf.wellsfargomobile.util.v;

// Referenced classes of package com.wf.wellsfargomobile.webview.javascriptinterface.execute:
//            BridgeExecuteHandler

public class GetDeviceInfo extends BridgeExecuteHandler
{

    private static final String TAG = "GetDeviceInfo";

    public GetDeviceInfo(Activity activity)
    {
        super(activity);
    }

    protected String calculateReturn()
    {
        return v.b();
    }

    protected void executeInternal()
    {
    }
}
