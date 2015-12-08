// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.ups.backend;

import android.app.Activity;
import android.content.DialogInterface;
import com.weather.beacons.analytics.Analytics;

// Referenced classes of package com.weather.commons.ups.backend:
//            UpsCommonUtil

static final class val.listener
    implements android.content.OnClickListener
{

    final Activity val$activity;
    final DialogListener val$listener;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        Analytics.trackAction(val$activity.getString(com.weather.commons.ups_pitch_later), null);
        if (val$listener != null)
        {
            val$listener.onClickNegative();
        }
    }

    DialogListener(Activity activity1, DialogListener dialoglistener)
    {
        val$activity = activity1;
        val$listener = dialoglistener;
        super();
    }
}
