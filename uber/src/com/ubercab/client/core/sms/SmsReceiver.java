// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.sms;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.telephony.SmsMessage;
import com.ubercab.client.core.app.RiderApplication;
import dfp;
import drh;
import dri;
import dus;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class SmsReceiver extends BroadcastReceiver
{

    public dri a;
    private boolean b;

    public SmsReceiver()
    {
    }

    public void onReceive(Context context, Intent intent)
    {
        if (intent.getAction().equals("android.provider.Telephony.SMS_RECEIVED")) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (!b)
        {
            ((RiderApplication)context.getApplicationContext()).b().a(this);
            b = true;
        }
        context = new ArrayList();
        Iterator iterator = a.a().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            drh drh2 = (drh)iterator.next();
            if (a.b(drh2.a()))
            {
                context.add(drh2);
            }
        } while (true);
        if (!context.isEmpty())
        {
            intent = dus.a(intent);
            context = context.iterator();
            while (context.hasNext()) 
            {
                drh drh1 = (drh)context.next();
                Iterator iterator1 = intent.iterator();
                while (iterator1.hasNext()) 
                {
                    drh1.a((SmsMessage)iterator1.next());
                }
            }
        }
        if (true) goto _L1; else goto _L3
_L3:
    }
}
