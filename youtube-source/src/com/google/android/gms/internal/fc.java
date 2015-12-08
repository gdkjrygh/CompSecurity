// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.util.Log;

public final class fc
    implements android.content.DialogInterface.OnClickListener
{

    private final Activity a;
    private final Intent b;
    private final int c;

    public fc(Activity activity, Intent intent, int i)
    {
        a = activity;
        b = intent;
        c = i;
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        try
        {
            if (b != null)
            {
                a.startActivityForResult(b, c);
            }
            dialoginterface.dismiss();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (DialogInterface dialoginterface)
        {
            Log.e("SettingsRedirect", "Can't redirect to app settings for Google Play services");
        }
    }
}
