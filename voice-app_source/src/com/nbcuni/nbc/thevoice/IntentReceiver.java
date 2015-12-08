// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcuni.nbc.thevoice;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.urbanairship.UAirship;

// Referenced classes of package com.nbcuni.nbc.thevoice:
//            MainActivity

public class IntentReceiver extends BroadcastReceiver
{

    public IntentReceiver()
    {
    }

    public void onReceive(Context context, Intent intent)
    {
label0:
        {
            context = intent.getAction();
            if (!context.equals("com.urbanairship.push.PUSH_RECEIVED"))
            {
                if (!context.equals("com.urbanairship.push.NOTIFICATION_OPENED"))
                {
                    break label0;
                }
                context = new Intent("android.intent.action.MAIN");
                context.setClass(UAirship.shared().getApplicationContext(), com/nbcuni/nbc/thevoice/MainActivity);
                context.setFlags(0x10000000);
                UAirship.shared().getApplicationContext().startActivity(context);
            }
            return;
        }
        context.equals("com.urbanairship.push.REGISTRATION_FINISHED");
    }
}
