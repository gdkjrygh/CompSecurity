// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kochava.android.tracker;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import com.kochava.android.util.Logging;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.Map;

public class ReferralCapture extends BroadcastReceiver
{

    private static final String LOGTAG = "KochavaReferralCapture";
    public static String params = "";

    public ReferralCapture()
    {
    }

    public void onReceive(Context context, Intent intent)
    {
        Object obj;
        Logging.Log("Referral Capture received an intent:");
        Logging.Log((new StringBuilder()).append("package:").append(intent.getPackage()).append(", action:").append(intent.getAction()).toString());
        try
        {
            obj = intent.getExtras();
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return;
        }
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        ((Bundle) (obj)).containsKey(null);
        String as[];
        obj = new HashMap();
        if (!intent.getAction().equals("com.android.vending.INSTALL_REFERRER"))
        {
            Logging.Log("intent not a referral");
            return;
        }
        intent = intent.getStringExtra("referrer");
        if (intent == null || intent.length() == 0)
        {
            Logging.LogError("referral intent empty");
            return;
        }
        int i;
        int j;
        try
        {
            intent = URLDecoder.decode(intent, "UTF-8");
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Logging.LogError((new StringBuilder()).append("Error within ReferralCapture: ").append(context.getMessage()).toString());
            return;
        }
        Logging.Log((new StringBuilder()).append("referral string: ").append(intent).toString());
        intent = intent.split("&");
        j = intent.length;
        i = 0;
_L2:
        if (i >= j)
        {
            break MISSING_BLOCK_LABEL_270;
        }
        as = intent[i].split("=");
        if (as.length != 1)
        {
            break; /* Loop/switch isn't completed */
        }
        ((Map) (obj)).put(as[0], "");
_L3:
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        ((Map) (obj)).put(as[0], as[1]);
          goto _L3
        intent;
        Logging.Log((new StringBuilder()).append("Error within ReferralCapture: ").append(intent.getMessage()).toString());
        intent = obj.toString();
        intent = intent.substring(1, intent.length() - 1).replace(", ", "&").replace("=", ":");
        context.getSharedPreferences("initPrefs", 0).edit().putString("initData", intent).commit();
        Logging.Log((new StringBuilder()).append("Setting referral global string: ").append(intent).toString());
        return;
    }

}
