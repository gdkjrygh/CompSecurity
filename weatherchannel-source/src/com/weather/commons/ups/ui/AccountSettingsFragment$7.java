// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.ups.ui;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

// Referenced classes of package com.weather.commons.ups.ui:
//            AccountSettingsFragment

class this._cls0 extends BroadcastReceiver
{

    final AccountSettingsFragment this$0;

    public void onReceive(Context context, Intent intent)
    {
        (new goutTask(AccountSettingsFragment.this, null)).execute(new Void[0]);
        context.unregisterReceiver(AccountSettingsFragment.access$1800(AccountSettingsFragment.this));
    }

    goutTask()
    {
        this$0 = AccountSettingsFragment.this;
        super();
    }
}
