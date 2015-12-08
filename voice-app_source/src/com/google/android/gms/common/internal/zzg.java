// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.util.Log;

public class zzg
    implements android.content.DialogInterface.OnClickListener
{

    private final Activity mActivity;
    private final Intent mIntent;
    private final Fragment zzZX;
    private final int zzZY;

    public zzg(Activity activity, Intent intent, int i)
    {
        mActivity = activity;
        zzZX = null;
        mIntent = intent;
        zzZY = i;
    }

    public zzg(Fragment fragment, Intent intent, int i)
    {
        mActivity = null;
        zzZX = fragment;
        mIntent = intent;
        zzZY = i;
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        if (mIntent == null || zzZX == null) goto _L2; else goto _L1
_L1:
        zzZX.startActivityForResult(mIntent, zzZY);
_L4:
        dialoginterface.dismiss();
        return;
_L2:
        if (mIntent != null)
        {
            mActivity.startActivityForResult(mIntent, zzZY);
        }
        if (true) goto _L4; else goto _L3
_L3:
        dialoginterface;
        Log.e("SettingsRedirect", "Can't redirect to app settings for Google Play services");
        return;
    }
}
