// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Process;

final class dr
    implements android.content.DialogInterface.OnCancelListener
{

    final Activity a;

    dr(Activity activity)
    {
        a = activity;
        super();
    }

    public void onCancel(DialogInterface dialoginterface)
    {
        a.finish();
        Process.killProcess(Process.myPid());
    }
}
