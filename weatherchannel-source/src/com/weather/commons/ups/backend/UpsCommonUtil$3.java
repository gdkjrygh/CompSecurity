// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.ups.backend;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import com.weather.beacons.analytics.Analytics;

// Referenced classes of package com.weather.commons.ups.backend:
//            UpsCommonUtil

static final class val.listener
    implements android.content.OnClickListener
{

    final Activity val$activity;
    final DialogListener val$listener;
    final Class val$signUpActivityClass;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        Analytics.trackAction(val$activity.getString(com.weather.commons.ups_pitch_signup), null);
        val$activity.startActivity(new Intent(val$activity, val$signUpActivityClass));
        if (val$listener != null)
        {
            val$listener.onClickPositive();
        }
        dialoginterface.dismiss();
    }

    DialogListener(Activity activity1, Class class1, DialogListener dialoglistener)
    {
        val$activity = activity1;
        val$signUpActivityClass = class1;
        val$listener = dialoglistener;
        super();
    }
}
