// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.push;

import android.content.ActivityNotFoundException;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import com.weather.util.log.LogUtil;
import com.weather.util.log.LoggingMetaTags;

public class KahunaOnPushClickReceiver extends BroadcastReceiver
{

    public static final String ANDROID_DEEP_LINK = "android_deep_link";
    private static final String TAG = "KahunaOnPushClickRec";

    public KahunaOnPushClickReceiver()
    {
    }

    private Bundle checkIntent(Intent intent)
    {
        if ("com.kahuna.sdk.push.clicked".equals(intent.getAction()))
        {
            return intent.getBundleExtra("landing_extras_id");
        } else
        {
            return null;
        }
    }

    Intent getLaunchIntent(String s)
    {
        Intent intent = new Intent();
        intent.setAction("android.intent.action.VIEW");
        intent.setData(Uri.parse(s));
        intent.setFlags(0x10000000);
        return intent;
    }

    Intent getMainIntent(Context context)
    {
        context = context.getPackageManager().getLaunchIntentForPackage("com.weather.Weather");
        context.setFlags(0x10000000);
        return context;
    }

    public void onReceive(Context context, Intent intent)
    {
        Bundle bundle = checkIntent(intent);
        LogUtil.d("KahunaOnPushClickRec", LoggingMetaTags.TWC_GENERAL, (new StringBuilder()).append("intent: ").append(LogUtil.bundleToString(intent.getExtras())).toString(), new Object[0]);
        if (bundle == null)
        {
            break MISSING_BLOCK_LABEL_67;
        }
        intent = bundle.getString("android_deep_link");
        if (intent == null)
        {
            break MISSING_BLOCK_LABEL_67;
        }
        context.startActivity(getLaunchIntent(intent));
        return;
        intent;
        LogUtil.d("KahunaOnPushClickRec", LoggingMetaTags.TWC_GENERAL, intent.toString(), new Object[0]);
        context.startActivity(getMainIntent(context));
        return;
    }
}
