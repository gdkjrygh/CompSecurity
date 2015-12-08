// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import java.util.Map;

// Referenced classes of package com.google.android.apps.youtube.app:
//            ac

final class ad extends BroadcastReceiver
{

    final SharedPreferences a;
    final ac b;

    ad(ac ac1, SharedPreferences sharedpreferences)
    {
        b = ac1;
        a = sharedpreferences;
        super();
    }

    public final void onReceive(Context context, Intent intent)
    {
        if ("com.google.android.youtube.action.set_flag".equals(intent.getAction()))
        {
            context = intent.getExtras().getString("flag_name");
            intent = intent.getExtras().getString("flag_value");
            a.edit().putString(ac.a(b, context), intent).apply();
            ac.a(b).put(context, intent);
        }
    }
}
