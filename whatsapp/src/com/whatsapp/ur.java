// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.app.Activity;
import android.content.DialogInterface;

final class ur
    implements android.content.DialogInterface.OnClickListener
{

    final int a;
    final Activity b;

    ur(Activity activity, int i)
    {
        b = activity;
        a = i;
        super();
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        b.removeDialog(a);
    }
}
