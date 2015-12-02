// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.push.internal.vendor.baidu;

import android.app.IntentService;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import hbb;

public class BaiduIntentService extends IntentService
{

    public BaiduIntentService()
    {
        super("BaiduIntentService");
    }

    public static Intent a(Context context, String s)
    {
        context = new Intent(context, com/ubercab/push/internal/vendor/baidu/BaiduIntentService);
        if (!TextUtils.isEmpty(s))
        {
            context.putExtra("com.ubercab.push.JSON_DATA", s);
        }
        return context;
    }

    protected void onHandleIntent(Intent intent)
    {
        Object obj = intent.getStringExtra("com.ubercab.push.JSON_DATA");
        intent = new Intent("com.ubercab.push.UBER_MESSAGE");
        intent.setPackage(getPackageName());
        obj = hbb.a(((String) (obj)));
        if (obj != null)
        {
            intent.putExtras(((android.os.Bundle) (obj)));
            sendBroadcast(intent);
        }
    }
}
