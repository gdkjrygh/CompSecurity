// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.dal2.system;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.common.base.Preconditions;
import com.weather.dal2.DataAccessLayer;
import com.weather.util.Postable;
import com.weather.util.log.LogUtil;
import com.weather.util.log.LoggingMetaTags;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.weather.dal2.system:
//            TwcBus, SystemEvent

public class UniversalBroadcastReceiver extends BroadcastReceiver
{

    private static final Map SYSTEM_EVENTS;
    private static final String TAG = "UniversalBroadcastReceiver";
    private final TwcBus twcBus;

    public UniversalBroadcastReceiver()
    {
        this(DataAccessLayer.BUS);
    }

    UniversalBroadcastReceiver(TwcBus twcbus)
    {
        twcBus = (TwcBus)Preconditions.checkNotNull(twcbus);
    }

    public void onReceive(Context context, Intent intent)
    {
        String s;
        context = null;
        s = intent.getAction();
        LogUtil.method("UniversalBroadcastReceiver", LoggingMetaTags.TWC_DAL, "onReceive", new Object[] {
            s
        });
        if (!SYSTEM_EVENTS.containsKey(s)) goto _L2; else goto _L1
_L1:
        context = (SystemEvent.Cause)SYSTEM_EVENTS.get(s);
_L4:
        if (context != null)
        {
            context = new SystemEvent(context);
            context.setOriginTag("UniversalBroadcastReceiver");
            twcBus.post(context);
        }
        return;
_L2:
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(s))
        {
            if (intent.getBooleanExtra("noConnectivity", false))
            {
                context = SystemEvent.Cause.NETWORK_DOWN;
            } else
            {
                context = SystemEvent.Cause.NETWORK_UP;
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    static 
    {
        SYSTEM_EVENTS = new HashMap();
        SYSTEM_EVENTS.put("android.intent.action.BOOT_COMPLETED", SystemEvent.Cause.BOOT);
        SYSTEM_EVENTS.put("android.intent.action.LOCALE_CHANGED", SystemEvent.Cause.LOCALE_CHANGED);
        SYSTEM_EVENTS.put("android.intent.action.USER_PRESENT", SystemEvent.Cause.USER_PRESENT);
        SYSTEM_EVENTS.put("android.intent.action.ACTION_POWER_CONNECTED", SystemEvent.Cause.POWER_CONNECTED);
        SYSTEM_EVENTS.put("android.intent.action.ACTION_POWER_DISCONNECTED", SystemEvent.Cause.POWER_DISCONNECTED);
        SYSTEM_EVENTS.put("android.location.PROVIDERS_CHANGED", SystemEvent.Cause.LBS_PROVIDER_CHANGED);
    }
}
