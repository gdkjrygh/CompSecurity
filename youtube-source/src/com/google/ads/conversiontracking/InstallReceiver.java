// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.ads.conversiontracking;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;

// Referenced classes of package com.google.ads.conversiontracking:
//            b

public class InstallReceiver extends BroadcastReceiver
{

    public InstallReceiver()
    {
    }

    public void onReceive(Context context, Intent intent)
    {
        Object obj = intent.getStringExtra("referrer");
        if (!"com.android.vending.INSTALL_REFERRER".equals(intent.getAction()) || obj == null)
        {
            return;
        }
        Log.i("GoogleConversionPing", (new StringBuilder("Received install referrer: ")).append(((String) (obj))).toString());
        intent = Uri.parse("http://hostname/").buildUpon().appendQueryParameter("referrer", ((String) (obj))).build();
        if (intent == null)
        {
            Log.e("GoogleConversionPing", "Failed to register referrer from a null click url");
            return;
        }
        Log.i("GoogleConversionPing", (new StringBuilder("Registering: ")).append(intent.toString()).toString());
        obj = b.a(intent);
        if (obj == null)
        {
            Log.w("GoogleConversionPing", (new StringBuilder("Failed to parse referrer from: ")).append(intent.toString()).toString());
            return;
        }
        if (b.a(context, ((f) (obj))))
        {
            Log.i("GoogleConversionPing", (new StringBuilder("Successfully registered: ")).append(intent.toString()).toString());
            return;
        } else
        {
            Log.w("GoogleConversionPing", (new StringBuilder("Failed to register: ")).append(intent.toString()).toString());
            return;
        }
    }
}
