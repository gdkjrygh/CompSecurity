// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

// Referenced classes of package com.google.android.gms.tagmanager:
//            cx, DataLayer

class bo extends BroadcastReceiver
{

    static final String yR = com/google/android/gms/tagmanager/bo.getName();
    private final cx asb;

    public void onReceive(Context context, Intent intent)
    {
label0:
        {
            String s = intent.getAction();
            if ("android.net.conn.CONNECTIVITY_CHANGE".equals(s))
            {
                Object obj = intent.getExtras();
                context = Boolean.FALSE;
                if (obj != null)
                {
                    context = Boolean.valueOf(intent.getExtras().getBoolean("noConnectivity"));
                }
                obj = asb;
                boolean flag;
                if (!context.booleanValue())
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                ((cx) (obj)).C(flag);
                if (!DataLayer.a)
                {
                    break label0;
                }
            }
            if ("com.google.analytics.RADIO_POWERED".equals(s) && !intent.hasExtra(yR))
            {
                asb.ey();
            }
        }
    }

}
