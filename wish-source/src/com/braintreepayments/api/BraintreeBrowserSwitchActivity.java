// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.braintreepayments.api;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Window;

// Referenced classes of package com.braintreepayments.api:
//            BraintreeBroadcastManager

public class BraintreeBrowserSwitchActivity extends Activity
{

    public static final String EXTRA_INTENT = "com.braintreepayments.api.BraintreeBrowserSwitchActivity.EXTRA_INTENT";
    public static final String EXTRA_RESULT_CODE = "com.braintreepayments.api.messages.EXTRA_RESULT_CODE";
    public static final String LOCAL_BROADCAST_BROWSER_SWITCH_COMPLETED = "com.braintreepayments.api.messages.LOCAL_BROADCAST_BROWSER_SWITCH_COMPLETED";

    public BraintreeBrowserSwitchActivity()
    {
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        getWindow().setBackgroundDrawableResource(0x106000d);
        bundle = (new Intent("com.braintreepayments.api.messages.LOCAL_BROADCAST_BROWSER_SWITCH_COMPLETED")).putExtra("com.braintreepayments.api.messages.EXTRA_RESULT_CODE", -1);
        if (getIntent() != null)
        {
            bundle.putExtra("com.braintreepayments.api.BraintreeBrowserSwitchActivity.EXTRA_INTENT", getIntent());
        }
        BraintreeBroadcastManager.getInstance(this).sendBroadcastSync(bundle);
        finish();
    }
}
