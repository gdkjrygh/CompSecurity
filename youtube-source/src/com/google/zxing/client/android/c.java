// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.client.android;

import android.app.Activity;
import android.content.DialogInterface;

public final class c
    implements android.content.DialogInterface.OnCancelListener, android.content.DialogInterface.OnClickListener, Runnable
{

    private final Activity a;

    public c(Activity activity)
    {
        a = activity;
    }

    public final void onCancel(DialogInterface dialoginterface)
    {
        run();
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        run();
    }

    public final void run()
    {
        a.finish();
    }
}
