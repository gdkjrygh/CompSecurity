// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.wmservice.fastpickup;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.walmart.android.app.fastpickup.FastPickupUtil;
import com.walmart.android.app.main.MainActivity;
import com.walmart.android.config.FragmentConfig;

public class FastPickupNotificationReceiver extends BroadcastReceiver
{

    public static final String INTENT_EXTRAS_ORDERIDS = "ORDER_IDS";
    public static final String INTENT_EXTRAS_STOREID = "STORE_ID";
    public static final String INTENT_EXTRAS_TYPE = "ANIVIA_TYPE";
    private static final String TAG = com/walmart/android/wmservice/fastpickup/FastPickupNotificationReceiver.getSimpleName();
    public static final String TYPE_LOCAL_NOTIFICATION = "USWMSM842";
    public static final String TYPE_PUSH_NOTIFICATION_NEW_ORDER = "USWMSM837";
    public static final String TYPE_PUSH_NOTIFICATION_REMINDER = "USWMSM841";

    public FastPickupNotificationReceiver()
    {
    }

    public void onReceive(Context context, Intent intent)
    {
        Intent intent1;
        intent1 = new Intent(context, com/walmart/android/app/main/MainActivity);
        intent1.setAction("android.intent.action.VIEW");
        intent1.setFlags(0x20000000);
        intent1.setFlags(0x10000000);
        intent1.putExtra("reroute", FragmentConfig.getFragmentClass(com.walmart.android.config.FragmentConfig.FragmentName.FAST_PICKUP).getName());
        intent1.putExtra("STORE_ID", intent.getStringExtra("STORE_ID"));
        if (intent.getExtras() != null)
        {
            intent1.putExtras(intent.getExtras());
        }
        intent = intent.getStringExtra("ANIVIA_TYPE");
        if (TextUtils.isEmpty(intent)) goto _L2; else goto _L1
_L1:
        if ("USWMSM837".compareToIgnoreCase(intent) != 0) goto _L4; else goto _L3
_L3:
        FastPickupUtil.sendPageViewEvent("express pickup notification");
_L2:
        context.startActivity(intent1);
        return;
_L4:
        if ("USWMSM842".compareToIgnoreCase(intent) == 0)
        {
            FastPickupUtil.sendPageViewEvent("check in : order ready : service desk");
        } else
        if ("USWMSM841".compareToIgnoreCase(intent) == 0)
        {
            FastPickupUtil.sendPageViewEvent("check in : order ready : store");
        }
        if (true) goto _L2; else goto _L5
_L5:
    }

}
