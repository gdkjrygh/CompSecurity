// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.honeycomb.phone;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v4.app.FragmentActivity;

final class e
    implements android.content.DialogInterface.OnClickListener
{

    final AutomaticPairingActivity.ConnectionErrorDialogFragment a;

    e(AutomaticPairingActivity.ConnectionErrorDialogFragment connectionerrordialogfragment)
    {
        a = connectionerrordialogfragment;
        super();
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        dialoginterface = new Intent(a.i().getBaseContext(), com/google/android/apps/youtube/app/honeycomb/Shell$HomeActivity);
        a.a(dialoginterface);
    }
}
