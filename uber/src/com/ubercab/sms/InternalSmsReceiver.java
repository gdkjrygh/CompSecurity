// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.sms;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import hoc;

public final class InternalSmsReceiver extends BroadcastReceiver
{

    public InternalSmsReceiver()
    {
    }

    private static void a(Context context, Intent intent)
    {
        Intent intent1 = new Intent("com.ubercab.sms.SMS_RECEIVED");
        intent1.setPackage(context.getPackageName());
        intent1.putExtra("pdus", intent.getSerializableExtra("pdus"));
        context.sendBroadcast(intent1);
    }

    public final void onReceive(Context context, Intent intent)
    {
        (new hoc(context)).a();
        a(context, intent);
    }
}
