// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.internal.jx;

// Referenced classes of package com.google.android.gms.analytics:
//            aj

class u extends BroadcastReceiver
{

    static final String yR = com/google/android/gms/analytics/u.getName();
    private final aj yS;

    public void onReceive(Context context, Intent intent)
    {
label0:
        {
            boolean flag = false;
            int i = y.a.a;
            context = intent.getAction();
            if ("android.net.conn.CONNECTIVITY_CHANGE".equals(context))
            {
                boolean flag1 = intent.getBooleanExtra("noConnectivity", false);
                aj aj1 = yS;
                if (!flag1)
                {
                    flag = true;
                }
                aj1.C(flag);
                if (i == 0)
                {
                    break label0;
                }
                jx.a++;
            }
            if ("com.google.analytics.RADIO_POWERED".equals(context) && !intent.hasExtra(yR))
            {
                yS.ey();
            }
        }
    }

}
