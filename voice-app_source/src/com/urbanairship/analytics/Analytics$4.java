// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.urbanairship.analytics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.urbanairship.Logger;

// Referenced classes of package com.urbanairship.analytics:
//            Analytics

class > extends BroadcastReceiver
{

    final Analytics this$0;

    public void onReceive(Context context, Intent intent)
    {
        Logger.verbose(intent.getAction());
        if (Analytics.ACTION_APP_BACKGROUND.equals(intent.getAction()))
        {
            Analytics.access$102(Analytics.this, true);
        } else
        if (Analytics.ACTION_APP_FOREGROUND.equals(intent.getAction()))
        {
            Analytics.access$102(Analytics.this, false);
            return;
        }
    }

    ()
    {
        this$0 = Analytics.this;
        super();
    }
}
