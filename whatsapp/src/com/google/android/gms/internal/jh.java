// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.util.Log;

// Referenced classes of package com.google.android.gms.internal:
//            qw

public class jh
    implements android.content.DialogInterface.OnClickListener
{

    private final Fragment Mx;
    private final int My;
    private final Intent mIntent;
    private final Activity nB;

    public jh(Activity activity, Intent intent, int i)
    {
        nB = activity;
        Mx = null;
        mIntent = intent;
        My = i;
    }

    public jh(Fragment fragment, Intent intent, int i)
    {
        nB = null;
        Mx = fragment;
        mIntent = intent;
        My = i;
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        Object obj;
        if (mIntent == null)
        {
            break MISSING_BLOCK_LABEL_41;
        }
        obj = Mx;
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_41;
        }
        boolean flag;
        Mx.startActivityForResult(mIntent, My);
        flag = qw.a;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_65;
        }
        obj = mIntent;
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_65;
        }
        nB.startActivityForResult(mIntent, My);
        try
        {
            dialoginterface.dismiss();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (DialogInterface dialoginterface)
        {
            Log.e("SettingsRedirect", "Can't redirect to app settings for Google Play services");
        }
        break MISSING_BLOCK_LABEL_93;
        dialoginterface;
        try
        {
            throw dialoginterface;
        }
        // Misplaced declaration of an exception variable
        catch (DialogInterface dialoginterface) { }
        try
        {
            throw dialoginterface;
        }
        // Misplaced declaration of an exception variable
        catch (DialogInterface dialoginterface) { }
        try
        {
            throw dialoginterface;
        }
        // Misplaced declaration of an exception variable
        catch (DialogInterface dialoginterface) { }
        throw dialoginterface;
    }
}
