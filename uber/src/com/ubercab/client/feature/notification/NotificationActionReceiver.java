// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.notification;

import android.content.Context;
import android.content.Intent;
import android.support.v4.content.WakefulBroadcastReceiver;
import com.ubercab.client.core.app.RiderApplication;
import com.ubercab.client.feature.launch.LauncherActivity;
import com.ubercab.client.feature.trip.TripActivity;
import com.ubercab.rider.realtime.model.Client;
import com.ubercab.rider.realtime.model.PaymentProfile;
import dfp;
import dkn;
import dpg;
import dxg;
import ekp;
import ekq;
import eky;
import hkm;
import hkr;
import ica;
import ico;

public class NotificationActionReceiver extends WakefulBroadcastReceiver
{

    public hkr a;
    public dpg b;
    public dkn c;
    public hkm d;
    public eky e;
    private boolean f;

    public NotificationActionReceiver()
    {
    }

    public void onReceive(Context context, Intent intent)
    {
        Object obj;
        Object obj1;
        String s;
        byte byte0;
        obj1 = null;
        obj = null;
        if (!f)
        {
            ((RiderApplication)context.getApplicationContext()).b().a(this);
            f = true;
        }
        s = intent.getAction();
        byte0 = -1;
        s.hashCode();
        JVM INSTR lookupswitch 11: default 144
    //                   -2135852769: 369
    //                   -2038445361: 285
    //                   -1869739587: 253
    //                   -1737783427: 301
    //                   -1614102506: 318
    //                   -1224602576: 269
    //                   -92089822: 221
    //                   440339789: 237
    //                   536097183: 352
    //                   689048081: 205
    //                   1864393129: 335;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12
_L1:
        byte0;
        JVM INSTR tableswitch 0 10: default 204
    //                   0 386
    //                   1 430
    //                   2 456
    //                   3 456
    //                   4 456
    //                   5 456
    //                   6 456
    //                   7 456
    //                   8 456
    //                   9 482
    //                   10 628;
           goto _L13 _L14 _L15 _L16 _L16 _L16 _L16 _L16 _L16 _L16 _L17 _L18
_L13:
        return;
_L11:
        if (s.equals("com.ubercab.client.ACTION_CLICK"))
        {
            byte0 = 0;
        }
        continue; /* Loop/switch isn't completed */
_L8:
        if (s.equals("com.ubercab.client.ACTION_DELETE"))
        {
            byte0 = 1;
        }
        continue; /* Loop/switch isn't completed */
_L9:
        if (s.equals("com.ubercab.client.ACTION_TRIP_ADD_DESTINATION"))
        {
            byte0 = 2;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        if (s.equals("com.ubercab.client.ACTION_TRIP_CANCEL"))
        {
            byte0 = 3;
        }
        continue; /* Loop/switch isn't completed */
_L7:
        if (s.equals("com.ubercab.client.ACTION_SAFETYNET_SHARE_TRIP"))
        {
            byte0 = 4;
        }
        continue; /* Loop/switch isn't completed */
_L3:
        if (s.equals("com.ubercab.client.ACTION_TRIP_SHARE_ETA"))
        {
            byte0 = 5;
        }
        continue; /* Loop/switch isn't completed */
_L5:
        if (s.equals("com.ubercab.client.ACTION_TRIP_SHOW_MAP"))
        {
            byte0 = 6;
        }
        continue; /* Loop/switch isn't completed */
_L6:
        if (s.equals("com.ubercab.client.ACTION_TRIP_SPLIT_FARE"))
        {
            byte0 = 7;
        }
        continue; /* Loop/switch isn't completed */
_L12:
        if (s.equals("com.ubercab.client.ACTION_RECEIPT_RATE_DRIVER"))
        {
            byte0 = 8;
        }
        continue; /* Loop/switch isn't completed */
_L10:
        if (s.equals("com.ubercab.client.ACTION_FARE_SPLIT_INVITE_ACCEPT"))
        {
            byte0 = 9;
        }
        continue; /* Loop/switch isn't completed */
_L2:
        if (s.equals("com.ubercab.client.ACTION_FARE_SPLIT_INVITE_DECLINE"))
        {
            byte0 = 10;
        }
        continue; /* Loop/switch isn't completed */
_L14:
        obj = new Intent();
        int i = intent.getIntExtra("com.ubercab.client.EXTRA_MESSAGE_IDENTIFIER", 0);
        ((Intent) (obj)).setAction(intent.getStringExtra("com.ubercab.client.EXTRA_ACTION"));
        ((Intent) (obj)).putExtra("com.ubercab.client.EXTRA_MESSAGE_IDENTIFIER", i);
        context.sendOrderedBroadcast(((Intent) (obj)), null);
        return;
_L15:
        int j = intent.getIntExtra("com.ubercab.client.EXTRA_ID", 0);
        intent.getStringExtra("com.ubercab.client.EXTRA_TAG");
        e.a(j);
        return;
_L16:
        context.startActivity(LauncherActivity.a(context, (new Intent(context, com/ubercab/client/feature/trip/TripActivity)).setAction(intent.getAction())));
        return;
_L17:
        intent = a.c();
        if (intent != null)
        {
            intent = intent.findPaymentProfileByUuid(intent.getLastSelectedPaymentProfileUUID());
        } else
        {
            intent = null;
        }
        if (!b.a())
        {
            if (intent != null && "PayPal".equals(intent.getTokenType()))
            {
                obj = intent.getUuid();
                intent = dxg.a(context);
                context = ((Context) (obj));
            } else
            {
                context = null;
                intent = ((Intent) (obj));
            }
            c.a(context, intent, true);
            return;
        }
        if (intent != null)
        {
            obj = obj1;
            if ("PayPal".equals(intent.getTokenType()))
            {
                obj = dxg.a(context);
            }
            d.a(intent.getUuid(), ((String) (obj))).a(ico.a()).a(new ekp(context));
            return;
        }
          goto _L13
_L18:
        if (!b.g())
        {
            c.a(true);
            return;
        }
        d.b().a(ico.a()).a(new ekq(this, context));
        return;
        if (true) goto _L1; else goto _L19
_L19:
    }
}
