// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile.webview.javascriptinterface.execute;

import android.app.Activity;
import android.content.Context;
import android.telephony.TelephonyManager;
import com.wf.wellsfargomobile.WFApp;

// Referenced classes of package com.wf.wellsfargomobile.webview.javascriptinterface.execute:
//            BridgeExecuteHandler

public class C4cGetANIHandler extends BridgeExecuteHandler
{

    private static final String TAG = "C4cGetANIHandler";
    private String devicePhoneNumber;

    public C4cGetANIHandler(Activity activity)
    {
        super(activity);
    }

    protected String calculateReturn()
    {
        if (devicePhoneNumber != null)
        {
            return devicePhoneNumber;
        } else
        {
            return null;
        }
    }

    protected void executeInternal()
    {
        TelephonyManager telephonymanager = (TelephonyManager)WFApp.g.getSystemService("phone");
        if (telephonymanager != null && telephonymanager.getLine1Number() != null)
        {
            devicePhoneNumber = telephonymanager.getLine1Number();
        }
    }
}
