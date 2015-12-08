// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.fastpickup;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import com.walmart.android.config.WalmartNetServiceSettings;
import com.walmart.android.util.SharedPreferencesUtil;
import com.walmart.android.wmservice.Services;
import com.walmart.android.wmservice.fastpickup.FastPickupManager;
import com.walmart.android.wmservice.fastpickup.FastPickupService;
import com.walmartlabs.utils.WLog;

// Referenced classes of package com.walmart.android.app.fastpickup:
//            FastPickupUtil

static final class val.context
    implements android.content.nClickListener
{

    final Context val$context;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        switch (i)
        {
        default:
            return;

        case 0: // '\0'
            WalmartNetServiceSettings.showFastPickupServerSelectDialog(val$context);
            return;

        case 1: // '\001'
            WLog.d(FastPickupUtil.access$000(), "Clearing notification cache...");
            SharedPreferencesUtil.clearFastPickupNotificationStatus(val$context, null);
            return;

        case 2: // '\002'
            WLog.d(FastPickupUtil.access$000(), "Clearing read order...");
            Services.get().getFastPickupManager().resetServerState();
            SharedPreferencesUtil.clearFastPickupNotificationStatus(val$context, null);
            return;

        case 3: // '\003'
            dialoginterface = new Intent();
            dialoginterface.setAction("com.google.android.c2dm.intent.RECEIVE");
            dialoginterface.addCategory("com.walmart.android");
            dialoginterface.putExtra("url", "walmart://checkin/2280");
            dialoginterface.putExtra("title", "Fast Pickup test");
            dialoginterface.putExtra("text", "Test message");
            val$context.sendOrderedBroadcast(dialoginterface, null);
            return;

        case 4: // '\004'
            FastPickupService.refresh(val$context, true);
            break;
        }
    }

    ervice(Context context1)
    {
        val$context = context1;
        super();
    }
}
