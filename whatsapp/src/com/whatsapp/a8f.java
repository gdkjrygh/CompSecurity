// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.app.Activity;
import android.content.DialogInterface;

final class a8f
    implements android.content.DialogInterface.OnCancelListener
{

    final Activity a;
    final int b;

    a8f(Activity activity, int i)
    {
        a = activity;
        b = i;
        super();
    }

    public void onCancel(DialogInterface dialoginterface)
    {
        a.removeDialog(b);
    }
}
