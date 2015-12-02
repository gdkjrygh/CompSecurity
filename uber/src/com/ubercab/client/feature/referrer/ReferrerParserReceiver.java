// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.referrer;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import fdp;

public class ReferrerParserReceiver extends BroadcastReceiver
{

    public ReferrerParserReceiver()
    {
    }

    private static Uri a(String s)
    {
        s = Uri.decode(s);
        return Uri.parse((new StringBuilder("https://get.uber.com?")).append(s).toString());
    }

    public void onReceive(Context context, Intent intent)
    {
        intent = intent.getStringExtra("referrer");
        if (!TextUtils.isEmpty(intent))
        {
            intent = a(intent).getQueryParameter("promo_code");
            if (!TextUtils.isEmpty(intent))
            {
                fdp.a(context, intent);
            }
        }
    }
}
